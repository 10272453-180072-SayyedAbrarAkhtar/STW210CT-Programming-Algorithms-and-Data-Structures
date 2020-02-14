/*
SQLyog Community v13.1.5  (64 bit)
MySQL - 10.4.10-MariaDB : Database - quizapp
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`quizapp` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `quizapp`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `contact` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

/*Data for the table `admin` */

insert  into `admin`(`id`,`name`,`username`,`password`,`email`,`gender`,`contact`) values 
(1,'Sayyed Abrar Akhtar','admin','admin','quiz@quiz.com','Male','12345678991'),
(2,'admin','test','test','admin','Male','00'),
(3,'sayyed','sayyed','0','say@ad.com','Male','12456');

/*Table structure for table `examinee` */

DROP TABLE IF EXISTS `examinee`;

CREATE TABLE `examinee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(40) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `contact` varchar(25) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

/*Data for the table `examinee` */

insert  into `examinee`(`id`,`name`,`username`,`password`,`gender`,`contact`,`email`) values 
(1,'test','test','test','Male','0000000000','test'),
(2,'Sayyed','quiz','quiz','Male','1456464111','Sayyed@quiz');

/*Table structure for table `questions` */

DROP TABLE IF EXISTS `questions`;

CREATE TABLE `questions` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `question` varchar(300) DEFAULT NULL,
  `a` varchar(100) DEFAULT NULL,
  `b` varchar(100) DEFAULT NULL,
  `c` varchar(100) DEFAULT NULL,
  `d` varchar(100) DEFAULT NULL,
  `e` varchar(100) DEFAULT NULL,
  `correctanswer` varchar(1) DEFAULT NULL,
  `setid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `setid` (`setid`),
  CONSTRAINT `questions_ibfk_2` FOREIGN KEY (`setid`) REFERENCES `questionset` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4;

/*Data for the table `questions` */

insert  into `questions`(`id`,`question`,`a`,`b`,`c`,`d`,`e`,`correctanswer`,`setid`) values 
(1,'Which of those doesnt have an index based structure?','list','set','tree','array','dict','b',2),
(2,'java.util.Collections is a:','class','interface','object','method','None of the above','a',1),
(3,'Methods such as reverse, shuffle are offered in:','Object','Collection','Collections','Apache Commons Collections','None','b',1),
(4,'Which of those allows duplicate elements?','set','List','All','None','Array','b',1),
(5,'Which allows the storage of a null key and null values?','Hashtable','Array','Both','HashMap','None of the above','d',1),
(6,'Which interface should be implemented for sorting on basis of many criteria’s?','Serializable','Comparable','Comparator','All','None of the above','c',1),
(7,' In ConcurrentHashMap - once thread locks one segment for updation it doesn\'t block it for retrieval hence another thread will scan the same segment, however, it\'ll be ready to read the data before locking?','0','100','True','False','None','c',1),
(8,'Which Set class should be most popular in a multi-threading environment, considering performance constraint?','HashSet','ConcurrentSkipListSet','CopyOnWriteArraySet','LinkedHashSet','All','b',1),
(9,'Which Map class should be most popular in a multi-threading environment, considering performance constraint?','Hashtable','CopyOnWriteMap','ConcurrentHashMap','ConcurrentMap','None','b',1),
(10,'Which allows the removal of elements from a collection?','Enumeration','Iterator','Both ','No elements','None of the above','e',1),
(11,'Which star is at the center of our Solar System? ',' Sun',' Earth','Mars','Jupiter','All','a',3),
(12,' What is the diameter of Sun?','145263987 km','236547895 km','1,392,684 km','253698745 Km','15454400054km','c',3),
(13,'Computers which offer information are called .......... and those which seek information are called -','Servers, clients ','Clients, servers ','Applications, complex soft-wares ','System software, application software ','None','a',4),
(14,'FAQ stands for - ','Frequently Asked Questions ','Favourite Asked Questions ','Favourite and Answered Questions ','Frequently Answered Questions ','None','a',4),
(15,'What is the capital of Nepal?','Pokhara','Mustang','Naubise','Kathmandu','Hetauda','d',2),
(16,'What is a famous pilgrimage site in Nepal Himalayas, both for Buddhist and Hindu pilgrims?','Sonamnath','Badrinath','Muktinath','Amarnath','Pashupatinath','c',2),
(17,'What percent of the solar system’s mass does Sun holds?','99.8 percent','98.5 percent','95.5 percent','94.5 percent','50 percent','a',3),
(18,'How many stars are in the Milky Way?','more than 100 billion','more than 200 billion','more thant 300 billion','more than 500 billion','None','a',3),
(19,'Speed of internet connection is measured in ............ ','GHz ','dpi ','ppm ','Gbps ','Hz','d',4),
(20,'Which of the following is not a type of printer? ','Inkjet ','3-d ','Landscape ','Laserjet ','Laser','c',4),
(21,'What is the name of the beautiful lake by which Pokhara lies?','Sun Lake','Phewa Tal','Himal Lake','Naini Tal','Fewa Lake','b',2),
(22,'Who became king of Nepal in 2001?','Birendra','Ram Das Karna','Mahendra','Gyanendra','Bir Bahadur','d',2),
(23,'What is the animal who helps people to carry so many things on the high paths of Nepal? ','Yak','Blue sheep','Dzak','Khondro','Sheep','a',2),
(24,'What is the name of the famous street in Kathmandu, where the first hippies lived in the 60\'s and 70\'s?','Hippy Lane','Jawala','Freak Street','Freek Road','Mai Street','c',2),
(25,'Where is Nepal?','In Asia with a coastline on the Arabian Sea','In Africa with a coastline on the Atlantic Ocean','In Asia between India and China','In Africa between Cameroon and Sudan','All','c',2),
(26,'What color cant be seen on the Nepal\'s flag','White','Blue','Red','Yellow','All','b',2),
(27,'how many languages are spoken in Nepal?','roughly 4.6 billion years ago','roughly 4.7 billion years ago','roughly 4.8 billion years ago','roughly 4.10 billion years ago','None','a',3),
(28,'What is the distance between sun and earth?','123654789 miles','92,960,000 miles','92 966666 miles','258963147 miles','25863147 miles','b',3),
(29,'How many languages are spoken in Nepal?','10 ','15','100','56','123','e',2),
(30,'Hitting ....... key and ...... will open a dialogue box for searching a world in pdf file. ','Alt, S ','Ctrl, F ','Ctrl, S','Alt, F ','All','b',4),
(31,'A/ An ......... is a computer program that spreads by inserting copies of itself into other executable code or documents. ','Operating System','Virus','Firewall ','Anti-virus ','Computer Virus','e',4),
(32,'Sun’s Chemical Composition:','No composition','72% of Hydrogen, 26.5% Helium and2.5% of other elements','71% of Hydrogen, 26.5% Helium and2.5% of other elements','74% of Hydrogen, 26.5% Helium and2.5% of other elements','73% of Hydrogen, 26.5% Helium and2.5% of other elements','c',3),
(33,'Which web browser was the first web browser from the following? ','Chrome','Opera ','Safari ','Mosaic ','MSIE ','d',4),
(34,'How much time does sun rays take to reach earth?','15 minutes','9 minutes','8 minutes','12 minutes','1 hour','c',3),
(35,'Which planet is nearest to the earth?','Saturn','Jupiter','Mars','Mercury','Neptune','d',3),
(36,'The Speed of the internet is measured in the number of -','Bit transferred per unit time','Byte transferred per unit time ','Bit transferred per square unit time ','All','None','b',4),
(38,'Video conferencing is done through -','Telephone Network ','IP Network ','TV ','None of these ','All','b',4),
(39,'Which of the following technologies provide high speed data communication over wireless network? ','Wireless LAN ','Wifi ','Wimax','All of these ','None','d',4),
(40,'What is the population of Nepal?','29.3 million','28.3 million','29.3 billion','27.3 billion','27.3 million','a',2),
(41,'Which country does not border Nepal?','China ','India','Pakistan','All','None','c',2),
(42,'Which planet is known as the Morning Star or the Evening Star?','Jupiter','Mars','Saturn ','Earth','Venus','e',3),
(43,'What is the diameter of MERCURY?','3221 miles','1236 miles','2589 miles','3,032 miles','None','d',3);

/*Table structure for table `questionset` */

DROP TABLE IF EXISTS `questionset`;

CREATE TABLE `questionset` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `setname` varchar(50) NOT NULL,
  PRIMARY KEY (`setname`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4;

/*Data for the table `questionset` */

insert  into `questionset`(`id`,`setname`) values 
(1,'Java'),
(2,'Nepal'),
(3,'Universe'),
(4,'Computer');

/*Table structure for table `result` */

DROP TABLE IF EXISTS `result`;

CREATE TABLE `result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `examineeid` int(11) DEFAULT NULL,
  `score` int(11) DEFAULT NULL,
  `setname` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `examineeid` (`examineeid`),
  KEY `setname` (`setname`),
  CONSTRAINT `result_ibfk_1` FOREIGN KEY (`examineeid`) REFERENCES `examinee` (`id`),
  CONSTRAINT `result_ibfk_2` FOREIGN KEY (`setname`) REFERENCES `questionset` (`setname`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

/*Data for the table `result` */

insert  into `result`(`id`,`examineeid`,`score`,`setname`) values 
(1,5,8,'Java');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
