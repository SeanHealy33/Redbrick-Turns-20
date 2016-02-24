(ns redbrick-20.views.home
    (:require-macros [secretary.core :refer [defroute]])
    (:import goog.History)
    (:require [reagent.core :as reagent]
              [redbrick-20.views.header :as header]
              [redbrick-20.views.map :as gmaps]
              [redbrick-20.components.data :as data]))

(enable-console-print!)

(def years-atom (reagent/atom {}))
(def browser-width (reagent/atom js/window.innerWidth))

(defn video-card []
  [:div {:class "video_wrapper mdl-card mdl-shadow--6dp"}
    [:div {:class "padder"}]
    [:div {:class "padder"}]
    [:h1 {:class "appear mdl-color-text--white"} "Redbrick Turns 20!"]
    [:h3 {:class "appear-slow mdl-color-text--white"} "Happy Birthday"]
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
     [:div {:class "gmaps"}
      [gmaps/render-map]]
      [:div {:class "event_info"}
        [:p {:class "event_location"}
          [:b "Event Location: "] (:event-location @data/event-details)]
        [:p {:class "event_location"}
          [:b "Date: " ] (:event-date @data/event-details)]]]])

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
