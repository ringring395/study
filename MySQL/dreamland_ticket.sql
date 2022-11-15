-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: dreamland
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ticket` (
  `t_no` int NOT NULL AUTO_INCREMENT,
  `id` varchar(30) DEFAULT NULL,
  `t_date` varchar(15) DEFAULT NULL,
  `t_day` varchar(5) DEFAULT NULL,
  `t_time` varchar(10) DEFAULT NULL,
  `t_a_price` int DEFAULT '0',
  `t_j_price` int DEFAULT '0',
  `t_c_price` int DEFAULT '0',
  `t_a_cnt` int DEFAULT '0',
  `t_j_cnt` int DEFAULT '0',
  `t_c_cnt` int DEFAULT '0',
  `t_total` int DEFAULT '0',
  `t_regdate` datetime DEFAULT CURRENT_TIMESTAMP,
  `t_discount` int DEFAULT '0',
  `t_final` int DEFAULT NULL,
  PRIMARY KEY (`t_no`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
INSERT INTO `ticket` VALUES (1,'user1@mail.com','2022-10-29','토','allday',60000,48000,36000,2,2,2,288000,'2022-10-21 11:38:22',1,230400),(2,'user1@mail.com','2022-10-29','토','night',50000,40000,30000,2,2,2,240000,'2022-10-21 11:38:41',1,192000),(3,'user1@mail.com','2022-10-29','토','allday',60000,48000,36000,3,2,1,312000,'2022-10-21 11:39:19',1,249600),(13,'admin@mail.com','2022-10-29','토','allday',60000,48000,36000,2,0,0,120000,'2022-10-21 14:30:41',1,96000),(14,'admin@mail.com','2022-10-28','금','allday',50000,40000,30000,2,0,2,160000,'2022-10-21 16:23:45',2,112000),(15,'admin@mail.com','2022-10-26','수','allday',50000,40000,30000,2,2,2,240000,'2022-10-26 15:55:44',1,192000),(16,'admin@mail.com','2022-10-26','수','night',40000,32000,24000,1,1,1,96000,'2022-10-26 15:55:55',4,57600),(17,'admin@mail.com','2022-10-27','목','allday',50000,40000,30000,4,0,2,260000,'2022-10-26 15:56:05',2,182000),(18,'admin@mail.com','2022-10-27','목','night',40000,32000,24000,0,2,0,64000,'2022-10-26 15:56:14',2,44800),(19,'admin@mail.com','2022-10-28','금','allday',50000,40000,30000,2,2,0,180000,'2022-10-26 15:56:23',1,144000),(20,'admin@mail.com','2022-10-28','금','night',40000,32000,24000,2,2,0,144000,'2022-10-26 15:56:32',0,144000),(21,'admin@mail.com','2022-10-30','일','allday',60000,48000,36000,2,2,0,216000,'2022-10-26 15:59:04',2,151200),(22,'admin@mail.com','2022-10-30','일','allday',60000,48000,36000,4,0,0,240000,'2022-10-26 15:59:12',0,240000),(23,'admin@mail.com','2022-10-30','일','night',50000,40000,30000,4,0,0,200000,'2022-10-26 15:59:19',0,200000),(24,'admin@mail.com','2022-10-31','월','allday',50000,40000,30000,2,0,0,100000,'2022-10-31 15:16:14',0,100000),(25,'user2@mail.com','2022-11-05','토','allday',60000,48000,36000,2,0,2,192000,'2022-10-31 15:22:29',0,192000),(26,'user2@mail.com','2022-10-31','월','allday',50000,40000,30000,2,2,0,180000,'2022-10-31 15:23:36',0,180000),(27,'user2@mail.com','2022-11-03','목','allday',50000,40000,30000,2,0,0,100000,'2022-10-31 15:26:43',0,100000),(28,'user2@mail.com','2022-11-06','일','allday',60000,48000,36000,2,0,0,120000,'2022-10-31 15:29:12',0,120000),(29,'user2@mail.com','2022-11-04','금','night',40000,32000,24000,2,0,0,80000,'2022-11-04 12:09:17',0,80000),(30,'user2@mail.com','2022-11-05','토','night',50000,40000,30000,4,0,0,200000,'2022-11-04 12:09:36',0,200000),(31,'user1@mail.com','2022-11-16','수','allday',50000,40000,30000,2,0,0,100000,'2022-11-07 11:52:47',0,100000),(32,'user3@mail.com','2022-11-19','토','night',50000,40000,30000,2,0,0,100000,'2022-11-07 15:14:58',3,60000),(33,'admin@mail.com','2022-11-09','수','night',40000,32000,24000,2,0,0,80000,'2022-11-09 11:29:19',3,48000),(34,'admin@mail.com','2022-11-19','토','allday',60000,48000,36000,0,3,0,144000,'2022-11-10 14:26:49',16,100800);
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-15 14:14:43
