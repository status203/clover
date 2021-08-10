(ns clover.p19-mylast)

(defn my-last
  "Returns the last element of a sequence"
  [s]
  (reduce (fn [_ v] v) s))

(comment
  (= (my-last [1 2 3 4 5]) 5)

  (= (my-last '(5 4 3)) 3)

  (= (my-last ["b" "c" "d"]) "d")
  )