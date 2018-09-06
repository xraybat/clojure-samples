(ns samples.records)

(defrecord Person [first-name middle-name last-name])

(defn person [first-name middle-name last-name]
  (->Person first-name middle-name last-name)
  )

(def foo (->Person "Aaron" "X"  "Bedra"))
(println foo)
(println (:first-name foo))
(println (:middle-name foo))
(println (:last-name foo))

(println (person "Aaron" "Y" "Bedra"))