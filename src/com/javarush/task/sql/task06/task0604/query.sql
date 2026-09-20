drop table if exists users;
create table users
(
    user_id    int auto_increment primary key,
    first_name varchar(255) not null,
    last_name  varchar(255) not null
);


