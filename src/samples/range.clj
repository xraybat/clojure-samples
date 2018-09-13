(ns samples.range)

(do
  (println (range 10))
  (println (range 10 20))
  (println (range 1 25 2))
  (println (range 0 -1 -0.25))                              ;; negative steps
  (println (range 1/2 4 1))                                 ;; ratios
  (println))

(do
  (println (repeat 5 1))
  (println (repeat 10 "x"))
  (println))

(do
  (println (take 10 (iterate inc 1) ))                      ;; infinite seq lazily evaluated by 'take'
  (println (take 20 (repeat 1)))                            ;; same here
  (println))

;; a useful (infinite) general sequence
(def whole-numbers (iterate inc 1))                         ;; not evaluated, no infinite loop

(println (take 10 whole-numbers))