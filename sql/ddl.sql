drop table if exists member CASCADE;
create table member
(
    id bigint generated by default as identity, //자동생성
    name varchar(255),
    primary key (id)
    );