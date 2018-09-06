(ns samples.shared-state)

;; atom used for shared state, starting with an empty set
(def visitors (atom #{}))

(defn hello [name]
  "remember who we've said hello to"

  ;; must swap in/out of shared state (atoms)
  (swap! visitors conj name)
  (str "hello, " name "!")
  )

(defn who []
  (println "visitors:" @visitors)
  )

(defn try-it []
  (println (hello "peter"))
  (println (hello "stu"))
  (println (hello "aaron"))
  (do (println) (who))
  )

;;(try-it)
