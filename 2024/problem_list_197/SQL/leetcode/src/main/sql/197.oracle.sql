/* Write your PL/SQL query statement below */
SELECT a.id
FROM Weather a RIGHT JOIN Weather b ON a.recordDate = b.recordDate + 1
WHERE a.temperature > b.temperature
ORDER BY b.recordDate;