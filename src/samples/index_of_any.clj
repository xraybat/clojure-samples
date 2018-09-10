(ns samples.index-of-any)

(defn indexed [coll]
  (map-indexed vector coll))

(println (indexed "abcde"))

(defn index-filter [pred coll]
  (when pred
    (for [[idx elt] (indexed coll) :when (pred elt)]
      idx)))

(println (index-filter #{\a \b} "abcdbbb"))
(println (index-filter #{\a \b} "xyz"))

(defn index-of-any [pred coll]
  (first (index-filter pred coll)))

(println (index-of-any #{\z \a} "zzabyycdxx"))
(println (index-of-any #{\b \y} "zzabyycdxx"))