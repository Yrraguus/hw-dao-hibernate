create schema if not exists example;

create table if not exists example.persons
(
    name           varchar(255) not null,
    surname        varchar(255) not null,
    age            int          not null,
    phone_number   long,
    city_of_living varchar(255),
    primary key (name, surname, age)
);
