CREATE OR REPLACE FUNCTION NthHighestSalary(N INT) RETURNS TABLE (Salary INT) AS $$
BEGIN
    RETURN QUERY (
        -- Write your PostgreSQL query statement below.        
        SELECT (CASE WHEN N < 1 THEN null ELSE (SELECT DISTINCT a.salary FROM Employee ORDER BY a.salary DESC LIMIT 1 OFFSET N-1) END)
    );
END;
$$ LANGUAGE plpgsql;