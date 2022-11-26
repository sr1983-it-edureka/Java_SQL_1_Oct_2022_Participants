show variables;

show variables where variable_name = 'secure_file_priv';
show variables like 'secure_file_priv';

select * from player;

select * into outfile "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\player.txt" from player;


select * into outfile "C:\\ProgramData\\MySQL\\MySQL Server 8.0\\Uploads\\player-v2.txt" 
FIELDS TERMINATED BY ","
ENCLOSED BY '"'
from player;
