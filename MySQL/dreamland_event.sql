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
-- Table structure for table `event`
--

DROP TABLE IF EXISTS `event`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `event` (
  `e_no` int NOT NULL AUTO_INCREMENT,
  `e_type` varchar(10) DEFAULT NULL,
  `e_title` varchar(50) DEFAULT NULL,
  `e_start` date DEFAULT NULL,
  `e_end` date DEFAULT NULL,
  `e_summary` varchar(150) DEFAULT NULL,
  `e_contents` varchar(500) DEFAULT NULL,
  `e_upload` datetime DEFAULT CURRENT_TIMESTAMP,
  `e_discount` int DEFAULT '0',
  PRIMARY KEY (`e_no`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `event`
--

LOCK TABLES `event` WRITE;
/*!40000 ALTER TABLE `event` DISABLE KEYS */;
INSERT INTO `event` VALUES (1,'sale','10월 국민카드','2022-10-21','2022-10-31','국민카드 행사','ㄴㅇㄹㄴㅇㄹㄴㅇㄹㄴㅇㄹㄴ','2022-10-20 15:20:45',20),(2,'sale','10월 현대카드','2022-10-01','2022-10-31','루피 퍼레이드를 진행합니다.','10월 현대카드10월 현대카드','2022-10-20 15:30:54',30),(4,'sale','10월 우리카드','2022-10-15','2022-10-31','우리카드 행사','우리카드 행사','2022-10-20 15:31:43',40),(7,'event','10월 행사','2022-10-01','2022-10-31','10월 행사입니다','쌀쌀한 가을 행사','2022-10-25 14:23:17',5),(10,'event','9월 행사','2022-09-01','2022-09-30','999','99999999999999999','2022-10-25 14:24:00',5),(11,'parade','10월 퍼레이드','2022-10-01','2022-10-31','101010101010','10101010101010101010','2022-10-25 14:26:03',5),(13,'parade','999999999','2022-09-01','2022-09-30','99999999999','99999999999','2022-10-25 14:26:56',5),(14,'event','11월 행사 ','2022-11-01','2022-11-30','여러분을 초대합니닷','어서오세요. 여러분을 위한 행사를 준비했어요.','2022-11-09 09:12:54',5),(15,'sale','KB카드','2022-11-01','2023-12-31','국민카드 할인 행사 합니다.','국민카드 5만원이상 결제시 20%할인 적용합니다.\r\n','2022-11-09 11:48:51',20),(16,'sale','현대카드','2022-11-01','2023-12-31','현대카드로 결제시 할인 적용','현대카드로 30만원이상 결제시 30%할인 적용','2022-11-09 11:58:02',30),(17,'sale','NH카드','2022-11-01','2023-12-31','NH카드 결제시 할인 적용','NH카드로 10만원이상 결제시 10%할인 적용합니다.\r\n단, 체크카드는 불가.','2022-11-09 11:59:23',10),(18,'sale','WelcomeDay','2022-11-01','2023-12-31','블랙프라이데이 + 드림랜드','드림랜드에서 블랙프라이데이 할인을 진행합니다.\r\n11월 한달간 5%할인 적용합니닷','2022-11-09 12:01:26',5),(22,'sale','크리스마스','2022-12-01','2022-12-31','12월 할인적용','크리스마스 트리에서 인생샷 남겨보시죠','2022-11-09 12:06:04',10),(23,'parade','퍼레이드 짜잔','2022-11-01','2023-12-31','에브리데이 퍼레이드','매일 퍼레이드를 진행합니다. 다들 즐겨보세요','2022-11-09 12:08:36',5),(24,'event','dreamland','2022-11-01','2023-12-31','루피세계로 초대합니다.','welcomewelcomewelcome\r\nwelcomewelcomewelcome','2022-11-09 12:20:42',5),(25,'parade','루피세상','2022-11-01','2023-12-31','루피 퍼레이드를 진행합니다.','신나게 놀아봅시당','2022-11-10 14:30:56',5);
/*!40000 ALTER TABLE `event` ENABLE KEYS */;
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
