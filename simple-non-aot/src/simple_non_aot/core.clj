(ns simple-non-aot.core)

(defn fib
  ([n]
   (take n (fib 1 1)))
  ([a b]
   (cons a (lazy-seq (fib b (+ a b))))))

(defn -main []
  (println (fib 20)))
