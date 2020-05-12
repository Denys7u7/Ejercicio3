create database empresa;

use empresa;

create table empresa(
	id int primary key auto_increment,
    nombre varchar(30),
    nit varchar(17) unique,
    fundacion date,
    direccion varchar(75)
);

drop table empresa;

insert into 
empresa(nombre, nit, fundacion, direccion)
values ('Bytes', '0619-313294-102-4', '1999/01/01', 'San Salvador');

select * from empresa;