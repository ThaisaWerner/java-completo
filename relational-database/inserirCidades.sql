INSERT INTO cidades (nome, area, estado_id) VALUES
('Campinas', 795, 25),
('Niterói', 133.9, 19),
('Caruaru', 920.6, (SELECT id FROM estados WHERE sigla = 'PE')),
('Juazeiro do Norte', 248.2, (SELECT id FROM estados WHERE sigla = 'CE'))