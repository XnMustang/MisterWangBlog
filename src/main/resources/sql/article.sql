/*
 Navicat Premium Data Transfer

 Source Server         : 阿里云MySQL-5.7
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : 182.92.220.1:3306
 Source Schema         : mister_wang_blog

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 23/11/2020 11:05:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `articleId` int(11) NOT NULL COMMENT '文章id',
  `articleTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章标题',
  `categoryId` int(20) NOT NULL COMMENT '文章类型',
  `tagId` int(20) NOT NULL COMMENT '文章标签',
  `author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章作者',
  `publishDate` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '发布文章日期',
  `articleContent` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章内容',
  `articleHits` int(11) NOT NULL COMMENT '文章阅读数',
  `articleComment` int(11) NOT NULL COMMENT '文章评论数',
  `articleDigest` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文章摘要',
  `lastArticleId` int(20) NOT NULL COMMENT '上一篇文章id',
  `nextArticleId` int(20) NOT NULL COMMENT '下一篇文章id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES (1, 1001, '栈和队列', 1, 1, '王先生', '2019-02-11', '栈和队列的从入门到精通系列深度文章', 48, 12, '栈和队列的从入门到', 1000, 1002);
INSERT INTO `article` VALUES (2, 1002, 'Java基础总结', 2, 3, 'admin', '2020-10-03', 'JavaSE知识的全面总结，环境搭建到JDBC，全面的总i金额', 12, 9, 'Java基础知识总结复习', 1001, 1003);
INSERT INTO `article` VALUES (3, 1003, 'web前端开发技术路线', 3, 2, '夏末飘雪', '2020-03-11', '对于一个网站来说，CSS、JavaScript、Logo、图标这些静态资源文件更新的频率都比较低，而这些文件又几乎是每次HTTP请求都需要的，如果将这些文件缓存在浏览器中，可以极好地改善性能。通过header函数设置HTTP头中Cache-Control和Expires的属性，可设定浏览器缓存，缓存时间可以是数天、甚至是几个月。', 121, 98, '一般说来Web前端指网站业务逻辑之前的部分，包括浏览器加载、网站视图模型、图片服务、CDN服务等。主要优化手段有优化浏览器访问、使用反向代理、CDN等', 1002, 1004);
INSERT INTO `article` VALUES (4, 1004, 'Nginx的配置使用', 4, 2, 'admin', '2019-11-09', '对于互联网产品或长期运行的产品而言，运维工作非常重要，尤其是在产品复杂了以后，在这篇blog中就来说下Java应用的运维工作。\r\n码农按照需求开发好了一个全新的Java Web应用，该发布上线给用户用了，要把一个Java Web应用发布上线，首先需要搭建运行的环境，运行的环境需要有JDK、APPServer，在已经装好了os的机器上装上JDK和APPServer，开发好的Java Web应用可以用maven直接打成war或ear，将这个打好的包scp或其他方式到目标机器上，准备妥当，就差启动了。', 87, 12, '应用多了后，还会带来的问题是应用部署的规范性(同时也是为了降低运维的复杂性)，因为每个应用可能都会有一些特殊的配置，这个时候最好是能够通过搭建运行环境以及权限控制来保证一个应用部署后的目录控制。', 1003, 1004);
INSERT INTO `article` VALUES (5, 1005, '测试开发和测试的区别', 4, 1, '晨曦亖你', '2018-01-22', '这个名词一开始并不叫测试开发，只是说懂技术，懂研发的测试工程师，后来这个词又很长，再加上以前测试开发曾经在老的时代是有一个对应的词的，从微软的时代的时候，微软就把工程师称为软件工程师on testing，就是属于测试领域的一个开发工程师。后来这个词就慢慢的受到很多公司的采纳，之后测试开发这个词，逐渐的开始流行。', 9, 1, '在开始正文之前，我先抛出一个观点，做80%的做测试的，都称不上为测试工程师。', 1004, 1005);
INSERT INTO `article` VALUES (6, 1006, 'DBA到底每天都在做什么', 1, 2, 'DBA先生', '2019-02-11', 'DBA这个职位名称叫做数据库管理员，由名称可知对数据库肯定非常在行', 11, 8, '数据库管理员（Database Administrator，简称DBA），是从事管理和维护数据库管理系统(DBMS)的相关工作人员的统称，属于运维工程师的一个分支，主要负责业务数据库从设计、测试到部署交付的全生命周期管理。', 1005, 1007);

SET FOREIGN_KEY_CHECKS = 1;
