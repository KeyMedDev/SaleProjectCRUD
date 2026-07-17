-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 15-06-2021 a las 18:04:48
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdtiendapochita`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tabastece`
--

CREATE TABLE `tabastece` (
  `idAbastece` int(11) NOT NULL,
  `fechaProv` date DEFAULT NULL,
  `idProveedor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcajero`
--

CREATE TABLE `tcajero` (
  `idCajero` int(11) NOT NULL,
  `nomCajero` varchar(40) DEFAULT NULL,
  `apPat` varchar(40) DEFAULT NULL,
  `apMat` varchar(40) DEFAULT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `clave` varchar(20) DEFAULT NULL,
  `idLocal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tcajero`
--

INSERT INTO `tcajero` (`idCajero`, `nomCajero`, `apPat`, `apMat`, `usuario`, `clave`, `idLocal`) VALUES
(1, 'Harry', 'Terrones', 'Torres', 'harrytt', '12345', 2),
(2, 'Doris', 'Mesones', 'Llempen', 'dorism', '12345', 4),
(3, 'Jaime', 'Galarza', 'Maquera', 'jaimeg', '12345', 3),
(4, 'Karla', 'Mamani', 'Marquina', 'karlam', '12345', 1),
(5, 'Miguel', 'Solis', 'Chavez', 'miguels', '12345', 5);


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcategoria`
--

CREATE TABLE `tcategoria` (
  `idCategoria` int(11) NOT NULL,
  `descCategoria` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tcategoria`
--

INSERT INTO `tcategoria` (`idCategoria`, `descCategoria`) VALUES
(1, 'U.Escritorio'),
(2, 'Acc.Computo'),
(3, 'Regalos'),
(4, 'Perfumeria');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcliente`
--

CREATE TABLE `tcliente` (
  `idCliente` int(11) NOT NULL,
  `dni` varchar(8) DEFAULT NULL,
  `apPat` varchar(40) DEFAULT NULL,
  `apMat` varchar(40) DEFAULT NULL,
  `nombre` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `tcliente` (`idCliente`,`dni`,`apPat`,`apMat`,`nombre`) values 
(1,'12345678','Vargas','Lopez','Felipe'),
(2,'23456789','Esquivel','Solis','Oscar'),
(3,'34567890','Reategui','Mollinedo','Ursula'),
(4,'45678901','Hilares','Taboada','Jaime'),
(5,'56789012','Quispe','Troncoso','Miriam');
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcompra`
--

CREATE TABLE `tcompra` (
  `idCompra` int(11) NOT NULL,
  `fechaCompra` date DEFAULT NULL,
  `idCajero` int(11) DEFAULT NULL,
  `idCliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdetalleabastece`
--

CREATE TABLE `tdetalleabastece` (
  `idAbastece` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `cant` decimal(7,2) DEFAULT NULL,
  `precio` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdetallecompra`
--

CREATE TABLE `tdetallecompra` (
  `idCompra` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `cant` decimal(7,2) DEFAULT NULL,
  `pu` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tlocal`
--

CREATE TABLE `tlocal` (
  `idLocal` int(11) NOT NULL,
  `administrador` varchar(40) DEFAULT NULL,
  `diasAtenc` varchar(40) DEFAULT NULL,
  `horario` varchar(20) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tlocal`
--

INSERT INTO `tlocal` (`idLocal`, `administrador`, `diasAtenc`, `horario`, `direccion`) VALUES
(1, 'Esther Ramirez', 'L-M-V', '08:00-14:00', 'Jr. Garzón 145'),
(2, 'Karla Orbegoso', 'M-J-D', '08:00-17:00', 'Urb. Ate A-45'),
(3, 'Dina Quimper', 'L-V', '08:00-18:00', 'Calle KK 124'),
(4, 'Diana Janampa', 'L-V', '08:00-18:00', 'Urb. H-A24'),
(5, 'Gerardo Ramirez', 'L-M-V', '08:00-18:00', 'Calle Consuelo 124');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tproducto`
--

CREATE TABLE `tproducto` (
  `idProducto` int(11) NOT NULL,
  `descProd` varchar(60) DEFAULT NULL,
  `unidad` varchar(10) DEFAULT NULL,
  `precVenta` decimal(7,2) DEFAULT NULL,
  `stock` decimal(7,2) DEFAULT NULL,
  `stockMin` decimal(7,2) DEFAULT NULL,
  `idCategoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tproducto`
--

INSERT INTO `tproducto` (`idProducto`, `descProd`, `unidad`, `precVenta`, `stock`, `stockMin`, `idCategoria`) VALUES
(1, 'Lapicero Faber Castell', 'Und', '12.50', '100.00', '50.00', 1),
(2, 'Mouse 2 botones', 'Und', '24.00', '12.00', '6.00', 2),
(3, 'Transportador', 'Und', '2.70', '120.00', '25.00', 1),
(4, 'Regla 30 cm', 'Und', '2.80', '100.00', '60.65', 1),
(5, 'Colonia Bandido 200ml', 'Und', '75.25', '12', '3', 4),
(6, 'Oso de peluche pequeño', 'Und', '45.34', '6', '3', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tproveedor`
--

CREATE TABLE `tproveedor` (
  `idProveedor` int(11) NOT NULL,
  `razSocial` varchar(60) DEFAULT NULL,
  `direccion` varchar(60) DEFAULT NULL,
  `rucProveedor` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tabastece`
--
ALTER TABLE `tabastece`
  ADD PRIMARY KEY (`idAbastece`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `tcajero`
--
ALTER TABLE `tcajero`
  ADD PRIMARY KEY (`idCajero`),
  ADD KEY `idLocal` (`idLocal`);

--
-- Indices de la tabla `tcategoria`
--
ALTER TABLE `tcategoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `tcliente`
--
ALTER TABLE `tcliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `tcompra`
--
ALTER TABLE `tcompra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idCajero` (`idCajero`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indices de la tabla `tdetalleabastece`
--
ALTER TABLE `tdetalleabastece`
  ADD KEY `idAbastece` (`idAbastece`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `tdetallecompra`
--
ALTER TABLE `tdetallecompra`
  ADD KEY `idCompra` (`idCompra`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `tlocal`
--
ALTER TABLE `tlocal`
  ADD PRIMARY KEY (`idLocal`);

--
-- Indices de la tabla `tproducto`
--
ALTER TABLE `tproducto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `tproveedor`
--
ALTER TABLE `tproveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tabastece`
--
ALTER TABLE `tabastece`
  MODIFY `idAbastece` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tcajero`
--
ALTER TABLE `tcajero`
  MODIFY `idCajero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tcategoria`
--
ALTER TABLE `tcategoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tcliente`
--
ALTER TABLE `tcliente`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tcompra`
--
ALTER TABLE `tcompra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tlocal`
--
ALTER TABLE `tlocal`
  MODIFY `idLocal` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tproducto`
--
ALTER TABLE `tproducto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `tproveedor`
--
ALTER TABLE `tproveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tabastece`
--
ALTER TABLE `tabastece`
  ADD CONSTRAINT `tabastece_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `tproveedor` (`idProveedor`);

--
-- Filtros para la tabla `tcajero`
--
ALTER TABLE `tcajero`
  ADD CONSTRAINT `tcajero_ibfk_1` FOREIGN KEY (`idLocal`) REFERENCES `tlocal` (`idLocal`);

--
-- Filtros para la tabla `tcompra`
--
ALTER TABLE `tcompra`
  ADD CONSTRAINT `tcompra_ibfk_1` FOREIGN KEY (`idCajero`) REFERENCES `tcajero` (`idCajero`),
  ADD CONSTRAINT `tcompra_ibfk_2` FOREIGN KEY (`idCliente`) REFERENCES `tcliente` (`idCliente`);

--
-- Filtros para la tabla `tdetalleabastece`
--
ALTER TABLE `tdetalleabastece`
  ADD CONSTRAINT `tdetalleabastece_ibfk_1` FOREIGN KEY (`idAbastece`) REFERENCES `tabastece` (`idAbastece`),
  ADD CONSTRAINT `tdetalleabastece_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `tproducto` (`idProducto`);

--
-- Filtros para la tabla `tdetallecompra`
--
ALTER TABLE `tdetallecompra`
  ADD CONSTRAINT `tdetallecompra_ibfk_1` FOREIGN KEY (`idCompra`) REFERENCES `tcompra` (`idCompra`),
  ADD CONSTRAINT `tdetallecompra_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `tproducto` (`idProducto`);

--
-- Filtros para la tabla `tproducto`
--
ALTER TABLE `tproducto`
  ADD CONSTRAINT `tproducto_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `tcategoria` (`idCategoria`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
