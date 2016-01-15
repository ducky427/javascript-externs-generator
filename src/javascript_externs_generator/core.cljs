(ns javascript-externs-generator.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as rf]
            [goog.dom :as dom]
            [javascript-externs-generator.ui.subs]
            [javascript-externs-generator.ui.handlers]
            [javascript-externs-generator.ui.views :as ui]))

(defn mount-root
  []
  (reagent/render [ui/extern-generator] (dom/getElement "app")))

(defn init! []
  (rf/dispatch-sync [:initialize])
  (mount-root))
