(ns dictionarybutinclojure.core
  (:gen-class)
  (:require [dictionarybutinclojure.mainMain :as main]))

(defn -main [& args]
 (main/getInput))
