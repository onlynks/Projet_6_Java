CREATE DATABASE  IF NOT EXISTS `projet_3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `projet_3`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: projet_3
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `author` (
  `author_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `death_date` date DEFAULT NULL,
  `description` text,
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
INSERT INTO `author` VALUES (1,'Joanne','Rowling','1965-07-31',NULL,'Joanne Rowling4,5, également connue sous le nom de J. K. Rowling - cette initiale K. choisie par elle et provenant du prénom de sa grand-mère paternelle, ses agents communiquant postérieurement que son nom complet serait Joanne Kathleen Rowling6,7 - et le pseudonyme de Robert Galbraith, est une romancière et scénariste britannique née le 31 juillet 1965 dans l?agglomération de Yate, dans le Gloucestershire, en Angleterre. Elle doit sa notoriété mondiale à la série Harry Potter, dont les romans traduits en près de quatre-vingts langues ont été vendus à plus de 500 millions d\'exemplaires dans le monde.'),(2,NULL,'Hergé','1907-05-22','1983-03-03','Georges Remia dit Hergé, né le 22 mai 1907 à Etterbeek et mort le 3 mars 1983 à Woluwe-Saint-Lambert, est un auteur belge de bande dessinée principalement connu pour Les Aventures de Tintin.');
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `description` text,
  `author_id` int(11) DEFAULT NULL,
  `publisher_id` int(11) DEFAULT NULL,
  `available` tinyint(1) NOT NULL,
  PRIMARY KEY (`book_id`),
  KEY `publisher_book_fk` (`publisher_id`),
  KEY `author_book_fk` (`author_id`),
  CONSTRAINT `author_book_fk` FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`),
  CONSTRAINT `publisher_book_fk` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`publisher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'Tintin','Les Aventures de Tintin font partie des plus célèbres et plus populaires (230 millions d\'exemplaires vendus1) bandes dessinées européennes du xxe siècle. Elles ont été traduites en une centaine de langues et dialectes1 et adaptées à de nombreuses reprises au cinéma, à la télévision et au théâtre. Elles se déroulent dans un univers réaliste et parfois fantastique, fourmillant de personnages aux traits de caractère bien définis. Le héros de la série est le personnage éponyme, Tintin, un jeune reporter et globe-trotter belge ; il est accompagné dans ses aventures par son fox-terrier Milou. Au fil des albums, plusieurs figures récurrentes apparaissent, comme le capitaine Haddock - qui ne tarde pas à devenir un personnage principal -, les détectives accumulant les maladresses loufoques Dupond et Dupont, ou encore le professeur Tournesol.',2,5,1),(2,'Harry Potter à l\'école des sorciers','Harry Potter, jeune orphelin, a été élevé par son oncle et sa tante dans des conditions hostiles. À l\'âge de onze ans, un demi-géant nommé Rubeus Hagrid lui apprend qu\'il possède des pouvoirs magiques et que ses parents ont été assassinés, des années auparavant, par le mage noir Lord Voldemort. Voldemort avait également essayé de tuer Harry, mais le sort lui a rebondi dessus, le tuant presque. En fréquentant pour la première fois le monde des sorciers, accompagné par Hagrid, Harry découvre qu\'il y est très célèbre. Il entame sa première année d\'études à l\'école de sorcellerie Poudlard, où il apprend à maîtriser la magie aux côtés de ses deux nouveaux amis Ron Weasley et Hermione Granger. Au cours de l\'année, le trio se trouve impliqué dans le mystère de la pierre philosophale, gardée au sein de l\'école et convoitée par un inconnu qu\'ils cherchent à démasquer. L\'enquête est menée durant toute l\'année jusqu\'à la fin où le jeune Harry Potter rencontre Lord Voldemort, forcé et contraint de partager son corps avec celui du Professeur Quirinus Quirell et arrive à le vaincre.',1,4,0),(14,'Harry Potter et la Chambre des secrets','Une rentrée fracassante en voiture volante, une étrange malédiction qui s\'abat sur les élèves, cette deuxième année à l\'école des sorciers ne s\'annonce pas de tout repos ! Entre les cours de potions magiques, les matches de Quidditch et les combats de mauvais sorts, Harry et ses amis Ron et Hermione trouveront-ils le temps de percer le mystère de la Chambre des Secrets ?\n\nLe deuxième volume des aventures de Harry Potter : un livre magique pour sorciers confirmés.',1,4,0),(21,'Harry Potter et le Prisonnier d\'Azkaban','Harry Potter et le Prisonnier d\'Azkaban est le troisième roman de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 19 octobre 1999 en France.',1,4,0),(26,'Harry Potter et la Coupe de feu','Harry Potter et la Coupe de feu est le quatrième tome de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 29 novembre 2000 en France.',1,4,1),(29,'Harry Potter et le Prisonnier d\'Azkaban','Harry Potter et le Prisonnier d\'Azkaban est le troisième roman de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 19 octobre 1999 en France.',1,4,1),(30,'Harry Potter et le Prisonnier d\'Azkaban','Harry Potter et le Prisonnier d\'Azkaban est le troisième roman de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 19 octobre 1999 en France.',1,4,1),(31,'Harry Potter et le Prisonnier d\'Azkaban','Harry Potter et le Prisonnier d\'Azkaban est le troisième roman de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 19 octobre 1999 en France.',1,4,1),(32,'Harry Potter et le Prisonnier d\'Azkaban','Harry Potter et le Prisonnier d\'Azkaban est le troisième roman de la série littéraire centrée sur le personnage de Harry Potter créé par J. K. Rowling. Il a été publié le 19 octobre 1999 en France.',1,4,1);
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `borrowing`
--

DROP TABLE IF EXISTS `borrowing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `borrowing` (
  `borrowing_id` int(11) NOT NULL AUTO_INCREMENT,
  `beginning_date` date NOT NULL,
  `ending_date` date NOT NULL,
  `book_id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `extended` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`borrowing_id`),
  KEY `book_borrowing_fk` (`book_id`),
  KEY `user_borrowing_fk` (`id_user`),
  CONSTRAINT `book_borrowing_fk` FOREIGN KEY (`book_id`) REFERENCES `book` (`book_id`),
  CONSTRAINT `user_borrowing_fk` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `borrowing`
--

LOCK TABLES `borrowing` WRITE;
/*!40000 ALTER TABLE `borrowing` DISABLE KEYS */;
INSERT INTO `borrowing` VALUES (3,'2019-01-31','2019-04-28',26,2,1),(4,'2019-02-25','2019-03-25',21,2,0),(7,'2019-01-11','2019-02-11',21,2,0),(8,'2019-01-11','2019-02-11',26,2,0);
/*!40000 ALTER TABLE `borrowing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `publisher` (
  `publisher_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`publisher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES (4,'Bloomsbury Publishing'),(5,'Le Lombard'),(6,'Hachette'),(7,'Nathan');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `role` (
  `id_role` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) NOT NULL,
  PRIMARY KEY (`id_role`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'admin');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `adress` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `post_code` int(11) NOT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  `id_role` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `password` (`password`),
  KEY `role_user_fk` (`id_role`),
  CONSTRAINT `role_user_fk` FOREIGN KEY (`id_role`) REFERENCES `role` (`id_role`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (2,'Nicolas','Garnier','3 allée Miss Rodgers','Lardy',91510,'0637517428',1,'$2a$10$2h/uqURbRYGfa5QvE4FL1uxztU1KmSMT1ZnkVBi/DQTSElIoFohm6','dev.adress.12@gmail.com'),(6,'Patrick','Sébastien','21 boulevard du cabaret','Beaufville',51450,'0685785486',1,'$2a$10$UOcYRORAl6SAo0oVN.dd8u.4ppN14rzduZCLaVWRvM2xYtAqQqFYe','dev.adress.12@gmail.com'),(7,'Rose','Gentille','8 rue des coquet','Pitiviers',91450,'0685784258',1,'$2a$10$Yq1zWI7hdIy4xe7O0SseX.mMy9KE6lW7ez2BqN0rwmc1ovdpM8XtK','dev.adress.12@gmail.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-04 22:21:14
