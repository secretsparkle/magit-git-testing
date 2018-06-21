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

(defn my-map [func lst]
  (loop [coll lst
         acc nil]
    (if (empty? coll)
      (reverse acc)
      (recur (rest coll) (cons (func (first coll)) acc)))))

(defn my-reduce [func init lst]
  (loop [coll lst
         acc init]
    (if (empty? coll)
      acc
      (recur (rest coll) (func (first coll) acc)))))

(defn elem [elt lst]
  (loop [piece elt
         whole lst]
    (if (empty? whole)
      nil
      (if (= piece (first whole))
        true
        (recur piece (rest whole))))))
