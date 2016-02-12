(ns redbrick-20.views.map
    (:require [reagent.core :as reagent]))

(defn home-render []
  [:div {:style {:height "250px"}}])

(defn home-did-mount [this]
  (let [map-canvas (reagent/dom-node this)
        map-options (clj->js {"center" (google.maps.LatLng.   53.3366916, -6.265777)
                              "zoom" 15})]
        (js/google.maps.Map. map-canvas map-options)))

(defn render-map []
  (reagent/create-class {:reagent-render home-render
                         :component-did-mount home-did-mount}))
