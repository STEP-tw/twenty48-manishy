(ns twenty48.utils
  (:gen-class))


; ===================================================

(def filter-zero (partial filter (comp not zero?)))
(def group-similar (partial partition-by identity))
(def make-pair (partial partition-all 2)) 
(def group-numbers (comp (partial map make-pair) group-similar))
(def merge-group (partial reduce concat))         
(def add-similar (comp (partial map (partial apply +))))
(def padding (partial repeat 4))
(def add-left-padding (partial concat (padding 0)))
(def add-right-padding #( concat %1 (padding 0)))
(def take-last-4 (partial take-last 4))
(def take-first-4 (partial take 4))



(def move-right (comp take-last-4 add-left-padding add-similar
                      merge-group (partial map reverse)
                      group-numbers filter-zero
                      ))

(def move-left (comp take-first-4 add-right-padding add-similar
                     merge-group
                     group-numbers filter-zero
                     ))
 
; ======================================================
