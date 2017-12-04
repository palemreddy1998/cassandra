# cassandra client example
CREATE KEYSPACE ReddyKS WITH replication = {'class': 'SimpleStrategy', 'replication_factor' : 3};
create table reddyks.emp(empid text primary key,firstname text,lastname text);
insert into reddyks.emp(empid,firstname,lastname) values('101','alan','gray');
select * from reddyks.emp;