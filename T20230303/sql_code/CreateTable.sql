create table user(
    id int primary key AUTO_INCREMENT,
    username varchar(12) unique not null ,
    password varchar(18) not null
);

create table student(
    id int primary key AUTO_INCREMENT,
    name varchar(12) unique not null ,
    sex char(2) check(sex = '男'or sex = '女') not null,
    class varchar(12) not null
);

//自增字段不连续的原因和解决方法
SET @i=0;
UPDATE `tablename` SET `id`=(@i:=@i+1);
ALTER TABLE `tablename` AUTO_INCREMENT=0
