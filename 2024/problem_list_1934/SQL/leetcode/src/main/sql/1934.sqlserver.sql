/* Write your T-SQL query statement below */
SELECT a.user_id, (CASE COUNT(b.user_id) WHEN 0 THEN 0 ELSE ROUND(SUM((CASE b.action WHEN 'confirmed' THEN 1.0 ELSE 0 END))/COUNT(b.user_id), 2) END) AS confirmation_rate
FROM Signups a LEFT JOIN Confirmations b ON a.user_id = b.user_id
GROUP BY a.user_id;