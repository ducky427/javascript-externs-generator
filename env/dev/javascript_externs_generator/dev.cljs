(ns ^:figwheel-no-load javascript-externs-generator.dev
  (:require [javascript-externs-generator.core :as core]
            [devtools.core :as devtools]))

(enable-console-print!)

(devtools/set-pref! :install-sanity-hints true)
(devtools/install!)

(core/init!)
