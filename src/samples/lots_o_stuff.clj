(ns samples.lots-o-stuff)

(defn fruity
  "I can say 'fruity...x!'"
  [x]

  (println "fruity..."x)
  )

(defn lots-o-stuff []

  (fruity "apple")

  (def var "val")
  (def x 1)
  (do (println var) (println x) (println))

  (do (println (+ 1 2)) (println))

  (loop [i 0]
    (when (< i 5)
      (println i)
      (recur (inc i))))
  (println)

  (def listInt (list 1 2 3 4))
  (def listCh (list 'a 'b 'c 'd))
  (do (println listInt) (println listCh) (println))

  (def setInt (set '(1 2 2 3 3 3 4 4 4 4)))
  (def setCh (set '(a b b c c c 'd 'd 'd 'd)))
  (do (println setInt) (println setCh) (println))

  (def vecInt (vector 1 2 3 4))
  (def vecCh (vector 'a 'b 'c 'd))
  (do (println vecInt) (println vecCh) (println))

  (def hmapInt (hash-map 1 1 2 2 3 3 4 4))
  (def hmapCh (hash-map 'a 'a 'b 'b 'c 'c 'd 'd))
  (def hmapChInt (hash-map 'a 1 'b 2 'c 3 'd 4))
  (def hmapChStr (hash-map 'd "dddd" 'c "ccc" 'b "bb" 'a "a"))
  (def smapChStr (sorted-map 'd "dddd" 'c "ccc" 'b "bb" 'a "a"))
  (do (println hmapInt) (println hmapCh) (println hmapChInt) (println hmapChStr) (println smapChStr) (println))

  (def int-seq (seq [1 2 3]))                               ;; allowable var naming
  (def ch-seq (seq ['c 'b 'a]))
  (do (println int-seq) (println ch-seq) (println))

  )

(lots-o-stuff)