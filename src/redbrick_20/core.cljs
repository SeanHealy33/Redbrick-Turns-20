(ns ^:figwheel-always redbrick-20.core
    (:require
              [reagent.core :as reagent :refer [atom]]
              [redbrick-20.views.home :as home]))

(enable-console-print!)

(println "Edits to this text should show up in your developer console.")

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {}))

(defn hello-world []
  [home/render-page])

(reagent/render-component [hello-world]
                          (. js/document (getElementById "app")))


(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
