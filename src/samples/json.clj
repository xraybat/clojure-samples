(ns samples.json
  (:require [clojure.data.json :as json])
  (:gen-class))

(defn example []
  (println (json/write-str {:a 1 :b 2}))
  )

(example)