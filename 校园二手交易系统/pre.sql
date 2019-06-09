CREATE DATABASE `secondhandtransactions`;

USE `secondhandtransactions`;

/*Table structure for table `comtype` */

DROP TABLE IF EXISTS `comtype`;

CREATE TABLE `comtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comtypename` varchar(20) NOT NULL,
  `comtypedesc` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`comtypename`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `comtype` */

insert  into `comtype`(`id`,`comtypename`,`comtypedesc`) values (11, '书籍', 'xxx'),
(12, '手机', 'xxx'),
(14, '服装', 'xxx'),
(10, '水果', 'xxx'),
(13, '电脑', 'xxx');


/*Table structure for table `comm` */

DROP TABLE IF EXISTS `comm`;

CREATE TABLE `comm` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comname` varchar(20) NOT NULL,
  `comdesc` varchar(100) DEFAULT NULL,
  `comtype` varchar(20) DEFAULT NULL,
  `comcount` int(11) DEFAULT NULL,
  `comprice` float NOT NULL,
  `author` varchar(10) NOT NULL,
  `phone` varchar(12) NOT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `useyear` int(11) DEFAULT NULL,
  `usemonth` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_comm` (`comtype`),
  CONSTRAINT `FK_comm` FOREIGN KEY (`comtype`) REFERENCES `comtype` (`comtypename`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `comm` */

insert  into `comm`(`id`,`comname`,`comdesc`,`comtype`,`comcount`,`comprice`,`author`,`phone`,`sex`,`useyear`,`usemonth`) values (2, '软件工程概论', '软件工程大二课本', '书籍 ', 1, 12, 'zzz', '1111111111', '男', 2016, 3),
(3, '数据库系统', '软件工程大二课本', '书籍', 1, 12, 'zzz', '1111111111 ', '男', 2016, 2),
(4, '华为mate10pro', '9成新', '手机', 1, 2333, 'zzz ', '1111111111', '男', 2018, 1),
(5, 'T恤', '不要了', '服装', 1, 22, 'zzz', '1111111111', '男', 2018, 1),
(6, 'Acer', '宏碁电脑一台', '电脑', 1, 4333, 'zzz', '1111111111', '男', 2016,1),
(7, '高等数学', '大一课本', '书籍', 1, 5, 'aaa', '3421341313', '男', '2015', 1);


/*Table structure for table `salesrecond` */

DROP TABLE IF EXISTS `salesrecond`;

CREATE TABLE `salesrecond` (
  `id` int(11) NOT NULL,
  `商品名` varchar(20) DEFAULT NULL,
  `数量` int(11) DEFAULT NULL,
  `总价` float DEFAULT NULL,
  `日期` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`) values (8, 'admin', 'admin'),
	(1, 'zong', 'zong'), (3, 'zhou', 'zhou'), (5, 'cheng', 'cheng'), (9, 'huang', 'huang');
