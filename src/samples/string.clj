(ns samples.string)

(require '[clojure.string :refer [join]])

(do
  (println (str "one" "two" "three"))
  (println (apply str "one" "two" "three"))
  (println (interpose "," ["one" "two" "three"]))
  (println)
  )

(do
  (println (str (interpose ", " ["one" "two" "three"])))
  (println (apply str (interpose ", " ["one" "two" "three"]))) ;; note:'apply'
  (println)
  )

;; short-hand for 'interpose'
(do
  (println (join \, ["one" "two" "three" ]))
  (println (join ", " ["one" "two" "three" ]))
  (println)
  )
