# Write your MySQL query statement below
SELECT a.name
FROM Employee a INNER JOIN Employee b ON a.id = b.managerId
GROUP BY a.name, b.managerId
HAVING COUNT(b.managerId) > 4;