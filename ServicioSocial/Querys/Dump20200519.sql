CREATE DATABASE  IF NOT EXISTS `cdi182430` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cdi182430`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: cdi182430
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
-- Table structure for table `acciones_procesos`
--

DROP TABLE IF EXISTS `acciones_procesos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acciones_procesos` (
  `id_acciones_procesos` int NOT NULL AUTO_INCREMENT,
  `abrir` tinyint(1) NOT NULL,
  `acabar` tinyint(1) NOT NULL,
  `acompaniar` tinyint(1) NOT NULL,
  `acostar_se` tinyint(1) NOT NULL,
  `agarrar` tinyint(1) NOT NULL,
  `alcanzar` tinyint(1) NOT NULL,
  `almorzar` tinyint(1) NOT NULL,
  `amarrar_se` tinyint(1) NOT NULL,
  `andar` tinyint(1) NOT NULL,
  `apagar` tinyint(1) NOT NULL,
  `apretar` tinyint(1) NOT NULL,
  `apurar_se` tinyint(1) NOT NULL,
  `arreglar_se` tinyint(1) NOT NULL,
  `asustar_se` tinyint(1) NOT NULL,
  `avanzar` tinyint(1) NOT NULL,
  `aventar` tinyint(1) NOT NULL,
  `ayudar` tinyint(1) NOT NULL,
  `bailar` tinyint(1) NOT NULL,
  `bajar_se` tinyint(1) NOT NULL,
  `barrer` tinyint(1) NOT NULL,
  `besar` tinyint(1) NOT NULL,
  `brincar` tinyint(1) NOT NULL,
  `buscar` tinyint(1) NOT NULL,
  `caber` tinyint(1) NOT NULL,
  `caer_se` tinyint(1) NOT NULL,
  `callar_se` tinyint(1) NOT NULL,
  `caminar` tinyint(1) NOT NULL,
  `cantar` tinyint(1) NOT NULL,
  `cargar` tinyint(1) NOT NULL,
  `cenar` tinyint(1) NOT NULL,
  `cerrar` tinyint(1) NOT NULL,
  `cocinar` tinyint(1) NOT NULL,
  `comer_se` tinyint(1) NOT NULL,
  `comprar` tinyint(1) NOT NULL,
  `conocer` tinyint(1) NOT NULL,
  `contestar` tinyint(1) NOT NULL,
  `correr` tinyint(1) NOT NULL,
  `cortar` tinyint(1) NOT NULL,
  `dar` tinyint(1) NOT NULL,
  `decir` tinyint(1) NOT NULL,
  `dejar` tinyint(1) NOT NULL,
  `desayunar` tinyint(1) NOT NULL,
  `dibujar` tinyint(1) NOT NULL,
  `doler` tinyint(1) NOT NULL,
  `dormir_se` tinyint(1) NOT NULL,
  `echar` tinyint(1) NOT NULL,
  `empezar` tinyint(1) NOT NULL,
  `empujar` tinyint(1) NOT NULL,
  `encontrar` tinyint(1) NOT NULL,
  `enseniar` tinyint(1) NOT NULL,
  `entrar` tinyint(1) NOT NULL,
  `equivocar_se` tinyint(1) NOT NULL,
  `esconder_se` tinyint(1) NOT NULL,
  `escribir` tinyint(1) NOT NULL,
  `escuchar` tinyint(1) NOT NULL,
  `esperar_se` tinyint(1) NOT NULL,
  `ganar` tinyint(1) NOT NULL,
  `gritar` tinyint(1) NOT NULL,
  `gustar` tinyint(1) NOT NULL,
  `hacer` tinyint(1) NOT NULL,
  `ir_se` tinyint(1) NOT NULL,
  `jalar` tinyint(1) NOT NULL,
  `jugar` tinyint(1) NOT NULL,
  `juntar` tinyint(1) NOT NULL,
  `lastimar_se` tinyint(1) NOT NULL,
  `lavar_se` tinyint(1) NOT NULL,
  `leer` tinyint(1) NOT NULL,
  `levantar_se` tinyint(1) NOT NULL,
  `llamar` tinyint(1) NOT NULL,
  `llegar` tinyint(1) NOT NULL,
  `llevar_se` tinyint(1) NOT NULL,
  `llorar` tinyint(1) NOT NULL,
  `manejar` tinyint(1) NOT NULL,
  `meter_se` tinyint(1) NOT NULL,
  `mirar` tinyint(1) NOT NULL,
  `morder` tinyint(1) NOT NULL,
  `mover` tinyint(1) NOT NULL,
  `nadar` tinyint(1) NOT NULL,
  `oir` tinyint(1) NOT NULL,
  `parar_se` tinyint(1) NOT NULL,
  `pasear` tinyint(1) NOT NULL,
  `patear` tinyint(1) NOT NULL,
  `patinar` tinyint(1) NOT NULL,
  `pegar_se` tinyint(1) NOT NULL,
  `peinar_se` tinyint(1) NOT NULL,
  `pellizcar` tinyint(1) NOT NULL,
  `pensar` tinyint(1) NOT NULL,
  `perder` tinyint(1) NOT NULL,
  `pintar` tinyint(1) NOT NULL,
  `platicar` tinyint(1) NOT NULL,
  `poder` tinyint(1) NOT NULL,
  `poner_se` tinyint(1) NOT NULL,
  `prender` tinyint(1) NOT NULL,
  `quedar_se` tinyint(1) NOT NULL,
  `quemar_se` tinyint(1) NOT NULL,
  `querer` tinyint(1) NOT NULL,
  `quitar_se` tinyint(1) NOT NULL,
  `regalar` tinyint(1) NOT NULL,
  `romper` tinyint(1) NOT NULL,
  `saber` tinyint(1) NOT NULL,
  `sacar` tinyint(1) NOT NULL,
  `salir_se` tinyint(1) NOT NULL,
  `saltar` tinyint(1) NOT NULL,
  `saludar` tinyint(1) NOT NULL,
  `seguir` tinyint(1) NOT NULL,
  `sentar_se` tinyint(1) NOT NULL,
  `soplar` tinyint(1) NOT NULL,
  `subir` tinyint(1) NOT NULL,
  `tapar` tinyint(1) NOT NULL,
  `tener` tinyint(1) NOT NULL,
  `terminar` tinyint(1) NOT NULL,
  `tirar` tinyint(1) NOT NULL,
  `tocar` tinyint(1) NOT NULL,
  `tomar_se` tinyint(1) NOT NULL,
  `trabajar` tinyint(1) NOT NULL,
  `traer_se` tinyint(1) NOT NULL,
  `venir_se` tinyint(1) NOT NULL,
  `ver_se` tinyint(1) NOT NULL,
  `vivir` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_acciones_procesos`),
  KEY `fk_acciones_procesos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_acciones_procesos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acciones_procesos`
--

LOCK TABLES `acciones_procesos` WRITE;
/*!40000 ALTER TABLE `acciones_procesos` DISABLE KEYS */;
/*!40000 ALTER TABLE `acciones_procesos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alimentos_bebidas`
--

DROP TABLE IF EXISTS `alimentos_bebidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alimentos_bebidas` (
  `id_alimentos_bebidas` int NOT NULL AUTO_INCREMENT,
  `agua` tinyint(1) NOT NULL,
  `arroz` tinyint(1) NOT NULL,
  `atole` tinyint(1) NOT NULL,
  `atun` tinyint(1) NOT NULL,
  `avena` tinyint(1) NOT NULL,
  `azucar` tinyint(1) NOT NULL,
  `cacahuate_mani` tinyint(1) NOT NULL,
  `cafe` tinyint(1) NOT NULL,
  `calabaza` tinyint(1) NOT NULL,
  `carne` tinyint(1) NOT NULL,
  `cereal` tinyint(1) NOT NULL,
  `chicharo` tinyint(1) NOT NULL,
  `chicharron` tinyint(1) NOT NULL,
  `chicle` tinyint(1) NOT NULL,
  `chile` tinyint(1) NOT NULL,
  `chocolate` tinyint(1) NOT NULL,
  `comida` tinyint(1) NOT NULL,
  `crema_cacahuate` tinyint(1) NOT NULL,
  `dulce` tinyint(1) NOT NULL,
  `durazno` tinyint(1) NOT NULL,
  `ejotes` tinyint(1) NOT NULL,
  `elote` tinyint(1) NOT NULL,
  `espagueti` tinyint(1) NOT NULL,
  `fresa` tinyint(1) NOT NULL,
  `frijoles` tinyint(1) NOT NULL,
  `galleta` tinyint(1) NOT NULL,
  `gelatina` tinyint(1) NOT NULL,
  `hamburguesa` tinyint(1) NOT NULL,
  `helado_nieve` tinyint(1) NOT NULL,
  `hielo` tinyint(1) NOT NULL,
  `hot_cakes` tinyint(1) NOT NULL,
  `huevo` tinyint(1) NOT NULL,
  `jamon` tinyint(1) NOT NULL,
  `jugo` tinyint(1) NOT NULL,
  `leche` tinyint(1) NOT NULL,
  `licuado` tinyint(1) NOT NULL,
  `limonada` tinyint(1) NOT NULL,
  `limon` tinyint(1) NOT NULL,
  `mango` tinyint(1) NOT NULL,
  `mantequilla` tinyint(1) NOT NULL,
  `manzana` tinyint(1) NOT NULL,
  `melon` tinyint(1) NOT NULL,
  `mermelada` tinyint(1) NOT NULL,
  `miel` tinyint(1) NOT NULL,
  `naranja` tinyint(1) NOT NULL,
  `paleta` tinyint(1) NOT NULL,
  `palomitas` tinyint(1) NOT NULL,
  `pan` tinyint(1) NOT NULL,
  `pan_dulce` tinyint(1) NOT NULL,
  `papas` tinyint(1) NOT NULL,
  `papitas_frituras` tinyint(1) NOT NULL,
  `pasas` tinyint(1) NOT NULL,
  `pastel` tinyint(1) NOT NULL,
  `pescado` tinyint(1) NOT NULL,
  `pinia` tinyint(1) NOT NULL,
  `pizza` tinyint(1) NOT NULL,
  `platano_bananas` tinyint(1) NOT NULL,
  `pollo` tinyint(1) NOT NULL,
  `quesadilla` tinyint(1) NOT NULL,
  `queso` tinyint(1) NOT NULL,
  `refresco_soda` tinyint(1) NOT NULL,
  `sal` tinyint(1) NOT NULL,
  `salchicha` tinyint(1) NOT NULL,
  `salsa` tinyint(1) NOT NULL,
  `sandia` tinyint(1) NOT NULL,
  `sandwich` tinyint(1) NOT NULL,
  `sopa` tinyint(1) NOT NULL,
  `tacos` tinyint(1) NOT NULL,
  `te` tinyint(1) NOT NULL,
  `torta` tinyint(1) NOT NULL,
  `tortilla` tinyint(1) NOT NULL,
  `uvas` tinyint(1) NOT NULL,
  `vainilla` tinyint(1) NOT NULL,
  `verduras` tinyint(1) NOT NULL,
  `vitaminas` tinyint(1) NOT NULL,
  `yogur` tinyint(1) NOT NULL,
  `zanahoria` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_alimentos_bebidas`),
  KEY `fk_alimentos_bebidas_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_alimentos_bebidas_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alimentos_bebidas`
--

LOCK TABLES `alimentos_bebidas` WRITE;
/*!40000 ALTER TABLE `alimentos_bebidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `alimentos_bebidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animales`
--

DROP TABLE IF EXISTS `animales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animales` (
  `id_animales` int NOT NULL AUTO_INCREMENT,
  `abeja` tinyint(1) NOT NULL,
  `aguila` tinyint(1) NOT NULL,
  `alacran` tinyint(1) NOT NULL,
  `animal` tinyint(1) NOT NULL,
  `arania` tinyint(1) NOT NULL,
  `ardilla` tinyint(1) NOT NULL,
  `ballena` tinyint(1) NOT NULL,
  `bicho` tinyint(1) NOT NULL,
  `borrego` tinyint(1) NOT NULL,
  `buey` tinyint(1) NOT NULL,
  `buho` tinyint(1) NOT NULL,
  `burro` tinyint(1) NOT NULL,
  `caballo` tinyint(1) NOT NULL,
  `canario` tinyint(1) NOT NULL,
  `cangrejo` tinyint(1) NOT NULL,
  `caracol` tinyint(1) NOT NULL,
  `cebra` tinyint(1) NOT NULL,
  `cocodrilo` tinyint(1) NOT NULL,
  `conejo` tinyint(1) NOT NULL,
  `elefante` tinyint(1) NOT NULL,
  `foca` tinyint(1) NOT NULL,
  `gallina` tinyint(1) NOT NULL,
  `ganso` tinyint(1) NOT NULL,
  `gato` tinyint(1) NOT NULL,
  `guajolote` tinyint(1) NOT NULL,
  `gusano_lombriz` tinyint(1) NOT NULL,
  `hipopotamo` tinyint(1) NOT NULL,
  `hormiga` tinyint(1) NOT NULL,
  `jirafa` tinyint(1) NOT NULL,
  `oso` tinyint(1) NOT NULL,
  `leon` tinyint(1) NOT NULL,
  `lobo` tinyint(1) NOT NULL,
  `mariposa` tinyint(1) NOT NULL,
  `mono` tinyint(1) NOT NULL,
  `mosca` tinyint(1) NOT NULL,
  `mosco` tinyint(1) NOT NULL,
  `paloma` tinyint(1) NOT NULL,
  `pajaro` tinyint(1) NOT NULL,
  `panda` tinyint(1) NOT NULL,
  `pato` tinyint(1) NOT NULL,
  `perico` tinyint(1) NOT NULL,
  `perro` tinyint(1) NOT NULL,
  `pescado` tinyint(1) NOT NULL,
  `pinguino` tinyint(1) NOT NULL,
  `pollito` tinyint(1) NOT NULL,
  `puerco` tinyint(1) NOT NULL,
  `rana` tinyint(1) NOT NULL,
  `rata` tinyint(1) NOT NULL,
  `raton_hamster` tinyint(1) NOT NULL,
  `tiburon` tinyint(1) NOT NULL,
  `tigre` tinyint(1) NOT NULL,
  `toro` tinyint(1) NOT NULL,
  `tortuga` tinyint(1) NOT NULL,
  `vaca` tinyint(1) NOT NULL,
  `venado` tinyint(1) NOT NULL,
  `vibora` tinyint(1) NOT NULL,
  `zorro` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_animales`),
  KEY `fk_animales_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_animales_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animales`
--

LOCK TABLES `animales` WRITE;
/*!40000 ALTER TABLE `animales` DISABLE KEYS */;
/*!40000 ALTER TABLE `animales` ENABLE KEYS */;
UNLOCK TABLES;

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
  `sexo` tinyint(1) NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `fkUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idBebe`)
) ENGINE=InnoDB AUTO_INCREMENT=564 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebe`
--

LOCK TABLES `bebe` WRITE;
/*!40000 ALTER TABLE `bebe` DISABLE KEYS */;
/*!40000 ALTER TABLE `bebe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cita` (
  `id_cita` int NOT NULL AUTO_INCREMENT,
  `fecha_cita` date NOT NULL,
  `edad_cita` decimal(5,2) NOT NULL,
  `bebes_id_bebe` int NOT NULL,
  PRIMARY KEY (`id_cita`),
  KEY `fk_citas_bebes_idx` (`bebes_id_bebe`),
  CONSTRAINT `fk_citas_bebes` FOREIGN KEY (`bebes_id_bebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `complejidad`
--

DROP TABLE IF EXISTS `complejidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `complejidad` (
  `id_complejidad` int NOT NULL AUTO_INCREMENT,
  `frase1` tinyint(1) NOT NULL,
  `frase2` tinyint(1) NOT NULL,
  `frase3` tinyint(1) NOT NULL,
  `frase4` tinyint(1) NOT NULL,
  `frase5` tinyint(1) NOT NULL,
  `frase6` tinyint(1) NOT NULL,
  `frase7` tinyint(1) NOT NULL,
  `frase8` tinyint(1) NOT NULL,
  `frase9` tinyint(1) NOT NULL,
  `frase10` tinyint(1) NOT NULL,
  `frase11` tinyint(1) NOT NULL,
  `frase12` tinyint(1) NOT NULL,
  `frase13` tinyint(1) NOT NULL,
  `frase14` tinyint(1) NOT NULL,
  `frase15` tinyint(1) NOT NULL,
  `frase16` tinyint(1) NOT NULL,
  `frase17` tinyint(1) NOT NULL,
  `frase18` tinyint(1) NOT NULL,
  `frase19` tinyint(1) NOT NULL,
  `frase20` tinyint(1) NOT NULL,
  `frase21` tinyint(1) NOT NULL,
  `frase22` tinyint(1) NOT NULL,
  `frase23` tinyint(1) NOT NULL,
  `frase24` tinyint(1) NOT NULL,
  `frase25` tinyint(1) NOT NULL,
  `frase26` tinyint(1) NOT NULL,
  `frase27` tinyint(1) NOT NULL,
  `frase28` tinyint(1) NOT NULL,
  `frase29` tinyint(1) NOT NULL,
  `frase30` tinyint(1) NOT NULL,
  `frase31` tinyint(1) NOT NULL,
  `frase32` tinyint(1) NOT NULL,
  `frase33` tinyint(1) NOT NULL,
  `frase34` tinyint(1) NOT NULL,
  `frase35` tinyint(1) NOT NULL,
  `frase36` tinyint(1) NOT NULL,
  `frase37` tinyint(1) NOT NULL,
  `total` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_complejidad`),
  KEY `fk_complejidad_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_complejidad_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complejidad`
--

LOCK TABLES `complejidad` WRITE;
/*!40000 ALTER TABLE `complejidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `complejidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `conectivos`
--

DROP TABLE IF EXISTS `conectivos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `conectivos` (
  `id_conectivos` int NOT NULL AUTO_INCREMENT,
  `entonces` tinyint(1) NOT NULL,
  `luego` tinyint(1) NOT NULL,
  `oo` tinyint(1) NOT NULL,
  `pues` tinyint(1) NOT NULL,
  `que` tinyint(1) NOT NULL,
  `yy` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_conectivos`),
  KEY `fk_conectivos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_conectivos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `conectivos`
--

LOCK TABLES `conectivos` WRITE;
/*!40000 ALTER TABLE `conectivos` DISABLE KEYS */;
/*!40000 ALTER TABLE `conectivos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cualidades_atributos`
--

DROP TABLE IF EXISTS `cualidades_atributos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cualidades_atributos` (
  `id_cualidades_atributos` int NOT NULL AUTO_INCREMENT,
  `abierto` tinyint(1) NOT NULL,
  `alto` tinyint(1) NOT NULL,
  `amarillo` tinyint(1) NOT NULL,
  `azul` tinyint(1) NOT NULL,
  `bajo` tinyint(1) NOT NULL,
  `bien` tinyint(1) NOT NULL,
  `blanco` tinyint(1) NOT NULL,
  `bonita` tinyint(1) NOT NULL,
  `bueno` tinyint(1) NOT NULL,
  `caliente` tinyint(1) NOT NULL,
  `cansado` tinyint(1) NOT NULL,
  `chaparro` tinyint(1) NOT NULL,
  `chico` tinyint(1) NOT NULL,
  `chulo` tinyint(1) NOT NULL,
  `descompuesto` tinyint(1) NOT NULL,
  `despierto` tinyint(1) NOT NULL,
  `diferente` tinyint(1) NOT NULL,
  `dificil` tinyint(1) NOT NULL,
  `dormido` tinyint(1) NOT NULL,
  `duro` tinyint(1) NOT NULL,
  `enfermo` tinyint(1) NOT NULL,
  `enojado` tinyint(1) NOT NULL,
  `feliz` tinyint(1) NOT NULL,
  `feo` tinyint(1) NOT NULL,
  `flaco` tinyint(1) NOT NULL,
  `frio` tinyint(1) NOT NULL,
  `fuchi` tinyint(1) NOT NULL,
  `fuerte` tinyint(1) NOT NULL,
  `gordo` tinyint(1) NOT NULL,
  `grande` tinyint(1) NOT NULL,
  `guapo` tinyint(1) NOT NULL,
  `hambre` tinyint(1) NOT NULL,
  `hondo` tinyint(1) NOT NULL,
  `igual` tinyint(1) NOT NULL,
  `largo` tinyint(1) NOT NULL,
  `lento` tinyint(1) NOT NULL,
  `limpio` tinyint(1) NOT NULL,
  `linda` tinyint(1) NOT NULL,
  `lleno` tinyint(1) NOT NULL,
  `malo` tinyint(1) NOT NULL,
  `mejor` tinyint(1) NOT NULL,
  `miedo_susto` tinyint(1) NOT NULL,
  `mojado` tinyint(1) NOT NULL,
  `morado` tinyint(1) NOT NULL,
  `negro` tinyint(1) NOT NULL,
  `nuevo` tinyint(1) NOT NULL,
  `oscuro` tinyint(1) NOT NULL,
  `padre` tinyint(1) NOT NULL,
  `parado` tinyint(1) NOT NULL,
  `pegajoso` tinyint(1) NOT NULL,
  `peligroso` tinyint(1) NOT NULL,
  `pesado` tinyint(1) NOT NULL,
  `platicador` tinyint(1) NOT NULL,
  `pobre` tinyint(1) NOT NULL,
  `primero` tinyint(1) NOT NULL,
  `querido` tinyint(1) NOT NULL,
  `rapido` tinyint(1) NOT NULL,
  `rojo` tinyint(1) NOT NULL,
  `rosa` tinyint(1) NOT NULL,
  `roto` tinyint(1) NOT NULL,
  `ruidoso` tinyint(1) NOT NULL,
  `seco` tinyint(1) NOT NULL,
  `solo` tinyint(1) NOT NULL,
  `suave` tinyint(1) NOT NULL,
  `sucio` tinyint(1) NOT NULL,
  `tonto` tinyint(1) NOT NULL,
  `tranquilo` tinyint(1) NOT NULL,
  `travieso` tinyint(1) NOT NULL,
  `triste` tinyint(1) NOT NULL,
  `ultimo` tinyint(1) NOT NULL,
  `vacio` tinyint(1) NOT NULL,
  `verde` tinyint(1) NOT NULL,
  `viejo` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_cualidades_atributos`),
  KEY `fk_cualidades_atributos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_cualidades_atributos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cualidades_atributos`
--

LOCK TABLES `cualidades_atributos` WRITE;
/*!40000 ALTER TABLE `cualidades_atributos` DISABLE KEYS */;
/*!40000 ALTER TABLE `cualidades_atributos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuantificadores_adverbios`
--

DROP TABLE IF EXISTS `cuantificadores_adverbios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuantificadores_adverbios` (
  `id_cuantificadores_adverbios` int NOT NULL AUTO_INCREMENT,
  `alguno_a` tinyint(1) NOT NULL,
  `asi` tinyint(1) NOT NULL,
  `bien` tinyint(1) NOT NULL,
  `despacio` tinyint(1) NOT NULL,
  `igual` tinyint(1) NOT NULL,
  `mal` tinyint(1) NOT NULL,
  `mas` tinyint(1) NOT NULL,
  `mucho` tinyint(1) NOT NULL,
  `nada` tinyint(1) NOT NULL,
  `ninguno_a` tinyint(1) NOT NULL,
  `no` tinyint(1) NOT NULL,
  `no_hay` tinyint(1) NOT NULL,
  `otro_otra_vez` tinyint(1) NOT NULL,
  `rapido` tinyint(1) NOT NULL,
  `si` tinyint(1) NOT NULL,
  `todo` tinyint(1) NOT NULL,
  `ya` tinyint(1) NOT NULL,
  `poco_poquito` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_cuantificadores_adverbios`),
  KEY `fk_cuantificadores_adverbios_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_cuantificadores_adverbios_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuantificadores_adverbios`
--

LOCK TABLES `cuantificadores_adverbios` WRITE;
/*!40000 ALTER TABLE `cuantificadores_adverbios` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuantificadores_adverbios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuerpo`
--

DROP TABLE IF EXISTS `cuerpo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuerpo` (
  `id_cuerpo` int NOT NULL AUTO_INCREMENT,
  `barba` tinyint(1) NOT NULL,
  `bigote` tinyint(1) NOT NULL,
  `boca` tinyint(1) NOT NULL,
  `brazo` tinyint(1) NOT NULL,
  `cabeza` tinyint(1) NOT NULL,
  `caca_popo` tinyint(1) NOT NULL,
  `cachete` tinyint(1) NOT NULL,
  `cara` tinyint(1) NOT NULL,
  `ceja` tinyint(1) NOT NULL,
  `chichi_pecho` tinyint(1) NOT NULL,
  `chis_pipi` tinyint(1) NOT NULL,
  `cola` tinyint(1) NOT NULL,
  `dedo` tinyint(1) NOT NULL,
  `dientes` tinyint(1) NOT NULL,
  `garganta_anginas` tinyint(1) NOT NULL,
  `hombro` tinyint(1) NOT NULL,
  `labios` tinyint(1) NOT NULL,
  `lengua` tinyint(1) NOT NULL,
  `mano` tinyint(1) NOT NULL,
  `nalgas_pompas` tinyint(1) NOT NULL,
  `nariz` tinyint(1) NOT NULL,
  `ojos` tinyint(1) NOT NULL,
  `ombligo` tinyint(1) NOT NULL,
  `oreja` tinyint(1) NOT NULL,
  `panza` tinyint(1) NOT NULL,
  `pelo` tinyint(1) NOT NULL,
  `pene` tinyint(1) NOT NULL,
  `pestanias` tinyint(1) NOT NULL,
  `piernas` tinyint(1) NOT NULL,
  `pies` tinyint(1) NOT NULL,
  `rodilla` tinyint(1) NOT NULL,
  `unia` tinyint(1) NOT NULL,
  `vagina` tinyint(1) NOT NULL,
  `cabello` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_cuerpo`),
  KEY `fk_cuerpo_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_cuerpo_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuerpo`
--

LOCK TABLES `cuerpo` WRITE;
/*!40000 ALTER TABLE `cuerpo` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuerpo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estados`
--

DROP TABLE IF EXISTS `estados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estados` (
  `id_estados` int NOT NULL AUTO_INCREMENT,
  `estar` tinyint(1) NOT NULL,
  `haber_hay` tinyint(1) NOT NULL,
  `ser` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_estados`),
  KEY `fk_estados_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_estados_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados`
--

LOCK TABLES `estados` WRITE;
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `juguetes`
--

DROP TABLE IF EXISTS `juguetes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `juguetes` (
  `id_juguetes` int NOT NULL AUTO_INCREMENT,
  `andadera` tinyint(1) NOT NULL,
  `bat` tinyint(1) NOT NULL,
  `burbujas` tinyint(1) NOT NULL,
  `colores` tinyint(1) NOT NULL,
  `crayolas` tinyint(1) NOT NULL,
  `cubo` tinyint(1) NOT NULL,
  `cuento` tinyint(1) NOT NULL,
  `globo_bomba` tinyint(1) NOT NULL,
  `hoja_papel` tinyint(1) NOT NULL,
  `juego_te` tinyint(1) NOT NULL,
  `juguete` tinyint(1) NOT NULL,
  `lapiz` tinyint(1) NOT NULL,
  `libro` tinyint(1) NOT NULL,
  `munieca_o` tinyint(1) NOT NULL,
  `osito` tinyint(1) NOT NULL,
  `patines` tinyint(1) NOT NULL,
  `pelota` tinyint(1) NOT NULL,
  `peluche` tinyint(1) NOT NULL,
  `pinturas` tinyint(1) NOT NULL,
  `piniata` tinyint(1) NOT NULL,
  `pistola` tinyint(1) NOT NULL,
  `plastilina` tinyint(1) NOT NULL,
  `pluma_plumones` tinyint(1) NOT NULL,
  `robot` tinyint(1) NOT NULL,
  `tambor` tinyint(1) NOT NULL,
  `triciclo` tinyint(1) NOT NULL,
  `trompo` tinyint(1) NOT NULL,
  `yoyo` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_juguetes`),
  KEY `fk_juguetes_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_juguetes_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juguetes`
--

LOCK TABLES `juguetes` WRITE;
/*!40000 ALTER TABLE `juguetes` DISABLE KEYS */;
/*!40000 ALTER TABLE `juguetes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locativos`
--

DROP TABLE IF EXISTS `locativos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locativos` (
  `id_locativos` int NOT NULL AUTO_INCREMENT,
  `abajo` tinyint(1) NOT NULL,
  `adentro` tinyint(1) NOT NULL,
  `afuera` tinyint(1) NOT NULL,
  `ahi` tinyint(1) NOT NULL,
  `alla` tinyint(1) NOT NULL,
  `alli` tinyint(1) NOT NULL,
  `aqui` tinyint(1) NOT NULL,
  `arriba` tinyint(1) NOT NULL,
  `atras` tinyint(1) NOT NULL,
  `cerca` tinyint(1) NOT NULL,
  `encima` tinyint(1) NOT NULL,
  `enfrente` tinyint(1) NOT NULL,
  `lejos` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_locativos`),
  KEY `fk_locativos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_locativos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locativos`
--

LOCK TABLES `locativos` WRITE;
/*!40000 ALTER TABLE `locativos` DISABLE KEYS */;
/*!40000 ALTER TABLE `locativos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lugares_fuera`
--

DROP TABLE IF EXISTS `lugares_fuera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lugares_fuera` (
  `id_lugares_fuera` int NOT NULL AUTO_INCREMENT,
  `arena` tinyint(1) NOT NULL,
  `banco` tinyint(1) NOT NULL,
  `banqueta` tinyint(1) NOT NULL,
  `bosque` tinyint(1) NOT NULL,
  `calle` tinyint(1) NOT NULL,
  `campo` tinyint(1) NOT NULL,
  `casa` tinyint(1) NOT NULL,
  `cerro` tinyint(1) NOT NULL,
  `cine` tinyint(1) NOT NULL,
  `circo` tinyint(1) NOT NULL,
  `escuela` tinyint(1) NOT NULL,
  `fabrica` tinyint(1) NOT NULL,
  `feria` tinyint(1) NOT NULL,
  `fiesta` tinyint(1) NOT NULL,
  `hospital_clinica` tinyint(1) NOT NULL,
  `iglesia_templo` tinyint(1) NOT NULL,
  `jardin` tinyint(1) NOT NULL,
  `mar` tinyint(1) NOT NULL,
  `montania` tinyint(1) NOT NULL,
  `oficina` tinyint(1) NOT NULL,
  `parque` tinyint(1) NOT NULL,
  `patio` tinyint(1) NOT NULL,
  `playa` tinyint(1) NOT NULL,
  `rancho` tinyint(1) NOT NULL,
  `rio` tinyint(1) NOT NULL,
  `teatro` tinyint(1) NOT NULL,
  `tienda_mercado` tinyint(1) NOT NULL,
  `zoologico` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_lugares_fuera`),
  KEY `fk_lugares_fuera_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_lugares_fuera_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lugares_fuera`
--

LOCK TABLES `lugares_fuera` WRITE;
/*!40000 ALTER TABLE `lugares_fuera` DISABLE KEYS */;
/*!40000 ALTER TABLE `lugares_fuera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `muebles_cuartos`
--

DROP TABLE IF EXISTS `muebles_cuartos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `muebles_cuartos` (
  `id_muebles_cuartos` int NOT NULL AUTO_INCREMENT,
  `alacena` tinyint(1) NOT NULL,
  `bacinica` tinyint(1) NOT NULL,
  `banco` tinyint(1) NOT NULL,
  `banio` tinyint(1) NOT NULL,
  `cajon` tinyint(1) NOT NULL,
  `cama` tinyint(1) NOT NULL,
  `champu` tinyint(1) NOT NULL,
  `cochera_garage` tinyint(1) NOT NULL,
  `cocina` tinyint(1) NOT NULL,
  `comedor` tinyint(1) NOT NULL,
  `computadora` tinyint(1) NOT NULL,
  `cuarto` tinyint(1) NOT NULL,
  `cuna` tinyint(1) NOT NULL,
  `escaleras` tinyint(1) NOT NULL,
  `escritorio` tinyint(1) NOT NULL,
  `estufa` tinyint(1) NOT NULL,
  `horno` tinyint(1) NOT NULL,
  `lavabo` tinyint(1) NOT NULL,
  `lavadora` tinyint(1) NOT NULL,
  `librero` tinyint(1) NOT NULL,
  `mesa` tinyint(1) NOT NULL,
  `mueble` tinyint(1) NOT NULL,
  `patio` tinyint(1) NOT NULL,
  `puerta` tinyint(1) NOT NULL,
  `recamara` tinyint(1) NOT NULL,
  `refrigerador` tinyint(1) NOT NULL,
  `regadera_ducha` tinyint(1) NOT NULL,
  `ropero_closet` tinyint(1) NOT NULL,
  `sala` tinyint(1) NOT NULL,
  `secadora` tinyint(1) NOT NULL,
  `silla` tinyint(1) NOT NULL,
  `sillon` tinyint(1) NOT NULL,
  `sofa` tinyint(1) NOT NULL,
  `television` tinyint(1) NOT NULL,
  `tina` tinyint(1) NOT NULL,
  `ventana` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_muebles_cuartos`),
  KEY `fk_muebles_cuartos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_muebles_cuartos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `muebles_cuartos`
--

LOCK TABLES `muebles_cuartos` WRITE;
/*!40000 ALTER TABLE `muebles_cuartos` DISABLE KEYS */;
/*!40000 ALTER TABLE `muebles_cuartos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `objetos_fuera`
--

DROP TABLE IF EXISTS `objetos_fuera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `objetos_fuera` (
  `id_objetos_fuera` int NOT NULL AUTO_INCREMENT,
  `alberca_piscina` tinyint(1) NOT NULL,
  `arbol` tinyint(1) NOT NULL,
  `bandera` tinyint(1) NOT NULL,
  `cielo` tinyint(1) NOT NULL,
  `coladera` tinyint(1) NOT NULL,
  `columpio` tinyint(1) NOT NULL,
  `estrella` tinyint(1) NOT NULL,
  `flor` tinyint(1) NOT NULL,
  `fuego` tinyint(1) NOT NULL,
  `hojas` tinyint(1) NOT NULL,
  `lenia` tinyint(1) NOT NULL,
  `lluvia` tinyint(1) NOT NULL,
  `luna` tinyint(1) NOT NULL,
  `maceta` tinyint(1) NOT NULL,
  `manguera` tinyint(1) NOT NULL,
  `munieco_nieve` tinyint(1) NOT NULL,
  `nieve` tinyint(1) NOT NULL,
  `nube` tinyint(1) NOT NULL,
  `pala` tinyint(1) NOT NULL,
  `palo` tinyint(1) NOT NULL,
  `pasto` tinyint(1) NOT NULL,
  `piedra` tinyint(1) NOT NULL,
  `planta` tinyint(1) NOT NULL,
  `reja` tinyint(1) NOT NULL,
  `resbaladilla` tinyint(1) NOT NULL,
  `sol` tinyint(1) NOT NULL,
  `tanque` tinyint(1) NOT NULL,
  `techo` tinyint(1) NOT NULL,
  `tierra` tinyint(1) NOT NULL,
  `timbre` tinyint(1) NOT NULL,
  `viento_aire` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_objetos_fuera`),
  KEY `fk_objetos_fuera_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_objetos_fuera_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `objetos_fuera`
--

LOCK TABLES `objetos_fuera` WRITE;
/*!40000 ALTER TABLE `objetos_fuera` DISABLE KEYS */;
/*!40000 ALTER TABLE `objetos_fuera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oraciones_gramatica`
--

DROP TABLE IF EXISTS `oraciones_gramatica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `oraciones_gramatica` (
  `id_oraciones_gramatica` int NOT NULL AUTO_INCREMENT,
  `acabo` tinyint(1) NOT NULL,
  `acabas` tinyint(1) NOT NULL,
  `acaba` tinyint(1) NOT NULL,
  `acabamos` tinyint(1) NOT NULL,
  `como` tinyint(1) NOT NULL,
  `comes` tinyint(1) NOT NULL,
  `come` tinyint(1) NOT NULL,
  `comemos` tinyint(1) NOT NULL,
  `subo` tinyint(1) NOT NULL,
  `subes` tinyint(1) NOT NULL,
  `sube` tinyint(1) NOT NULL,
  `subimos` tinyint(1) NOT NULL,
  `acabe` tinyint(1) NOT NULL,
  `acabo2` tinyint(1) NOT NULL,
  `comi` tinyint(1) NOT NULL,
  `comio` tinyint(1) NOT NULL,
  `subi` tinyint(1) NOT NULL,
  `subio` tinyint(1) NOT NULL,
  `acaba2` tinyint(1) NOT NULL,
  `acabate` tinyint(1) NOT NULL,
  `come2` tinyint(1) NOT NULL,
  `comete` tinyint(1) NOT NULL,
  `sube2` tinyint(1) NOT NULL,
  `subete` tinyint(1) NOT NULL,
  `total` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_oraciones_gramatica`),
  KEY `fk_oraciones_gramatica_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_oraciones_gramatica_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oraciones_gramatica`
--

LOCK TABLES `oraciones_gramatica` WRITE;
/*!40000 ALTER TABLE `oraciones_gramatica` DISABLE KEYS */;
/*!40000 ALTER TABLE `oraciones_gramatica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `p3l_palabras`
--

DROP TABLE IF EXISTS `p3l_palabras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `p3l_palabras` (
  `id_p3l_palabras` int NOT NULL AUTO_INCREMENT,
  `combina_palabras` tinyint(1) NOT NULL,
  `frase1` varchar(100) DEFAULT NULL,
  `frase2` varchar(100) DEFAULT NULL,
  `frase3` varchar(100) DEFAULT NULL,
  `total` int DEFAULT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_p3l_palabras`),
  KEY `fk_p3l_palabras_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_p3l_palabras_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `p3l_palabras`
--

LOCK TABLES `p3l_palabras` WRITE;
/*!40000 ALTER TABLE `p3l_palabras` DISABLE KEYS */;
/*!40000 ALTER TABLE `p3l_palabras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `percentiles`
--

DROP TABLE IF EXISTS `percentiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `percentiles` (
  `id_percentiles` int NOT NULL AUTO_INCREMENT,
  `percentil_complejidad_frases` int NOT NULL,
  `percentil_p3l_palabras` int NOT NULL,
  `percentil_produccion_palabras` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_percentiles`),
  KEY `fk_percentiles_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_percentiles_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `percentiles`
--

LOCK TABLES `percentiles` WRITE;
/*!40000 ALTER TABLE `percentiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `percentiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `id_personas` int NOT NULL AUTO_INCREMENT,
  `abuela` tinyint(1) NOT NULL,
  `abuelo` tinyint(1) NOT NULL,
  `amiga` tinyint(1) NOT NULL,
  `amigo` tinyint(1) NOT NULL,
  `bebe` tinyint(1) NOT NULL,
  `cura` tinyint(1) NOT NULL,
  `doctor` tinyint(1) NOT NULL,
  `enfermera` tinyint(1) NOT NULL,
  `familia` tinyint(1) NOT NULL,
  `fantasma` tinyint(1) NOT NULL,
  `hermana` tinyint(1) NOT NULL,
  `hermano` tinyint(1) NOT NULL,
  `hijo_a` tinyint(1) NOT NULL,
  `madrina` tinyint(1) NOT NULL,
  `maestra` tinyint(1) NOT NULL,
  `mama` tinyint(1) NOT NULL,
  `monstruo` tinyint(1) NOT NULL,
  `nana` tinyint(1) NOT NULL,
  `nene_a` tinyint(1) NOT NULL,
  `ninia` tinyint(1) NOT NULL,
  `ninio` tinyint(1) NOT NULL,
  `nombre_ninio` tinyint(1) NOT NULL,
  `padrino` tinyint(1) NOT NULL,
  `papa` tinyint(1) NOT NULL,
  `payaso` tinyint(1) DEFAULT NULL,
  `persona` tinyint(1) DEFAULT NULL,
  `policia` tinyint(1) NOT NULL,
  `prima` tinyint(1) NOT NULL,
  `primo` tinyint(1) NOT NULL,
  `reyes_magos` tinyint(1) NOT NULL,
  `santa_claus` tinyint(1) NOT NULL,
  `senior` tinyint(1) NOT NULL,
  `seniora` tinyint(1) NOT NULL,
  `seniorita` tinyint(1) NOT NULL,
  `tia` tinyint(1) NOT NULL,
  `tio` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_personas`),
  KEY `fk_personas_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_personas_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preguntas` (
  `id_preguntas` int NOT NULL AUTO_INCREMENT,
  `como` tinyint(1) NOT NULL,
  `cual` tinyint(1) NOT NULL,
  `cuando` tinyint(1) NOT NULL,
  `donde` tinyint(1) NOT NULL,
  `por_que` tinyint(1) NOT NULL,
  `que` tinyint(1) NOT NULL,
  `quien` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_preguntas`),
  KEY `fk_preguntas_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_preguntas_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntas`
--

LOCK TABLES `preguntas` WRITE;
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preposiciones_articulos`
--

DROP TABLE IF EXISTS `preposiciones_articulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preposiciones_articulos` (
  `id_preposiciones_articulos` int NOT NULL AUTO_INCREMENT,
  `a` tinyint(1) NOT NULL,
  `bajo` tinyint(1) NOT NULL,
  `cabe` tinyint(1) NOT NULL,
  `con` tinyint(1) NOT NULL,
  `de` tinyint(1) NOT NULL,
  `desde` tinyint(1) NOT NULL,
  `el` tinyint(1) NOT NULL,
  `en` tinyint(1) NOT NULL,
  `entre` tinyint(1) NOT NULL,
  `hacia` tinyint(1) NOT NULL,
  `hasta` tinyint(1) NOT NULL,
  `la` tinyint(1) NOT NULL,
  `las` tinyint(1) NOT NULL,
  `los` tinyint(1) NOT NULL,
  `para` tinyint(1) NOT NULL,
  `pero` tinyint(1) NOT NULL,
  `por` tinyint(1) NOT NULL,
  `sin` tinyint(1) NOT NULL,
  `sobre` tinyint(1) NOT NULL,
  `tras` tinyint(1) NOT NULL,
  `un` tinyint(1) NOT NULL,
  `una` tinyint(1) NOT NULL,
  `unas` tinyint(1) NOT NULL,
  `unos` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_preposiciones_articulos`),
  KEY `fk_preposiciones_articulos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_preposiciones_articulos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preposiciones_articulos`
--

LOCK TABLES `preposiciones_articulos` WRITE;
/*!40000 ALTER TABLE `preposiciones_articulos` DISABLE KEYS */;
/*!40000 ALTER TABLE `preposiciones_articulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pronombres_modificadores`
--

DROP TABLE IF EXISTS `pronombres_modificadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pronombres_modificadores` (
  `id_pronombres_modificadores` int NOT NULL AUTO_INCREMENT,
  `aquel` tinyint(1) NOT NULL,
  `aquella` tinyint(1) NOT NULL,
  `aquellas` tinyint(1) NOT NULL,
  `aquellos` tinyint(1) NOT NULL,
  `conmigo` tinyint(1) NOT NULL,
  `el` tinyint(1) NOT NULL,
  `ella` tinyint(1) NOT NULL,
  `ellas` tinyint(1) NOT NULL,
  `ellos` tinyint(1) NOT NULL,
  `esa` tinyint(1) NOT NULL,
  `esas` tinyint(1) NOT NULL,
  `ese` tinyint(1) NOT NULL,
  `eso` tinyint(1) NOT NULL,
  `esos` tinyint(1) NOT NULL,
  `esta` tinyint(1) NOT NULL,
  `estas` tinyint(1) NOT NULL,
  `este` tinyint(1) NOT NULL,
  `esto` tinyint(1) NOT NULL,
  `estos` tinyint(1) NOT NULL,
  `le` tinyint(1) NOT NULL,
  `les` tinyint(1) NOT NULL,
  `lo` tinyint(1) NOT NULL,
  `me` tinyint(1) NOT NULL,
  `mi` tinyint(1) NOT NULL,
  `mia` tinyint(1) NOT NULL,
  `mias` tinyint(1) NOT NULL,
  `mio` tinyint(1) NOT NULL,
  `mios` tinyint(1) NOT NULL,
  `nadie` tinyint(1) NOT NULL,
  `nosotros` tinyint(1) NOT NULL,
  `nuestros` tinyint(1) NOT NULL,
  `quien` tinyint(1) NOT NULL,
  `se` tinyint(1) NOT NULL,
  `su` tinyint(1) NOT NULL,
  `suya` tinyint(1) NOT NULL,
  `suyas` tinyint(1) NOT NULL,
  `suyo` tinyint(1) NOT NULL,
  `suyos` tinyint(1) NOT NULL,
  `te` tinyint(1) NOT NULL,
  `ti` tinyint(1) NOT NULL,
  `tu` tinyint(1) NOT NULL,
  `tuya` tinyint(1) NOT NULL,
  `tuyas` tinyint(1) NOT NULL,
  `tuyo` tinyint(1) NOT NULL,
  `tuyos` tinyint(1) NOT NULL,
  `ustedes` tinyint(1) NOT NULL,
  `yo` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_pronombres_modificadores`),
  KEY `fk_pronombres_modificadores_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_pronombres_modificadores_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pronombres_modificadores`
--

LOCK TABLES `pronombres_modificadores` WRITE;
/*!40000 ALTER TABLE `pronombres_modificadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `pronombres_modificadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resultados`
--

DROP TABLE IF EXISTS `resultados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resultados` (
  `id_resultados` int NOT NULL AUTO_INCREMENT,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `total_oraciones` int NOT NULL,
  `total_p3l` int DEFAULT NULL,
  `total_complejidad` int DEFAULT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_resultados`),
  KEY `fk_resultados_citas1` (`citas_id_cita`),
  CONSTRAINT `fk_resultados_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultados`
--

LOCK TABLES `resultados` WRITE;
/*!40000 ALTER TABLE `resultados` DISABLE KEYS */;
/*!40000 ALTER TABLE `resultados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ropa`
--

DROP TABLE IF EXISTS `ropa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ropa` (
  `id_ropa` int NOT NULL AUTO_INCREMENT,
  `abrigo` tinyint(1) NOT NULL,
  `aretes` tinyint(1) NOT NULL,
  `babero` tinyint(1) NOT NULL,
  `bolsa` tinyint(1) NOT NULL,
  `botas` tinyint(1) NOT NULL,
  `boton` tinyint(1) NOT NULL,
  `bufanda` tinyint(1) NOT NULL,
  `calceta_calcetin` tinyint(1) NOT NULL,
  `calzon` tinyint(1) NOT NULL,
  `camisa` tinyint(1) NOT NULL,
  `camiseta` tinyint(1) NOT NULL,
  `chaleco` tinyint(1) NOT NULL,
  `chamarra` tinyint(1) NOT NULL,
  `chancla_sandalia` tinyint(1) NOT NULL,
  `cierre` tinyint(1) NOT NULL,
  `collar` tinyint(1) NOT NULL,
  `falda` tinyint(1) NOT NULL,
  `gorra` tinyint(1) NOT NULL,
  `guantes` tinyint(1) NOT NULL,
  `lentes` tinyint(1) NOT NULL,
  `medias` tinyint(1) NOT NULL,
  `pantalon` tinyint(1) NOT NULL,
  `panial` tinyint(1) NOT NULL,
  `pijama` tinyint(1) NOT NULL,
  `playera` tinyint(1) NOT NULL,
  `ropa` tinyint(1) NOT NULL,
  `shorts` tinyint(1) NOT NULL,
  `sombrero` tinyint(1) NOT NULL,
  `sudadera` tinyint(1) NOT NULL,
  `sueter` tinyint(1) NOT NULL,
  `tenis` tinyint(1) NOT NULL,
  `vestido` tinyint(1) NOT NULL,
  `zapato` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_ropa`),
  KEY `fk_ropa_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_ropa_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ropa`
--

LOCK TABLES `ropa` WRITE;
/*!40000 ALTER TABLE `ropa` DISABLE KEYS */;
/*!40000 ALTER TABLE `ropa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rutina_reglas_juegos`
--

DROP TABLE IF EXISTS `rutina_reglas_juegos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rutina_reglas_juegos` (
  `id_rutina_reglas_juegos` int NOT NULL AUTO_INCREMENT,
  `shhh` tinyint(1) NOT NULL,
  `como_estas` tinyint(1) NOT NULL,
  `donde_esta` tinyint(1) NOT NULL,
  `a_comer` tinyint(1) NOT NULL,
  `a_dormir` tinyint(1) NOT NULL,
  `a_ver` tinyint(1) NOT NULL,
  `acerrin` tinyint(1) NOT NULL,
  `adios_bye` tinyint(1) NOT NULL,
  `ahi_te_voy` tinyint(1) NOT NULL,
  `ojitos` tinyint(1) NOT NULL,
  `al_agua_patos` tinyint(1) NOT NULL,
  `besitos` tinyint(1) NOT NULL,
  `bravo` tinyint(1) NOT NULL,
  `buenas_noches` tinyint(1) NOT NULL,
  `buenos_dias` tinyint(1) NOT NULL,
  `cosquillas` tinyint(1) NOT NULL,
  `espera` tinyint(1) NOT NULL,
  `gol` tinyint(1) NOT NULL,
  `gracias` tinyint(1) NOT NULL,
  `hola` tinyint(1) NOT NULL,
  `manos_arriba` tinyint(1) NOT NULL,
  `okay` tinyint(1) NOT NULL,
  `pon_pon_tata` tinyint(1) NOT NULL,
  `por_favor` tinyint(1) NOT NULL,
  `salud` tinyint(1) NOT NULL,
  `siesta` tinyint(1) NOT NULL,
  `te_voy_a_pegar` tinyint(1) NOT NULL,
  `tengo_manita` tinyint(1) NOT NULL,
  `tortillitas` tinyint(1) NOT NULL,
  `uno_dos_tres` tinyint(1) NOT NULL,
  `vamonos` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_rutina_reglas_juegos`),
  KEY `fk_rutina_reglas_juegos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_rutina_reglas_juegos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rutina_reglas_juegos`
--

LOCK TABLES `rutina_reglas_juegos` WRITE;
/*!40000 ALTER TABLE `rutina_reglas_juegos` DISABLE KEYS */;
/*!40000 ALTER TABLE `rutina_reglas_juegos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sonidos`
--

DROP TABLE IF EXISTS `sonidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sonidos` (
  `id_sonidos` int NOT NULL AUTO_INCREMENT,
  `am` tinyint(1) NOT NULL,
  `auch` tinyint(1) NOT NULL,
  `ay` tinyint(1) NOT NULL,
  `bee_me` tinyint(1) NOT NULL,
  `chuu_chuu` tinyint(1) NOT NULL,
  `cua_cua` tinyint(1) NOT NULL,
  `gordogordo` tinyint(1) NOT NULL,
  `grrr` tinyint(1) NOT NULL,
  `gua_gua` tinyint(1) NOT NULL,
  `miau` tinyint(1) NOT NULL,
  `mmmmm` tinyint(1) NOT NULL,
  `muu` tinyint(1) NOT NULL,
  `oinc_oinc` tinyint(1) NOT NULL,
  `pazz` tinyint(1) NOT NULL,
  `pio_pio` tinyint(1) NOT NULL,
  `pi_pi` tinyint(1) NOT NULL,
  `pum` tinyint(1) NOT NULL,
  `qui_qui_ri_qui` tinyint(1) NOT NULL,
  `tic_tac` tinyint(1) NOT NULL,
  `tu_tu` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_sonidos`),
  KEY `fk_sonidos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_sonidos_citas1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sonidos`
--

LOCK TABLES `sonidos` WRITE;
/*!40000 ALTER TABLE `sonidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `sonidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiempo`
--

DROP TABLE IF EXISTS `tiempo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiempo` (
  `id_tiempo` int NOT NULL AUTO_INCREMENT,
  `ahorita_ahora` tinyint(1) NOT NULL,
  `al_rato` tinyint(1) NOT NULL,
  `antes` tinyint(1) NOT NULL,
  `ayer` tinyint(1) NOT NULL,
  `cuando` tinyint(1) NOT NULL,
  `despues` tinyint(1) NOT NULL,
  `dia` tinyint(1) NOT NULL,
  `en_la_maniana` tinyint(1) NOT NULL,
  `en_la_noche` tinyint(1) NOT NULL,
  `en_la_tarde` tinyint(1) NOT NULL,
  `hoy` tinyint(1) NOT NULL,
  `maniana` tinyint(1) NOT NULL,
  `noche` tinyint(1) NOT NULL,
  `nunca` tinyint(1) NOT NULL,
  `todavia` tinyint(1) NOT NULL,
  `siempre` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_tiempo`),
  KEY `fk_tiempo_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_tiempo_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiempo`
--

LOCK TABLES `tiempo` WRITE;
/*!40000 ALTER TABLE `tiempo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiempo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utensilios`
--

DROP TABLE IF EXISTS `utensilios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utensilios` (
  `id_utensilios` int NOT NULL AUTO_INCREMENT,
  `almohada` tinyint(1) NOT NULL,
  `aspiradora` tinyint(1) NOT NULL,
  `basura` tinyint(1) NOT NULL,
  `bolsa` tinyint(1) NOT NULL,
  `bote` tinyint(1) NOT NULL,
  `botella_mamila` tinyint(1) NOT NULL,
  `caja` tinyint(1) NOT NULL,
  `camara` tinyint(1) NOT NULL,
  `canasta` tinyint(1) NOT NULL,
  `casete` tinyint(1) NOT NULL,
  `cepillo` tinyint(1) NOT NULL,
  `cepillo_dientes` tinyint(1) NOT NULL,
  `cerillos` tinyint(1) NOT NULL,
  `chupon_chupete` tinyint(1) NOT NULL,
  `cigarros` tinyint(1) NOT NULL,
  `clavo` tinyint(1) NOT NULL,
  `cobija` tinyint(1) NOT NULL,
  `cortina` tinyint(1) NOT NULL,
  `cuadro` tinyint(1) NOT NULL,
  `cubeta` tinyint(1) NOT NULL,
  `cuchara` tinyint(1) NOT NULL,
  `cuchillo` tinyint(1) NOT NULL,
  `dinero` tinyint(1) NOT NULL,
  `escoba` tinyint(1) NOT NULL,
  `espejo` tinyint(1) NOT NULL,
  `foco` tinyint(1) NOT NULL,
  `fotos` tinyint(1) NOT NULL,
  `jabon` tinyint(1) NOT NULL,
  `jaula` tinyint(1) NOT NULL,
  `lampara` tinyint(1) NOT NULL,
  `llave` tinyint(1) NOT NULL,
  `luz` tinyint(1) NOT NULL,
  `martillo` tinyint(1) NOT NULL,
  `medicina` tinyint(1) NOT NULL,
  `mochila` tinyint(1) NOT NULL,
  `olla` tinyint(1) NOT NULL,
  `paniuelo` tinyint(1) NOT NULL,
  `papel` tinyint(1) NOT NULL,
  `peine` tinyint(1) NOT NULL,
  `pasta_dientes` tinyint(1) NOT NULL,
  `pelicula` tinyint(1) NOT NULL,
  `periodico` tinyint(1) NOT NULL,
  `plancha` tinyint(1) NOT NULL,
  `plato` tinyint(1) NOT NULL,
  `radio` tinyint(1) NOT NULL,
  `reloj` tinyint(1) NOT NULL,
  `servilleta` tinyint(1) NOT NULL,
  `tapete` tinyint(1) NOT NULL,
  `taza` tinyint(1) NOT NULL,
  `telefono` tinyint(1) NOT NULL,
  `tenedor` tinyint(1) NOT NULL,
  `tijeras` tinyint(1) NOT NULL,
  `toalla` tinyint(1) NOT NULL,
  `trapo` tinyint(1) NOT NULL,
  `vaso` tinyint(1) NOT NULL,
  `vela` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_utensilios`),
  KEY `fk_utensilios_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_utensilios_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utensilios`
--

LOCK TABLES `utensilios` WRITE;
/*!40000 ALTER TABLE `utensilios` DISABLE KEYS */;
/*!40000 ALTER TABLE `utensilios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `id_vehiculos` int NOT NULL AUTO_INCREMENT,
  `autobus` tinyint(1) NOT NULL,
  `avion` tinyint(1) NOT NULL,
  `barco` tinyint(1) NOT NULL,
  `bicicleta` tinyint(1) NOT NULL,
  `camion_bomberos` tinyint(1) NOT NULL,
  `camion` tinyint(1) NOT NULL,
  `camioneta` tinyint(1) NOT NULL,
  `carreola` tinyint(1) NOT NULL,
  `carro_coche` tinyint(1) NOT NULL,
  `helicoptero` tinyint(1) NOT NULL,
  `lancha` tinyint(1) NOT NULL,
  `metro` tinyint(1) NOT NULL,
  `moto` tinyint(1) NOT NULL,
  `nave` tinyint(1) NOT NULL,
  `pesero` tinyint(1) NOT NULL,
  `taxi` tinyint(1) NOT NULL,
  `tractor` tinyint(1) NOT NULL,
  `trailer` tinyint(1) NOT NULL,
  `tren` tinyint(1) NOT NULL,
  `triciclo` tinyint(1) NOT NULL,
  `trineo` tinyint(1) NOT NULL,
  `total_c_icplim` int NOT NULL,
  `total_cyd_icplim` int NOT NULL,
  `total_icplim` int NOT NULL,
  `total_cyd_cdi` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_vehiculos`),
  KEY `fk_vehiculos_citas1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_vehiculos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cdi182430'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-19  1:31:17
CREATE DATABASE  IF NOT EXISTS `cdi12` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cdi12`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: cdi12
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
-- Table structure for table `acciones_procesos`
--

DROP TABLE IF EXISTS `acciones_procesos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acciones_procesos` (
  `id_acciones_procesos` int NOT NULL AUTO_INCREMENT,
  `abrir` tinyint(1) NOT NULL,
  `acabar_se` tinyint(1) NOT NULL,
  `apagar` tinyint(1) NOT NULL,
  `apurar_se` tinyint(1) NOT NULL,
  `aventar` tinyint(1) NOT NULL,
  `ayudar` tinyint(1) NOT NULL,
  `bailar` tinyint(1) NOT NULL,
  `brincar` tinyint(1) NOT NULL,
  `caer_se` tinyint(1) NOT NULL,
  `caminar` tinyint(1) NOT NULL,
  `cantar` tinyint(1) NOT NULL,
  `cenar` tinyint(1) NOT NULL,
  `cerrar` tinyint(1) NOT NULL,
  `comer_se` tinyint(1) NOT NULL,
  `correr` tinyint(1) NOT NULL,
  `dar` tinyint(1) NOT NULL,
  `decir` tinyint(1) NOT NULL,
  `desayunar` tinyint(1) NOT NULL,
  `dibujar` tinyint(1) NOT NULL,
  `doler` tinyint(1) NOT NULL,
  `dormir_se` tinyint(1) NOT NULL,
  `empujar` tinyint(1) NOT NULL,
  `enseniar` tinyint(1) NOT NULL,
  `escribir` tinyint(1) NOT NULL,
  `esperar_se` tinyint(1) NOT NULL,
  `ir_se` tinyint(1) NOT NULL,
  `jugar` tinyint(1) NOT NULL,
  `lavar_se` tinyint(1) NOT NULL,
  `leer` tinyint(1) NOT NULL,
  `llevar_se` tinyint(1) NOT NULL,
  `llorar` tinyint(1) NOT NULL,
  `meter_se` tinyint(1) NOT NULL,
  `mirar` tinyint(1) NOT NULL,
  `mojar_se` tinyint(1) NOT NULL,
  `morder` tinyint(1) NOT NULL,
  `parar_se` tinyint(1) NOT NULL,
  `pegar_se` tinyint(1) NOT NULL,
  `peinar_se` tinyint(1) NOT NULL,
  `pintar` tinyint(1) NOT NULL,
  `poder` tinyint(1) NOT NULL,
  `poner_se` tinyint(1) NOT NULL,
  `prender` tinyint(1) NOT NULL,
  `querer` tinyint(1) NOT NULL,
  `romper` tinyint(1) NOT NULL,
  `sacar` tinyint(1) NOT NULL,
  `secar_se` tinyint(1) NOT NULL,
  `sentar_se` tinyint(1) NOT NULL,
  `soplar` tinyint(1) NOT NULL,
  `subir` tinyint(1) NOT NULL,
  `tener` tinyint(1) NOT NULL,
  `tirar` tinyint(1) NOT NULL,
  `tocar` tinyint(1) NOT NULL,
  `tomar_se` tinyint(1) NOT NULL,
  `trabajar` tinyint(1) NOT NULL,
  `ver` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_acciones_procesos`),
  KEY `fk_acciones_procesos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_acciones_procesos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acciones_procesos`
--

LOCK TABLES `acciones_procesos` WRITE;
/*!40000 ALTER TABLE `acciones_procesos` DISABLE KEYS */;
/*!40000 ALTER TABLE `acciones_procesos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `alimentos_bebidas`
--

DROP TABLE IF EXISTS `alimentos_bebidas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alimentos_bebidas` (
  `id_alimentos_bebidas` int NOT NULL AUTO_INCREMENT,
  `agua` tinyint(1) NOT NULL,
  `arroz` tinyint(1) NOT NULL,
  `atole` tinyint(1) NOT NULL,
  `cafe` tinyint(1) NOT NULL,
  `carne` tinyint(1) NOT NULL,
  `cereal` tinyint(1) NOT NULL,
  `comida` tinyint(1) NOT NULL,
  `chile` tinyint(1) NOT NULL,
  `dulce` tinyint(1) NOT NULL,
  `frijoles` tinyint(1) NOT NULL,
  `galleta` tinyint(1) NOT NULL,
  `helado_nieve` tinyint(1) NOT NULL,
  `huevo` tinyint(1) NOT NULL,
  `jamon` tinyint(1) NOT NULL,
  `jugo` tinyint(1) NOT NULL,
  `leche` tinyint(1) NOT NULL,
  `manzana` tinyint(1) NOT NULL,
  `naranja` tinyint(1) NOT NULL,
  `pan` tinyint(1) NOT NULL,
  `paleta` tinyint(1) NOT NULL,
  `pastel` tinyint(1) NOT NULL,
  `platano_banana` tinyint(1) NOT NULL,
  `pollo` tinyint(1) NOT NULL,
  `quesadilla` tinyint(1) NOT NULL,
  `queso` tinyint(1) NOT NULL,
  `salchicha` tinyint(1) NOT NULL,
  `soda_refresco` tinyint(1) NOT NULL,
  `sopa` tinyint(1) NOT NULL,
  `tortilla` tinyint(1) NOT NULL,
  `uvas` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_alimentos_bebidas`),
  KEY `fk_alimentos_bebidas_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_alimentos_bebidas_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alimentos_bebidas`
--

LOCK TABLES `alimentos_bebidas` WRITE;
/*!40000 ALTER TABLE `alimentos_bebidas` DISABLE KEYS */;
/*!40000 ALTER TABLE `alimentos_bebidas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `animales`
--

DROP TABLE IF EXISTS `animales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `animales` (
  `id_animales` int NOT NULL AUTO_INCREMENT,
  `abeja` tinyint(1) NOT NULL,
  `animal` tinyint(1) NOT NULL,
  `arania` tinyint(1) NOT NULL,
  `ardilla` tinyint(1) NOT NULL,
  `borrego` tinyint(1) NOT NULL,
  `buho` tinyint(1) NOT NULL,
  `burro` tinyint(1) NOT NULL,
  `caballo` tinyint(1) NOT NULL,
  `cabra` tinyint(1) NOT NULL,
  `conejo` tinyint(1) NOT NULL,
  `elefante` tinyint(1) NOT NULL,
  `gallina` tinyint(1) NOT NULL,
  `gato` tinyint(1) NOT NULL,
  `guajolote` tinyint(1) NOT NULL,
  `hipopotamo` tinyint(1) NOT NULL,
  `hormiga` tinyint(1) NOT NULL,
  `jirafa` tinyint(1) NOT NULL,
  `leon` tinyint(1) NOT NULL,
  `lobo` tinyint(1) NOT NULL,
  `mariposa` tinyint(1) NOT NULL,
  `mono` tinyint(1) NOT NULL,
  `mosca` tinyint(1) NOT NULL,
  `oso` tinyint(1) NOT NULL,
  `pajaro` tinyint(1) NOT NULL,
  `pato` tinyint(1) NOT NULL,
  `perro` tinyint(1) NOT NULL,
  `pescado` tinyint(1) NOT NULL,
  `pinguino` tinyint(1) NOT NULL,
  `pollito` tinyint(1) NOT NULL,
  `puerco` tinyint(1) NOT NULL,
  `rana` tinyint(1) NOT NULL,
  `raton` tinyint(1) NOT NULL,
  `tigre` tinyint(1) NOT NULL,
  `tortuga` tinyint(1) NOT NULL,
  `vaca` tinyint(1) NOT NULL,
  `venado` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_animales`),
  KEY `fk_animales_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_animales_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animales`
--

LOCK TABLES `animales` WRITE;
/*!40000 ALTER TABLE `animales` DISABLE KEYS */;
/*!40000 ALTER TABLE `animales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `articulos`
--

DROP TABLE IF EXISTS `articulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articulos` (
  `id_articulos` int NOT NULL AUTO_INCREMENT,
  `el` tinyint(1) NOT NULL,
  `la` tinyint(1) NOT NULL,
  `las` tinyint(1) NOT NULL,
  `los` tinyint(1) NOT NULL,
  `un` tinyint(1) NOT NULL,
  `una` tinyint(1) NOT NULL,
  `unas` tinyint(1) NOT NULL,
  `unos` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_articulos`),
  KEY `fk_articulos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_articulos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulos`
--

LOCK TABLES `articulos` WRITE;
/*!40000 ALTER TABLE `articulos` DISABLE KEYS */;
/*!40000 ALTER TABLE `articulos` ENABLE KEYS */;
UNLOCK TABLES;

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
  `sexo` tinyint(1) NOT NULL,
  `fechaNacimientoBb` date NOT NULL,
  `fkUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idBebe`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebe`
--

LOCK TABLES `bebe` WRITE;
/*!40000 ALTER TABLE `bebe` DISABLE KEYS */;
/*!40000 ALTER TABLE `bebe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cita`
--

DROP TABLE IF EXISTS `cita`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cita` (
  `id_cita` int NOT NULL AUTO_INCREMENT,
  `fecha_cita` date NOT NULL,
  `edad_cita` decimal(5,2) NOT NULL,
  `bebes_id_bebe` int NOT NULL,
  PRIMARY KEY (`id_cita`),
  KEY `fk_cita_bebe_idx` (`bebes_id_bebe`),
  CONSTRAINT `fk_cita_bebe` FOREIGN KEY (`bebes_id_bebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cita`
--

LOCK TABLES `cita` WRITE;
/*!40000 ALTER TABLE `cita` DISABLE KEYS */;
/*!40000 ALTER TABLE `cita` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cualidades_atributos`
--

DROP TABLE IF EXISTS `cualidades_atributos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cualidades_atributos` (
  `id_cualidades_atributos` int NOT NULL AUTO_INCREMENT,
  `amarillo` tinyint(1) NOT NULL,
  `azul` tinyint(1) NOT NULL,
  `bonita` tinyint(1) NOT NULL,
  `caliente` tinyint(1) NOT NULL,
  `cansado` tinyint(1) NOT NULL,
  `contento` tinyint(1) NOT NULL,
  `cuidado` tinyint(1) NOT NULL,
  `chico` tinyint(1) NOT NULL,
  `diferente` tinyint(1) NOT NULL,
  `dificil` tinyint(1) NOT NULL,
  `enfermo` tinyint(1) NOT NULL,
  `enojado` tinyint(1) NOT NULL,
  `feo` tinyint(1) NOT NULL,
  `frio` tinyint(1) NOT NULL,
  `fuchi` tinyint(1) NOT NULL,
  `grande` tinyint(1) NOT NULL,
  `guapo` tinyint(1) NOT NULL,
  `hambre` tinyint(1) NOT NULL,
  `igual` tinyint(1) NOT NULL,
  `limpio` tinyint(1) NOT NULL,
  `lleno` tinyint(1) NOT NULL,
  `malo` tinyint(1) NOT NULL,
  `miedo` tinyint(1) NOT NULL,
  `nuevo` tinyint(1) NOT NULL,
  `oscuro` tinyint(1) NOT NULL,
  `pesado` tinyint(1) NOT NULL,
  `poco` tinyint(1) NOT NULL,
  `rojo` tinyint(1) NOT NULL,
  `roto` tinyint(1) NOT NULL,
  `sed` tinyint(1) NOT NULL,
  `suave` tinyint(1) NOT NULL,
  `suenio` tinyint(1) NOT NULL,
  `sucio` tinyint(1) NOT NULL,
  `triste` tinyint(1) NOT NULL,
  `vacio` tinyint(1) NOT NULL,
  `verde` tinyint(1) NOT NULL,
  `viejo` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_cualidades_atributos`),
  KEY `fk_cualidades_atributos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_cualidades_atributos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cualidades_atributos`
--

LOCK TABLES `cualidades_atributos` WRITE;
/*!40000 ALTER TABLE `cualidades_atributos` DISABLE KEYS */;
/*!40000 ALTER TABLE `cualidades_atributos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuantificadores_adverbios`
--

DROP TABLE IF EXISTS `cuantificadores_adverbios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuantificadores_adverbios` (
  `id_cuantificadores_adverbios` int NOT NULL AUTO_INCREMENT,
  `mas` tinyint(1) NOT NULL,
  `mucho` tinyint(1) NOT NULL,
  `nada` tinyint(1) NOT NULL,
  `no_hay` tinyint(1) NOT NULL,
  `otro_otra_vez` tinyint(1) NOT NULL,
  `tambien` tinyint(1) NOT NULL,
  `todo` tinyint(1) NOT NULL,
  `ya` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_cuantificadores_adverbios`),
  KEY `fk_cuantificadores_adverbios_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_cuantificadores_adverbios_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuantificadores_adverbios`
--

LOCK TABLES `cuantificadores_adverbios` WRITE;
/*!40000 ALTER TABLE `cuantificadores_adverbios` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuantificadores_adverbios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuerpo`
--

DROP TABLE IF EXISTS `cuerpo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuerpo` (
  `id_cuerpo` int NOT NULL AUTO_INCREMENT,
  `bigote` tinyint(1) NOT NULL,
  `boca` tinyint(1) NOT NULL,
  `brazos` tinyint(1) NOT NULL,
  `cabeza` tinyint(1) NOT NULL,
  `cachete` tinyint(1) NOT NULL,
  `cara` tinyint(1) NOT NULL,
  `chichi_pecho` tinyint(1) NOT NULL,
  `dedos` tinyint(1) NOT NULL,
  `dientes` tinyint(1) NOT NULL,
  `lengua` tinyint(1) NOT NULL,
  `manos` tinyint(1) NOT NULL,
  `nariz` tinyint(1) NOT NULL,
  `ojos` tinyint(1) NOT NULL,
  `ombligo` tinyint(1) NOT NULL,
  `orejas` tinyint(1) NOT NULL,
  `panza` tinyint(1) NOT NULL,
  `pelo` tinyint(1) NOT NULL,
  `piernas` tinyint(1) NOT NULL,
  `pies` tinyint(1) NOT NULL,
  `rodillas` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_cuerpo`),
  KEY `fk_cuerpo_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_cuerpo_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuerpo`
--

LOCK TABLES `cuerpo` WRITE;
/*!40000 ALTER TABLE `cuerpo` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuerpo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estados`
--

DROP TABLE IF EXISTS `estados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estados` (
  `id_estados` int NOT NULL AUTO_INCREMENT,
  `estar` tinyint(1) NOT NULL,
  `ser` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_estados`),
  KEY `fk_estados_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_estados_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estados`
--

LOCK TABLES `estados` WRITE;
/*!40000 ALTER TABLE `estados` DISABLE KEYS */;
/*!40000 ALTER TABLE `estados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gestos_acciones`
--

DROP TABLE IF EXISTS `gestos_acciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `gestos_acciones` (
  `id_gestos_acciones` int NOT NULL AUTO_INCREMENT,
  `a1` tinyint(1) NOT NULL,
  `a2` tinyint(1) NOT NULL,
  `a3` tinyint(1) NOT NULL,
  `a4` tinyint(1) NOT NULL,
  `a5` tinyint(1) NOT NULL,
  `a6` tinyint(1) NOT NULL,
  `a7` tinyint(1) NOT NULL,
  `a8` tinyint(1) NOT NULL,
  `a9` tinyint(1) NOT NULL,
  `a10` tinyint(1) NOT NULL,
  `a11` tinyint(1) NOT NULL,
  `a12` tinyint(1) NOT NULL,
  `a13` tinyint(1) NOT NULL,
  `b1` tinyint(1) NOT NULL,
  `b2` tinyint(1) NOT NULL,
  `b3` tinyint(1) NOT NULL,
  `b4` tinyint(1) NOT NULL,
  `b5` tinyint(1) NOT NULL,
  `b6` tinyint(1) NOT NULL,
  `b7` tinyint(1) NOT NULL,
  `b8` tinyint(1) NOT NULL,
  `c1` tinyint(1) NOT NULL,
  `c2` tinyint(1) NOT NULL,
  `c3` tinyint(1) NOT NULL,
  `c4` tinyint(1) NOT NULL,
  `c5` tinyint(1) NOT NULL,
  `c6` tinyint(1) NOT NULL,
  `c7` tinyint(1) NOT NULL,
  `c8` tinyint(1) NOT NULL,
  `c9` tinyint(1) NOT NULL,
  `c10` tinyint(1) NOT NULL,
  `c11` tinyint(1) NOT NULL,
  `c12` tinyint(1) NOT NULL,
  `c13` tinyint(1) NOT NULL,
  `c14` tinyint(1) NOT NULL,
  `c15` tinyint(1) NOT NULL,
  `d1` tinyint(1) NOT NULL,
  `d2` tinyint(1) NOT NULL,
  `d3` tinyint(1) NOT NULL,
  `d4` tinyint(1) NOT NULL,
  `d5` tinyint(1) NOT NULL,
  `d6` tinyint(1) NOT NULL,
  `d7` tinyint(1) NOT NULL,
  `d8` tinyint(1) NOT NULL,
  `d9` tinyint(1) NOT NULL,
  `d10` tinyint(1) NOT NULL,
  `d11` tinyint(1) NOT NULL,
  `d12` tinyint(1) NOT NULL,
  `d13` tinyint(1) NOT NULL,
  `e1` tinyint(1) NOT NULL,
  `e2` tinyint(1) NOT NULL,
  `e3` tinyint(1) NOT NULL,
  `e4` tinyint(1) NOT NULL,
  `e5` tinyint(1) NOT NULL,
  `e6` tinyint(1) NOT NULL,
  `e7` tinyint(1) NOT NULL,
  `e8` tinyint(1) NOT NULL,
  `e9` tinyint(1) NOT NULL,
  `e10` tinyint(1) NOT NULL,
  `e11` tinyint(1) NOT NULL,
  `e12` tinyint(1) NOT NULL,
  `e13` tinyint(1) NOT NULL,
  `e14` tinyint(1) NOT NULL,
  `e15` tinyint(1) NOT NULL,
  `total_a` int NOT NULL,
  `total_b` int NOT NULL,
  `total_c` int NOT NULL,
  `total_d` int NOT NULL,
  `total_e` int NOT NULL,
  `total_gestos` int NOT NULL,
  `total_gestos_tempranos` int NOT NULL,
  `total_gestos_tardios` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_gestos_acciones`),
  KEY `fk_gestos_acciones_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_gestos_acciones_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gestos_acciones`
--

LOCK TABLES `gestos_acciones` WRITE;
/*!40000 ALTER TABLE `gestos_acciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `gestos_acciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `juguetes`
--

DROP TABLE IF EXISTS `juguetes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `juguetes` (
  `id_juguetes` int NOT NULL AUTO_INCREMENT,
  `globo_bomba` tinyint(1) NOT NULL,
  `juguete` tinyint(1) NOT NULL,
  `libro` tinyint(1) NOT NULL,
  `lapiz` tinyint(1) NOT NULL,
  `munieca` tinyint(1) NOT NULL,
  `osito` tinyint(1) NOT NULL,
  `pelota` tinyint(1) NOT NULL,
  `tambor` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_juguetes`),
  KEY `fk_juguetes_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_juguetes_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `juguetes`
--

LOCK TABLES `juguetes` WRITE;
/*!40000 ALTER TABLE `juguetes` DISABLE KEYS */;
/*!40000 ALTER TABLE `juguetes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `locativos`
--

DROP TABLE IF EXISTS `locativos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `locativos` (
  `id_locativos` int NOT NULL AUTO_INCREMENT,
  `abajo` tinyint(1) NOT NULL,
  `adentro` tinyint(1) NOT NULL,
  `afuera` tinyint(1) NOT NULL,
  `ahi` tinyint(1) NOT NULL,
  `alla_alli` tinyint(1) NOT NULL,
  `aqui` tinyint(1) NOT NULL,
  `arriba` tinyint(1) NOT NULL,
  `atras` tinyint(1) NOT NULL,
  `encima` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_locativos`),
  KEY `fk_locativos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_locativos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `locativos`
--

LOCK TABLES `locativos` WRITE;
/*!40000 ALTER TABLE `locativos` DISABLE KEYS */;
/*!40000 ALTER TABLE `locativos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lugares_objetos`
--

DROP TABLE IF EXISTS `lugares_objetos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lugares_objetos` (
  `id_lugares_objetos` int NOT NULL AUTO_INCREMENT,
  `alberca_piscina` tinyint(1) NOT NULL,
  `arbol` tinyint(1) NOT NULL,
  `casa` tinyint(1) NOT NULL,
  `campo` tinyint(1) NOT NULL,
  `calle` tinyint(1) NOT NULL,
  `cielo` tinyint(1) NOT NULL,
  `columpio` tinyint(1) NOT NULL,
  `escuela` tinyint(1) NOT NULL,
  `estrella` tinyint(1) NOT NULL,
  `fiesta` tinyint(1) NOT NULL,
  `flor` tinyint(1) NOT NULL,
  `iglesia_templo` tinyint(1) NOT NULL,
  `jardin` tinyint(1) NOT NULL,
  `luna` tinyint(1) NOT NULL,
  `lluvia` tinyint(1) NOT NULL,
  `nieve` tinyint(1) NOT NULL,
  `nube` tinyint(1) NOT NULL,
  `parque` tinyint(1) NOT NULL,
  `piedra` tinyint(1) NOT NULL,
  `planta` tinyint(1) NOT NULL,
  `playa` tinyint(1) NOT NULL,
  `resbaladilla` tinyint(1) NOT NULL,
  `sol` tinyint(1) NOT NULL,
  `techo` tinyint(1) NOT NULL,
  `tienda_mercado` tinyint(1) NOT NULL,
  `zoologico` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_lugares_objetos`),
  KEY `fk_lugares_objetos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_lugares_objetos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lugares_objetos`
--

LOCK TABLES `lugares_objetos` WRITE;
/*!40000 ALTER TABLE `lugares_objetos` DISABLE KEYS */;
/*!40000 ALTER TABLE `lugares_objetos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `muebles_cuartos`
--

DROP TABLE IF EXISTS `muebles_cuartos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `muebles_cuartos` (
  `id_muebles_cuartos` int NOT NULL AUTO_INCREMENT,
  `bacinica` tinyint(1) NOT NULL,
  `banio` tinyint(1) NOT NULL,
  `cajon` tinyint(1) NOT NULL,
  `cama` tinyint(1) NOT NULL,
  `cocina` tinyint(1) NOT NULL,
  `cochera_garage` tinyint(1) NOT NULL,
  `cuarto` int NOT NULL,
  `cuna` tinyint(1) NOT NULL,
  `escalera` tinyint(1) NOT NULL,
  `estufa` tinyint(1) NOT NULL,
  `horno` tinyint(1) NOT NULL,
  `lavabo` tinyint(1) NOT NULL,
  `mesa` tinyint(1) NOT NULL,
  `puerta` tinyint(1) NOT NULL,
  `recamara` tinyint(1) NOT NULL,
  `refrigerador` tinyint(1) NOT NULL,
  `regadera_ducha` tinyint(1) NOT NULL,
  `ropero_closet` tinyint(1) NOT NULL,
  `sala` tinyint(1) NOT NULL,
  `silla` tinyint(1) NOT NULL,
  `sofa` tinyint(1) NOT NULL,
  `television` tinyint(1) NOT NULL,
  `tina` tinyint(1) NOT NULL,
  `ventana` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_muebles_cuartos`),
  KEY `fk_muebles_cuartos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_muebles_cuartos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `muebles_cuartos`
--

LOCK TABLES `muebles_cuartos` WRITE;
/*!40000 ALTER TABLE `muebles_cuartos` DISABLE KEYS */;
/*!40000 ALTER TABLE `muebles_cuartos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `percentiles`
--

DROP TABLE IF EXISTS `percentiles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `percentiles` (
  `id_percentiles` int NOT NULL AUTO_INCREMENT,
  `percentil_primeras_frases` int NOT NULL,
  `percentil_comprension_palabras` int NOT NULL,
  `percentil_produccion_palabras` int NOT NULL,
  `percentil_gestos` int NOT NULL,
  `percentil_gestos_tempranos` int NOT NULL,
  `percentil_gestos_tardios` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_percentiles`),
  KEY `fk_percentiles_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_percentiles_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `percentiles`
--

LOCK TABLES `percentiles` WRITE;
/*!40000 ALTER TABLE `percentiles` DISABLE KEYS */;
/*!40000 ALTER TABLE `percentiles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `id_personas` int NOT NULL AUTO_INCREMENT,
  `abuela` tinyint(1) NOT NULL,
  `abuelo` tinyint(1) NOT NULL,
  `bebe` tinyint(1) NOT NULL,
  `familia` tinyint(1) NOT NULL,
  `hermana` tinyint(1) NOT NULL,
  `hermano` tinyint(1) NOT NULL,
  `madrina` tinyint(1) NOT NULL,
  `maestra` tinyint(1) NOT NULL,
  `mama_mami` tinyint(1) NOT NULL,
  `nana` tinyint(1) NOT NULL,
  `ninia` tinyint(1) NOT NULL,
  `ninio` tinyint(1) NOT NULL,
  `padrino` tinyint(1) NOT NULL,
  `papa_papi` tinyint(1) NOT NULL,
  `persona` tinyint(1) DEFAULT NULL,
  `senior` tinyint(1) NOT NULL,
  `seniora` tinyint(1) NOT NULL,
  `tia` tinyint(1) NOT NULL,
  `tio` tinyint(1) NOT NULL,
  `nombre_ninio` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_personas`),
  KEY `fk_personas_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_personas_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preguntas`
--

DROP TABLE IF EXISTS `preguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preguntas` (
  `id_preguntas` int NOT NULL AUTO_INCREMENT,
  `como` tinyint(1) NOT NULL,
  `cual` tinyint(1) NOT NULL,
  `donde_esta` tinyint(1) NOT NULL,
  `por_que` tinyint(1) NOT NULL,
  `que` tinyint(1) NOT NULL,
  `quien` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_preguntas`),
  KEY `fk_preguntas_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_preguntas_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preguntas`
--

LOCK TABLES `preguntas` WRITE;
/*!40000 ALTER TABLE `preguntas` DISABLE KEYS */;
/*!40000 ALTER TABLE `preguntas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preposiciones`
--

DROP TABLE IF EXISTS `preposiciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preposiciones` (
  `id_preposiciones` int NOT NULL AUTO_INCREMENT,
  `de` tinyint(1) NOT NULL,
  `en` tinyint(1) NOT NULL,
  `para` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_preposiciones`),
  KEY `fk_preposiciones_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_preposiciones_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preposiciones`
--

LOCK TABLES `preposiciones` WRITE;
/*!40000 ALTER TABLE `preposiciones` DISABLE KEYS */;
/*!40000 ALTER TABLE `preposiciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `primeras_palabras`
--

DROP TABLE IF EXISTS `primeras_palabras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `primeras_palabras` (
  `id_primeras_palabras` int NOT NULL AUTO_INCREMENT,
  `a1` tinyint(1) NOT NULL,
  `a2` tinyint(1) NOT NULL,
  `a3` tinyint(1) NOT NULL,
  `b1` tinyint(1) NOT NULL,
  `b2` tinyint(1) NOT NULL,
  `b3` tinyint(1) NOT NULL,
  `b4` tinyint(1) NOT NULL,
  `b5` tinyint(1) NOT NULL,
  `b6` tinyint(1) NOT NULL,
  `b7` tinyint(1) NOT NULL,
  `b8` tinyint(1) NOT NULL,
  `b9` tinyint(1) NOT NULL,
  `b10` tinyint(1) NOT NULL,
  `b11` tinyint(1) NOT NULL,
  `b12` tinyint(1) NOT NULL,
  `b13` tinyint(1) NOT NULL,
  `b14` tinyint(1) NOT NULL,
  `b15` tinyint(1) NOT NULL,
  `b16` tinyint(1) NOT NULL,
  `b17` tinyint(1) NOT NULL,
  `b18` tinyint(1) NOT NULL,
  `b19` tinyint(1) NOT NULL,
  `b20` tinyint(1) NOT NULL,
  `b21` tinyint(1) NOT NULL,
  `b22` tinyint(1) NOT NULL,
  `b23` tinyint(1) NOT NULL,
  `b24` tinyint(1) NOT NULL,
  `b25` tinyint(1) NOT NULL,
  `b26` tinyint(1) NOT NULL,
  `b27` tinyint(1) NOT NULL,
  `b28` tinyint(1) NOT NULL,
  `c1` tinyint(1) NOT NULL,
  `c2` tinyint(1) NOT NULL,
  `total_comprension_temprana` int NOT NULL,
  `total_primeras_frases` int NOT NULL,
  `total_maneras_hablar` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_primeras_palabras`),
  KEY `fk_primeras_palabras_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_primeras_palabras_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `primeras_palabras`
--

LOCK TABLES `primeras_palabras` WRITE;
/*!40000 ALTER TABLE `primeras_palabras` DISABLE KEYS */;
/*!40000 ALTER TABLE `primeras_palabras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pronombres`
--

DROP TABLE IF EXISTS `pronombres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pronombres` (
  `id_pronombres` int NOT NULL AUTO_INCREMENT,
  `aquel` tinyint(1) NOT NULL,
  `aquella` tinyint(1) NOT NULL,
  `el` tinyint(1) NOT NULL,
  `ella` tinyint(1) NOT NULL,
  `ellas` tinyint(1) NOT NULL,
  `ellos` tinyint(1) NOT NULL,
  `esa` tinyint(1) NOT NULL,
  `esas` tinyint(1) NOT NULL,
  `ese` tinyint(1) NOT NULL,
  `eso` tinyint(1) NOT NULL,
  `esos` tinyint(1) NOT NULL,
  `esta` tinyint(1) NOT NULL,
  `estas` tinyint(1) NOT NULL,
  `este` tinyint(1) NOT NULL,
  `esto` tinyint(1) NOT NULL,
  `estos` tinyint(1) NOT NULL,
  `le` tinyint(1) NOT NULL,
  `les` tinyint(1) NOT NULL,
  `lo` tinyint(1) NOT NULL,
  `me` tinyint(1) NOT NULL,
  `mia` tinyint(1) NOT NULL,
  `mias` tinyint(1) NOT NULL,
  `mio` tinyint(1) NOT NULL,
  `mios` tinyint(1) NOT NULL,
  `se` tinyint(1) NOT NULL,
  `su` tinyint(1) NOT NULL,
  `te` tinyint(1) NOT NULL,
  `tu` tinyint(1) NOT NULL,
  `tuya` tinyint(1) NOT NULL,
  `tuyas` tinyint(1) NOT NULL,
  `tuyo` tinyint(1) NOT NULL,
  `tuyos` tinyint(1) NOT NULL,
  `yo` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_pronombres`),
  KEY `fk_pronombres_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_pronombres_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pronombres`
--

LOCK TABLES `pronombres` WRITE;
/*!40000 ALTER TABLE `pronombres` DISABLE KEYS */;
/*!40000 ALTER TABLE `pronombres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resultados`
--

DROP TABLE IF EXISTS `resultados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resultados` (
  `id_resultados` int NOT NULL AUTO_INCREMENT,
  `total_comprension_temprana` int NOT NULL,
  `total_primeras_frases` int NOT NULL,
  `total_maneras_hablar` int NOT NULL,
  `total_comprension_vocabulario` int NOT NULL,
  `total_cyd_vocabulario` int NOT NULL,
  `total_gestos` int NOT NULL,
  `total_gestos_tempranos` int NOT NULL,
  `total_gestos_tardios` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_resultados`),
  KEY `fk_resultados_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_resultados_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resultados`
--

LOCK TABLES `resultados` WRITE;
/*!40000 ALTER TABLE `resultados` DISABLE KEYS */;
/*!40000 ALTER TABLE `resultados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ropa`
--

DROP TABLE IF EXISTS `ropa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ropa` (
  `id_ropa` int NOT NULL AUTO_INCREMENT,
  `aretes` tinyint(1) NOT NULL,
  `babero` tinyint(1) NOT NULL,
  `botas` tinyint(1) NOT NULL,
  `boton` tinyint(1) NOT NULL,
  `calcetines` tinyint(1) NOT NULL,
  `calzon` tinyint(1) NOT NULL,
  `cierre` tinyint(1) NOT NULL,
  `collar` tinyint(1) NOT NULL,
  `falda` tinyint(1) NOT NULL,
  `lentes` tinyint(1) NOT NULL,
  `pantalon` tinyint(1) NOT NULL,
  `panial` tinyint(1) NOT NULL,
  `pijama` tinyint(1) NOT NULL,
  `playera` tinyint(1) NOT NULL,
  `shorts` tinyint(1) NOT NULL,
  `sombrero` tinyint(1) NOT NULL,
  `sueter` tinyint(1) NOT NULL,
  `vestido` tinyint(1) NOT NULL,
  `zapato` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_ropa`),
  KEY `fk_ropa_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_ropa_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ropa`
--

LOCK TABLES `ropa` WRITE;
/*!40000 ALTER TABLE `ropa` DISABLE KEYS */;
/*!40000 ALTER TABLE `ropa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rutina_reglas_juegos`
--

DROP TABLE IF EXISTS `rutina_reglas_juegos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rutina_reglas_juegos` (
  `id_rutina_reglas_juegos` int NOT NULL AUTO_INCREMENT,
  `acerrin` tinyint(1) NOT NULL,
  `adios_bye_bye` tinyint(1) NOT NULL,
  `besitos` tinyint(1) NOT NULL,
  `buenas_noches` tinyint(1) NOT NULL,
  `buenos_dias` tinyint(1) NOT NULL,
  `cosquillitas` tinyint(1) NOT NULL,
  `gracias` tinyint(1) NOT NULL,
  `hacer_meme` tinyint(1) NOT NULL,
  `hola` tinyint(1) NOT NULL,
  `manos` tinyint(1) NOT NULL,
  `no` tinyint(1) NOT NULL,
  `ojitos` tinyint(1) NOT NULL,
  `por_favor` tinyint(1) NOT NULL,
  `salud` tinyint(1) NOT NULL,
  `shhh` tinyint(1) NOT NULL,
  `si` tinyint(1) NOT NULL,
  `tengo_manita` tinyint(1) NOT NULL,
  `tortillitas` tinyint(1) NOT NULL,
  `uno_dos_tres` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_rutina_reglas_juegos`),
  KEY `fk_rutina_reglas_juegos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_rutina_reglas_juegos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rutina_reglas_juegos`
--

LOCK TABLES `rutina_reglas_juegos` WRITE;
/*!40000 ALTER TABLE `rutina_reglas_juegos` DISABLE KEYS */;
/*!40000 ALTER TABLE `rutina_reglas_juegos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sonidos`
--

DROP TABLE IF EXISTS `sonidos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sonidos` (
  `id_sonidos` int NOT NULL AUTO_INCREMENT,
  `am` tinyint(1) NOT NULL,
  `ay` tinyint(1) NOT NULL,
  `bee_me` tinyint(1) NOT NULL,
  `cua_cua` tinyint(1) NOT NULL,
  `gua_gua` tinyint(1) NOT NULL,
  `miau` tinyint(1) NOT NULL,
  `muu` tinyint(1) NOT NULL,
  `pi_pi` tinyint(1) NOT NULL,
  `pio_pio` tinyint(1) NOT NULL,
  `qui_qui_ri_qui` tinyint(1) NOT NULL,
  `tu_tu` tinyint(1) NOT NULL,
  `pum` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_sonidos`),
  KEY `fk_sonidos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_sonidos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sonidos`
--

LOCK TABLES `sonidos` WRITE;
/*!40000 ALTER TABLE `sonidos` DISABLE KEYS */;
/*!40000 ALTER TABLE `sonidos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiempo`
--

DROP TABLE IF EXISTS `tiempo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiempo` (
  `id_tiempo` int NOT NULL AUTO_INCREMENT,
  `ahorita_ahora` tinyint(1) NOT NULL,
  `ayer` tinyint(1) NOT NULL,
  `dia` tinyint(1) NOT NULL,
  `despues` tinyint(1) NOT NULL,
  `hoy` tinyint(1) NOT NULL,
  `maniana` tinyint(1) NOT NULL,
  `noche` tinyint(1) NOT NULL,
  `temprano` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_tiempo`),
  KEY `fk_tiempo_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_tiempo_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiempo`
--

LOCK TABLES `tiempo` WRITE;
/*!40000 ALTER TABLE `tiempo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tiempo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utensilios`
--

DROP TABLE IF EXISTS `utensilios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `utensilios` (
  `id_utensilios` int NOT NULL AUTO_INCREMENT,
  `almohada` tinyint(1) NOT NULL,
  `aspiradora` tinyint(1) NOT NULL,
  `basura` tinyint(1) NOT NULL,
  `botella_mamila` tinyint(1) NOT NULL,
  `bolsa` tinyint(1) NOT NULL,
  `caja` tinyint(1) NOT NULL,
  `cepillo` tinyint(1) NOT NULL,
  `cepillo_dientes` tinyint(1) NOT NULL,
  `cigarros` tinyint(1) NOT NULL,
  `cobija` tinyint(1) NOT NULL,
  `cuadro` tinyint(1) NOT NULL,
  `cuchara` tinyint(1) NOT NULL,
  `cuchillo` tinyint(1) NOT NULL,
  `chupon_chupete` tinyint(1) NOT NULL,
  `dinero` tinyint(1) NOT NULL,
  `escoba` tinyint(1) NOT NULL,
  `espejo` tinyint(1) NOT NULL,
  `fotos` tinyint(1) NOT NULL,
  `jabon` tinyint(1) NOT NULL,
  `luz` tinyint(1) NOT NULL,
  `llaves` tinyint(1) NOT NULL,
  `martillo` tinyint(1) NOT NULL,
  `medicina` tinyint(1) NOT NULL,
  `papel` tinyint(1) NOT NULL,
  `peine` tinyint(1) NOT NULL,
  `plato` tinyint(1) NOT NULL,
  `radio` tinyint(1) NOT NULL,
  `reloj` tinyint(1) NOT NULL,
  `taza` tinyint(1) NOT NULL,
  `telefono` tinyint(1) NOT NULL,
  `tenedor` tinyint(1) NOT NULL,
  `tijeras` tinyint(1) NOT NULL,
  `toalla` tinyint(1) NOT NULL,
  `trapo` tinyint(1) NOT NULL,
  `vaso` tinyint(1) NOT NULL,
  `vela` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_utensilios`),
  KEY `fk_utensilios_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_utensilios_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utensilios`
--

LOCK TABLES `utensilios` WRITE;
/*!40000 ALTER TABLE `utensilios` DISABLE KEYS */;
/*!40000 ALTER TABLE `utensilios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculos`
--

DROP TABLE IF EXISTS `vehiculos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculos` (
  `id_vehiculos` int NOT NULL AUTO_INCREMENT,
  `avion` tinyint(1) NOT NULL,
  `barco` tinyint(1) NOT NULL,
  `bicicleta` tinyint(1) NOT NULL,
  `camion_bomberos` tinyint(1) NOT NULL,
  `camion_troca` tinyint(1) NOT NULL,
  `carreola` tinyint(1) NOT NULL,
  `carro_coche` tinyint(1) NOT NULL,
  `moto` tinyint(1) NOT NULL,
  `tren` tinyint(1) NOT NULL,
  `total_c` int NOT NULL,
  `total_cyd` int NOT NULL,
  `citas_id_cita` int NOT NULL,
  PRIMARY KEY (`id_vehiculos`),
  KEY `fk_vehiculos_cita1_idx` (`citas_id_cita`),
  CONSTRAINT `fk_vehiculos_cita1` FOREIGN KEY (`citas_id_cita`) REFERENCES `cita` (`id_cita`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculos`
--

LOCK TABLES `vehiculos` WRITE;
/*!40000 ALTER TABLE `vehiculos` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehiculos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'cdi12'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-19  1:31:18
CREATE DATABASE  IF NOT EXISTS `babywizard` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `babywizard`;
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
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bebe`
--

LOCK TABLES `bebe` WRITE;
/*!40000 ALTER TABLE `bebe` DISABLE KEYS */;
INSERT INTO `bebe` VALUES (19,'El','Samurai','Bebe',0,'2015-04-16','Vagabond'),(20,'Basti√°n','Bux','Baltazar',0,'2016-09-04','Vagabond'),(22,'Samus','Bebe','Aran',1,'2016-01-05','Vene'),(23,'Daniel','Torres','Sempere',0,'2014-05-05','root'),(25,'Bebe','Interesante','Muy',1,'2017-05-06','root'),(26,'Link','Hyrule','Of',0,'2015-03-03','root');
/*!40000 ALTER TABLE `bebe` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuidador`
--

LOCK TABLES `cuidador` WRITE;
/*!40000 ALTER TABLE `cuidador` DISABLE KEYS */;
INSERT INTO `cuidador` VALUES (9,'samurai@samurai.com','El','Padre','Samurai','1991-08-03','Samurai','11111111','00000000',0,19),(10,'barney@fantasia.com','Barney','Bux','Senior','1987-12-10','Dentista','22223333','44445555',16,20),(12,'ridleybad@metroid.com','Metroid','Prime','Fusion','1984-11-10','Destruir','00000000','11111111',0,22),(13,'sempere70@crz.com','Se√±or','Sempere','de Daniel','1992-05-16','Emprendedor','12341234','98769876',14,23),(15,'interesantisima@interesante.com','Se√±ora','Muy','Interesante','1999-05-06','Ser interesante','00001111','11110000',2,25),(16,'awelita@hyrule.com','Awela','De','Link','1968-10-12','Cuidar','01230123','98769876',10,26);
/*!40000 ALTER TABLE `cuidador` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experimentocabina`
--

LOCK TABLES `experimentocabina` WRITE;
/*!40000 ALTER TABLE `experimentocabina` DISABLE KEYS */;
INSERT INTO `experimentocabina` VALUES (4,'0',1,1.00,1.00,1.00,1.00,1.00,20);
/*!40000 ALTER TABLE `experimentocabina` ENABLE KEYS */;
UNLOCK TABLES;

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
  `cuidadorBebe` tinyint NOT NULL,
  `fkBebe` int DEFAULT NULL,
  PRIMARY KEY (`idLecturaConjunta`),
  UNIQUE KEY `idCategoriaGramatical_UNIQUE` (`idLecturaConjunta`),
  KEY `fkInfante_idx` (`fkBebe`),
  CONSTRAINT `fkBebeRana` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lecturaconjunta`
--

LOCK TABLES `lecturaconjunta` WRITE;
/*!40000 ALTER TABLE `lecturaconjunta` DISABLE KEYS */;
/*!40000 ALTER TABLE `lecturaconjunta` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sociodemografico`
--

LOCK TABLES `sociodemografico` WRITE;
/*!40000 ALTER TABLE `sociodemografico` DISABLE KEYS */;
INSERT INTO `sociodemografico` VALUES (5,'2020-04-24',0,42,10,10,3.00,0,0,0,0,0,0,1,1,0,'Padre',0,0,0,0,0,0,'Muy samurai',19),(6,'2020-04-24',0,40,10,9,2.80,1,0,0,0,1,0,1,1,1,'Padre',0,0,0,0,0,0,'Muy imaginativo',20),(8,'2020-04-29',0,42,10,10,2.90,1,0,0,0,1,0,1,1,0,'Padre',0,0,0,0,0,0,'Muy fuerte',22),(9,'2020-05-01',0,38,9,9,3.20,0,0,0,0,0,0,1,1,0,'Padre',0,0,0,1,12,6,'Lector',23),(11,'2020-05-08',0,40,10,10,3.00,0,0,0,0,0,0,1,2,0,'Madre',0,0,0,0,0,0,'Muy interesante',25),(12,'2020-05-13',0,42,10,10,3.50,0,0,0,0,0,0,1,1,0,'Abuela',0,0,0,0,0,0,'',26);
/*!40000 ALTER TABLE `sociodemografico` ENABLE KEYS */;
UNLOCK TABLES;

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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socioeconomico`
--

LOCK TABLES `socioeconomico` WRITE;
/*!40000 ALTER TABLE `socioeconomico` DISABLE KEYS */;
INSERT INTO `socioeconomico` VALUES (5,20,'AB',5),(6,18,'C',6),(8,2,'E',8),(9,14,'C-',9),(11,1,'AB',11),(12,15,'C',12);
/*!40000 ALTER TABLE `socioeconomico` ENABLE KEYS */;
UNLOCK TABLES;

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
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES ('root',_binary ')C\À\«\‡Vì˜Û\·Ç-\‡',1,'El','Root','Famoso'),('Vagabond',_binary '\¬!%ÅÄ;\√IO¥LnI1',0,'Shinmen','Miyamoto','Musashi'),('Vene',_binary 'Ñ\0o_RΩÜu8\rˇ\\£',1,'Vic','El Mejor','Programador');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

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
  PRIMARY KEY (`idWppsi303642`),
  UNIQUE KEY `idWPPSI303642_UNIQUE` (`idWppsi303642`),
  KEY `fkBebeWPPSI303642_idx` (`fkBebe`),
  CONSTRAINT `fkBebeWppsi303642` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wppsi303642`
--

LOCK TABLES `wppsi303642` WRITE;
/*!40000 ALTER TABLE `wppsi303642` DISABLE KEYS */;
INSERT INTO `wppsi303642` VALUES (5,34,20,30,10,20,25,'2020-05-16');
/*!40000 ALTER TABLE `wppsi303642` ENABLE KEYS */;
UNLOCK TABLES;

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
  PRIMARY KEY (`idWppsi48`),
  UNIQUE KEY `idWPPSI48_UNIQUE` (`idWppsi48`),
  KEY `fkBebeWPPSI48_idx` (`fkBebe`),
  CONSTRAINT `fkBebeWppsi48` FOREIGN KEY (`fkBebe`) REFERENCES `bebe` (`idBebe`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wppsi48`
--

LOCK TABLES `wppsi48` WRITE;
/*!40000 ALTER TABLE `wppsi48` DISABLE KEYS */;
INSERT INTO `wppsi48` VALUES (3,10,10,10,10,10,10,10,10,10,10,10,10,10,10,19,'2020-05-18');
/*!40000 ALTER TABLE `wppsi48` ENABLE KEYS */;
UNLOCK TABLES;

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

-- Dump completed on 2020-05-19  1:31:18
