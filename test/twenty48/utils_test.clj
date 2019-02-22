(ns twenty48.utils-test
  (:require [clojure.test :refer :all]
            [twenty48.utils :refer :all]))




(deftest group-similar-test
  (testing "Rows for grouping of similar numbers"
    (is (= '((0) (2 2) (3) (2)) (group-similar '(0 2 2 3 2))))
    (is (= '((0) (2 2) (3)) (group-similar '(0 2 2 3))))
    (is (= '((0 0 0) (3)) (group-similar '(0 0 0 3))))
    ))



(deftest make-pair-test
  (testing "For grouping by 2"
    (is (= '((2 2) (2)) (make-pair '(2 2 2))))
    ))


(deftest move-right-test
  (testing "Rows for moving right "
    (is (= '(0 0 0 4) (move-right '(2 0 0 2))))
    (is (= '(0 0 4 4) (move-right '(2 0 2 4))))
    (is (= '(0 0 0 4) (move-right '(2 0 2 0))))
    (is (= '(0 0 0 4) (move-right '(0 0 2 2))))
    (is (= '(0 0 0 4) (move-right '(0 2 2 0))))
    (is (= '(0 0 2 4) (move-right '(0 2 2 2))))
    (is (= '(0 0 4 4) (move-right '(2 2 2 2))))
    (is (= '(0 0 2 4) (move-right '(0 2 2 2))))
    ))


(deftest move-left-test
  (testing "Rows for moving left "
    (is (= '(4 0 0 0) (move-left '(2 0 0 2))))
    (is (= '(4 4 0 0) (move-left '(2 0 2 4))))
    (is (= '(4 0 0 0) (move-left '(2 0 2 0))))
    (is (= '(4 0 0 0) (move-left '(0 0 2 2))))
    (is (= '(4 0 0 0) (move-left '(0 2 2 0))))
    (is (= '(4 2 0 0) (move-left '(0 2 2 2))))
    (is (= '(4 4 0 0) (move-left '(2 2 2 2))))
    (is (= '(4 2 0 0) (move-left '(0 2 2 2))))))

(deftest transpose-test
  (testing "Grid for transposing"
    (is (= '((0 0 2 0)
             (0 2 0 4)
             (2 0 2 4)
             (2 4 0 0))
           (transpose '((0 0 2 2)
                        (0 2 0 4)
                        (2 0 2 0)
                        (0 4 4 0)))))
    ))