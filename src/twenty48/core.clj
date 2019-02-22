(ns twenty48.core
  (:gen-class)
  (:require [twenty48.utils :refer :all]))



(def move-grid-left (partial map move-left))

(def move-grid-right (partial map move-right))

(defn move-grid-down
  "Moves an entire grid down"
  [grid]
  grid)

(defn move-grid-up
  "Moves an entire grid up"
  [grid]
  grid)
