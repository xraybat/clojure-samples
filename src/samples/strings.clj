(ns samples.strings
  (:gen-class))

(defn blank? [str]
  (every? #(Character/isWhitespace %) str)
  )

(println (blank? "str"))
(println (blank? "   "))
(println (blank? ""))
(println (blank? "\t"))
(println (blank? "\tstuff\n"))
(println (blank? "\t\n"))
(println (blank? nil))
