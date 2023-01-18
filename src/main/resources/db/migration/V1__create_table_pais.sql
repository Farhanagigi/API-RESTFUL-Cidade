create table pais(

    id bigint not null auto_increment,
    Nome varchar(100) not null unique,
    Capital varchar(6) not null unique,
    Regiao varchar(100),
    Subregiao varchar(20),
    Area varchar(100) not null,

    primary key(id)

);