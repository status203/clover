(ns clover.p26-fibonacci)

(defn fib
  ([] (lazy-cat [1 1] (map + (fib) (rest (fib)))))
  ([n] (take n (fib))))

(comment
  (= (fib 3) '(1 1 2))

  (= (fib 6) '(1 1 2 3 5 8))

  (= (fib 8) '(1 1 2 3 5 8 13 21))
  )