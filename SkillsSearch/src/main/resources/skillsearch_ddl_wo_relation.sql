DROP SCHEMA IF EXISTS `SkillSearchDb`;
CREATE SCHEMA `SkillSearchDb` /*!40100 DEFAULT CHARACTER SET latin1 */;


CREATE TABLE `SkillSearchDb`.`user` (
  `user_id` INT NOT NULL,
  `user_sid` VARCHAR(10) NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`user_id`));

  
  CREATE TABLE `SkillSearchDb`.`skill` (
  `skill_id` INT NOT NULL,
  `skill_name` VARCHAR(100) NOT NULL,
  `version` VARCHAR(50) NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`skill_id`),
  UNIQUE INDEX `skillName_UNIQUE` (`skill_name` ASC));
  
  CREATE TABLE `SkillSearchDb`.`location` (
  `location_id` INT NOT NULL,
  `country` VARCHAR(50) NOT NULL,
  `city` VARCHAR(50) NOT NULL,
  `state` VARCHAR(50) NOT NULL,
  `address1` VARCHAR(100) NOT NULL,
  `address2` VARCHAR(100) NULL,
  `zip` VARCHAR(10) NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`location_id`));

  
  
 CREATE TABLE `SkillSearchDb`.`project` (
  `project_id` INT NOT NULL,
  `project_name` VARCHAR(100) NOT NULL,
  `location_id` INT NOT NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`project_id`, `project_name`));
  
   CREATE TABLE `SkillSearchDb`.`user_profile` (
  `iduser_profile` INT NOT NULL,
  `user_id` INT NOT NULL,
  `user_sid` VARCHAR(50) NOT NULL,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NULL,
  `location_id` INT NOT NULL,
  `is_ooo` VARCHAR(1) NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`iduser_profile`));

  
  CREATE TABLE `SkillSearchDb`.`user_project_skill` (
  `iduser_project_skill` INT NOT NULL,
  `user_id` INT NOT NULL,
  `sid` VARCHAR(50) NOT NULL,
  `projectid` INT NOT NULL,
  `skillid` INT NOT NULL,
  `ratings` DECIMAL(1,1) NULL,
  `origindate` DATETIME NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`iduser_project_skill`));

 

  
  CREATE TABLE `SkillSearchDb`.`help` (
  `id_help` INT NOT NULL,
  `requester` VARCHAR(50) NOT NULL,
  `provider` VARCHAR(50) NULL,
  `isHelping` VARCHAR(1) NOT NULL,
  `isApproved` VARCHAR(1) NOT NULL,
  `rating` DECIMAL(1,1) NULL,
  `requested_hours` INT NULL,
  `actual_hours` INT NULL,
  `comment` VARCHAR(500) NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`id_help`));

ALTER TABLE `SkillSearchDb`.`user` 
CHANGE COLUMN `user_id` `user_id` INT(11) NOT NULL AUTO_INCREMENT ;

ALTER TABLE `SkillSearchDb`.`user_profile` 
CHANGE COLUMN `iduser_profile` `iduser_profile` INT(11) NOT NULL AUTO_INCREMENT ;

ALTER TABLE `SkillSearchDb`.`skill` 
CHANGE COLUMN `skill_id` `skill_id` INT(11) NOT NULL AUTO_INCREMENT ;

ALTER TABLE `SkillSearchDb`.`project` 
CHANGE COLUMN `project_id` `project_id` INT(11) NOT NULL AUTO_INCREMENT ;

ALTER TABLE `SkillSearchDb`.`location` 
CHANGE COLUMN `location_id` `location_id` INT(11) NOT NULL AUTO_INCREMENT ;

ALTER TABLE `SkillSearchDb`.`help` 
CHANGE COLUMN `id_help` `id_help` INT(11) NOT NULL AUTO_INCREMENT ;


ALTER TABLE `SkillSearchDb`.`user_project_skill` 
CHANGE COLUMN `iduser_project_skill` `iduser_project_skill` INT(11) NOT NULL AUTO_INCREMENT ;

