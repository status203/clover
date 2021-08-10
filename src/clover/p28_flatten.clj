(ns clover.p28-flatten)

(defn my-flatten
  [s]
  (reduce (fn [acc v] (if (coll? v)
                        (vec (concat acc (my-flatten v)))
                        (conj acc v)))
          []
          s))

(comment
  (seq? "aoeu")
  (seq? [])
  (coll? [])
  (coll? (range 5))
  (coll? "AOEU")
  

  (= (my-flatten '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))

  (= (my-flatten ["a" ["b"] "c"]) '("a" "b" "c"))

  (= (my-flatten '((((:a))))) '(:a))
  )