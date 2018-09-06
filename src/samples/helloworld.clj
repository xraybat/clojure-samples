(ns samples.helloworld)

(require 'samples.shared-state)

(defn hello-local [name]
  "I let others say 'hello, name!'"

  (str "hello, " name "!")
  )

(defn say-helloworld
  "I can say 'hello, world!'"
  []

  ;; look! a comment...
  (println "hello, world!")
  )

;; use 'do' as block??
(do
  (say-helloworld)
  (println hello-local)                                       ;; the function itself
  (println (hello-local "peter"))
  (println (samples.shared-state/hello "peter"))
  (println (samples.shared-state/hello "stu"))
  (do (samples.shared-state/who) (println))
  )
