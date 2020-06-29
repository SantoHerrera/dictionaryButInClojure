(ns dictionarybutinclojure.mainMain
 (:gen-class)
 (:require [cheshire.core :refer :all]))

;(:require [:use cheshire.core])


(defn getNewUrl
 [word]
 (str "https://dictionaryapi.com/api/v3/references/" "spanish" "/json/" word "?key=" "226a8d2c-2502-4efd-ac72-5a26eb317695"))

(defn getInput []
 (do (print "Enter word to find definition ------")
  (flush)
  (getNewUrl (str (read-line)))))

;(parse-string (slurp (getNewUrl "platano")))
