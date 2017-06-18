/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50536
Source Host           : 127.0.0.1:3306
Source Database       : maven

Target Server Type    : MYSQL
Target Server Version : 50536
File Encoding         : 65001

Date: 2017-06-18 23:16:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cst_customer
-- ----------------------------
DROP TABLE IF EXISTS `cst_customer`;
CREATE TABLE `cst_customer` (
  `cust_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
  `cust_name` varchar(32) NOT NULL COMMENT '客户名称(公司名称)',
  `cust_user_id` bigint(32) DEFAULT NULL COMMENT '负责人id',
  `cust_create_id` bigint(32) DEFAULT NULL COMMENT '创建人id',
  `cust_source` varchar(32) DEFAULT NULL COMMENT '客户信息来源',
  `cust_industry` varchar(32) DEFAULT NULL COMMENT '客户所属行业',
  `cust_level` varchar(32) DEFAULT NULL COMMENT '客户级别',
  `cust_linkman` varchar(64) DEFAULT NULL COMMENT '联系人',
  `cust_phone` varchar(64) DEFAULT NULL COMMENT '固定电话',
  `cust_mobile` varchar(16) DEFAULT NULL COMMENT '移动电话',
  `cust_createtime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`cust_id`),
  KEY `FK_cst_customer_source` (`cust_source`),
  KEY `FK_cst_customer_industry` (`cust_industry`),
  KEY `FK_cst_customer_level` (`cust_level`),
  KEY `FK_cst_customer_user_id` (`cust_user_id`),
  KEY `FK_cst_customer_create_id` (`cust_create_id`),
  CONSTRAINT `FK_cst_customer_create_id` FOREIGN KEY (`cust_create_id`) REFERENCES `sys_user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_cst_customer_industry` FOREIGN KEY (`cust_industry`) REFERENCES `base_dict` (`dict_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_cst_customer_level` FOREIGN KEY (`cust_level`) REFERENCES `base_dict` (`dict_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_cst_customer_source` FOREIGN KEY (`cust_source`) REFERENCES `base_dict` (`dict_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_cst_customer_user_id` FOREIGN KEY (`cust_user_id`) REFERENCES `sys_user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cst_customer
-- ----------------------------
INSERT INTO `cst_customer` VALUES ('1', '北京传智播客', null, null, '7', null, null, null, null, '1333333', null);
INSERT INTO `cst_customer` VALUES ('6', '北京黑马', null, null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('7', '郑州传智', null, null, '7', '1', '23', '', '', '', null);
INSERT INTO `cst_customer` VALUES ('10', '西安黑马', null, null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('11', '哈尔宾黑马', null, null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('12', '长沙黑马', null, null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('13', '昆明黑马', null, null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('14', '杭州黑马s', null, null, null, null, null, null, null, null, null);
INSERT INTO `cst_customer` VALUES ('22', '上海传智播客', null, null, '6', '2', '22', '黎活明', '', '', null);
INSERT INTO `cst_customer` VALUES ('23', '山东黑马程序员', null, null, '7', '2', '22', '王总', '', '', null);
INSERT INTO `cst_customer` VALUES ('24', '重庆传智播客', null, null, '7', '1', '23', '张总', '43332222', '144443333', null);
INSERT INTO `cst_customer` VALUES ('28', 'test', null, null, '6', '1', '22', '', '', '', '2016-03-08 17:22:23');
INSERT INTO `cst_customer` VALUES ('29', '重庆黑马', null, null, '6', '2', '22', '张总', '', '', '2016-03-10 15:22:48');
