(ns samples.let)

(defn square-corners [bottom left size]
  (let
    [top (+ bottom size) right (+ left size)]
    [[bottom left] [top left] [top right] [bottom right]]
    (println bottom left top right)
    )
  )

(square-corners 10 10 20)