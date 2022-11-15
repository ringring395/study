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
-- Table structure for table `upload`
--

DROP TABLE IF EXISTS `upload`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `upload` (
  `uuid` varchar(100) NOT NULL,
  `uploadpath` varchar(100) DEFAULT NULL,
  `filename` varchar(100) DEFAULT NULL,
  `image` tinyint(1) DEFAULT NULL,
  `e_no` int DEFAULT NULL,
  `i_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `upload`
--

LOCK TABLES `upload` WRITE;
/*!40000 ALTER TABLE `upload` DISABLE KEYS */;
INSERT INTO `upload` VALUES ('0100b8f6-7e97-4d84-a036-ba3a12b20bc9','2022\\10\\25','loopy01.png',1,7,'m'),('0230fe18-a3e4-46f1-9055-812bd4663ef4','2022\\11\\09','loopy01.png',1,14,'m'),('13c68c71-6150-4caf-9ea1-84741cd38754','2022\\10\\25','loopy06.jpg',1,12,'s'),('1996b1ba-d6cf-4148-9f01-a028e719c518','2022\\10\\20','loopy05.jpg',1,5,'m'),('1c213689-f036-4226-a66c-799af9ac1011','2022\\10\\20','loopy06.jpg',1,6,'m'),('24098362-d021-48a0-bd38-503572fad845','2022\\11\\09','kb_card.png',1,15,'m'),('2a5f2252-1a23-4baa-b131-201e01184579','2022\\10\\20','loopy05.jpg',1,1,'m'),('2abb5398-b391-44d8-8bab-147525806fa0','2022\\10\\25','loopy02.jpeg',1,7,'s'),('2b289f7a-90d1-4676-96d7-41be6abd32b6','2022\\11\\09','christmas_3.jpg',1,22,'m'),('2bdff290-4474-43dd-b2d4-715478441cce','2022\\10\\25','loopy01.png',1,7,'s'),('2db9a165-7bd8-4315-b948-01b616cd6bd7','2022\\10\\20','loopy07.jpg',1,3,'m'),('2fdf7646-9fd9-48d9-8ebc-be2a5e238bb6','2022\\11\\09','nh_card.png',1,17,'m'),('38cf286e-5ac5-4117-9930-0d5997dadea1','2022\\10\\25','loopy05.jpg',1,12,'s'),('4d7f0ee0-8646-4ac2-b00c-afc1af3690c3','2022\\11\\09','loopy04.jpeg',1,24,'m'),('5099110c-a4a3-4776-b5ac-45fa76ade152','2022\\10\\25','loopy02.jpeg',1,12,'m'),('5d595f4a-49fa-41f4-aac5-36c7ed13633b','2022\\10\\20','loopy07.jpg',1,2,'m'),('6b3c9cd4-a7e1-43a8-b06a-8d29597dfdba','2022\\11\\10','loopy06.jpg',1,25,'m'),('79afde0b-a8c8-4be0-be62-755f0c798eeb','2022\\11\\09','fireworks_2.jpg',1,23,'m'),('7c01c568-f224-49e0-89e1-82585a066231','2022\\10\\25','loopy07.jpg',1,11,'m'),('83f735a7-d38a-4eb2-868b-0acb5181a7c5','2022\\10\\18','loopy07.jpg',1,79,'s'),('85002542-d87a-4bf5-85cd-72247c08bb28','2022\\10\\18','loopy08.jpg',1,79,'s'),('8b55fe98-c70b-4962-8301-eb621c424116','2022\\11\\09','nh_card.png',1,21,'m'),('8d3838e1-38b3-45a7-bfc3-380abaf2445b','2022\\11\\09','loopy06.jpg',1,18,'m'),('9519849d-b5b2-45bb-b11a-2ebfd8f82591','2022\\10\\18','loopy04.jpeg',1,79,'m'),('99cef07b-4dcd-4b46-a46d-3d0ed53b86a0','2022\\10\\25','loopy07.jpg',1,13,'m'),('a221b70b-55ad-47e4-94b5-6c70640aa250','2022\\11\\09','loopy03.jpeg',1,14,'s'),('a5c0602c-3244-42b3-97d7-ea7fa1d3cdd5','2022\\10\\25','loopy02.jpeg',1,8,'m'),('b0beaade-7b3f-4188-8a56-f249efa3690b','2022\\10\\25','loopy08.jpg',1,10,'m'),('c7e20930-162e-4127-932f-683686849c74','2022\\10\\18','loopy06.jpg',1,79,'s'),('ce231891-ab54-405d-9580-339d16c6527e','2022\\10\\25','loopy05.jpg',1,13,'s'),('df2ea39f-0c69-420e-bdd6-f428b8e35091','2022\\10\\25','loopy06.jpg',1,11,'s'),('df33486a-5584-48ea-ae8a-1875bdd2e25a','2022\\11\\09','loopy02.jpeg',1,14,'s'),('e10abafb-0891-4996-9368-c5950349f96e','2022\\11\\09','hyundai_card.png',1,16,'m'),('e1ae8d6c-4235-433d-99f0-0dc473701c30','2022\\11\\09','hyundai_card.png',1,20,'m'),('e48e0d13-c01c-4291-a4cc-0ca5f9c2d68a','2022\\10\\25','loopy07.jpg',1,11,'s'),('f07960a9-6aca-4456-b3c0-cd7229e3780b','2022\\10\\20','loopy04.jpeg',1,4,'m'),('f41db883-f7a5-49ef-9bf0-09f0a95390b9','2022\\10\\18','loopy06.jpg',1,78,'m'),('fc7561f2-7c5c-494c-8a22-ad4bfee6444a','2022\\11\\09','kb_card.png',1,19,'m');
/*!40000 ALTER TABLE `upload` ENABLE KEYS */;
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
