/*
Navicat MySQL Data Transfer

Source Server         : deg
Source Server Version : 50703
Source Host           : localhost:3306
Source Database       : ygbid

Target Server Type    : MYSQL
Target Server Version : 50703
File Encoding         : 65001

Date: 2019-12-08 21:25:25
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `supplier`
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `suppliername` varchar(255) DEFAULT NULL COMMENT '供应商名字',
  `supplierpeople` varchar(255) DEFAULT NULL COMMENT '法人',
  `suppliermoney` int(11) DEFAULT NULL COMMENT '注册资金',
  `supplieraddress` varchar(255) DEFAULT NULL COMMENT '地址',
  `tel` varchar(255) DEFAULT NULL COMMENT '电话',
  `sign` int(11) DEFAULT NULL COMMENT '注册标志',
  `explain` varchar(255) DEFAULT NULL COMMENT '审核的意见',
  `suppliertypeid` int(11) DEFAULT NULL COMMENT '供应商类型',
  `tradetypeid` int(11) DEFAULT NULL COMMENT '行业类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1', 'java', '张某某', '1000000', '不知道', '4356454', '0', null, null, null);
INSERT INTO `supplier` VALUES ('2', '自行车', '萨达', '435345', '石家庄', '6873545', '0', null, null, null);
INSERT INTO `supplier` VALUES ('3', '安保', '毒法师', '9000080', '航海', '5785645', '0', null, null, null);
INSERT INTO `supplier` VALUES ('4', '水电费', 's\'f师傅说', '899999', '安德瑞', '4564564', '0', null, null, null);
INSERT INTO `supplier` VALUES ('5', '挨打', '敖德萨', '700000', '鬼画', '4356346', '0', null, null, null);
INSERT INTO `supplier` VALUES ('6', '撒打发', 'r人格化', '500000', '条件', '8743231', '0', null, null, null);
INSERT INTO `supplier` VALUES ('7', '阿斯达', 'd大树', '3432424', '刀飞', '5645642', '0', null, null, null);
INSERT INTO `supplier` VALUES ('8', 'f发给对方', '二分', '3454374', 'd地方', '7353453', '0', null, null, null);
INSERT INTO `supplier` VALUES ('9', null, null, null, null, null, null, null, null, null);
