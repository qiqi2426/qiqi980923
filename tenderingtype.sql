/*
Navicat MySQL Data Transfer

Source Server         : deg
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : ygbid

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2019-12-08 21:25:18
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `tenderingtype`
-- ----------------------------
DROP TABLE IF EXISTS `tenderingtype`;
CREATE TABLE `tenderingtype` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenderingtypename` varchar(255) DEFAULT NULL COMMENT '招标类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of tenderingtype
-- ----------------------------
INSERT INTO `tenderingtype` VALUES ('1', 'java');
INSERT INTO `tenderingtype` VALUES ('2', 'mysql');
INSERT INTO `tenderingtype` VALUES ('3', 'c');
INSERT INTO `tenderingtype` VALUES ('4', 'html');
INSERT INTO `tenderingtype` VALUES ('5', 'python');
