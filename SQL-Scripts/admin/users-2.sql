create user 'akash'@'localhost' identified by 'password_123';

create user 'raghu'@'localhost' identified by 'password_123';

select * from mysql.`user`;

use javasql1_index;

GRANT INSERT, DELETE, SELECT ON `.*` TO
akash@localhost;

show grants for root@localhost;
show grants for akash@localhost;

show grants for raghu@localhost;

