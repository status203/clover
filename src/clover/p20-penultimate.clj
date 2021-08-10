(ns clover.p20-penultimate)

(defn penultimate
  "Returns the penultimate value of a sequence"
  [s] (-> s reverse rest first))

(comment
  (= (penultimate (list 1 2 3 4 5)) 4)

  (= (penultimate ["a" "b" "c"]) "b")

  (= (penultimate [[1 2] [3 4]]) [1 2])
  )