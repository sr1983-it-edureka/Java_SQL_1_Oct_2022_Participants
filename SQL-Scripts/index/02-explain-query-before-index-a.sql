select * from player where country = 'India';

EXPLAIN select * from player where country = 'India';


--
-- '1', 'SIMPLE', 'player', NULL, 'ALL', NULL, NULL, NULL, NULL, '--100', '10.00', 'Using where'
