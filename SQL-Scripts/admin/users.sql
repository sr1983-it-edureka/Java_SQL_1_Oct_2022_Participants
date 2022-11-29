select * from mysql.user;

create user 'rajesh'@'localhost' identified by 'password_123';

GRANT INSERT, DELETE ON `javasql1_sql_queries.*` TO rajesh@localhost;
