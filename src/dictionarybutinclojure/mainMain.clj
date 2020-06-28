(ns dictionarybutinclojure.mainMain
 (:gen-class))


;(defn getInput []
; (do (print "What's your name? ")
; (flush)
;  (printInput (str (read-line)))))

(defn nameOfFunctionHere 
 [here]
  (println "fuck" here))

(defn getNewUrl 
 [word]
  (println (str "will" "this " word "work")))

(defn getInput [] 
 (do (print "What's your name? ")
  (flush)
   (getNewUrl (str (read-line)))))