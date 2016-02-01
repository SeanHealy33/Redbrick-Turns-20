(ns redbrick-20.views.donation
    (:require-macros [secretary.core :refer [defroute]])
    (:import goog.History)
    (:require [reagent.core :as reagent]
              [redbrick-20.views.header :as header]
              [redbrick-20.components.data :as data]
              [ajax.core :refer [GET]]))

(enable-console-print!)

(def years-atom (reagent/atom {}))
(def browser-width (reagent/atom js/window.innerWidth))
(def donation-ammount (reagent/atom nil))
(def user-donation-opt (reagent/atom "0"))

(defn handler [response]
  (reset! donation-ammount (get response "value")))

(defn error-handler [{:keys [status status-text]}]
  (.log js/console (str "something bad happened: " status " " status-text)))

(defn get-value
  []
  (GET "Http://www.redbrick.dcu.ie/~space/value.php"
    {:handler handler
     :error-handler error-handler}))

(defn display-bar
  [goal-row]
  (if (< @donation-ammount (:value goal-row)) ;TODO Make this less hideous
    (if (> @donation-ammount (:prev_value goal-row))
       (str (* (/ (- @donation-ammount (:prev_value goal-row)) (- (:value goal-row) (:prev_value goal-row))) 100 )"%" )
       "0%"
    )
    "100%"))

(defn display-row
  [goal-row]
  (if (< @donation-ammount (:value goal-row)) ;TODO Make this less hideous
    (if (> @donation-ammount (:prev_value goal-row))
       "0 7px 2px 0 #ffde00"
       "0px -2px -2px -5px #ffde00"
    )
    " 0 7px 2px 0 #ffde00"))

(defn donation-card []
  [:div {:class "fill-card mdl-card mdl-shadow--2dp mdl-card mdl-shadow--6dp"}
    [:div {:class "mdl-card__title"}
      [:h2 {:class "mdl-card__title-text mdl-color-text--red-900"} "How Much would you like to give to us?"]]

    [:label
      [:input {:type :radio :name "userAmmount" :value "10.00"
        :on-change  #(reset! user-donation-opt "10.00")}] "10.00"]
    [:label
      [:input {:type :radio :name "userAmmount" :value "25.00"
        :on-change  #(reset! user-donation-opt "25.00")}] "25.00"]
    [:label
      [:input {:type :radio :name "userAmmount" :value "50.00"
        :on-change  #(reset! user-donation-opt "50.00")}] "50.00"]
    [:label
      [:input {:type :radio :name "userAmmount" :value "100.00"
        :on-change  #(reset! user-donation-opt "100.00")}] "100.00"]
    [:label
      [:input {:type :radio :name "userAmmount" :value "0"
        :on-change  #(reset! user-donation-opt "0")}] "Custom Ammount"]

    [:div
      [:form {:action "https://www.paypal.com/cgi-bin/webscr" :method "post" :target "_top"}
      [:input {:type "hidden" :name "cmd" :value "_donations"}]
      [:input {:type "hidden" :name "business" :value "birthday@redbrick.dcu.ie"}]
      [:input {:type "hidden" :name "lc" :value "IE"}]
      [:input {:type "hidden" :name "item_name" :value "Redbrick"}]
      [:input {:type "hidden" :name "amount" :value @user-donation-opt}]
      [:input {:type "hidden" :name "currency_code" :value "EUR"}]
      [:input {:type "hidden" :name "bn" :value "PP-DonationsBF:btn_donateCC_LG.gif:NonHostedGuest"}]
      [:input {:type "image" :src "https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif"
               :border "0" :name "submit" :alt "PayPal - The safer, easier way to pay online!"}]
      [:img {:alt "" :border "0" :src "https://www.paypalobjects.com/en_US/i/scr/pixel.gif" :width "1" :height "1"}]]]])

(defn donation_row [goal-row]
  [:div {:class "stretch_wrapper_row"}
    [:div {:class "value_wrapper"}
      [:div {:class "ruler"}]
      [:div {:class "text_wrapper"}
        [:p {:class "mdl-card__title-text mdl-color-text--red-900"}(str "€ " (:value goal-row))]]]
    [:div {:class (str "progress_bar mdl-color--red-700 "
                    (if (= (display-bar goal-row) "100%")
                      "full-bar"
                      "round-bar"))
           :style {:height (display-bar goal-row)}}]
    [:div {:class "stretch_goal"}
      [:div {:class "ruler"}]
      [:div {:class "goal_container"}
        [:p {:class "goal_title mdl-card__title-text mdl-color-text--red-900"}
          (:type goal-row)]]]])

(defn redbrick-donation []
  [:div {:class "redbrick_donation"}
    [:div {:class "fill-card mdl-card mdl-shadow--2dp mdl-card mdl-shadow--6dp"}
      [:div {:class "mdl-card__title"}
        [:h2 {:class "mdl-card__title-text mdl-color-text--red-900"} "Donate to Our event!"]]
      [:div {:class "donation_wrapper"}
        [:h2 {:class "donation_ammount"} (str "So far we have raised €" @donation-ammount)]]
          (doall
            (get-value)
            (for [row @data/donationGoals]
              ^{:key (:value row)} [donation_row row]))]])

(defn render-content-wrapper []
  [:div
    [:div {:class "padder"}]
    [:div {:class "content"}
      [donation-card]
      [:div {:class "padder"}]
      [redbrick-donation]]])

(defn render-page []
  [:div {:class "mdl-layout mdl-js-layout mdl-layout--fixed-header"}
  [header/render-header
    (if (< 570 @browser-width)
      "Redbrick: DCU's Networking Society"
      "Redbrick")]
   [:main {:class "mdl-layout__content"}
    [render-content-wrapper]
    [:div {:class "padder"}]]])
