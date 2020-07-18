(ns dictionarybutinclojure.mainMain
 (:gen-class)
 (:require [cheshire.core :refer :all]))

(declare getInput)

(defn getNewUrl
  [word]
  (str "https://dictionaryapi.com/api/v3/references/" "spanish" "/json/" word "?key=" "226a8d2c-2502-4efd-ac72-5a26eb317695"))

(defn getJson [word] (parse-string (slurp (getNewUrl word))))


(defn bulletPoint
  [word]
  (println (str "> " word)))



(def nothingEnteredPrompt "please enter something before hitting enter :)")

(defn setUp ([] (println nothingEnteredPrompt) (getInput))
  ([wordEntered] (let [wordJson (parse-string (slurp (getNewUrl wordEntered)))]
                  (run! println (mapcat #(% "shortdef") wordJson)))))

(defn getInput []
 (println "Enter word to find definition ->")
 (flush)
 (let [wordEntered (read-line)]
  (if (clojure.string/blank? wordEntered)
    (setUp)
    (setUp wordEntered))))

(defn whatToDo [word] (println (str word)))

(defn input [] (println "worked"))
