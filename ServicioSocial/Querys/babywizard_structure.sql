-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: babywizard
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
) ENGINE=InnoDB AUTO_INCREMENT=1041 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cdi12`
--

DROP TABLE IF EXISTS `cdi12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cdi12` (
  `idCdi12` int NOT NULL AUTO_INCREMENT,
  `primerasFrases` int DEFAULT NULL,
  `propPrimerasFrases` decimal(3,2) DEFAULT NULL,
  `percPrimerasFrases` int DEFAULT NULL,
  `comprension` int DEFAULT NULL,
  `propComprension` decimal(3,2) DEFAULT NULL,
  `percComprension` int DEFAULT NULL,
  `produccion` int DEFAULT NULL,
  `propProduccion` decimal(3,2) DEFAULT NULL,
  `percProduccion` int DEFAULT NULL,
  `totalGestos` int DEFAULT NULL,
  `propTotalGestos` decimal(3,2) DEFAULT NULL,
  `percTotalGestos` int DEFAULT NULL,
  `gestosTempranos` int DEFAULT NULL,
  `propGestosTempranos` decimal(3,2) DEFAULT NULL,
  `percGestosTempranos` int DEFAULT NULL,
  `gestosTardios` int DEFAULT NULL,
  `propGestosTardios` decimal(3,2) DEFAULT NULL,
  `percGestosTardios` int DEFAULT NULL,
  `fechaAplicacion` date DEFAULT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idCdi12`),
  UNIQUE KEY `idCdi12_UNIQUE` (`idCdi12`),
  KEY `fkInfante_idx` (`fkBebe`),
  CONSTRAINT `fkBebe` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `cdi182430`
--

DROP TABLE IF EXISTS `cdi182430`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cdi182430` (
  `idCdi182430` int NOT NULL AUTO_INCREMENT,
  `produccion` int DEFAULT NULL,
  `propProduccion` decimal(3,2) DEFAULT NULL,
  `percProduccion` int DEFAULT NULL,
  `p3lPalabras` decimal(3,2) DEFAULT NULL,
  `percP3lPalabras` int DEFAULT NULL,
  `complejidadFrases` int DEFAULT NULL,
  `propComplejidadFrases` decimal(3,2) DEFAULT NULL,
  `percComplejidadFrases` int DEFAULT NULL,
  `fechaAplicacion` date DEFAULT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idCdi182430`),
  UNIQUE KEY `idCdi182430_UNIQUE` (`idCdi182430`),
  KEY `fkInfante_idx` (`fkBebe`),
  CONSTRAINT `idCdi182430_ibfk_1` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  `ocupacion` varchar(45) NOT NULL,
  `primerTelefono` varchar(15) NOT NULL,
  `segundoTelefono` varchar(15) DEFAULT NULL,
  `aniosEstudio` int NOT NULL,
  `fkBebe` int NOT NULL,
  `edad` int NOT NULL,
  `relacion` varchar(45) NOT NULL,
  PRIMARY KEY (`idCuidador`),
  UNIQUE KEY `idCuidador_UNIQUE` (`idCuidador`),
  UNIQUE KEY `correoElectronico_UNIQUE` (`correoElectronico`),
  KEY `fkbebecuidador` (`fkBebe`),
  CONSTRAINT `fkbebecuidador` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1060 DEFAULT CHARSET=utf8;
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
  `enlace` varchar(100) DEFAULT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idExperimentoCabina`),
  KEY `fkBebeEC_idx` (`fkBebe`),
  CONSTRAINT `fkBebeEC` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `icplim`
--

DROP TABLE IF EXISTS `icplim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `icplim` (
  `idIcplim` int NOT NULL AUTO_INCREMENT,
  `C` int DEFAULT NULL,
  `propC` decimal(3,2) DEFAULT NULL,
  `CyD` int DEFAULT NULL,
  `propCyD` decimal(3,2) DEFAULT NULL,
  `total` int DEFAULT NULL,
  `propTotal` decimal(3,2) DEFAULT NULL,
  `fechaAplicacion` date DEFAULT NULL,
  `fkBebe` int NOT NULL,
  PRIMARY KEY (`idIcplim`),
  UNIQUE KEY `idIcplim_UNIQUE` (`idIcplim`),
  KEY `fkBebeIcplim_idx` (`fkBebe`),
  CONSTRAINT `fkBebeIcplim` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  `cuidadorBebe` tinyint NOT NULL,
  `fechaAplicacion` date DEFAULT NULL,
  PRIMARY KEY (`idLecturaConjunta`),
  UNIQUE KEY `idCategoriaGramatical_UNIQUE` (`idLecturaConjunta`),
  KEY `fkInfante_idx` (`fkBebe`),
  CONSTRAINT `fkBebeRana` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
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
  KEY `fkBebe_idx` (`fkBebeSociodemografico`),
  CONSTRAINT `fkBebeSociodemografico` FOREIGN KEY (`fkBebeSociodemografico`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1025 DEFAULT CHARSET=utf8;
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
  `fkBebe` int NOT NULL,
  `fechaAplicacion` date DEFAULT NULL,
  PRIMARY KEY (`idSocioeconomico`),
  UNIQUE KEY `idSocioeconomico_UNIQUE` (`idSocioeconomico`),
  KEY `fkBebe` (`fkBebe`),
  CONSTRAINT `socioeconomico_ibfk_1` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1027 DEFAULT CHARSET=utf8;
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
  `fechaAplicacion` date NOT NULL,
  `sustdn` tinyint DEFAULT NULL,
  PRIMARY KEY (`idWppsi303642`),
  UNIQUE KEY `idWPPSI303642_UNIQUE` (`idWppsi303642`),
  KEY `fkBebeWPPSI303642_idx` (`fkBebe`),
  CONSTRAINT `fkBebeWppsi303642` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;
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
  `fechaAplicacion` date NOT NULL,
  `dcfi` tinyint NOT NULL,
  `dcrc` tinyint NOT NULL,
  `incm` tinyint NOT NULL,
  `inse` tinyint NOT NULL,
  `mtfi` tinyint NOT NULL,
  `mtrc` tinyint NOT NULL,
  `vccm` tinyint NOT NULL,
  `vcse` tinyint NOT NULL,
  `cpfi` tinyint NOT NULL,
  `cprc` tinyint NOT NULL,
  `pscm` tinyint NOT NULL,
  `psse` tinyint NOT NULL,
  `clbs` tinyint NOT NULL,
  PRIMARY KEY (`idWppsi48`),
  UNIQUE KEY `idWPPSI48_UNIQUE` (`idWppsi48`),
  KEY `fkBebeWPPSI48_idx` (`fkBebe`),
  CONSTRAINT `fkBebeWppsi48` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=204 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-04 19:54:01
