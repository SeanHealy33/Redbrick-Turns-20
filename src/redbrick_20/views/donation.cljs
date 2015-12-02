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

(defn donation_row [goal-row]
  [:div {:class "stretch_wrapper_row"}
    [:div {:class "value_wrapper"}
      [:div {:class "ruler"}]
      [:div {:class "text_wrapper"}
        [:p {:class "mdl-card__title-text mdl-color-text--red-900"}(str "€ " (:value goal-row))]]]
    [:div {:class "progress_bar mdl-color--red-700"
           :style {:height (display-bar goal-row)
                   :box-shadow (display-row goal-row)}}]
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
