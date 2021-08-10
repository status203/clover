(ns clover.p22-count)

(defn my-count
  [s]
  (reduce (fn [acc _] (inc acc)) 0 s))

(comment
  (= (my-count '(1 2 3 3 1)) 5)

  (= (my-count "Hello World") 11)

  (= (my-count [[1 2] [3 4] [5 6]]) 3)

  (= (my-count '(13)) 1)

  (= (my-count '(:a :b :c)) 3)
  )