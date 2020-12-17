drop table if exists `department`;
create table `department` (
    `id` int(11) not null AUTO_INCREMENT,
    `department_name` varchar(255) default null,
    primary key (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 default charset=utf8;