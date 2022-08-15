-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: exam
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `board`
--

DROP TABLE IF EXISTS `board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `board` (
  `bno` int NOT NULL AUTO_INCREMENT,
  `title` varchar(20) NOT NULL,
  `content` varchar(1000) DEFAULT NULL,
  `regdate` datetime DEFAULT CURRENT_TIMESTAMP,
  `count` int DEFAULT '0',
  `id` varchar(18) DEFAULT NULL,
  PRIMARY KEY (`bno`),
  KEY `id_fk` (`id`),
  CONSTRAINT `id_fk` FOREIGN KEY (`id`) REFERENCES `member` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `board`
--

LOCK TABLES `board` WRITE;
/*!40000 ALTER TABLE `board` DISABLE KEYS */;
INSERT INTO `board` VALUES (19,'반갑습니다','반가워요','2022-07-27 09:58:06',0,'ddd444'),(20,'조은아침','좋은아침','2022-07-27 09:58:49',0,'bbb222'),(21,'goooooooooooooooood','morning1111111111111111','2022-07-27 09:59:19',0,'bbb222'),(22,'Hi!!','반가워요\r\n첫인사입니다','2022-07-27 09:59:51',0,'ccc333'),(25,'가입했어요','반가워요\r\n제이름은 eee555입니다','2022-07-27 10:03:29',0,'eee555'),(26,'good','하하하하하핳하','2022-07-27 10:11:08',0,'eee555'),(29,'hello','hi~','2022-07-27 11:05:40',0,'ddd444'),(33,'글쓰기2','게시판 글쓰기','2022-07-28 11:22:58',0,'ccc333'),(34,'로그인 되어야','글쓰기 가능합니다.','2022-07-28 12:27:27',0,'ccc333'),(35,'첫인사','안녕하세요','2022-07-29 10:06:09',0,'fff666'),(40,'글쓰기2','jsp연습해요','2022-07-29 10:49:53',0,'fff666'),(41,'글쓰기3','연습중','2022-07-29 10:57:21',0,'fff666'),(46,'ㅁㅈㄹㅈㅁㄹ','ㅁㅈㄹㅈ','2022-08-09 16:42:30',0,NULL),(53,'어푸어푸','하하하하awfe','2022-08-09 17:07:23',0,NULL),(55,'제목','내용','2022-08-09 17:08:02',0,NULL),(56,'8/10','테스트를 합시다','2022-08-10 09:21:31',0,NULL),(57,'화면이동확인중','글쓰기 insert가 되었습니다.','2022-08-10 11:52:34',0,NULL),(58,'글쓰기 테스트','sql에 insert되었음을 확인합니다.','2022-08-10 13:32:03',0,NULL),(59,'redirect 화면','화면이동을 확인하는 테스트 중입니다.','2022-08-10 14:23:29',0,NULL);
/*!40000 ALTER TABLE `board` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-12 16:43:36
