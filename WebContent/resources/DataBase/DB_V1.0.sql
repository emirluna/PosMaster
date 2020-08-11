-- MySQL dump 10.13  Distrib 8.0.18, for macos10.14 (x86_64)
--
-- Host: 127.0.0.1    Database: PosMaster
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `Account`
--

DROP TABLE IF EXISTS `Account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Account` (
  `id` int NOT NULL AUTO_INCREMENT,
  `balance` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `payment_code` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `min_available` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `max_available` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Account`
--

LOCK TABLES `Account` WRITE;
/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Address`
--

DROP TABLE IF EXISTS `Address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Address` (
  `id` int NOT NULL AUTO_INCREMENT,
  `country` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `state` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `city` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `street` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `number` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `zip_code` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Address`
--

LOCK TABLES `Address` WRITE;
/*!40000 ALTER TABLE `Address` DISABLE KEYS */;
/*!40000 ALTER TABLE `Address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Branch`
--

DROP TABLE IF EXISTS `Branch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Branch` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `address_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_BRANCH_ADDRESS_idx` (`address_id`),
  KEY `FK_ADMINISTRATOR_idx` (`user_id`),
  CONSTRAINT `FK_ADMINISTRATOR` FOREIGN KEY (`user_id`) REFERENCES `Users` (`id`),
  CONSTRAINT `FK_BRANCH_ADDRESS` FOREIGN KEY (`address_id`) REFERENCES `Address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Branch`
--

LOCK TABLES `Branch` WRITE;
/*!40000 ALTER TABLE `Branch` DISABLE KEYS */;
/*!40000 ALTER TABLE `Branch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Category`
--

DROP TABLE IF EXISTS `Category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Category`
--

LOCK TABLES `Category` WRITE;
/*!40000 ALTER TABLE `Category` DISABLE KEYS */;
/*!40000 ALTER TABLE `Category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Configuration`
--

DROP TABLE IF EXISTS `Configuration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Configuration` (
  `id` int NOT NULL AUTO_INCREMENT,
  `company_name` varchar(85) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `descrption` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `owner_name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `main_email` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `main_phone` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `main_address` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Conf_Address_idx` (`main_address`),
  CONSTRAINT `FK_Conf_Address` FOREIGN KEY (`main_address`) REFERENCES `Address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Configuration`
--

LOCK TABLES `Configuration` WRITE;
/*!40000 ALTER TABLE `Configuration` DISABLE KEYS */;
/*!40000 ALTER TABLE `Configuration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `last_name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `phone` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `status` int DEFAULT NULL,
  `customer_detail_id` int DEFAULT NULL,
  `account_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Detail_Info_idx` (`customer_detail_id`),
  KEY `FK_Account_idx` (`account_id`),
  CONSTRAINT `FK_Account` FOREIGN KEY (`account_id`) REFERENCES `Account` (`id`),
  CONSTRAINT `FK_Detail_Info` FOREIGN KEY (`customer_detail_id`) REFERENCES `CustumerDetail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CustomerBuys`
--

DROP TABLE IF EXISTS `CustomerBuys`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CustomerBuys` (
  `sale_id` int NOT NULL,
  `customer_id` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `status` tinyint DEFAULT NULL,
  PRIMARY KEY (`sale_id`,`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CustomerBuys`
--

LOCK TABLES `CustomerBuys` WRITE;
/*!40000 ALTER TABLE `CustomerBuys` DISABLE KEYS */;
/*!40000 ALTER TABLE `CustomerBuys` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CustomerPay`
--

DROP TABLE IF EXISTS `CustomerPay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CustomerPay` (
  `customer_id` int NOT NULL,
  `payment_id` int NOT NULL,
  `status` smallint DEFAULT NULL,
  PRIMARY KEY (`customer_id`,`payment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CustomerPay`
--

LOCK TABLES `CustomerPay` WRITE;
/*!40000 ALTER TABLE `CustomerPay` DISABLE KEYS */;
/*!40000 ALTER TABLE `CustomerPay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `CustumerDetail`
--

DROP TABLE IF EXISTS `CustumerDetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `CustumerDetail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `birth_date` datetime DEFAULT NULL,
  `registration_date` datetime DEFAULT NULL,
  `last_buy` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `username` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `verification_code` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `last_operation` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CustumerDetail`
--

LOCK TABLES `CustumerDetail` WRITE;
/*!40000 ALTER TABLE `CustumerDetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `CustumerDetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Order`
--

DROP TABLE IF EXISTS `Order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stock_id` int DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `price` float DEFAULT NULL,
  `subtotal` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `sale_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_SALE__idx` (`sale_id`),
  KEY `FK_Product_idx` (`stock_id`),
  CONSTRAINT `FK_SALE_` FOREIGN KEY (`sale_id`) REFERENCES `Sale` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Order`
--

LOCK TABLES `Order` WRITE;
/*!40000 ALTER TABLE `Order` DISABLE KEYS */;
/*!40000 ALTER TABLE `Order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Payment`
--

DROP TABLE IF EXISTS `Payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Payment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `amount` float DEFAULT NULL,
  `method` smallint DEFAULT NULL,
  `date_of_payment` datetime DEFAULT NULL,
  `branch_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `account_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_PAY_BRANCH_idx` (`branch_id`),
  KEY `FK_PAY_USER_idx` (`user_id`),
  KEY `FK_Account_Payment_idx` (`account_id`),
  CONSTRAINT `FK_Account_Payment` FOREIGN KEY (`account_id`) REFERENCES `Account` (`id`),
  CONSTRAINT `FK_PAY_BRANCH` FOREIGN KEY (`branch_id`) REFERENCES `Branch` (`id`),
  CONSTRAINT `FK_PAY_USER` FOREIGN KEY (`user_id`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Payment`
--

LOCK TABLES `Payment` WRITE;
/*!40000 ALTER TABLE `Payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `Payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Poduct`
--

DROP TABLE IF EXISTS `Poduct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Poduct` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `short_name` varchar(10) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `measure` int DEFAULT NULL,
  `price` float DEFAULT NULL,
  `barcode` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `category_id` int DEFAULT NULL,
  `detail_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `barcode_UNIQUE` (`barcode`),
  KEY `FK_Category_idx` (`category_id`),
  KEY `FK_Detail_idx` (`detail_id`),
  CONSTRAINT `FK_Category` FOREIGN KEY (`category_id`) REFERENCES `Category` (`id`),
  CONSTRAINT `FK_Detail` FOREIGN KEY (`detail_id`) REFERENCES `ProductDetail` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Poduct`
--

LOCK TABLES `Poduct` WRITE;
/*!40000 ALTER TABLE `Poduct` DISABLE KEYS */;
/*!40000 ALTER TABLE `Poduct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ProductDetail`
--

DROP TABLE IF EXISTS `ProductDetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ProductDetail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `brand` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `description` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `weight` float DEFAULT NULL,
  `splitable` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ProductDetail`
--

LOCK TABLES `ProductDetail` WRITE;
/*!40000 ALTER TABLE `ProductDetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `ProductDetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Sale`
--

DROP TABLE IF EXISTS `Sale`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Sale` (
  `id` int NOT NULL AUTO_INCREMENT,
  `branch_id` int DEFAULT NULL,
  `customer_id` int DEFAULT NULL,
  `account_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `total_items` int DEFAULT NULL,
  `total_cost` float DEFAULT NULL,
  `sale_status` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Customer_idx` (`customer_id`),
  KEY `FK_Branch_idx` (`branch_id`),
  KEY `FK_User_idx` (`user_id`),
  KEY `FK_Sale_Account_idx` (`account_id`),
  CONSTRAINT `FK_Sale_Account` FOREIGN KEY (`account_id`) REFERENCES `Account` (`id`),
  CONSTRAINT `FK_SALE_BRACH_ID` FOREIGN KEY (`branch_id`) REFERENCES `Branch` (`id`),
  CONSTRAINT `FK_SALE_Customer` FOREIGN KEY (`customer_id`) REFERENCES `Customer` (`id`),
  CONSTRAINT `FK_User_ID` FOREIGN KEY (`user_id`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Sale`
--

LOCK TABLES `Sale` WRITE;
/*!40000 ALTER TABLE `Sale` DISABLE KEYS */;
/*!40000 ALTER TABLE `Sale` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Stocks`
--

DROP TABLE IF EXISTS `Stocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Stocks` (
  `id` int NOT NULL AUTO_INCREMENT,
  `stock` int DEFAULT NULL,
  `min_stock` int DEFAULT NULL,
  `max_stock` int DEFAULT NULL,
  `branch_id` int DEFAULT NULL,
  `product_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_Branch_idx` (`branch_id`),
  KEY `FK_Product_idx` (`product_id`),
  CONSTRAINT `FK_Branch` FOREIGN KEY (`branch_id`) REFERENCES `Branch` (`id`),
  CONSTRAINT `FK_Product` FOREIGN KEY (`product_id`) REFERENCES `Poduct` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Stocks`
--

LOCK TABLES `Stocks` WRITE;
/*!40000 ALTER TABLE `Stocks` DISABLE KEYS */;
/*!40000 ALTER TABLE `Stocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Users`
--

DROP TABLE IF EXISTS `Users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `last_name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `user_name` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `phone` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `address_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `FK_Address_idx` (`address_id`),
  CONSTRAINT `FK_Address` FOREIGN KEY (`address_id`) REFERENCES `Address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Users`
--

LOCK TABLES `Users` WRITE;
/*!40000 ALTER TABLE `Users` DISABLE KEYS */;
/*!40000 ALTER TABLE `Users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-21 11:14:51
