# Write your MySQL query statement below
SELECT CLASS FROM Courses
GROUP BY CLASS
HAVING COUNT(STUDENT) >= 5;