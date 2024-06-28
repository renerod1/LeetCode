/* Write your PL/SQL query statement below */
SELECT (CASE WHEN LENGTH(content) > 15 THEN tweet_id ELSE -1 END) AS tweet_id 
FROM Tweets
WHERE (CASE WHEN LENGTH(content) > 15 THEN tweet_id ELSE -1 END) NOT IN (-1);