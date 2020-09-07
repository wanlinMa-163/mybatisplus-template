
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mydb` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `mydb`;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `date` datetime DEFAULT NULL COMMENT '日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;


insert  into `user`(`id`,`name`,`age`,`email`,`date`) values (1,'xm',122,'test1@baomidou.com','2020-09-05 12:12:13'),(2,'xl',122,'test2@baomidou.com','2020-09-05 12:12:13'),(3,'xh',122,'test3@baomidou.com','2020-09-05 12:12:13'),(4,'zs',122,'test4@baomidou.com','2020-09-05 12:12:13'),(5,'zs2',122,'test5@baomidou.com','2020-09-05 12:12:13'),(6,'臧嵩6',126,NULL,'2020-09-05 12:12:13'),(7,'臧嵩',12,'163.com','2020-09-05 12:12:12');
