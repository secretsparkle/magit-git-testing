(ns first.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn add [& args]
  (loop [coll args
         acc 0]
    (if (empty? coll)
      acc
      (recur (rest coll) (+ (first coll) acc)))))
