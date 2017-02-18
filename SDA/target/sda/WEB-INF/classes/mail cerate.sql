CREATE TABLE `sdadb`.`mail` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `mail` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  UNIQUE INDEX `mail_UNIQUE` (`mail` ASC));
