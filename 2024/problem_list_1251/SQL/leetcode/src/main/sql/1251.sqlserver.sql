/* Write your T-SQL query statement below */
SELECT DISTINCT c.product_id, COALESCE(d.average_price, 0) AS average_price
FROM Prices c LEFT JOIN 
    (SELECT a.product_id, ROUND(SUM(a.price * b.units) / CONVERT(float,SUM(b.units)), 2) AS average_price
    FROM Prices a LEFT JOIN UnitsSold b ON a.product_id = b.product_id
    WHERE b.purchase_date BETWEEN a.start_date AND a.end_date
    GROUP BY a.product_id ) AS d ON c.product_id = d.product_id;