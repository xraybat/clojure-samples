(ns samples.destructure
  (:gen-class))

(defn example []
  (def my-vector [1 2 3 4])

  (let [[a b c d] my-vector]
    (println a b c d))

  (let [[a b _ _] my-vector]
    (println a b))

  (let [[_ _ c d] my-vector]
    (println c d))

  (let [[a b :as coords] my-vector]
    (println a b "total:" (count coords)))

  (let [[a b & the-rest] my-vector]
    (println a b the-rest))

  (let [[a & the-rest :as all] my-vector]
    (println a the-rest "(while all is" all "all)"))

  (println)
  (def my-map {"a" 1 "b" 2 "c" 3})

  (let [{a "a" b "b" c "c"} my-map]
    (println a b c))
  ;; no 'the-rest' for maps

  )

(require '[clojure.string :as str])

(defn ellipsise [words]
  (let [[w1 w2 w3] (str/split words #"\s+")]
    (str/join " " [w1 w2 w3 "..."])))

(example)
(println)
(println (ellipsise "The quick brown fox jumps over the lazy dog."))
