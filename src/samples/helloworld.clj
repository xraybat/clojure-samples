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

;; use 'do' as block? yes, but 'do' really implies side-effects, and all return values are ignored bar the last
(do
  (println (resolve 'say-helloworld))
  (println (meta #'say-helloworld))
  (say-helloworld)
  (println (resolve 'hello-local))
  (println (meta #'hello-local))
  (println hello-local)                                       ;; the function itself
  (println (hello-local "peter"))
  (println (resolve 'samples.shared-state/hello))
  (println (meta #'samples.shared-state/hello))
  (println (samples.shared-state/hello "peter"))
  (println (samples.shared-state/hello "stu"))
  (println (samples.shared-state/hello))
  (println (resolve 'samples.shared-state/hello-reach))
  (println (meta #'samples.shared-state/hello-reach ))
  (println (samples.shared-state/hello-reach {:last-name "smith", :first-name "pete"}))
  (do (samples.shared-state/who) (println))
  nil                                                       ;; 'do' return??
  )
