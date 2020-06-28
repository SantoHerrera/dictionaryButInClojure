(ns dictionarybutinclojure.core
  (:gen-class)
  (:require [dictionarybutinclojure.mainMain :as main]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn -main [& args]
 (main/getInput))
