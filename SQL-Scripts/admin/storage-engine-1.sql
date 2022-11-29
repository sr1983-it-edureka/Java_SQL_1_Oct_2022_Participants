show engines;

create table temp1 (id integer);

create table temp2 (id integer) ENGINE = MYISAM;

show create table temp1;

show create table temp2;

ALTER TABLE temp2 ENGINE = InnoDB;



select * from player;

