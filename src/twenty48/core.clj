(ns twenty48.core
  (:gen-class)
  (:require [twenty48.utils :refer :all]))

(def move-grid-left (partial map move-left))
(def move-grid-right (partial map move-right))

(def move-grid-down (comp transpose move-grid-right transpose))
(def move-grid-up (comp transpose move-grid-left transpose))
