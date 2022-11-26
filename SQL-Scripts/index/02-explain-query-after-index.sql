
select * from player where country = 'India';

EXPLAIN select * from player where country = 'India';

-- '1', 'SIMPLE', 'player', NULL, 'ref', 'player_country', 'player_country', '83', 'const', '19', '100.00', NULL
