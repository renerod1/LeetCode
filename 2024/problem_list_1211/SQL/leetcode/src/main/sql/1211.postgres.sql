-- Write your PostgreSQL query statement below
SELECT a.query_name, ROUND(SUM(a.rating / CAST(a.position AS numeric)) / COUNT(a.rating), 2) AS quality, COALESCE(ROUND(((SELECT COUNT(b.rating) FROM queries b WHERE a.query_name = b.query_name AND b.rating < 3 GROUP BY b.query_name) / CAST(COUNT(a.rating) AS numeric)) * 100, 2), 0) AS poor_query_percentage
FROM queries a
WHERE query_name IS NOT NULL
GROUP BY a.query_name;