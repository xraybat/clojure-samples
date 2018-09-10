(ns samples.loop)

(defn loop-1 [no-iters]                                     ;; loop w/ recur
  (println
    (loop [result [] iter no-iters]
      (if (zero? iter)
        result
        (recur (conj result iter) (dec iter))))
    )
  )

(defn countdown-recur [result iter]
  (if (zero? iter)
    result
    (recur (conj result iter) (dec iter))))

(defn countdown-into-take [result iter]
  (into result (take iter (iterate dec iter))))

;; have to bump iter up by 1
(defn countdown-into-drop [result iter]
  (into result (drop-last (reverse (range (+ iter 1))))))

(defn countdown-vec [iter]
  (vec (reverse (rest (range (+ iter 1))))))

;;(comment
(loop-1 5)
(println (countdown-recur [] 5))
(println (countdown-into-take [] 5))
(println (countdown-into-drop [] 5))
(println (countdown-vec 5))
;;)