(ns samples.loop)

(defn loop-1 [no-iters]
  (println
    (loop [result [] x no-iters]
      (if (zero? x)
        result
        (recur (conj result x) (dec x))))
    )
  )

;;(comment
(loop-1 5)
;;)