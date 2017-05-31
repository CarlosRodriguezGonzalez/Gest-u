-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 31-05-2017 a las 17:02:13
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 7.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `FaisanPI`
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
(1, '22-04-2017', 'Ocio', 'Gymkana', 'IES Carmen Martin Gaite', NULL, 'Gymkana con distintos circuitos orientada a niños.'),
(2, '10-11-2011', 'Ocio', 'Todo por ti ', 'Pueblo nuevo', NULL, 'Actividades para jovenes entre 3-12 años'),
(3, '15-6-2007', 'Deporte', 'Charly fit', 'Barrio Salamanca', NULL, 'Charly te entrena(o no)'),
(4, '25-6-2013', 'Ocio', 'Jonyou', 'Campo de arriba', NULL, 'ocio y tiempo libre'),
(5, '14-5-2010', 'Deporte', 'Bumbum', 'IES Juan de Herrera', NULL, 'Competición de petanca'),
(6, '4-6-2012', 'Deporte', 'El tutú', 'Barrio el Padrón', NULL, 'Competición de carreras de saco'),
(7, '22-8-2013', 'Ocio', 'PEPETE', 'Barrio Maria Luisa', NULL, 'Venta de antiguedades'),
(8, '5-6-2013', 'Ocio', 'EL muni', 'Barrio viejo', NULL, 'Curso de informática gratuito'),
(9, '2-10-2013', 'Ocio', 'Cosika', 'Parque Grande', NULL, 'Curso de carpintería');

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
(1, 'Tiro al plato Faisan', 'B876234G', 'C/Jacinto Benavente P2 N4', 'Las Rozas', 28232, 918543234, 681019232, NULL, 'tiroplatofaisan@faisanworld.com', 1, 1, 1, 1, 1, '15-04-2015', 0),
(2, 'We''re Quiros', 'B432243C', 'C/ Poniente 28', 'Moralzarzal', 28411, 918432345, 681012343, NULL, 'werequiros@gmail.com', 1, 1, 1, 1, 1, '04-09-2016', 0),
(3, 'Fundacion UCA', 'B33423234V', 'C/ Daniel de la Uca 23', 'Mahadaonda', 28413, 918432121, 671221212, NULL, 'daniglesiauca@hotmail.es', 1, 1, 1, 1, 1, '25-02-2017', 0),
(4, 'Fundacion Ochentera', 'B334232V', 'C/ Elfo P1 4', 'Madrid', 28022, 917645321, 3434, NULL, 'fundacionochentera@gmail.com', 1, 1, 1, 1, 1, '28-02-2017', 0),
(5, 'Loleros Anónimos', 'B456723C', 'Avda. Grieta del invocador', 'Runaterra', 28023, 98789213, 3434, NULL, 'lolerosanonimos@hotmail.com', 1, 1, 1, 1, 1, '01-03-2017', 0),
(6, 'Autobuses Paul', '', 'C/ Nunca jamas 6', 'Las Rozas', 28232, 918576432, 3434, NULL, 'paulvilla@gmail.com', 1, 1, 1, 1, 1, '03-03-2017', 0),
(7, 'Malsu was here', 'Z635433B', 'C/ Playa de Liencres', 'Las Matas', 28290, 918564323, 3434, NULL, 'malsujeto@gmail.com', 1, 1, 1, 1, 1, '04-03-2017', 0),
(8, 'NullPointerException', 'B3432438', 'C/ De los Bugs', 'Java', 28232, 918576532, 3434, NULL, 'nullpointer@gmail.com', 1, 1, 1, 1, 1, '07-03-2017', 0),
(9, 'Quiros a la cazuela', 'B433343G', 'C/ Del Y si 23', 'Las Rozas', 28232, 918574632, 3434, NULL, 'quiroscope@gmail.com', 1, 1, 1, 1, 1, '15-03-2017', 0),
(10, 'In Charly We Trust', 'F33434G', 'C/ Playa de las Americas', 'Las Rozas', 28232, 918432123, 23223, NULL, 'incharlywetrust@gmail.com', 1, 1, 1, 1, 1, '19-03-2017', 0),
(11, 'Alcoholicos Anonimos', 'B873344F', 'Paseo de Moret 2', 'Madrid', 28022, 910664532, 3434, NULL, 'alcoholicos@hotmail.es', 1, 1, 1, 1, 1, '22-03-2017', 0),
(12, 'Not Giving In', 'B323433Y', 'C/ Junio 22', 'Madrid', 28023, 918234321, 3434, NULL, 'notgivingin@gmail.com', 1, 1, 1, 1, 1, '26-03-2017', 0),
(13, 'Fundacion Adahi', 'B343342C', 'Plaza de España', 'Madrid', 28022, 918765432, 3434, NULL, 'fundacionadahi@madrid.org', 1, 1, 1, 1, 1, '02-04-2017', 0),
(14, 'E-Sports Las Rozas', 'B33423C', 'C/ Jacinto Benavente 32', 'Las Rozas', 28231, 918674323, 3434, NULL, 'esportslasrozas@gmail.com', 1, 1, 1, 1, 1, '05-04-2017', 0),
(15, 'Libros ThePaper', 'B34432CR', 'C/ Real 23', 'Madrid', 28022, 918232234, 3434, NULL, 'librospaper@paperux.com', 1, 1, 1, 1, 1, '17-04-2017', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asociacion_actividad_organiza`
--

CREATE TABLE `asociacion_actividad_organiza` (
  `id_asociacion` int(11) NOT NULL,
  `id_actividad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `asociacion_actividad_organiza`
--

INSERT INTO `asociacion_actividad_organiza` (`id_asociacion`, `id_actividad`) VALUES
(1, 1),
(1, 3),
(1, 6),
(1, 8),
(2, 1),
(2, 5),
(2, 9),
(3, 2);

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
(0, 'Sergio Arranz', '02576543F', 'C/Federico Garcia Lorca 9', 'Moralzarzal', 28411, 918576543, 681723421, NULL, 'sergioas1996@gmail.com');

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
(1, 'C/ De la Piruleta', 'Duplex amplio', '05-04-2017', '07-04-2017'),
(2, 'C/ Velazquez', 'Pradera', '5-7-2013', '22-7-2013'),
(3, 'C/ Perez', 'Local', '12-8-2013', '5-9-2013'),
(4, 'C/ Alvarez', 'Local', '4-7-2014', '26-10-2014'),
(5, 'C/ Pepon', 'Parcela', '3-2-2016', '2-5-2015'),
(6, 'C/ Alfredo', 'Chalet', '3-4-2016', '22-5-2016');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sede_asociacion`
--

CREATE TABLE `sede_asociacion` (
  `id_asociacion` int(11) NOT NULL,
  `id_sede` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `sede_asociacion`
--

INSERT INTO `sede_asociacion` (`id_asociacion`, `id_sede`) VALUES
(1, 1),
(1, 2),
(1, 4),
(1, 5),
(2, 1),
(2, 3),
(2, 4);

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
(1, '02-05-2017', 567, 1),
(2, '22-6-2015', 1020, 2),
(3, '21-6-2012', 2000, 3),
(4, '5-6-2015', 520, 4),
(5, '2-5-2016', 1300, 3),
(6, '7-6-2017', 200, 5),
(7, '23-8-2017', 500, 6),
(8, '22-9-2017', 3000, 8),
(9, '6-8-2017', 800, 9);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo`
--

CREATE TABLE `tipo` (
  `id_tipo` int(11) NOT NULL,
  `tipo` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `user` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`user`, `pass`) VALUES
('patata', '35bc8cec895861697a0243c1304c7789');

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
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `actividad`
--
ALTER TABLE `actividad`
  MODIFY `id_actividad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `asociacion`
--
ALTER TABLE `asociacion`
  MODIFY `id_asociacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT de la tabla `sede`
--
ALTER TABLE `sede`
  MODIFY `id_sede` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `subvencion`
--
ALTER TABLE `subvencion`
  MODIFY `id_solicitud` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
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
