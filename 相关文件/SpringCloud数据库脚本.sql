-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.5.60-log - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 clouddb01 的数据库结构
CREATE DATABASE IF NOT EXISTS `clouddb01` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clouddb01`;

-- 导出  表 clouddb01.dept 结构
CREATE TABLE IF NOT EXISTS `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='部门信息表';

-- 正在导出表  clouddb01.dept 的数据：~7 rows (大约)
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` (`deptno`, `dname`, `db_source`) VALUES
	(1, '开发部', 'clouddb01'),
	(2, '人事部', 'clouddb01'),
	(3, '财务部', 'clouddb01'),
	(4, '市场部', 'clouddb01'),
	(5, '运维部', 'clouddb01'),
	(6, '测试部', 'clouddb01'),
	(7, 'AI', 'clouddb01');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;


-- 导出 clouddb02 的数据库结构
CREATE DATABASE IF NOT EXISTS `clouddb02` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clouddb02`;

-- 导出  表 clouddb02.dept 结构
CREATE TABLE IF NOT EXISTS `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='部门信息表';

-- 正在导出表  clouddb02.dept 的数据：~6 rows (大约)
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` (`deptno`, `dname`, `db_source`) VALUES
	(1, '开发部', 'clouddb02'),
	(2, '人事部', 'clouddb02'),
	(3, '财务部', 'clouddb02'),
	(4, '市场部', 'clouddb02'),
	(5, '运维部', 'clouddb02'),
	(6, '测试部', 'clouddb02');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;


-- 导出 clouddb03 的数据库结构
CREATE DATABASE IF NOT EXISTS `clouddb03` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clouddb03`;

-- 导出  表 clouddb03.dept 结构
CREATE TABLE IF NOT EXISTS `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(60) DEFAULT NULL,
  `db_source` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`deptno`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='部门信息表';

-- 正在导出表  clouddb03.dept 的数据：~6 rows (大约)
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` (`deptno`, `dname`, `db_source`) VALUES
	(1, '开发部', 'clouddb03'),
	(2, '人事部', 'clouddb03'),
	(3, '财务部', 'clouddb03'),
	(4, '市场部', 'clouddb03'),
	(5, '运维部', 'clouddb03'),
	(6, '测试部', 'clouddb03');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
