create table pais(

    id bigint not null auto_increment,
    nome varchar(100) not null unique,
    capital varchar(6) not null unique,
    regiao varchar(100),
    subregiao varchar(20),
    area varchar(100) not null,

    primary key(id)

);