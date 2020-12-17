drop table if exists `employee`;
create table `employee` (
    `id` int(11) not null AUTO_INCRMENT,
    `last_name` varchar(45) default null,
    `email` varchar(45) default null,
    `gender` varchar(15) default null,
    `dept_id` value(255) not null
    primary key ('id')
)ENGINE=InnoDB AUTO_INCRMENT=1 default charset=utf8;