(ns dictionarybutinclojure.mainMain
 (:gen-class))

;(:require [:use cheshire.core])


(defn getNewUrl
 [word]
 (println (str "https://dictionaryapi.com/api/v3/references/" "spanish" "/json/" word "?key=" "226a8d2c-2502-4efd-ac72-5a26eb317695")))

(defn getInput []
 (do (print "Enter word to find definition")
  (flush)
  (getNewUrl (str (read-line)))))

(defn randomT [none] (println (str none)))

;((def willIt {:fuck "yeah"}))

(generate-string willIt)
