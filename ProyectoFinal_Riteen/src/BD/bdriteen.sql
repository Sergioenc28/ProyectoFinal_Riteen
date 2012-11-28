/*
SQLyog Trial v10.3 
MySQL - 5.5.13 : Database - riteen
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`riteen` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `riteen`;

/*Table structure for table `almacen` */

DROP TABLE IF EXISTS `almacen`;

CREATE TABLE `almacen` (
  `idProducto` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(20) DEFAULT NULL,
  `Descripcion` tinytext,
  `idProveedor` int(11) DEFAULT NULL,
  `Costo` int(10) DEFAULT NULL,
  `PrecioDeVenta` int(10) DEFAULT NULL,
  `Existencia` int(11) DEFAULT NULL,
  `ExistenciaMinima` int(11) DEFAULT NULL,
  PRIMARY KEY (`idProducto`),
  KEY `idProveedor` (`idProveedor`),
  CONSTRAINT `almacen_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `proveedores` (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `almacen` */

insert  into `almacen`(`idProducto`,`Nombre`,`Descripcion`,`idProveedor`,`Costo`,`PrecioDeVenta`,`Existencia`,`ExistenciaMinima`) values (3,'resis','haahhahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa',1,892,832,2,1);

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Direccion` varchar(40) DEFAULT NULL,
  `Cedula` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

/*Data for the table `clientes` */

insert  into `clientes`(`idCliente`,`Nombre`,`Telefono`,`Direccion`,`Cedula`) values (2,'Harim Tejada','(809)-862-2593','cliente local','010-9283092-1'),(3,'dioni','(808)-186-8736','local en la habitacion','918-2739812-7'),(4,'willy','(102)-987-3012','aqui al lado','092-1873019-2'),(5,'roman ','(012)-983-1029','aquiiii lambiendo','019-2830192-8');

/*Table structure for table `cuentas_por_pagar` */

DROP TABLE IF EXISTS `cuentas_por_pagar`;

CREATE TABLE `cuentas_por_pagar` (
  `idCuentaXPagar` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `Descripcion` varchar(30) DEFAULT NULL,
  `Concepto` varchar(20) DEFAULT NULL,
  `Acreedor` varchar(20) DEFAULT NULL,
  `Plazo` varchar(10) DEFAULT NULL,
  `Total` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idCuentaXPagar`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `cuentas_por_pagar` */

insert  into `cuentas_por_pagar`(`idCuentaXPagar`,`Fecha`,`Descripcion`,`Concepto`,`Acreedor`,`Plazo`,`Total`) values (1,'2012-12-12','hola estoy haciendo mierda	','haha','harim','818','982'),(2,'2012-12-12','jsssssss','qiqoiqw','jaja','92','23');

/*Table structure for table `cuentasxcobrar` */

DROP TABLE IF EXISTS `cuentasxcobrar`;

CREATE TABLE `cuentasxcobrar` (
  `idCuentaXCobrar` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `Descripcion` varchar(59) DEFAULT NULL,
  `Concepto` varchar(40) DEFAULT NULL,
  `Cedula` varchar(15) DEFAULT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Deudor` varchar(30) DEFAULT NULL,
  `Plazo` varchar(20) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  PRIMARY KEY (`idCuentaXCobrar`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `cuentasxcobrar` */

insert  into `cuentasxcobrar`(`idCuentaXCobrar`,`Fecha`,`Descripcion`,`Concepto`,`Cedula`,`Telefono`,`Deudor`,`Plazo`,`total`) values (4,'2012-12-12','estoy haciendo mierda haha','828379817','309-8210398-1','(098)-123-0981','8283','82',12);

/*Table structure for table `detalles_facturas` */

DROP TABLE IF EXISTS `detalles_facturas`;

CREATE TABLE `detalles_facturas` (
  `idDetalle` int(11) NOT NULL AUTO_INCREMENT,
  `idFactura` int(11) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `Nombre` varchar(20) DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `Precio` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idDetalle`),
  KEY `idFactura` (`idFactura`),
  CONSTRAINT `detalles_facturas_ibfk_3` FOREIGN KEY (`idFactura`) REFERENCES `factura_cotando` (`idFactura`),
  CONSTRAINT `detalles_facturas_ibfk_4` FOREIGN KEY (`idFactura`) REFERENCES `factura_credito` (`idFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `detalles_facturas` */

/*Table structure for table `empleados` */

DROP TABLE IF EXISTS `empleados`;

CREATE TABLE `empleados` (
  `idEmpleado` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(40) DEFAULT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Direccion` varchar(40) DEFAULT NULL,
  `Cedula` varchar(15) DEFAULT NULL,
  `Sueldo` float DEFAULT NULL,
  `Horario` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idEmpleado`)
) ENGINE=InnoDB AUTO_INCREMENT=1191015 DEFAULT CHARSET=utf8;

/*Data for the table `empleados` */

insert  into `empleados`(`idEmpleado`,`Nombre`,`Telefono`,`Direccion`,`Cedula`,`Sueldo`,`Horario`) values (1191011,'89721638712','(198)-273-9182','0912830912','   -       - ',9218380000,'Dia Completo'),(1191012,'yo','(098)-108-9309','98123','091-8230981-2',7281,'Dia Completo'),(1191013,'roman ','(018)-093-8120','la romana','029-8340928-3',800,'Dia Completo'),(1191014,'Harim Tejada','(809)-862-2593','Trabajador local','019-2819281-9',3000,'Matutina');

/*Table structure for table `factura_cotando` */

DROP TABLE IF EXISTS `factura_cotando`;

CREATE TABLE `factura_cotando` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `NombreCliente` varchar(40) DEFAULT NULL,
  `Total` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `factura_cotando` */

/*Table structure for table `factura_credito` */

DROP TABLE IF EXISTS `factura_credito`;

CREATE TABLE `factura_credito` (
  `idFactura` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `NombreCliente` varchar(40) DEFAULT NULL,
  `DireccionCliente` varchar(60) DEFAULT NULL,
  `TelefonoCliente` int(11) DEFAULT NULL,
  `Plazo` varchar(20) DEFAULT NULL,
  `Total` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `factura_credito` */

/*Table structure for table `gastos` */

DROP TABLE IF EXISTS `gastos`;

CREATE TABLE `gastos` (
  `idGasto` int(11) NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `Responsable` varchar(20) DEFAULT NULL,
  `Concepto` varchar(20) DEFAULT NULL,
  `Total` varchar(10) DEFAULT NULL,
  `Descripcion` text,
  PRIMARY KEY (`idGasto`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `gastos` */

insert  into `gastos`(`idGasto`,`Fecha`,`Responsable`,`Concepto`,`Total`,`Descripcion`) values (3,'2012-12-12','harim','oiuo','89','u'),(4,'2012-12-12','hari','mierda','929','mierda'),(5,'2012-12-12','hari','haha','989','lskjdghflaksjfdhlaksjdhflaksjdhfl sakjdfhlkasjdhflkajsdh'),(6,'2012-12-12','hari','12/12/12','981','hlsgssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss');

/*Table structure for table `pedidos` */

DROP TABLE IF EXISTS `pedidos`;

CREATE TABLE `pedidos` (
  `idProducto` varchar(20) NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `Proveedor` varchar(20) DEFAULT NULL,
  KEY `idProducto` (`idProducto`),
  KEY `Proveedor` (`Proveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pedidos` */

insert  into `pedidos`(`idProducto`,`Cantidad`,`Proveedor`) values ('1',1,'11'),('mierda ',92,'caca');

/*Table structure for table `proveedores` */

DROP TABLE IF EXISTS `proveedores`;

CREATE TABLE `proveedores` (
  `idProveedor` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `Direccion` varchar(40) DEFAULT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  `Email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `proveedores` */

insert  into `proveedores`(`idProveedor`,`Nombre`,`Direccion`,`Telefono`,`Email`) values (1,'1','1','1','1'),(2,'HArim ','contacto','(309)-128-3091','harimtg.2@gmail.com'),(3,'jaja','0293842039','(   )-   -    ','0129\'09'),(4,'hhha','mierdaaa','(921)-380-1928','0923810928');

/*Table structure for table `recibos_de_reparacion` */

DROP TABLE IF EXISTS `recibos_de_reparacion`;

CREATE TABLE `recibos_de_reparacion` (
  `idRecibo` int(11) NOT NULL AUTO_INCREMENT,
  `FechaDeEntrega` date DEFAULT NULL,
  `Articulo` varchar(30) DEFAULT NULL,
  `Marca` varchar(20) DEFAULT NULL,
  `Modelo` varchar(20) DEFAULT NULL,
  `NombreCliente` varchar(40) DEFAULT NULL,
  `TelefonoCliente` varchar(15) DEFAULT NULL,
  `Plazo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idRecibo`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `recibos_de_reparacion` */

insert  into `recibos_de_reparacion`(`idRecibo`,`FechaDeEntrega`,`Articulo`,`Marca`,`Modelo`,`NombreCliente`,`TelefonoCliente`,`Plazo`) values (1,'2012-12-12','hola soy reparacion','toyoto','corla','harim','(019)-283-0912','01');

/*Table structure for table `usuarios` */

DROP TABLE IF EXISTS `usuarios`;

CREATE TABLE `usuarios` (
  `userName` varchar(15) DEFAULT NULL,
  `pass` varbinary(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuarios` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
