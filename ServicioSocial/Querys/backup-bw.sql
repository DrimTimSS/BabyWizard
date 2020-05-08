-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: babywizard
-- ------------------------------------------------------
-- Server version	8.0.19

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
-- Table structure for table `bebe`
--

DROP TABLE IF EXISTS `bebe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bebe` (
  `idBebe` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellidoMaterno` varchar(45) NOT NULL,
  `apellidoPaterno` varchar(45) NOT NULL,
  `sexo` tinyint NOT NULL,
  `fechaNacimientoBb` date NOT NULL,
  `fkUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idBebe`),
  UNIQUE KEY `idBebe_UNIQUE` (`idBebe`),
  KEY `fkUsuario_idx` (`fkUsuario`),
  CONSTRAINT `fkUsuario` FOREIGN KEY (`fkUsuario`) REFERENCES `usuario` (`usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cuidador`
--

DROP TABLE IF EXISTS `cuidador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuidador` (
  `idCuidador` int NOT NULL AUTO_INCREMENT,
  `correoElectronico` varchar(45) NOT NULL,
  `nombreC` varchar(45) NOT NULL,
  `primerApellidoC` varchar(45) NOT NULL,
  `segundoApellidoC` varchar(45) NOT NULL,
  `fechaDeNacimiento` date NOT NULL,
  `ocupacion` varchar(45) NOT NULL,
  `primerTelefono` varchar(15) NOT NULL,
  `segundoTelefono` varchar(15) DEFAULT NULL,
  `aniosEstudio` int NOT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idCuidador`),
  UNIQUE KEY `idCuidador_UNIQUE` (`idCuidador`),
  UNIQUE KEY `correoElectronico_UNIQUE` (`correoElectronico`),
  UNIQUE KEY `fkbebe` (`fkBebe`),
  CONSTRAINT `fkbebecuidador` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `experimentocabina`
--

DROP TABLE IF EXISTS `experimentocabina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experimentocabina` (
  `idExperimentoCabina` int NOT NULL AUTO_INCREMENT,
  `tipoExperimento` varchar(45) NOT NULL,
  `entrenamientoOPrueba` tinyint NOT NULL,
  `protarPre` decimal(6,2) NOT NULL,
  `protarPos` decimal(6,2) NOT NULL,
  `llkdifpre` decimal(6,2) NOT NULL,
  `llkdifpos` decimal(6,2) NOT NULL,
  `tr` decimal(6,2) NOT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idExperimentoCabina`),
  KEY `fkBebeEC_idx` (`fkBebe`),
  CONSTRAINT `fkBebeEC` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `lecturaconjunta`
--

DROP TABLE IF EXISTS `lecturaconjunta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lecturaconjunta` (
  `idLecturaConjunta` int NOT NULL AUTO_INCREMENT,
  `typeOrToken` tinyint NOT NULL,
  `preposicion` int NOT NULL,
  `sustantivo` int NOT NULL,
  `articulo` int NOT NULL,
  `verbo` int NOT NULL,
  `ininteligible` int NOT NULL,
  `adjetivo` int NOT NULL,
  `pronombre` int NOT NULL,
  `adverbio` int NOT NULL,
  `conjuncion` int NOT NULL,
  `interjeccion` int NOT NULL,
  `fkBebe` int DEFAULT NULL,
  PRIMARY KEY (`idLecturaConjunta`),
  UNIQUE KEY `idCategoriaGramatical_UNIQUE` (`idLecturaConjunta`),
  KEY `fkInfante_idx` (`fkBebe`),
  CONSTRAINT `fkBebeRana` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sociodemografico`
--

DROP TABLE IF EXISTS `sociodemografico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sociodemografico` (
  `idSociodemografico` int NOT NULL AUTO_INCREMENT,
  `fechaCita` date NOT NULL,
  `gestacion` tinyint NOT NULL,
  `semanasDeNacimiento` int NOT NULL,
  `ptApgar1` int NOT NULL,
  `ptApgar2` int DEFAULT NULL,
  `pesoAlNacer` decimal(3,2) NOT NULL,
  `problemasAlNacer` tinyint NOT NULL,
  `problemasDeSalud` tinyint NOT NULL,
  `problemasDeAudicion` tinyint NOT NULL,
  `problemasDeVision` tinyint NOT NULL,
  `otroIdioma` int NOT NULL,
  `hermanos` int NOT NULL,
  `lugarOcupa` int NOT NULL,
  `adultos` int NOT NULL,
  `ninios` int NOT NULL,
  `cuidadorPrincipal` varchar(45) NOT NULL,
  `guarderia` tinyint NOT NULL,
  `tiempoAsistiendoMesesG` int DEFAULT NULL,
  `tiempoQueAsisteG` int DEFAULT NULL,
  `preescolar` tinyint NOT NULL,
  `tiempoAsistiendoMesesP` int DEFAULT NULL,
  `tiempoQueAsisteP` int DEFAULT NULL,
  `Observaciones` text,
  `fkBebeSociodemografico` int NOT NULL,
  PRIMARY KEY (`idSociodemografico`),
  UNIQUE KEY `idSociodemografico_UNIQUE` (`idSociodemografico`),
  UNIQUE KEY `fkBebeSociodemografico_UNIQUE` (`fkBebeSociodemografico`),
  KEY `fkBebe_idx` (`fkBebeSociodemografico`),
  CONSTRAINT `fkBebeSociodemografico` FOREIGN KEY (`fkBebeSociodemografico`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `socioeconomico`
--

DROP TABLE IF EXISTS `socioeconomico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `socioeconomico` (
  `idSocioeconomico` int NOT NULL AUTO_INCREMENT,
  `puntajeCrudo` int NOT NULL,
  `nse` varchar(3) NOT NULL,
  `fkSociodemografico` int DEFAULT NULL,
  PRIMARY KEY (`idSocioeconomico`),
  UNIQUE KEY `idSocioeconomico_UNIQUE` (`idSocioeconomico`),
  UNIQUE KEY `fkSociodemografico_UNIQUE` (`fkSociodemografico`),
  CONSTRAINT `fkSociodemografico` FOREIGN KEY (`fkSociodemografico`) REFERENCES `sociodemografico` (`idSociodemografico`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `usuario` varchar(45) NOT NULL,
  `contrasenia` varbinary(150) NOT NULL,
  `administrador` tinyint NOT NULL,
  `nombreU` varchar(45) NOT NULL,
  `apellidoMaternoU` varchar(45) NOT NULL,
  `apellidoPaternoU` varchar(45) NOT NULL,
  PRIMARY KEY (`usuario`),
  UNIQUE KEY `idUsuario_UNIQUE` (`usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `wppsi303642`
--

DROP TABLE IF EXISTS `wppsi303642`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wppsi303642` (
  `idWppsi303642` int NOT NULL AUTO_INCREMENT,
  `vocabularioReceptivoNatural` int NOT NULL,
  `disenioCubosNatural` int NOT NULL,
  `informacionNatural` int NOT NULL,
  `rompecabezasNatural` int NOT NULL,
  `denominacionesNatural` int NOT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idWppsi303642`),
  UNIQUE KEY `idWPPSI303642_UNIQUE` (`idWppsi303642`),
  KEY `fkBebeWPPSI303642_idx` (`fkBebe`),
  CONSTRAINT `fkBebeWppsi303642` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `wppsi48`
--

DROP TABLE IF EXISTS `wppsi48`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `wppsi48` (
  `idWppsi48` int NOT NULL AUTO_INCREMENT,
  `disenioConCubosNatural` int NOT NULL,
  `informacionNatural` int NOT NULL,
  `semejanzasNatural` int NOT NULL,
  `matricesNatural` int NOT NULL,
  `vocabularioNatural` int NOT NULL,
  `conceptosConDibujosNatural` int NOT NULL,
  `busquedaSimbolosNatural` int NOT NULL,
  `pistasNatural` int NOT NULL,
  `clavesNatural` int NOT NULL,
  `comprensionNatural` int NOT NULL,
  `figurasIncompletasNatural` int NOT NULL,
  `vocabularioReceptivoNatural` int NOT NULL,
  `rompecabezasNatural` int NOT NULL,
  `denominacionesNatural` int NOT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idWppsi48`),
  UNIQUE KEY `idWPPSI48_UNIQUE` (`idWppsi48`),
  KEY `fkBebeWPPSI48_idx` (`fkBebe`),
  CONSTRAINT `fkBebeWppsi48` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping events for database 'babywizard'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-30 13:08:09
