/* Write your PL/SQL query statement below */
SELECT id, movie, description, rating
FROM cinema
WHERE (MOD(id, 2) != 0) AND (description NOT IN ('boring'))
ORDER BY rating DESC;