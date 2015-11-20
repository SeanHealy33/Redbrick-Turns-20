(ns redbrick-20.views.donation
    (:require-macros [secretary.core :refer [defroute]])
    (:import goog.History)
    (:require [reagent.core :as reagent]
              [redbrick-20.views.header :as header]
              [redbrick-20.components.data :as data]))

(enable-console-print!)

(def years-atom (reagent/atom {}))
(def browser-width (reagent/atom js/window.innerWidth))

(defn full-display [value row]
  (< 1 (/ value row))
)

(defn donation_row [goal-row]
  [:div {:class "stretch_wrapper_row"}
    [:div {:class "value_wrapper"}
      [:div {:class "ruler"}]
      [:div {:class "text_wrapper"}
        [:p {:class "mdl-card__title-text mdl-color-text--red-900"}(str "€ " (:value goal-row))]]]
    [:div {:class "progress_bar mdl-color--red-900"
          :style {:height
            (if (< (:value @data/donation) (:value goal-row))
              (if (> (:value @data/donation) (:prev_value goal-row))
                 (str (* (/ (- (:value @data/donation) (:prev_value goal-row)) (- (:value goal-row) (:prev_value goal-row))) 100 )"%" )
                 "0%"
              )
              "100%")}}]
    [:div {:class "stretch_goal"}
      [:div {:class "ruler"}]
      [:p {:class "goal_title mdl-card__title-text mdl-color-text--red-900"}
        (:type goal-row)]]
  ])

(defn redbrick-donation []
  [:div {:class "redbrick_donation"}
    [:div {:class "fill-card mdl-card mdl-shadow--2dp mdl-card mdl-shadow--6dp"}
      [:div {:class "mdl-card__title"}
        [:h2 {:class "mdl-card__title-text mdl-color-text--red-900"} "Donate to Our event!"]]
      [:div {:class "donation_wrapper"}
        [:h2 {:class "donation_ammount"} "TODO WRITE SCRIPT TO GET THIS DATA"]]
        (for [row @data/donationGoals]
          (donation_row row))]])

(defn render-content-wrapper []
  [:div
    [:div {:class "padder"}]
    [:div {:class "content"}
      (redbrick-donation)]])

(defn render-page []
  [:div {:class "mdl-layout mdl-js-layout mdl-layout--fixed-header"}
  [header/render-header
    (if (< 570 @browser-width)
      "Redbrick: DCU's Networking Society"
      "Redbrick")]
   [:main {:class "mdl-layout__content"}
    (render-content-wrapper)
    [:div {:class "padder"}]]])
