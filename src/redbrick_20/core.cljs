(ns ^:figwheel-always redbrick-20.core
  (:require-macros [secretary.core :refer [defroute]])
      (:import goog.History)
      (:require [secretary.core :as secretary]
                [goog.events :as events]
                [goog.history.EventType :as EventType]
                [reagent.core :as reagent]
                [redbrick-20.views.home :as home]
                [redbrick-20.views.timeline :as timeline]
                [redbrick-20.views.map :as map]))

(def app-state (reagent/atom {}))

(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn app-routes []
  (secretary/set-config! :prefix "#")

  (defroute "/" []
    (swap! app-state assoc :page :home))

  (defroute "/timeline" []
    (swap! app-state assoc :page :timeline))
  (defroute "/map" []
    (swap! app-state assoc :page :map))
  (hook-browser-navigation!))

(defmulti current-page #(@app-state :page))
(defmethod current-page :home []
  [home/render-page])
(defmethod current-page :timeline []
  [timeline/render-page])
(defmethod current-page :map []
  [map/render-map])
(defmethod current-page :default [])

(defn ^:export main []
  (app-routes)
  (reagent/render [current-page]
                  (.getElementById js/document "app")))
