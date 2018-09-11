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

;; also works with other seqs
;; vectors
(println (index-of-any #{\z \a} [\z \z \a \b \y \y \c \d \x \x]))
(println (index-of-any #{\b \y} [\z \z \a \b \y \y \c \d \x \x]))

(println (index-of-any #{:z :a} [:z :z :a :b :y :y :c :d :x :x]))
(println (index-of-any #{:b :y} [:z :z :a :b :y :y :c :d :x :x]))

;; lists
(println (index-of-any #{\z \a} '(\z \z \a \b \y \y \c \d \x \x)))
(println (index-of-any #{\b \y} '(\z \z \a \b \y \y \c \d \x \x)))

;; sets (but no dupes allowed and index order might be sketchy)
(println (index-of-any #{\z \a} #{\z \a \b \y \c \d \x}))
(println (index-of-any #{\b \y} #{\z \a \b \y \c \d \x}))

;; more general usages
(println)
(println (nth
           (index-filter #{:h} [:t :t :h :t :h :t :t :t :h :h])
           2))                                              ;; 3rd occurrence, nth-1, starts at 0

