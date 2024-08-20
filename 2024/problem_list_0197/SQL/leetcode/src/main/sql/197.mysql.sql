# Write your MySQL query statement below
SELECT a.id
FROM Weather a RIGHT JOIN Weather b ON a.recordDate = DATE_ADD(b.recordDate, INTERVAL 1 day)
WHERE a.temperature > b.temperature
ORDER BY b.recordDate;