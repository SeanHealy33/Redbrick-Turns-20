(ns redbrick.views.components
    (:require [reagent.core :as reagent]))

(defn header [title links]
  [:header {:class "mdl-layout__header mdl-layout__header--scroll"}
    [:div {:class "mdl-layout__header-row"}
      [:span {:class "mdl-layout-title"} title]
      [:div {:class "mdl-layout-spacer"}]
      [:nav {:class "mdl-navigation"}
        [:a {:class "mdl-navigation__link"
             :href ""} links]]]])
