(ns samples.destructure
  (:gen-class))

(defn example []
  (def my-vector [1 2 3 4])

  (let [[a b c d] my-vector]
    (println a b c d))

  (let [[a b & the-rest] my-vector]
    (println a b the-rest))

  (let [[a & the-rest :as all] my-vector]
    (println a the-rest "(while all is" all "all)"))

  (def my-map {"a" 1 "b" 2 "c" 3})

  (let [{a "a" b "b" c "c"} my-map]
    (println a b c))
  ;; no 'the-rest' for maps

  )

(example)