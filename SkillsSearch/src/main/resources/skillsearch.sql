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

  
  CREATE TABLE `SkillSearchDb`.`employee_project_skill` (
  `idemployee_project_skill` INT NOT NULL,
  `sid` VARCHAR(50) NOT NULL,
  `projectid` INT NOT NULL,
  `skillid` INT NOT NULL,
  `ratings` DECIMAL(1,1) NULL,
  `origindate` DATETIME NULL,
  `created_date` DATETIME NULL,
  `created_by` VARCHAR(50) NULL,
  `updated_date` DATETIME NULL,
  `updated_by` VARCHAR(50) NULL,
  PRIMARY KEY (`idemployee_project_skill`));

  
 

  
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

  
 /* ALTER TABLE `SkillSearchDb`.`user_profile` 
ADD CONSTRAINT `fk_profile_to_user`
  FOREIGN KEY (`iduser_profile`)
  REFERENCES `SkillSearchDb`.`user` (`user_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  
  ALTER TABLE `SkillSearchDb`.`project` 
ADD INDEX `fk_project_location_idx` (`location_id` ASC);
ALTER TABLE `SkillSearchDb`.`project` 
ADD CONSTRAINT `fk_project_location`
  FOREIGN KEY (`location_id`)
  REFERENCES `SkillSearchDb`.`location` (`location_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

  
  ALTER TABLE `SkillSearchDb`.`user_profile` 
ADD INDEX `fk_profile_to_location_idx` (`location_id` ASC);
ALTER TABLE `SkillSearchDb`.`user_profile` 
ADD CONSTRAINT `fk_profile_to_location`
  FOREIGN KEY (`location_id`)
  REFERENCES `SkillSearchDb`.`location` (`location_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

  
  ALTER TABLE `SkillSearchDb`.`employee_project_skill` 
ADD INDEX `fk_project_id_idx` (`projectid` ASC),
ADD INDEX `fk_skill_id_idx` (`skillid` ASC);
ALTER TABLE `SkillSearchDb`.`employee_project_skill` 
ADD CONSTRAINT `fk_user_id`
  FOREIGN KEY (`idemployee_project_skill`)
  REFERENCES `SkillSearchDb`.`user` (`user_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_project_id`
  FOREIGN KEY (`projectid`)
  REFERENCES `SkillSearchDb`.`project` (`project_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_skill_id`
  FOREIGN KEY (`skillid`)
  REFERENCES `SkillSearchDb`.`skill` (`skill_id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;*/

