(ns dictionarybutinclojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn printInput
  [idk] (println idk "nigga we made it"))

;(defn x (read-line))

(do (print "What's your name? ")
           (flush)
           (printInput (str (read-line))))

;(do (print "What's your name? ")
;           (flush)
;           (read-line))
;
;this works
;(do (print "What's your name? ") 
;           (flush) 
;
;           (read-line))
;(flush (read-line))
