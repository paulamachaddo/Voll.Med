create table doctors(

    id UUID not null,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm varchar(6) not null unique,
    specialty varchar(100) not null,
    address varchar(100) not null,
    number varchar(100) not null,
    cep varchar(9) not null,
    city varchar(100) not null,
    state char(2) not null,

    primary key(id)

);