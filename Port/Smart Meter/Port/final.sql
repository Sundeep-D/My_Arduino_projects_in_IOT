/*
SQLyog Community Edition- MySQL GUI v7.02 
MySQL - 5.1.59-community : Database - port
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`port` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `port`;

/*Table structure for table `por` */

DROP TABLE IF EXISTS `por`;

CREATE TABLE `por` (
  `temp` varchar(1000) DEFAULT NULL,
  `gas` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `por` */

insert  into `por`(`temp`,`gas`) values ('temp: 104  ','   gas: 175'),('temp: 97  ','   gas: 176'),('temp: 96  ','   gas: 176'),('temp: 95  ','   gas: 176'),('temp: 95  ','   gas: 176'),('temp: 94  ','   gas: 176'),('temp: 94  ','   gas: 176'),('temp: 95  ','   gas: 176'),('temp: 95  ','   gas: 176'),('temp: 95  ','   gas: 176'),('temp: 95  ','   gas: 175'),('temp: 95  ','   gas: 176'),('temp: 95  ','   gas: 175'),('temp: 95  ','   gas: 176'),('temp: 95  ','   gas: 175'),('temp: 95  ','   gas: 175'),('temp: 95  ','   gas: 175'),('temp: 95  ','   gas: 175'),('temp: 95  ','   gas: 176'),('temp: 95  ','   gas: 175'),('temp: 95  ','   gas: 176'),('temp: 94  ','   gas: 175'),('temp: 94  ','   gas: 175'),('temp: 96  ','   gas: 175'),('temp: 97  ','   gas: 175'),('temp: 97  ','   gas: 175'),('temp: 98  ','   gas: 175'),('temp: 98  ','   gas: 175'),('temp: 98  ','   gas: 175'),('temp: 98  ','   gas: 175'),('temp: 98  ','   gas: 175'),('temp: 98  ','   gas: 175'),('temp: 97  ','   gas: 175'),('temp: 96  ','   gas: 175'),('temp: 95  ','   gas: 175'),('temp: 94  ','   gas: 175'),('temp: 93  ','   gas: 175'),('temp: 94  ','   gas: 175'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 95  ','   gas: 173'),('temp: 96  ','   gas: 172'),('temp: 96  ','   gas: 173'),('temp: 97  ','   gas: 173'),('temp: 97  ','   gas: 173'),('temp: 97  ','   gas: 173'),('temp: 97  ','   gas: 173'),('temp: 97  ','   gas: 172'),('temp: 97  ','   gas: 172'),('temp: 97  ','   gas: 173'),('temp: 96  ','   gas: 172'),('temp: 95  ','   gas: 172'),('temp: 95  ','   gas: 172'),('temp: 94  ','   gas: 173'),('temp: 93  ','   gas: 173'),('temp: 93  ','   gas: 172'),('temp: 93  ','   gas: 173'),('temp: 93  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 172'),('temp: 94  ','   gas: 173'),('temp: 101  ','   gas: 174'),('temp: 95  ','   gas: 174'),('temp: 96  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 97  ','   gas: 173'),('temp: 98  ','   gas: 174'),('temp: 96  ','   gas: 174'),('temp: 95  ','   gas: 173'),('temp: 93  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 97  ','   gas: 173'),('temp: 98  ','   gas: 173'),('temp: 97  ','   gas: 173'),('temp: 97  ','   gas: 173'),('temp: 95  ','   gas: 173'),('temp: 93  ','   gas: 174'),('temp: 93  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 173'),('temp: 94  ','   gas: 174'),('temp: 94  ','   gas: 174'),('temp: 95  ','   gas: 173'),('temp: 95  ','   gas: 173'),('temp: 96  ','   gas: 174'),('temp: 96  ','   gas: 174'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 174'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 174'),('temp: 96  ','   gas: 174'),('temp: 96  ','   gas: 174'),('temp: 96  ','   gas: 173'),('temp: 96  ','   gas: 174'),('temp: 96  ','   gas: 173'),('temp: 97  ','   gas: 174'),('temp: 97  ','   gas: 174'),('temp: 97  ','   gas: 174'),('temp: 97  ','   gas: 174'),('temp: 97  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 98  ','   gas: 174'),('temp: 98  ','   gas: 174');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
