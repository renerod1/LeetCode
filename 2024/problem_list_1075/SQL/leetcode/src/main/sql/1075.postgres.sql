-- Write your PostgreSQL query statement below
SELECT a.project_id, ROUND(SUM(b.experience_years)/CAST(COUNT(b.experience_years) AS numeric), 2) AS average_years
FROM Project a LEFT JOIN Employee b ON a.employee_id = b.employee_id
GROUP BY a.project_id;