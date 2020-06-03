-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema babywizard
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema babywizard
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `babywizard` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `babywizard` ;

-- -----------------------------------------------------
-- Table `babywizard`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`usuario` (
  `usuario` VARCHAR(45) NOT NULL,
  `contrasenia` VARBINARY(150) NOT NULL,
  `administrador` TINYINT NOT NULL,
  `nombreU` VARCHAR(45) NOT NULL,
  `apellidoMaternoU` VARCHAR(45) NOT NULL,
  `apellidoPaternoU` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`usuario`),
  UNIQUE INDEX `idUsuario_UNIQUE` (`usuario` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`bebe`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`bebe` (
  `idBebe` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidoMaterno` VARCHAR(45) NOT NULL,
  `apellidoPaterno` VARCHAR(45) NOT NULL,
  `sexo` TINYINT NOT NULL,
  `fechaNacimientoBb` DATE NOT NULL,
  `fkUsuario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idBebe`),
  UNIQUE INDEX `idBebe_UNIQUE` (`idBebe` ASC) VISIBLE,
  INDEX `fkUsuario_idx` (`fkUsuario` ASC) VISIBLE,
  CONSTRAINT `fkUsuario`
    FOREIGN KEY (`fkUsuario`)
    REFERENCES `babywizard`.`usuario` (`usuario`))
ENGINE = InnoDB
AUTO_INCREMENT = 1030
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`cuidador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`cuidador` (
  `idCuidador` INT NOT NULL AUTO_INCREMENT,
  `correoElectronico` VARCHAR(45) NOT NULL,
  `nombreC` VARCHAR(45) NOT NULL,
  `primerApellidoC` VARCHAR(45) NOT NULL,
  `segundoApellidoC` VARCHAR(45) NOT NULL,
  `ocupacion` VARCHAR(45) NOT NULL,
  `primerTelefono` VARCHAR(15) NOT NULL,
  `segundoTelefono` VARCHAR(15) NULL DEFAULT NULL,
  `aniosEstudio` INT NOT NULL,
  `fkBebe` INT NOT NULL,
  `edad` INT NOT NULL,
  `relacion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCuidador`),
  UNIQUE INDEX `idCuidador_UNIQUE` (`idCuidador` ASC) VISIBLE,
  UNIQUE INDEX `correoElectronico_UNIQUE` (`correoElectronico` ASC) VISIBLE,
  INDEX `fkbebecuidador` (`fkBebe` ASC) VISIBLE,
  CONSTRAINT `fkbebecuidador`
    FOREIGN KEY (`fkBebe`)
    REFERENCES `babywizard`.`bebe` (`idBebe`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 1051
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`experimentocabina`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`experimentocabina` (
  `idExperimentoCabina` INT NOT NULL AUTO_INCREMENT,
  `tipoExperimento` VARCHAR(45) NOT NULL,
  `entrenamientoOPrueba` TINYINT NOT NULL,
  `protarPre` DECIMAL(6,2) NOT NULL,
  `protarPos` DECIMAL(6,2) NOT NULL,
  `llkdifpre` DECIMAL(6,2) NOT NULL,
  `llkdifpos` DECIMAL(6,2) NOT NULL,
  `tr` DECIMAL(6,2) NOT NULL,
  `fkBebe` INT NOT NULL,
  PRIMARY KEY (`idExperimentoCabina`),
  INDEX `fkBebeEC_idx` (`fkBebe` ASC) VISIBLE,
  CONSTRAINT `fkBebeEC`
    FOREIGN KEY (`fkBebe`)
    REFERENCES `babywizard`.`bebe` (`idBebe`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`lecturaconjunta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`lecturaconjunta` (
  `idLecturaConjunta` INT NOT NULL AUTO_INCREMENT,
  `typeOrToken` TINYINT NOT NULL,
  `preposicion` INT NOT NULL,
  `sustantivo` INT NOT NULL,
  `articulo` INT NOT NULL,
  `verbo` INT NOT NULL,
  `ininteligible` INT NOT NULL,
  `adjetivo` INT NOT NULL,
  `pronombre` INT NOT NULL,
  `adverbio` INT NOT NULL,
  `conjuncion` INT NOT NULL,
  `interjeccion` INT NOT NULL,
  `fkBebe` INT NULL DEFAULT NULL,
  `cuidadorBebe` TINYINT NOT NULL,
  PRIMARY KEY (`idLecturaConjunta`),
  UNIQUE INDEX `idCategoriaGramatical_UNIQUE` (`idLecturaConjunta` ASC) VISIBLE,
  INDEX `fkInfante_idx` (`fkBebe` ASC) VISIBLE,
  CONSTRAINT `fkBebeRana`
    FOREIGN KEY (`fkBebe`)
    REFERENCES `babywizard`.`bebe` (`idBebe`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`sociodemografico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`sociodemografico` (
  `idSociodemografico` INT NOT NULL AUTO_INCREMENT,
  `fechaCita` DATE NOT NULL,
  `gestacion` TINYINT NOT NULL,
  `semanasDeNacimiento` INT NOT NULL,
  `ptApgar1` INT NOT NULL,
  `ptApgar2` INT NULL DEFAULT NULL,
  `pesoAlNacer` DECIMAL(3,2) NOT NULL,
  `problemasAlNacer` TINYINT NOT NULL,
  `problemasDeSalud` TINYINT NOT NULL,
  `problemasDeAudicion` TINYINT NOT NULL,
  `problemasDeVision` TINYINT NOT NULL,
  `otroIdioma` INT NOT NULL,
  `hermanos` INT NOT NULL,
  `lugarOcupa` INT NOT NULL,
  `adultos` INT NOT NULL,
  `ninios` INT NOT NULL,
  `cuidadorPrincipal` VARCHAR(45) NOT NULL,
  `guarderia` TINYINT NOT NULL,
  `tiempoAsistiendoMesesG` INT NULL DEFAULT NULL,
  `tiempoQueAsisteG` INT NULL DEFAULT NULL,
  `preescolar` TINYINT NOT NULL,
  `tiempoAsistiendoMesesP` INT NULL DEFAULT NULL,
  `tiempoQueAsisteP` INT NULL DEFAULT NULL,
  `Observaciones` TEXT NULL DEFAULT NULL,
  `fkBebeSociodemografico` INT NOT NULL,
  PRIMARY KEY (`idSociodemografico`),
  UNIQUE INDEX `idSociodemografico_UNIQUE` (`idSociodemografico` ASC) VISIBLE,
  INDEX `fkBebe_idx` (`fkBebeSociodemografico` ASC) VISIBLE,
  CONSTRAINT `fkBebeSociodemografico`
    FOREIGN KEY (`fkBebeSociodemografico`)
    REFERENCES `babywizard`.`bebe` (`idBebe`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 17
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`socioeconomico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`socioeconomico` (
  `idSocioeconomico` INT NOT NULL AUTO_INCREMENT,
  `puntajeCrudo` INT NOT NULL,
  `nse` VARCHAR(3) NOT NULL,
  `fkSociodemografico` INT NOT NULL,
  PRIMARY KEY (`idSocioeconomico`),
  UNIQUE INDEX `idSocioeconomico_UNIQUE` (`idSocioeconomico` ASC) VISIBLE,
  INDEX `fkSociodemografico` (`fkSociodemografico` ASC) VISIBLE,
  CONSTRAINT `fkSociodemografico`
    FOREIGN KEY (`fkSociodemografico`)
    REFERENCES `babywizard`.`sociodemografico` (`idSociodemografico`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 15
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`wppsi303642`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`wppsi303642` (
  `idWppsi303642` INT NOT NULL AUTO_INCREMENT,
  `vocabularioReceptivoNatural` INT NOT NULL,
  `disenioCubosNatural` INT NOT NULL,
  `informacionNatural` INT NOT NULL,
  `rompecabezasNatural` INT NOT NULL,
  `denominacionesNatural` INT NOT NULL,
  `fkBebe` INT NOT NULL,
  `fechaAplicacion` DATE NOT NULL,
  `sustdn` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`idWppsi303642`),
  UNIQUE INDEX `idWPPSI303642_UNIQUE` (`idWppsi303642` ASC) VISIBLE,
  INDEX `fkBebeWPPSI303642_idx` (`fkBebe` ASC) VISIBLE,
  CONSTRAINT `fkBebeWppsi303642`
    FOREIGN KEY (`fkBebe`)
    REFERENCES `babywizard`.`bebe` (`idBebe`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 11
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `babywizard`.`wppsi48`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `babywizard`.`wppsi48` (
  `idWppsi48` INT NOT NULL AUTO_INCREMENT,
  `disenioConCubosNatural` INT NOT NULL,
  `informacionNatural` INT NOT NULL,
  `semejanzasNatural` INT NOT NULL,
  `matricesNatural` INT NOT NULL,
  `vocabularioNatural` INT NOT NULL,
  `conceptosConDibujosNatural` INT NOT NULL,
  `busquedaSimbolosNatural` INT NOT NULL,
  `pistasNatural` INT NOT NULL,
  `clavesNatural` INT NOT NULL,
  `comprensionNatural` INT NOT NULL,
  `figurasIncompletasNatural` INT NOT NULL,
  `vocabularioReceptivoNatural` INT NOT NULL,
  `rompecabezasNatural` INT NOT NULL,
  `denominacionesNatural` INT NOT NULL,
  `fkBebe` INT NOT NULL,
  `fechaAplicacion` DATE NOT NULL,
  `dcfi` TINYINT NOT NULL,
  `dcrc` TINYINT NOT NULL,
  `incm` TINYINT NOT NULL,
  `inse` TINYINT NOT NULL,
  `mtfi` TINYINT NOT NULL,
  `mtrc` TINYINT NOT NULL,
  `vccm` TINYINT NOT NULL,
  `vcse` TINYINT NOT NULL,
  `cpfi` TINYINT NOT NULL,
  `cprc` TINYINT NOT NULL,
  `pscm` TINYINT NOT NULL,
  `psse` TINYINT NOT NULL,
  `clbs` TINYINT NOT NULL,
  PRIMARY KEY (`idWppsi48`),
  UNIQUE INDEX `idWPPSI48_UNIQUE` (`idWppsi48` ASC) VISIBLE,
  INDEX `fkBebeWPPSI48_idx` (`fkBebe` ASC) VISIBLE,
  CONSTRAINT `fkBebeWppsi48`
    FOREIGN KEY (`fkBebe`)
    REFERENCES `babywizard`.`bebe` (`idBebe`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
