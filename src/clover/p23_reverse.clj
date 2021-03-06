(ns clover.p23-reverse)

(defn my-reverse
  [s]
  (reduce (fn [acc v] (cons v acc)) () s))

(comment
  (my-reverse (range 100000))

  (= (my-reverse [1 2 3 4 5]) [5 4 3 2 1])

  (= (my-reverse (sorted-set 5 7 2 7)) '(7 5 2))

  (= (my-reverse [[1 2] [3 4] [5 6]]) [[5 6] [3 4] [1 2]])
  )