(ns javascript-externs-generator.prod
  (:require [javascript-externs-generator.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(javascript-externs-generator/init!)
