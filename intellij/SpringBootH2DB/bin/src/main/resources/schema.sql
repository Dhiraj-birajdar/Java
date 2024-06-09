create table staff (
        staffid integer not null auto_increment,
        age integer not null,
        firstname varchar(255),
        hiredate datetime(6),
        lastname varchar(255),
        role varchar(255),
        salary integer not null,
        primary key (staffid)
    );