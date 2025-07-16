SELECT 
    regiao AS 'Região',
    SUM(populacao) AS Total
FROM estados
GROUP BY regiao
ORDER BY Total DESC;