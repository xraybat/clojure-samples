(ns samples.exceptions
  (:gen-class))

(defn example []
  (try
    (aget (int-array [1 2 3]) 5)                            ;; force an exception
    (catch java.io.FileNotFoundException e (println (str "caught file not found exception: " (.toString e))))
    (catch Exception e (println (str "caught exception: " (.toString e))))
    (finally (println "finally...")))
  (println "let's move on")
  )

(example)