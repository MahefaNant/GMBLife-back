--create database gmblife

create table member (
    id serial primary key ,
    pseudo varchar(50) not null,
    name varchar(100) not null ,
    mail varchar(50) unique not null ,
    password varchar(100) not null ,
    token_limit timestamp,
    token int
);

create table category(
    id serial primary key ,
    name varchar(50) not null,
    type varchar(10) check (type IN ('income','expense')) not null
);

create table factor(
    id serial primary key ,
    factor varchar(50) ,
    type varchar(10) check (type IN ('income','expense')) not null,
    description text default 'empty!' not null
);

create table transaction(
    id serial primary key ,
    id_category int not null ,
    id_factor int not null ,
    amount numeric(10, 2) not null ,
    type varchar(10) check (type IN ('income','expense')) not null,
    date DATE NOT NULL default now(),
    description text default 'empty!' not null
);

alter table transaction add foreign key (id_category) references category(id);
alter table transaction add foreign key (id_factor) references factor(id);

create table planned_transaction(
    id serial primary key ,
    id_category int not null ,
    id_factor int not null ,
    amount numeric(10, 2) not null ,
    type varchar(10) check (type IN ('income','expense')) not null,
    date DATE NOT NULL default now(),
    description text default 'empty!' not null
);

alter table transaction add foreign key (id_category) references category(id);
alter table transaction add foreign key (id_factor) references factor(id);

create table budget(
    id serial primary key ,
    amount numeric(10, 2) not null ,
    date DATE unique not null default now()
);

