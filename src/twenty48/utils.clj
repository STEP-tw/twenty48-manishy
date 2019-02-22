(ns twenty48.utils
  (:gen-class))

(def filter-zero (partial filter (comp not zero?)))

(def group-similar (partial partition-by identity))

(def make-pair (partial partition-all 2)) 

(def filter-zero-and-group-numbers (comp (partial map make-pair) group-similar filter-zero))

(def merge-groups (partial reduce concat))         

(def add-similar (comp (partial map (partial apply +))))

(def padding (partial repeat 4))

(def add-left-padding (partial concat (padding 0)))

(def add-right-padding #( concat %1 (padding 0)))

(def take-last-4 (partial take-last 4))

(def take-first-4 (partial take 4))

(def transpose (partial apply map list))

(def move-right (comp take-last-4 add-left-padding add-similar
                      merge-groups (partial map reverse)
                      filter-zero-and-group-numbers
                      ))

(def move-left (comp take-first-4 add-right-padding add-similar
                     merge-groups
                     filter-zero-and-group-numbers
                     ))

