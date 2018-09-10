(ns samples.shared-state)

;; atom used for shared state, starting with an empty set
(def visitors (atom #{}))

(defn hello
  "remember who we've said hello to
  default username is 'world'"
  ([name]                                                   ;; must swap in/out of shared state (atoms)
   (swap! visitors conj name)
   (str "hello, " name "!")
    )
  ([]
   (str "hello, world!")
    )
  )

(defn hello-reach
  "remember who we've said hello to
  default username is 'world'"
  ([{name :first-name}]                                     ;; must swap in/out of shared state (atoms)
   (swap! visitors conj name)
   (str "hello, " name "!")
    )
  ([]
   (str "hello, world!")
    )
  )

(defn who []
  (println "visitors:" @visitors)
  )

(defn try-it []
  (println (hello "peter"))
  (println (hello "stu"))
  (println (hello "aaron"))
  (println (hello))
  (do (println) (who))
  )

;; test
(comment
  (try-it)
  )
