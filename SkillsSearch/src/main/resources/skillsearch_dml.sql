INSERT INTO `SkillSearchDb`.`user`
(
`user_sid`,
`password`,
`email`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'o509773',
'abhie',
'abhimanyu.x.singh@jpmorgan.com',
NOW(),
'o509773',
NOW(),
'o509773');


INSERT INTO `SkillSearchDb`.`user`
(
`user_sid`,
`password`,
`email`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'a111111',
'Sanket',
'sanket.modi@jpmorgan.com',
NOW(),
'a111111',
NOW(),
'a111111');


INSERT INTO `SkillSearchDb`.`user`
(
`user_sid`,
`password`,
`email`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'a222222',
'Harry',
'harry.zhang@jpmorgan.com',
NOW(),
'a222222',
NOW(),
'a222222');


INSERT INTO `SkillSearchDb`.`user`
(
`user_sid`,
`password`,
`email`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'e787878',
'purvi',
'purvi.joshi@jpmorgan.com',
NOW(),
'e787878',
NOW(),
'e787878');


INSERT INTO `SkillSearchDb`.`skill`
(
`skill_name`,
`version`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'Java',
'1.8',
NOW(),
'o509773',
NOW(),
'o509773');

INSERT INTO `SkillSearchDb`.`skill`
(
`skill_name`,
`version`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'C',
NULL,
NOW(),
'o509773',
NOW(),
'o509773');


INSERT INTO `SkillSearchDb`.`skill`
(
`skill_name`,
`version`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'Informatica',
'10.8',
NOW(),
'o509773',
NOW(),
'o509773');


INSERT INTO `SkillSearchDb`.`skill`
(
`skill_name`,
`version`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'ExtJS',
'6.1',
NOW(),
'o509773',
NOW(),
'o509773');

INSERT INTO `SkillSearchDb`.`location`
(
`country`,
`city`,
`state`,
`address1`,
`address2`,
`zip`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'US',
'Jersey City',
'New Jersey',
'575 Washington Blvd',
NULL,
'07310',
NOW(),
'o509773',
NOW(),
'o509773');


INSERT INTO `SkillSearchDb`.`location`
(
`country`,
`city`,
`state`,
`address1`,
`address2`,
`zip`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'US',
'New York',
'New York',
'4 New York Plaza',
NULL,
'41141',
NOW(),
'o509773',
NOW(),
'o509773');


INSERT INTO `SkillSearchDb`.`project`
(
`project_name`,
`location_id`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'US Compliance',
1,
NOW(),
'o509773',
NOW(),
'o509773');


INSERT INTO `SkillSearchDb`.`project`
(
`project_name`,
`location_id`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'Asia Compliance',
2,
NOW(),
'o509773',
NOW(),
'o509773');


INSERT INTO `SkillSearchDb`.`user_profile`
(
`user_sid`,
`user_id`,
`first_name`,
`last_name`,
`location_id`,
`is_ooo`,
`created_date`,
`created_by`,
`updated_date`,
`updated_by`)
VALUES
(
'o509773',
2,
'Abhie',
'Singh',
2,
'N',
NOW(),
'o509773',
NOW(),
'o509773');
