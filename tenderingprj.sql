/*
Navicat MySQL Data Transfer

Source Server         : deg
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : ygbid

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2019-12-08 21:25:11
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `tenderingprj`
-- ----------------------------
DROP TABLE IF EXISTS `tenderingprj`;
CREATE TABLE `tenderingprj` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenderingtypeid` int(11) DEFAULT NULL COMMENT '招标类型(外键，引用招标类型表的id)',
  `userid` int(11) DEFAULT NULL COMMENT '招标项目发布人（默认是当前登陆用户）外键，引用后台用户表的id',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `body` varchar(255) DEFAULT NULL COMMENT '内容',
  `releasetime` varchar(255) DEFAULT NULL COMMENT '发布时间(发布项目的时候生成)',
  `supplierendtime` varchar(255) DEFAULT NULL COMMENT '截止时间（供应商投标结束时间）',
  `opentime` varchar(255) DEFAULT NULL COMMENT '开标时间',
  `supplierid` int(11) DEFAULT NULL COMMENT '中标单位(外键，引用供应商表的id)',
  `sign` int(11) DEFAULT NULL COMMENT '标志',
  `tenderingfileid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of tenderingprj
-- ----------------------------
INSERT INTO `tenderingprj` VALUES ('1', null, null, 'dfgd', 'dfgd', null, '2019-12-18', '2019-12-21', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('2', null, null, 'asdas', 'asdasd', null, '2019-12-18', '2019-12-13', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('3', null, null, 'asda', 'sada', null, '2019-12-24', '2019-12-19', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('4', null, null, 'dsfasd', 'asdasda', null, '2019-12-25', '2019-12-19', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('5', null, null, 'asdas', 'asdasdsf', null, '2019-12-17', '2019-12-25', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('6', null, null, 'asdas', 'asdasdasd', null, '2019-12-05', '2019-12-17', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('7', null, null, 'sdfsdf', 'sdfsdfsdf', null, '2019-12-10', '2019-12-25', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('8', null, null, 'sdfsdf', 'sdfsdfsdf', null, '2019-12-10', '2019-12-25', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('9', null, null, 'dasdas', 'asdasd', null, '2019-12-01', '2019-12-01', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('10', null, null, 'asdas', 'asdsad', null, '2019-12-01', '2019-12-01', null, '0', '8');
INSERT INTO `tenderingprj` VALUES ('11', null, '1', 'sdcsdf', 'sdfsdf', null, '2019-12-08', '2019-12-07', null, '0', '9');
INSERT INTO `tenderingprj` VALUES ('12', null, '1', '', '', null, '', '', null, '0', null);
INSERT INTO `tenderingprj` VALUES ('13', '1', '1', 'sada', 'asdasd', null, '2019-12-19', '2019-12-21', null, '0', '10');
