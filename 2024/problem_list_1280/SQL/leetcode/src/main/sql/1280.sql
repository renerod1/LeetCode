# Write your MySQL query statement below
SELECT a.student_id, a.student_name, b.subject_name, COUNT(c.student_id) AS attended_exams
FROM students a CROSS JOIN subjects b
LEFT JOIN examinations c ON a.student_id = c.student_id AND b.subject_name = c.subject_name
GROUP BY a.student_id, a.student_name, b.subject_name
ORDER BY a.student_id, a.student_name;