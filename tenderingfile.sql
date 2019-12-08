/*
Navicat MySQL Data Transfer

Source Server         : deg
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : ygbid

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2019-12-08 21:24:54
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `tenderingfile`
-- ----------------------------
DROP TABLE IF EXISTS `tenderingfile`;
CREATE TABLE `tenderingfile` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenderingprjid` int(11) DEFAULT NULL COMMENT '招标项目表 关联项目招标表的id号',
  `filepath` varchar(255) DEFAULT NULL COMMENT '对应文件的路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of tenderingfile
-- ----------------------------
INSERT INTO `tenderingfile` VALUES ('1', null, 'E:\\阳光采购招标询价系统\\a1.jpg');
INSERT INTO `tenderingfile` VALUES ('2', null, 'E:\\阳光采购招标询价系统\\a\\1.jpg');
INSERT INTO `tenderingfile` VALUES ('3', null, 'E:\\阳光采购招标询价系统\\a\\360截图20180620135916478.jpg');
INSERT INTO `tenderingfile` VALUES ('4', null, 'E:\\阳光采购招标询价系统\\a\\bootstrap.css');
INSERT INTO `tenderingfile` VALUES ('5', null, 'E:\\阳光采购招标询价系统\\a\\html笔记.doc');
INSERT INTO `tenderingfile` VALUES ('6', null, 'E:\\阳光采购招标询价系统\\a\\html笔记.doc');
INSERT INTO `tenderingfile` VALUES ('7', null, 'E:\\阳光采购招标询价系统\\a\\javascript笔记.doc');
INSERT INTO `tenderingfile` VALUES ('8', null, 'E:\\阳光采购招标询价系统\\a\\javascript笔记.doc');
INSERT INTO `tenderingfile` VALUES ('9', null, 'E:\\阳光采购招标询价系统\\a\\jquery4-5-6习题.doc');
INSERT INTO `tenderingfile` VALUES ('10', null, 'E:\\阳光采购招标询价系统\\a\\jdbc笔记.doc');
