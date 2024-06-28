/* Write your T-SQL query statement below */
SELECT a.machine_id, ROUND(SUM(b.timestamp - a.timestamp) / COUNT(a.process_id), 3) AS processing_time
FROM Activity a INNER JOIN Activity b ON a.machine_id = b.machine_id AND a.process_id = b.process_id
WHERE a.activity_type IN ('start') AND b.activity_type IN ('end')
GROUP BY a.machine_id;