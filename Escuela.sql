create database Escuela

use Escuela

create table Alumnos(
noContrlo varchar (10) not null,
nombre varchar(50),
aPaternal varchar(50),
aMaternal varchar (50),
constraint pk_alumnos primary key(nocontrlo)
)

create procedure alta_alumnos(
@nc varchar(10),
@nom varchar (50),
@ap varchar(50),
@am varchar(50)
)
as 
insert into Alumnos
values (@nc,@nom,@ap,@am)
go

create procedure edita_alumnos(
@nc varchar(10),
@nom varchar (50),
@ap varchar(50),
@am varchar(50)
)
as 
update Alumnos set nombre=@nom,
                   aPaternal=@ap,
				   aMaternal=@am
where noContrlo=@nc
go

create procedure borrar_alumnos(
@nc varchar(10)
)
as
delete from Alumnos
where nocontrlo=@nc
go

create procedure ver_alumnos(
@nc varchar(10)
)
as select * from Alumnos
where noContrlo=@nc
go
