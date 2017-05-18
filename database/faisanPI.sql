-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 19-05-2017 a las 00:34:22
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `faisanPI`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad`
--

CREATE TABLE `actividad` (
  `id_actividad` int(11) NOT NULL,
  `fecha` varchar(255) NOT NULL,
  `tipo` varchar(255) NOT NULL,
  `nombre_actividad` varchar(255) NOT NULL,
  `lugar` varchar(255) NOT NULL,
  `destinatario` int(11) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `actividad`
--

INSERT INTO `actividad` (`id_actividad`, `fecha`, `tipo`, `nombre_actividad`, `lugar`, `destinatario`, `descripcion`) VALUES
(1, '10-10-2001', 'Futbol', 'Futbito con Macarrones', 'Polideportivo', 1, 'asdf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `actividad_tipo`
--

CREATE TABLE `actividad_tipo` (
  `id_actividad` int(11) NOT NULL,
  `id_tipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asociacion`
--

CREATE TABLE `asociacion` (
  `id_asociacion` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cif` varchar(255) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `municipio` varchar(100) NOT NULL,
  `cp` int(5) NOT NULL,
  `telef_fijo` int(9) DEFAULT NULL,
  `telef_movil` int(9) NOT NULL,
  `fax` int(9) DEFAULT NULL,
  `email` varchar(200) NOT NULL,
  `baja` tinyint(4) NOT NULL,
  `estatutos` tinyint(4) NOT NULL,
  `num_registro` tinyint(4) NOT NULL,
  `acta_junta` tinyint(4) NOT NULL,
  `cert_domicilio` tinyint(4) NOT NULL,
  `fecha_solicitud` varchar(255) NOT NULL,
  `id_representante` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asociacion`
--

INSERT INTO `asociacion` (`id_asociacion`, `nombre`, `cif`, `direccion`, `municipio`, `cp`, `telef_fijo`, `telef_movil`, `fax`, `email`, `baja`, `estatutos`, `num_registro`, `acta_junta`, `cert_domicilio`, `fecha_solicitud`, `id_representante`) VALUES
(3, 'nombre', 'cif', 'direccion', 'municipio', 43, 34, 34, 34, 'ddfdfdfg', 3, 3, 3, 3, 3, '2017-05-08', 0),
(4, 'Quirosesporelmundo', 'B62332237', 'sdsddsf', 'Quirosworld', 272, 13232, 32323, 323232, 'quiroswii@dsd.com', 32, 3, 23, 3, 3, '2017-05-17', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asociacion_actividad_organiza`
--

CREATE TABLE `asociacion_actividad_organiza` (
  `id_asociacion` int(11) NOT NULL,
  `id_actividad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asociacion_actividad_participa`
--

CREATE TABLE `asociacion_actividad_participa` (
  `id_asociacion` int(11) NOT NULL,
  `id_actividad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asociacion_tipo`
--

CREATE TABLE `asociacion_tipo` (
  `id_asociacion` int(11) NOT NULL,
  `id_tipo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `representante`
--

CREATE TABLE `representante` (
  `id_representante` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `NIF_NIE` varchar(9) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `municipio` varchar(255) NOT NULL,
  `codigo_postal` int(5) NOT NULL,
  `tfn_fijo` int(9) DEFAULT NULL,
  `tfn_movil` int(9) NOT NULL,
  `fax` int(9) DEFAULT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `representante`
--

INSERT INTO `representante` (`id_representante`, `nombre`, `NIF_NIE`, `direccion`, `municipio`, `codigo_postal`, `tfn_fijo`, `tfn_movil`, `fax`, `email`) VALUES
(0, 'adsasd', 'ffdssfd', 'sdfsdfsd', 'sdffsd', 43, 34, 34, 34, 'dsffds');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sede`
--

CREATE TABLE `sede` (
  `id_sede` int(11) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `caracteristicas` varchar(255) NOT NULL,
  `fecha_solicitud` varchar(255) NOT NULL,
  `fecha_concesion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sede`
--

INSERT INTO `sede` (`id_sede`, `direccion`, `caracteristicas`, `fecha_solicitud`, `fecha_concesion`) VALUES
(1, 'Piruletalandia', 'Amplio', '10-10-2015', '10-10-2016');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sede_asociacion`
--

CREATE TABLE `sede_asociacion` (
  `id_asociacion` int(11) NOT NULL,
  `id_sede` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `subvencion`
--

CREATE TABLE `subvencion` (
  `id_solicitud` int(11) NOT NULL,
  `fecha_solicitud` varchar(255) NOT NULL,
  `importe` int(11) DEFAULT NULL,
  `id_actividad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `subvencion`
--

INSERT INTO `subvencion` (`id_solicitud`, `fecha_solicitud`, `importe`, `id_actividad`) VALUES
(1, '10-12-2001', 10000, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `id_tipo` int(11) NOT NULL,
  `tipo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `actividad`
--
ALTER TABLE `actividad`
  ADD PRIMARY KEY (`id_actividad`);

--
-- Indices de la tabla `actividad_tipo`
--
ALTER TABLE `actividad_tipo`
  ADD PRIMARY KEY (`id_actividad`,`id_tipo`),
  ADD KEY `fk_tipo_actividad` (`id_tipo`);

--
-- Indices de la tabla `asociacion`
--
ALTER TABLE `asociacion`
  ADD PRIMARY KEY (`id_asociacion`),
  ADD KEY `fk_aso_repre` (`id_representante`);

--
-- Indices de la tabla `asociacion_actividad_organiza`
--
ALTER TABLE `asociacion_actividad_organiza`
  ADD PRIMARY KEY (`id_asociacion`,`id_actividad`),
  ADD KEY `fk_actividad_asociacion_organiza` (`id_actividad`);

--
-- Indices de la tabla `asociacion_actividad_participa`
--
ALTER TABLE `asociacion_actividad_participa`
  ADD PRIMARY KEY (`id_asociacion`,`id_actividad`),
  ADD KEY `fk_actividad_asociacion_participa` (`id_actividad`);

--
-- Indices de la tabla `asociacion_tipo`
--
ALTER TABLE `asociacion_tipo`
  ADD PRIMARY KEY (`id_asociacion`,`id_tipo`),
  ADD KEY `fk_tipo_asociacion` (`id_tipo`);

--
-- Indices de la tabla `representante`
--
ALTER TABLE `representante`
  ADD PRIMARY KEY (`id_representante`);

--
-- Indices de la tabla `sede`
--
ALTER TABLE `sede`
  ADD PRIMARY KEY (`id_sede`);

--
-- Indices de la tabla `sede_asociacion`
--
ALTER TABLE `sede_asociacion`
  ADD PRIMARY KEY (`id_asociacion`,`id_sede`),
  ADD KEY `fk_sede_aso` (`id_sede`);

--
-- Indices de la tabla `subvencion`
--
ALTER TABLE `subvencion`
  ADD PRIMARY KEY (`id_solicitud`),
  ADD KEY `fk_solicitud_actividad` (`id_actividad`);

--
-- Indices de la tabla `tipo`
--
ALTER TABLE `tipo`
  ADD PRIMARY KEY (`id_tipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividad`
--
ALTER TABLE `actividad`
  MODIFY `id_actividad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `asociacion`
--
ALTER TABLE `asociacion`
  MODIFY `id_asociacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `sede`
--
ALTER TABLE `sede`
  MODIFY `id_sede` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `subvencion`
--
ALTER TABLE `subvencion`
  MODIFY `id_solicitud` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `actividad_tipo`
--
ALTER TABLE `actividad_tipo`
  ADD CONSTRAINT `fk_actividad_tipo` FOREIGN KEY (`id_actividad`) REFERENCES `actividad` (`id_actividad`),
  ADD CONSTRAINT `fk_tipo_actividad` FOREIGN KEY (`id_tipo`) REFERENCES `tipo` (`id_tipo`);

--
-- Filtros para la tabla `asociacion`
--
ALTER TABLE `asociacion`
  ADD CONSTRAINT `fk_aso_repre` FOREIGN KEY (`id_representante`) REFERENCES `representante` (`id_representante`);

--
-- Filtros para la tabla `asociacion_actividad_organiza`
--
ALTER TABLE `asociacion_actividad_organiza`
  ADD CONSTRAINT `fk_actividad_asociacion_organiza` FOREIGN KEY (`id_actividad`) REFERENCES `actividad` (`id_actividad`),
  ADD CONSTRAINT `fk_asociacion_actividad_organiza` FOREIGN KEY (`id_asociacion`) REFERENCES `asociacion` (`id_asociacion`);

--
-- Filtros para la tabla `asociacion_actividad_participa`
--
ALTER TABLE `asociacion_actividad_participa`
  ADD CONSTRAINT `fk_actividad_asociacion_participa` FOREIGN KEY (`id_actividad`) REFERENCES `actividad` (`id_actividad`),
  ADD CONSTRAINT `fk_asociacion_actividad_participa` FOREIGN KEY (`id_asociacion`) REFERENCES `asociacion` (`id_asociacion`);

--
-- Filtros para la tabla `asociacion_tipo`
--
ALTER TABLE `asociacion_tipo`
  ADD CONSTRAINT `fk_asociacion_tipo` FOREIGN KEY (`id_asociacion`) REFERENCES `asociacion` (`id_asociacion`),
  ADD CONSTRAINT `fk_tipo_asociacion` FOREIGN KEY (`id_tipo`) REFERENCES `tipo` (`id_tipo`);

--
-- Filtros para la tabla `sede_asociacion`
--
ALTER TABLE `sede_asociacion`
  ADD CONSTRAINT `fk_aso_sede` FOREIGN KEY (`id_asociacion`) REFERENCES `asociacion` (`id_asociacion`),
  ADD CONSTRAINT `fk_sede_aso` FOREIGN KEY (`id_sede`) REFERENCES `sede` (`id_sede`);

--
-- Filtros para la tabla `subvencion`
--
ALTER TABLE `subvencion`
  ADD CONSTRAINT `fk_solicitud_actividad` FOREIGN KEY (`id_actividad`) REFERENCES `actividad` (`id_actividad`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
