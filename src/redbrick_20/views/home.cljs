(ns redbrick-20.views.home
    (:require-macros [secretary.core :refer [defroute]])
    (:import goog.History)
    (:require [reagent.core :as reagent]
              [redbrick-20.views.header :as header]
              [redbrick-20.components.data :as data]))

(enable-console-print!)

(def years-atom (reagent/atom {}))
(def browser-width (reagent/atom js/window.innerWidth))

(defn video-card []
  (println @browser-width)
  [:div {:class "video_wrapper mdl-card mdl-shadow--6dp"}
    [:h1 {:class "appear mdl-color-text--red-700"} "Redbrick Turns 20!"]
    [:h3 {:class "appear-slow mdl-color-text--red-700"} "Happy Birthday"]
    [:div {:class "padder"}]])

(defn supporting-card []
  [:div {:class "fill-card mdl-card mdl-shadow--2dp mdl-card mdl-shadow--6dp"}
    [:div {:class "mdl-card__title"}
      [:h2 {:class "mdl-card__title-text"} (:title @data/supporting-deails)]]
    [:div {:class "card-text mdl-card__supporting-text"}
     [:p (:text @data/supporting-deails)]]])

(defn event-card []
  [:div {:class "fill-card mdl-card mdl-shadow--2dp mdl-card mdl-shadow--6dp"}
    [:div {:class "mdl-card__title"}
      [:h2 {:class "mdl-card__title-text"} (:event-title @data/event-details)]]
    [:div {:class "card-text mdl-card__supporting-text"}
     [:p (:event-information @data/event-details)]]])

(defn render-content-wrapper []
  [:div
    [video-card]
    [:div {:class "padder"}]
    [:div {:class "content"}
      [event-card]
      [:div {:class "padder"}]
      [supporting-card]]])

(defn render-page []
  [:div {:class "mdl-layout mdl-js-layout mdl-layout--fixed-header"}
    [header/render-header
      (if (< 570 @browser-width)
        "Redbrick: DCU's Networking Society"
        "Redbrick")]
   [:main {:class "mdl-layout__content"}
    (render-content-wrapper)
    [:div {:class "padder"}]]])
