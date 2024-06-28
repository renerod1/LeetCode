/* Write your T-SQL query statement below */
SELECT a.tweet_id
FROM (SELECT (CASE WHEN LEN(content) > 15 THEN tweet_id ELSE -1 END) AS tweet_id FROM Tweets) AS a
WHERE a.tweet_id NOT IN (-1);