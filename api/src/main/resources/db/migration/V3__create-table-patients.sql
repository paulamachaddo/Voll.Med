create table patients (

    id UUID not null,
    name varchar(100) not null,
    cpf varchar(11) not null,
    phone varchar (20) not null,
    email varchar(100) not null unique,
    address varchar(100) not null,
    number varchar(100) not null,
    cep varchar(9) not null,
    city varchar(100) not null,
    state char(2) not null,

    primary key(id)

);