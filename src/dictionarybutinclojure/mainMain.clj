(ns dictionarybutinclojure.mainMain
 (:gen-class)
 (:require [cheshire.core :refer :all]))
(defn getNewUrl
  [word]
  (str "https://dictionaryapi.com/api/v3/references/" "spanish" "/json/" word "?key=" "226a8d2c-2502-4efd-ac72-5a26eb317695"))
(defn getJson [word] (parse-string (slurp (getNewUrl word))))
(defn getInput []
 (do (println "Enter word to find definition ->")
  (flush)
  (println (mapcat #(% "shortdef") (getJson (str (read-line)))))))
