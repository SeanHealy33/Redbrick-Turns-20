(ns redbrick-20.views.home
    (:require-macros [secretary.core :refer [defroute]])
    (:import goog.History)
    (:require [reagent.core :as reagent]
              [redbrick-20.views.header :as header]
              [redbrick.views.data :as data]))

(enable-console-print!)

(def years-atom (reagent/atom {}))

(defn video-card []
  [:div {:class "video_wrapper mdl-card mdl-shadow--6dp"}
    [:h1 {:class "year appear"} "Redbrick Turns 20!"]
    [:h3 {:class "year appear-slow"} "Happy Birthday"]
    [:video {:class "video" :controls true}
      [:source {:type "video/mp4", :src "bin/sample.mp4"}]]
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
     [:pre (:event-information @data/event-details)]]])

(defn timeline-row [atom-state]
  [:div
    [:div {:class "year mdl-card__supporting-text"}
      [:h4 {:class "year"} (:year atom-state)]
        [:div {:class "card_content"}
          [:img {:src (str (:supporting-image atom-state))}]
          [:div {:class "text_block"}
            [:p (:supporting-data atom-state)]]]]
  [:hr]])


(defn redbrick-timeline []
  [:div {:class "redbrick_timeline"}
    [:div {:class "fill-card mdl-card mdl-shadow--2dp mdl-card mdl-shadow--6dp"}
      [:div {:class "mdl-card__title"}
        [:h2 {:class "mdl-card__title-text"} "Redbrick Through the Years"]]
      (for [year @data/timeline]
            [timeline-row year])]])

(defn render-content-wrapper []
  [:div
    [video-card]
    [:div {:class "padder"}]
    [:div {:class "content"}
      [supporting-card]
      [:div {:class "padder"}]
      [event-card]
      [:div {:class "padder"}]
        [redbrick-timeline]]])

(defn render-page []
  [:div {:class "mdl-layout mdl-js-layout"}
    [:div {:id "target"}
      (header/render-header)
      (render-content-wrapper)]
      [:div {:class "padder"}]
      [:div {:class "elevator-button"} "Back to Top"]
      [:script {:scr "./elevator.js"}]])
