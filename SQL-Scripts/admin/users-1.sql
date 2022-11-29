-- *.*
-- 'javasql1-inheritance.*'
-- 'javasql1_index.player'
GRANT INSERT ON `*.*` TO rajesh@localhost;

-- `
GRANT SELECT ON `*.*` TO rajesh@localhost;

GRANT SELECT (player_id, country, age) ON `javasql1_index.player` TO rajesh@locahost;
