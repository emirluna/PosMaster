-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema PosMaster
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema PosMaster
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `PosMaster` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci ;
USE `PosMaster` ;

-- -----------------------------------------------------
-- Table `PosMaster`.`Account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Account` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `balance` VARCHAR(45) NULL DEFAULT NULL,
  `payment_code` VARCHAR(45) NULL DEFAULT NULL,
  `min_available` VARCHAR(45) NULL DEFAULT NULL,
  `max_available` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Address`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Address` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(45) NULL DEFAULT NULL,
  `state` VARCHAR(45) NULL DEFAULT NULL,
  `city` VARCHAR(45) NULL DEFAULT NULL,
  `street` VARCHAR(45) NULL DEFAULT NULL,
  `number` VARCHAR(45) NULL DEFAULT NULL,
  `zip_code` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `user_name` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  `address_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_Address`
    FOREIGN KEY (`address_id`)
    REFERENCES `PosMaster`.`Address` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Branch`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Branch` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `address_id` INT NULL DEFAULT NULL,
  `user_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_ADMINISTRATOR`
    FOREIGN KEY (`user_id`)
    REFERENCES `PosMaster`.`Users` (`id`),
  CONSTRAINT `FK_BRANCH_ADDRESS`
    FOREIGN KEY (`address_id`)
    REFERENCES `PosMaster`.`Address` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Category`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Configuration`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Configuration` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `company_name` VARCHAR(85) NULL DEFAULT NULL,
  `description` VARCHAR(45) NULL DEFAULT NULL,
  `owner_name` VARCHAR(45) NULL DEFAULT NULL,
  `main_email` VARCHAR(45) NULL DEFAULT NULL,
  `main_phone` VARCHAR(45) NULL DEFAULT NULL,
  `main_address` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
 CONSTRAINT `FK_Conf_Address`
    FOREIGN KEY (`main_address`)
    REFERENCES `PosMaster`.`Address` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`CustumerDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`CustumerDetail` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `birth_date` DATETIME NULL DEFAULT NULL,
  `registration_date` DATETIME NULL DEFAULT NULL,
  `last_buy` VARCHAR(45) NULL DEFAULT NULL,
  `username` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `verification_code` VARCHAR(45) NULL DEFAULT NULL,
  `last_operation` DATETIME NULL DEFAULT NULL,
  `address_id` INT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_ADDRESS_CUSTOMER`
    FOREIGN KEY (`address_id`)
    REFERENCES `PosMaster`.`Address` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `last_name` VARCHAR(45) NULL DEFAULT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `status` INT NULL DEFAULT NULL,
  `customer_detail_id` INT NULL DEFAULT NULL,
  `account_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
 CONSTRAINT `FK_Account`
    FOREIGN KEY (`account_id`)
    REFERENCES `PosMaster`.`Account` (`id`),
  CONSTRAINT `FK_Detail_Info`
    FOREIGN KEY (`customer_detail_id`)
    REFERENCES `PosMaster`.`CustumerDetail` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`CustomerBuys`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`CustomerBuys` (
  `sale_id` INT NOT NULL,
  `customer_id` VARCHAR(45) NOT NULL,
  `status` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`sale_id`, `customer_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`CustomerPay`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`CustomerPay` (
  `customer_id` INT NOT NULL,
  `payment_id` INT NOT NULL,
  `status` SMALLINT NULL DEFAULT NULL,
  PRIMARY KEY (`customer_id`, `payment_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Sale`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Sale` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `branch_id` INT NULL DEFAULT NULL,
  `customer_id` INT NULL DEFAULT NULL,
  `account_id` INT NULL DEFAULT NULL,
  `user_id` INT NULL DEFAULT NULL,
  `total_items` INT NULL DEFAULT NULL,
  `total_cost` FLOAT NULL DEFAULT NULL,
  `sale_status` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_Sale_Account`
    FOREIGN KEY (`account_id`)
    REFERENCES `PosMaster`.`Account` (`id`),
  CONSTRAINT `FK_SALE_BRACH_ID`
    FOREIGN KEY (`branch_id`)
    REFERENCES `PosMaster`.`Branch` (`id`),
  CONSTRAINT `FK_SALE_Customer`
    FOREIGN KEY (`customer_id`)
    REFERENCES `PosMaster`.`Customer` (`id`),
  CONSTRAINT `FK_User_ID`
    FOREIGN KEY (`user_id`)
    REFERENCES `PosMaster`.`Users` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`ProductDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`ProductDetail` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `brand` VARCHAR(45) NULL DEFAULT NULL,
  `description` VARCHAR(45) NULL DEFAULT NULL,
  `weight` FLOAT NULL DEFAULT NULL,
  `splitable` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Poduct`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Poduct` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `short_name` VARCHAR(10) NULL DEFAULT NULL,
  `measure` INT NULL DEFAULT NULL,
  `price` FLOAT NULL DEFAULT NULL,
  `barcode` VARCHAR(45) NULL DEFAULT NULL,
  `category_id` INT NULL DEFAULT NULL,
  `detail_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
   CONSTRAINT `FK_Category`
    FOREIGN KEY (`category_id`)
    REFERENCES `PosMaster`.`Category` (`id`),
  CONSTRAINT `FK_Detail`
    FOREIGN KEY (`detail_id`)
    REFERENCES `PosMaster`.`ProductDetail` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Stocks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Stocks` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `stock` INT NULL DEFAULT NULL,
  `min_stock` INT NULL DEFAULT NULL,
  `max_stock` INT NULL DEFAULT NULL,
  `branch_id` INT NULL DEFAULT NULL,
  `product_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_Branch`
    FOREIGN KEY (`branch_id`)
    REFERENCES `PosMaster`.`Branch` (`id`),
  CONSTRAINT `FK_Product`
    FOREIGN KEY (`product_id`)
    REFERENCES `PosMaster`.`Poduct` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Order` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `amount` FLOAT NULL DEFAULT NULL,
  `price` FLOAT NULL DEFAULT NULL,
  `subtotal` VARCHAR(45) NULL DEFAULT NULL,
  `stock_id` INT NULL DEFAULT NULL,
  `sale_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_SALE_`
    FOREIGN KEY (`sale_id`)
    REFERENCES `PosMaster`.`Sale` (`id`),
  CONSTRAINT `FK_STOKS`
    FOREIGN KEY (`stock_id`)
    REFERENCES `PosMaster`.`Stocks` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


-- -----------------------------------------------------
-- Table `PosMaster`.`Payment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `PosMaster`.`Payment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `amount` FLOAT NULL DEFAULT NULL,
  `method` SMALLINT NULL DEFAULT NULL,
  `date_of_payment` DATETIME NULL DEFAULT NULL,
  `branch_id` INT NULL DEFAULT NULL,
  `user_id` INT NULL DEFAULT NULL,
  `account_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FK_Account_Payment`
    FOREIGN KEY (`account_id`)
    REFERENCES `PosMaster`.`Account` (`id`),
  CONSTRAINT `FK_PAY_BRANCH`
    FOREIGN KEY (`branch_id`)
    REFERENCES `PosMaster`.`Branch` (`id`),
  CONSTRAINT `FK_PAY_USER`
    FOREIGN KEY (`user_id`)
    REFERENCES `PosMaster`.`Users` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_spanish2_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
