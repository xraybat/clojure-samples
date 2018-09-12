(ns samples.seq)

;; lists
(println (first '(1 2 3)))
(println (rest '(1 2 3)))
;; 'cons'truct adds to given, returns new *seq*
(println (cons 0 '(1 2 3)))

;; vectors
(println (first [1 2 3]))
(println (rest [1 2 3]))
(println (cons 0 [1 2 3]))

(comment
  ;; quick 'conj'oin test; note: result is a seq *in* seq
  (println (conj '(1 2) '(3 4)))
  (println (conj [1 2] [3 4]))
  )

(def my-list '(1 2 3 4))
(def my-vec [1 2 3 4])
(def my-map {:1 "one", :2 "two", :3 "three", :4 "four"})
(def my-set #{:1 "one" :2 "two" :3 "three" :4 "four"})
(println "my-list" my-list)
(println "my-vec" my-vec)
(println "my-map" my-map)
(println "my-set" my-set)
(def my-seq-list (cons 0 my-list))
(def my-seq-vec (cons 0 my-vec))
(def my-seq-map (cons [:0, "zero"] my-map))
(def my-seq-set (cons [:0 "zero"] my-set))
(println "my-seq-list, sorted" (sorted-set my-seq-list))
(println "my-seq-vec, sorted" (sorted-set my-seq-vec))
(println "my-seq-map, sorted" (sorted-set my-seq-map))      ;; works
;;(println "my-seq-map, sorted" (sorted-map my-seq-map))      ;; sorted-map fails??
(println "my-seq-set" my-seq-set)
(println "my-seq-set, sorted" (sorted-set my-seq-set))
(println "(list? my-list" (list? my-list) ")")
(println "(list? my-vec" (list? my-vec) ")")
(println "(list? my-map" (list? my-map) ")")
(println "(list? my-set" (list? my-set) ")")
(println "(seq? my-list" (seq? my-list) ")")
(println "(seq? my-vec" (seq? my-vec) ")")
(println "(seq? my-map" (seq? my-map) ")")
(println "(seq? my-set" (seq? my-set) ")")
(println "(seq? my-seq-list" (seq? my-seq-list) ")")
(println "(seq? my-seq-vec" (seq? my-seq-vec) ")")
(println "(seq? my-seq-map" (seq? my-seq-map) ")")
(println "(seq? my-seq-set" (seq? my-seq-set) ")")
