(ns samples.ifs)

(println (true? true))

;; @TODO make 'if(' work, not recognising symbol atm
(println (​if​ (true) ​"is true"​ ​"is false"​))            ;; empty list
(println (​if​ () ​"() is true"​ ​"() is false"​))          ;; empty list