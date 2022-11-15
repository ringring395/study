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
-- Table structure for table `attach`
--

DROP TABLE IF EXISTS `attach`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attach` (
  `uuid` varchar(100) NOT NULL,
  `uploadpath` varchar(100) DEFAULT NULL,
  `filename` varchar(100) DEFAULT NULL,
  `image` tinyint(1) DEFAULT NULL,
  `bno` int DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attach`
--

LOCK TABLES `attach` WRITE;
/*!40000 ALTER TABLE `attach` DISABLE KEYS */;
INSERT INTO `attach` VALUES ('106e0105-9139-4ce3-a6f1-98f03872a84c','2022\\08\\29','loopy04.jpeg',1,178),('1b81b4f3-f4cd-4bdc-a68b-86e761db42db','2022\\09\\21','loopy01.png',1,185),('244d4f40-b65c-49e5-bafe-4b7d1b9f0070','2022\\08\\30','loopy08.jpg',1,182),('2b3bcc03-0e35-4db7-ace0-37242308ce96','2022\\08\\26','테스트용.txt',0,176),('338df30c-30f6-4941-b558-ca1e2373b8da','2022\\09\\20','loopy07.jpg',1,184),('39daacad-04e7-434a-b2f1-96dd508cf2d4','2022\\08\\29','loopy04.jpeg',1,179),('4c33ef30-133d-4cf1-9e33-2b514cb9ca36','2022\\09\\14','loopy06.jpg',1,183),('58471930-c0f1-45fa-9f0e-972faded37b5','2022\\08\\26','loopy06.jpg',1,174),('5d4752fb-b5db-4e43-aa1f-745ae437a043','2022\\08\\26','loopy03.jpeg',1,176),('649f0fa3-d19a-4c54-a4a1-aa3eb2ac6239','2022\\08\\26','loopy04.jpeg',1,171),('6cb31c2c-78cb-4f6f-b095-ffe3b268ece7','2022\0826','loopy08.jpg',1,169),('935d7591-d1ee-4df8-8770-1df0cfc7c030','2022\\08\\26','Sleep Away.mp3',0,176),('9eec7135-c644-48ab-9596-b3abac7d40b7','2022\\08\\26','테스트용.txt',0,175),('a13a4fc6-7902-43ae-bb31-3fa1ef2c6d14','2022\\08\\30','loopy06.jpg',1,181),('a34751a2-c3ce-4d05-a44c-234c6bc6aaf5','2022\\08\\26','loopy05.jpg',1,173),('aacbf3f7-6104-41e7-8a84-86cca93ab493','2022\\08\\26','grain.jpg',1,177),('acce0e65-acde-4a14-abfe-88c575137ba8','2022\\08\\26','loopy08.jpg',1,172),('b66a3406-a44f-4be9-9b0b-8fbc8f33f6ee','2022\\08\\26','테스트용.txt',0,177),('c01399ab-37e0-4296-8780-3d6162b3a990','2022\\08\\29','loopy07.jpg',1,180),('c6817584-f8e2-4d5d-976b-5aa6388db31d','2022\\08\\29','loopy08.jpg',1,180),('d8fe0ba5-2b7b-413d-b63d-bc149d9ff258','2022\\08\\26','loopy04.jpeg',1,177),('eaf5590e-18d8-4358-8c3e-267902b3fa06','2022\\08\\26','loopy06.jpg',1,175);
/*!40000 ALTER TABLE `attach` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-15 14:14:45
