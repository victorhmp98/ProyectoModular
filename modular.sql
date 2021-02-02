-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-02-2021 a las 03:45:22
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `modular`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `datos_prestadores`
--

CREATE TABLE `datos_prestadores` (
  `nombre` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contrasena` varchar(20) NOT NULL,
  `generacion` date NOT NULL,
  `fecha_registro` date NOT NULL,
  `tipo_usuario` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `datos_prestadores`
--

INSERT INTO `datos_prestadores` (`nombre`, `usuario`, `contrasena`, `generacion`, `fecha_registro`, `tipo_usuario`) VALUES
('perla', 'grin', 'asd', '2000-01-01', '2000-01-01', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reportes`
--

CREATE TABLE `reportes` (
  `usuario` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  `reporte` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reportes`
--

INSERT INTO `reportes` (`usuario`, `fecha`, `reporte`) VALUES
('grin', '2021-01-12', 'prueba de reporte');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `datos_prestadores`
--
ALTER TABLE `datos_prestadores`
  ADD PRIMARY KEY (`usuario`);

--
-- Indices de la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reportes`
--
ALTER TABLE `reportes`
  ADD CONSTRAINT `reportes_ibfk_1` FOREIGN KEY (`usuario`) REFERENCES `datos_prestadores` (`usuario`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
