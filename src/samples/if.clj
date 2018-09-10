(ns samples.if)

(defn is-small-nil? [number]
  (if (< number 100) "yes"))

(defn is-small-no? [number]
  (if (< number 100) "yes" "no"))

(defn is-small-more? [number]
  (if (< number 100)
    "yes"
    (do (print "saw a yuuuuge number! ") "no")))            ;; side-effect

;; tests
;;(comment
(do
  (println (is-small-nil? 50))
  (println (is-small-nil? 50000))
  (println (is-small-no? 50))
  (println (is-small-no? 50000))
  (println (is-small-more? 50))
  (println (is-small-more? 50000))
)
;;)
