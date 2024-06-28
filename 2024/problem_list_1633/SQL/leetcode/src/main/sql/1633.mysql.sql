# Write your MySQL query statement below
SELECT b.contest_id, ROUND((COUNT(b.contest_id) / (SELECT COUNT(c.user_id) FROM users c) * 100), 2) AS percentage
FROM users a INNER JOIN register b ON a.user_id = b.user_id
GROUP BY b.contest_id
ORDER BY percentage desc, contest_id asc;