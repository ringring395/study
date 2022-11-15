-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: exam
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
-- Table structure for table `reply`
--

DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reply` (
  `rno` int NOT NULL AUTO_INCREMENT,
  `reply` varchar(300) DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  `replydate` datetime DEFAULT CURRENT_TIMESTAMP,
  `bno` int DEFAULT NULL,
  PRIMARY KEY (`rno`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
INSERT INTO `reply` VALUES (19,'댓글이 들어갑니까?','aaaa1111','2022-08-19 11:30:22',NULL),(20,'댓글 수정 확인중','aaaa1111','2022-08-19 11:30:44',19),(21,'댓글 수정되는지 테스트중','hhh888','2022-08-19 11:44:01',165),(22,'두번째 테스트','hhh888','2022-08-19 12:05:01',165),(23,'안녕하세요~','hhh888','2022-08-19 12:13:34',19),(24,'반가워여','hhh888','2022-08-19 12:14:19',21),(25,'댓글 성공하면 알림창 띄워주세요','hhh888','2022-08-19 12:41:27',22),(26,'반가워요\n댓글쓰기 성공하면 알림창 띄워주세요.','hhh888','2022-08-19 12:49:52',25),(27,'반가워요 \n댓글쓰기 성공하면 알림창 띄워주세요','hhh888','2022-08-19 13:31:58',25),(29,'댓글 수정 확인중!','hhh888','2022-08-19 16:31:31',166),(30,'헤헤헤','hhh888','2022-08-19 16:32:32',166),(31,'흐흐흐흐ㅁㄴㅇ','hhh888','2022-08-19 16:33:47',166),(32,'하하핫','hhh888','2022-08-19 16:34:36',164),(33,'후해헤헤헿','hhh888','2022-08-22 09:36:40',165),(34,'반가워요 Hello\n','hhh888','2022-08-22 14:58:23',163),(35,'안녕하세요','hhh888','2022-08-22 14:58:35',163),(36,'푸헤헤헿','hhh888','2022-08-22 15:28:21',164),(37,'푸하하하하','hhh888','2022-08-22 15:32:40',162),(38,'푸헤헤헤','hhh888','2022-08-22 15:35:58',162),(39,'hellooooo','hhh888','2022-08-22 15:38:06',162),(41,'ㄴㅇㄹㄴㅇㄹ','fff666','2022-08-22 15:52:23',162),(42,'푸하하하','fff666','2022-08-22 15:56:05',163),(51,'댓글다는중','eee555','2022-08-22 16:33:02',161),(52,'아이디뭐냐고','eee555','2022-08-22 16:36:03',163),(53,'아이디뭔데','eee555','2022-08-22 16:37:58',163),(54,'아이디 뭐냐닊ㅏ','aaaa1111','2022-08-22 16:40:40',161),(55,'아이디뭔데','aaaa1111','2022-08-22 16:44:02',161),(56,'후하후하','bbb222','2022-08-22 16:45:08',161),(57,'아이디아이디 갖고와','bbb222','2022-08-22 16:45:45',161),(58,'당당당다라라라라랄ㅇ','ddd444','2022-08-22 16:46:20',161),(59,'후헤헤헤ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ헤','eee555','2022-08-23 08:50:22',160),(63,'후후후후후훟','eee555','2022-08-29 11:52:03',178),(66,'댓글댓글','fff666','2022-08-29 14:19:47',180),(67,'후헤후헤 ㄴㅇㄹㄴㅇㄹ','fff666','2022-08-29 14:23:24',179),(68,'푸헤헤헤헤헤','eee555','2022-08-29 14:45:33',180),(69,'푸헤헤헤헤','eee555','2022-08-29 14:46:15',180),(70,'푸헤헤헤sdfㄴㅇㄹㄴㅇㄹㄴㅇㄹsdf','eee555','2022-08-29 14:47:17',179),(71,'푸헤헤헤헤헿','eee555','2022-08-29 14:50:05',177),(72,'푸헤헤헿 푸헤헤헤헿\n','eee555','2022-08-29 14:50:48',166),(73,'우헤헤헤헤헤헤헤헿','eee555','2022-08-30 12:28:39',176),(74,'비가 온다고','bbb222','2022-08-30 13:51:59',182),(75,'오늘도 비가 온다고','eee555','2022-08-31 15:27:33',182),(76,'sdfsdfsdf','iii777','2022-09-20 11:59:19',183),(77,'어우 진ㅉㅏ....','iii777','2022-09-20 14:42:40',184);
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-15 14:14:44
