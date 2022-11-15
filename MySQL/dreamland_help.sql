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
-- Table structure for table `help`
--

DROP TABLE IF EXISTS `help`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `help` (
  `h_no` int NOT NULL AUTO_INCREMENT,
  `h_type` varchar(10) DEFAULT NULL,
  `h_title` varchar(50) DEFAULT NULL,
  `h_id` varchar(30) DEFAULT NULL,
  `h_email` varchar(30) DEFAULT NULL,
  `h_content` longtext,
  `h_regdate` datetime DEFAULT CURRENT_TIMESTAMP,
  `h_answer` tinyint DEFAULT '0',
  `h_an_content` longtext,
  `h_an_date` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`h_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `help`
--

LOCK TABLES `help` WRITE;
/*!40000 ALTER TABLE `help` DISABLE KEYS */;
INSERT INTO `help` VALUES (1,'group','50명 단체 문의드려요.','admin@mail.com','admin@mail.com','<p>안녕하세요.&nbsp;</p><p>저희 동아리 50명이 단체 티켓 때문에 문의드려요.</p>','2022-10-13 12:02:30',1,'<p>안녕하세요.</p><p><span style=\"background-color: rgb(255, 239, 198); font-family: &quot;Comic Sans MS&quot;;\"><u>DreamLand</u></span>입니다.</p><p>문의주신 50명 단체 입장은 따로 연락드려 상세히 안내드리겠습니다.</p><p><br></p><p><span style=\"background-color: rgb(255, 239, 198); font-family: &quot;Comic Sans MS&quot;;\"><u>DreamLand</u></span>에 관심 가져주셔서 감사합니다.</p>','2022-10-14 10:29:10'),(2,'event','할로윈 행사 문의','user1@mail.com','user1@mail.com','<p><span style=\"background-color: rgb(255, 156, 0);\"><u>할로윈 퍼레이드</u></span>는 몇시까지 하나요?</p>','2022-10-13 14:10:45',0,NULL,'2022-10-14 09:48:48'),(4,'ticket','다음 행사 티켓 구매','user1@mail.com','user1@mail.com','<p>다음 행사 티켓은 <span style=\"background-color: rgb(255, 198, 156);\"><b>언제부터</b></span> 구매할 수 있나요??</p><p><br></p>','2022-10-14 15:45:49',0,NULL,'2022-10-14 15:45:49');
/*!40000 ALTER TABLE `help` ENABLE KEYS */;
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
