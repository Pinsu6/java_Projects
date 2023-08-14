create table login(meter_no varchar(20),username varchar(20),
password varchar(20),user varchar(20));
describe login;
alter table login
change user  username varchar(20);
select * from login