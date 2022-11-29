-- file per tablespace (default)

-- general tablespace

create tablespace `ts1` add datafile 'ts1.ibd' Engine =InnoDB;

create table temp3 (id integer) tablespace ts1;
create table temp4 (id integer) tablespace ts1;

create tablespace `ts2` add datafile 'ts2.ibd' Engine =InnoDB;

create table temp5 (id integer) tablespace ts2;
create table temp6 (id integer) tablespace ts2;

select * from information_schema.innodb_tablespaces;

alter table temp5 tablespace = ts1;
