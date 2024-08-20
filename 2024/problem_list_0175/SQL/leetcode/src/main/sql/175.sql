# Write your MySQL query statement below
SELECT a.firstname, a.lastname, b.city, b.state
FROM person a LEFT JOIN address b ON a.personId = b.personId;