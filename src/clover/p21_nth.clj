(ns clover.p21-nth)

(defn zipmap-nth [s index]
  ((-> index inc range (zipmap s))
   index))

(defn reduce-nth [s index]
  (loop [s s index index]
    (if (zero? index) (first s)
        (recur (rest s) (dec index)))))

(defn my-nth [s index]
  (reduce-nth s index))

(comment
  (= (my-nth '(4 5 6 7) 2) 6)

  (= (my-nth [:a :b :c] 0) :a)

  (= (my-nth [1 2 3 4] 1) 2)
  
  (= (my-nth '([1 2] [3 4] [5 6]) 2) [5 6])
  )