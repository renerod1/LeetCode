/* Write your T-SQL query statement below */
SELECT a.id
FROM Weather a RIGHT JOIN Weather b ON a.recordDate = DATEADD(d, 1, b.recordDate)
WHERE a.temperature > b.temperature
ORDER BY b.recordDate;