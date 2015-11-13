(ns redbrick-20.views.timeline
    (:require-macros [secretary.core :refer [defroute]])
    (:import goog.History)
    (:require [reagent.core :as reagent]
              [redbrick-20.views.header :as header]
              [redbrick-20.components.data :as data]))

(enable-console-print!)

(def years-atom (reagent/atom {}))
(def browser-width (reagent/atom js/window.innerWidth))


(defn timeline-row [atom-state]
  [:div
    [:div {:id (str (:year atom-state))
           :class "year mdl-card__supporting-text"}
      [:h4 {:class "mdl-color-text--red"} (:year atom-state)]
        [:div {:class "card_content"}
          [:img {:src (str (:supporting-image atom-state))}]
          [:div {:class "text_block"}
            [:p (:supporting-data atom-state)]]]]
  [:hr]])

(defn redbrick-timeline []
  [:div {:class "redbrick_timeline"}
    [:div {:class "fill-card mdl-card mdl-shadow--2dp mdl-card mdl-shadow--6dp"}
      [:div {:class "mdl-card__title"}
        [:h2 {:class "mdl-card__title-text mdl-color-text--red-900"} "Redbrick Through the Years"]]
      (for [year data/timeline]
        [timeline-row year])]])

(defn render-content-wrapper []
  [:div
    [:div {:class "padder"}]
    [:div {:class "content"}
      [redbrick-timeline]]])

(defn render-page []
  [:div {:class "mdl-layout mdl-js-layout mdl-layout--fixed-header"}
  [header/render-header
    (if (< 570 @browser-width)
      "Redbrick: DCU's Networking Society"
      "Redbrick")]
   [:main {:class "mdl-layout__content"}
    (render-content-wrapper)
    [:div {:class "padder"}]]])
