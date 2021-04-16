/**
*agenda de contatos 
* @autor gabriel silva
*/

/* banco de dados */
-- verificar banco de dados dispomiveis
show databases;
-- criar um novo banco de dados
create database dbagenda;
-- selecionar o banco de dados
use dbagenda;

/* tabelas */
-- verificar tabelas do banco de dados
show tables ;
-- criar um nova tabela
create table contatos (
	idcon int primary key auto_increment,
    nome varchar(50) not null,
	fone varchar(15) not null,
    email varchar(50) 
);

-- DESCREVER A estrutura da tabela
describe contatos;

/* crud (creante read update delete)*/
-- crud create
insert into contatos(nome,fone,email)
values('silva lins', '1478-9633', 'gabriel@email,com');

insert into contatos(nome,fone)
value( 'bolo','99999-4178');

insert into contatos(nome,fone,email)
value( 'lins','7777-4789','silva@gmail.com');

-- CRUD READ
select * from contatos;
select * from contatos order by nome;
select * from contatos where idcon = 2;

-- CRUD updata
update contatos set email='bolo@gmail.com' where idcon = 2;
update contatos set nome='gabriel silva', fone='1111-2222', email='gabrie@edrgemail.com' where idcon = 1;

-- CRUD delete
delete from contatos where idcon = 3;
