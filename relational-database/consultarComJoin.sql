SELECT * FROM cidades c
INNER JOIN prefeitos p ON c.id = p.id_cidade;

SELECT * FROM cidades c 
LEFT JOIN prefeitos p ON c.id = p.id_cidade;

SELECT * FROM cidades c
RIGHT JOIN prefeitos p ON c.id = p.id_cidade;

SELECT * FROM cidades c
FULL JOIN prefeitos p ON c.id = p.id_cidade;