(ns dictionarybutinclojure.core
  (:gen-class)
  (:require [dictionarybutinclojure.mainMain :as main]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;(defn printInput
 ; [idk] (println idk "nigga we made it"))
;(printInput "yeah")
;(defn x (read-line))

(defn -main [& args]
 (main/nameOfFunctionHere "your couch nigga"))
 ;(mainMain/test))

(do (print "What's your name? ")
 (flush)
  (read-line))


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
