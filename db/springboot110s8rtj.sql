-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot110s8rtj
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springboot110s8rtj`
--

/*!40000 DROP DATABASE IF EXISTS `springboot110s8rtj`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot110s8rtj` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot110s8rtj`;

--
-- Table structure for table `aboutus`
--

DROP TABLE IF EXISTS `aboutus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aboutus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `subtitle` varchar(200) DEFAULT NULL COMMENT '副标题',
  `content` longtext NOT NULL COMMENT '内容',
  `picture1` longtext COMMENT '图片1',
  `picture2` longtext COMMENT '图片2',
  `picture3` longtext COMMENT '图片3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='关于我们';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aboutus`
--

LOCK TABLES `aboutus` WRITE;
/*!40000 ALTER TABLE `aboutus` DISABLE KEYS */;
INSERT INTO `aboutus` VALUES (1,'2024-01-29 06:14:17','关于我们','ABOUT US','当你设想门外是寒冷可怕的世界时，你还应该开门出去看看，是否真的如此。如果你有信心，你对前途就不犹豫了。如果你有勇气，你就不怕前途是否有困难或危险了每个人心中都应有两盏灯，一盏是希望的灯，一盏是勇气的灯。有了这两盏灯，我们就不怕海上的黑暗和风涛的险恶了。人的一生很像是在雾中行走。远远望去，只是迷蒙一片，辨不出方向和吉凶。可是，当你鼓起勇气，放下恐惧和怀疑，一步一步向前走去的时候，你就会发现，每走一步，你都能把下一步路看得清楚一点。“往前走，别站在远远的地方观望！”你就可以找到你的方向。','upload/aboutus_picture1.jpg','upload/aboutus_picture2.jpg','upload/aboutus_picture3.jpg');
/*!40000 ALTER TABLE `aboutus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bingchonghaicuoshi`
--

DROP TABLE IF EXISTS `bingchonghaicuoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bingchonghaicuoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `bingchonghaileixing` varchar(200) DEFAULT NULL COMMENT '病虫害类型',
  `fangzhicuoshi` longtext COMMENT '防治措施',
  `jishuyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '技术员账号',
  `jishuyuan` varchar(200) DEFAULT NULL COMMENT '技术员',
  `jishuyuanshouji` varchar(200) DEFAULT NULL COMMENT '技术员手机',
  `tuijianshebei` varchar(200) DEFAULT NULL COMMENT '推荐设备',
  `tuijiannongyao` varchar(200) DEFAULT NULL COMMENT '推荐农药',
  `fengmiantupian` longtext NOT NULL COMMENT '封面图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='病虫害措施';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingchonghaicuoshi`
--

LOCK TABLES `bingchonghaicuoshi` WRITE;
/*!40000 ALTER TABLE `bingchonghaicuoshi` DISABLE KEYS */;
INSERT INTO `bingchonghaicuoshi` VALUES (121,'2024-01-29 06:14:16','标题1','虫害','防治措施1','技术员账号1','技术员1','技术员手机1','推荐设备1','推荐农药1','upload/bingchonghaicuoshi_fengmiantupian1.jpg,upload/bingchonghaicuoshi_fengmiantupian2.jpg,upload/bingchonghaicuoshi_fengmiantupian3.jpg'),(122,'2024-01-29 06:14:16','标题2','虫害','防治措施2','技术员账号2','技术员2','技术员手机2','推荐设备2','推荐农药2','upload/bingchonghaicuoshi_fengmiantupian2.jpg,upload/bingchonghaicuoshi_fengmiantupian3.jpg,upload/bingchonghaicuoshi_fengmiantupian4.jpg'),(123,'2024-01-29 06:14:16','标题3','虫害','防治措施3','技术员账号3','技术员3','技术员手机3','推荐设备3','推荐农药3','upload/bingchonghaicuoshi_fengmiantupian3.jpg,upload/bingchonghaicuoshi_fengmiantupian4.jpg,upload/bingchonghaicuoshi_fengmiantupian5.jpg'),(124,'2024-01-29 06:14:16','标题4','虫害','防治措施4','技术员账号4','技术员4','技术员手机4','推荐设备4','推荐农药4','upload/bingchonghaicuoshi_fengmiantupian4.jpg,upload/bingchonghaicuoshi_fengmiantupian5.jpg,upload/bingchonghaicuoshi_fengmiantupian6.jpg'),(125,'2024-01-29 06:14:16','标题5','虫害','防治措施5','技术员账号5','技术员5','技术员手机5','推荐设备5','推荐农药5','upload/bingchonghaicuoshi_fengmiantupian5.jpg,upload/bingchonghaicuoshi_fengmiantupian6.jpg,upload/bingchonghaicuoshi_fengmiantupian7.jpg'),(126,'2024-01-29 06:14:16','标题6','虫害','防治措施6','技术员账号6','技术员6','技术员手机6','推荐设备6','推荐农药6','upload/bingchonghaicuoshi_fengmiantupian6.jpg,upload/bingchonghaicuoshi_fengmiantupian7.jpg,upload/bingchonghaicuoshi_fengmiantupian8.jpg'),(127,'2024-01-29 06:14:16','标题7','虫害','防治措施7','技术员账号7','技术员7','技术员手机7','推荐设备7','推荐农药7','upload/bingchonghaicuoshi_fengmiantupian7.jpg,upload/bingchonghaicuoshi_fengmiantupian8.jpg,upload/bingchonghaicuoshi_fengmiantupian9.jpg'),(128,'2024-01-29 06:14:16','标题8','虫害','防治措施8','技术员账号8','技术员8','技术员手机8','推荐设备8','推荐农药8','upload/bingchonghaicuoshi_fengmiantupian8.jpg,upload/bingchonghaicuoshi_fengmiantupian9.jpg,upload/bingchonghaicuoshi_fengmiantupian10.jpg');
/*!40000 ALTER TABLE `bingchonghaicuoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bingchonghaifangzhi`
--

DROP TABLE IF EXISTS `bingchonghaifangzhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bingchonghaifangzhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `zhongzhimianji` varchar(200) DEFAULT NULL COMMENT '种植面积(㎡)',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `zuowumingcheng` varchar(200) DEFAULT NULL COMMENT '作物名称',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `bingchongtupian` longtext COMMENT '病虫图片',
  `bingchonghaizhonglei` varchar(200) NOT NULL COMMENT '病虫害种类',
  `fangzhishijian` date DEFAULT NULL COMMENT '防治时间',
  `fangzhicuoshi` longtext COMMENT '防治措施',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8 COMMENT='病虫害防治';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bingchonghaifangzhi`
--

LOCK TABLES `bingchonghaifangzhi` WRITE;
/*!40000 ALTER TABLE `bingchonghaifangzhi` DISABLE KEYS */;
INSERT INTO `bingchonghaifangzhi` VALUES (71,'2024-01-29 06:14:16','地块编号1','种植面积(㎡)1','农场主账号1','农场主1','作物名称1','种植户账号1','种植户1','upload/bingchonghaifangzhi_bingchongtupian1.jpg,upload/bingchonghaifangzhi_bingchongtupian2.jpg,upload/bingchonghaifangzhi_bingchongtupian3.jpg','病毒类','2024-01-29','防治措施1'),(72,'2024-01-29 06:14:16','地块编号2','种植面积(㎡)2','农场主账号2','农场主2','作物名称2','种植户账号2','种植户2','upload/bingchonghaifangzhi_bingchongtupian2.jpg,upload/bingchonghaifangzhi_bingchongtupian3.jpg,upload/bingchonghaifangzhi_bingchongtupian4.jpg','病毒类','2024-01-29','防治措施2'),(73,'2024-01-29 06:14:16','地块编号3','种植面积(㎡)3','农场主账号3','农场主3','作物名称3','种植户账号3','种植户3','upload/bingchonghaifangzhi_bingchongtupian3.jpg,upload/bingchonghaifangzhi_bingchongtupian4.jpg,upload/bingchonghaifangzhi_bingchongtupian5.jpg','病毒类','2024-01-29','防治措施3'),(74,'2024-01-29 06:14:16','地块编号4','种植面积(㎡)4','农场主账号4','农场主4','作物名称4','种植户账号4','种植户4','upload/bingchonghaifangzhi_bingchongtupian4.jpg,upload/bingchonghaifangzhi_bingchongtupian5.jpg,upload/bingchonghaifangzhi_bingchongtupian6.jpg','病毒类','2024-01-29','防治措施4'),(75,'2024-01-29 06:14:16','地块编号5','种植面积(㎡)5','农场主账号5','农场主5','作物名称5','种植户账号5','种植户5','upload/bingchonghaifangzhi_bingchongtupian5.jpg,upload/bingchonghaifangzhi_bingchongtupian6.jpg,upload/bingchonghaifangzhi_bingchongtupian7.jpg','病毒类','2024-01-29','防治措施5'),(76,'2024-01-29 06:14:16','地块编号6','种植面积(㎡)6','农场主账号6','农场主6','作物名称6','种植户账号6','种植户6','upload/bingchonghaifangzhi_bingchongtupian6.jpg,upload/bingchonghaifangzhi_bingchongtupian7.jpg,upload/bingchonghaifangzhi_bingchongtupian8.jpg','病毒类','2024-01-29','防治措施6'),(77,'2024-01-29 06:14:16','地块编号7','种植面积(㎡)7','农场主账号7','农场主7','作物名称7','种植户账号7','种植户7','upload/bingchonghaifangzhi_bingchongtupian7.jpg,upload/bingchonghaifangzhi_bingchongtupian8.jpg,upload/bingchonghaifangzhi_bingchongtupian9.jpg','病毒类','2024-01-29','防治措施7'),(78,'2024-01-29 06:14:16','地块编号8','种植面积(㎡)8','农场主账号8','农场主8','作物名称8','种植户账号8','种植户8','upload/bingchonghaifangzhi_bingchongtupian8.jpg,upload/bingchonghaifangzhi_bingchongtupian9.jpg,upload/bingchonghaifangzhi_bingchongtupian10.jpg','病毒类','2024-01-29','防治措施8');
/*!40000 ALTER TABLE `bingchonghaifangzhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cangchu`
--

DROP TABLE IF EXISTS `cangchu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cangchu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yongpinbianhao` varchar(200) DEFAULT NULL COMMENT '用品编号',
  `yongpinmingcheng` varchar(200) NOT NULL COMMENT '用品名称',
  `yongpinleixing` varchar(200) DEFAULT NULL COMMENT '用品类型',
  `kucun` int(11) DEFAULT NULL COMMENT '库存',
  `gongyingshang` varchar(200) NOT NULL COMMENT '供应商',
  `yongpintupian` longtext COMMENT '用品图片',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=179 DEFAULT CHARSET=utf8 COMMENT='仓储';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cangchu`
--

LOCK TABLES `cangchu` WRITE;
/*!40000 ALTER TABLE `cangchu` DISABLE KEYS */;
INSERT INTO `cangchu` VALUES (171,'2024-01-29 06:14:16','用品编号1','用品名称1','种子',1,'供应商1','upload/cangchu_yongpintupian1.jpg,upload/cangchu_yongpintupian2.jpg,upload/cangchu_yongpintupian3.jpg','农场主账号1'),(172,'2024-01-29 06:14:16','用品编号2','用品名称2','种子',2,'供应商2','upload/cangchu_yongpintupian2.jpg,upload/cangchu_yongpintupian3.jpg,upload/cangchu_yongpintupian4.jpg','农场主账号2'),(173,'2024-01-29 06:14:16','用品编号3','用品名称3','种子',3,'供应商3','upload/cangchu_yongpintupian3.jpg,upload/cangchu_yongpintupian4.jpg,upload/cangchu_yongpintupian5.jpg','农场主账号3'),(174,'2024-01-29 06:14:16','用品编号4','用品名称4','种子',4,'供应商4','upload/cangchu_yongpintupian4.jpg,upload/cangchu_yongpintupian5.jpg,upload/cangchu_yongpintupian6.jpg','农场主账号4'),(175,'2024-01-29 06:14:16','用品编号5','用品名称5','种子',5,'供应商5','upload/cangchu_yongpintupian5.jpg,upload/cangchu_yongpintupian6.jpg,upload/cangchu_yongpintupian7.jpg','农场主账号5'),(176,'2024-01-29 06:14:16','用品编号6','用品名称6','种子',6,'供应商6','upload/cangchu_yongpintupian6.jpg,upload/cangchu_yongpintupian7.jpg,upload/cangchu_yongpintupian8.jpg','农场主账号6'),(177,'2024-01-29 06:14:16','用品编号7','用品名称7','种子',7,'供应商7','upload/cangchu_yongpintupian7.jpg,upload/cangchu_yongpintupian8.jpg,upload/cangchu_yongpintupian9.jpg','农场主账号7'),(178,'2024-01-29 06:14:16','用品编号8','用品名称8','种子',8,'供应商8','upload/cangchu_yongpintupian8.jpg,upload/cangchu_yongpintupian9.jpg,upload/cangchu_yongpintupian10.jpg','农场主账号8');
/*!40000 ALTER TABLE `cangchu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=239 DEFAULT CHARSET=utf8 COMMENT='在线咨询';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (231,'2024-01-29 06:14:17',1,1,'提问1','回复1',1),(232,'2024-01-29 06:14:17',2,2,'提问2','回复2',2),(233,'2024-01-29 06:14:17',3,3,'提问3','回复3',3),(234,'2024-01-29 06:14:17',4,4,'提问4','回复4',4),(235,'2024-01-29 06:14:17',5,5,'提问5','回复5',5),(236,'2024-01-29 06:14:17',6,6,'提问6','回复6',6),(237,'2024-01-29 06:14:17',7,7,'提问7','回复7',7),(238,'2024-01-29 06:14:17',8,8,'提问8','回复8',8);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chatmessage`
--

DROP TABLE IF EXISTS `chatmessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chatmessage` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `uid` bigint(20) NOT NULL COMMENT '用户ID',
  `fid` bigint(20) NOT NULL COMMENT '好友用户ID',
  `content` varchar(200) DEFAULT NULL COMMENT '内容',
  `format` int(11) DEFAULT NULL COMMENT '格式(1:文字，2:图片)',
  `isread` int(11) DEFAULT '0' COMMENT '消息已读(0:未读，1:已读)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='消息表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chatmessage`
--

LOCK TABLES `chatmessage` WRITE;
/*!40000 ALTER TABLE `chatmessage` DISABLE KEYS */;
/*!40000 ALTER TABLE `chatmessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COMMENT '头像',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  `istop` int(11) DEFAULT '0' COMMENT '是否置顶',
  `toptime` datetime DEFAULT NULL COMMENT '置顶时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=249 DEFAULT CHARSET=utf8 COMMENT='论坛';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (241,'2024-01-29 06:14:17','帖子标题1','帖子内容1',0,1,'用户名1','upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg','开放',0,'2024-01-29 14:14:17'),(242,'2024-01-29 06:14:17','帖子标题2','帖子内容2',0,2,'用户名2','upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg','开放',0,'2024-01-29 14:14:17'),(243,'2024-01-29 06:14:17','帖子标题3','帖子内容3',0,3,'用户名3','upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg','开放',0,'2024-01-29 14:14:17'),(244,'2024-01-29 06:14:17','帖子标题4','帖子内容4',0,4,'用户名4','upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg','开放',0,'2024-01-29 14:14:17'),(245,'2024-01-29 06:14:17','帖子标题5','帖子内容5',0,5,'用户名5','upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg','开放',0,'2024-01-29 14:14:17'),(246,'2024-01-29 06:14:17','帖子标题6','帖子内容6',0,6,'用户名6','upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg','开放',0,'2024-01-29 14:14:17'),(247,'2024-01-29 06:14:17','帖子标题7','帖子内容7',0,7,'用户名7','upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg','开放',0,'2024-01-29 14:14:17'),(248,'2024-01-29 06:14:17','帖子标题8','帖子内容8',0,8,'用户名8','upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg,upload/forum_avatarurl10.jpg','开放',0,'2024-01-29 14:14:17');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friend`
--

DROP TABLE IF EXISTS `friend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `friend` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `uid` bigint(20) NOT NULL COMMENT '用户ID',
  `fid` bigint(20) NOT NULL COMMENT '好友用户ID',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `role` varchar(200) DEFAULT NULL COMMENT '角色',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `alias` varchar(200) DEFAULT NULL COMMENT '别名',
  `type` int(11) DEFAULT '0' COMMENT '类型(0:好友申请，1:好友，2:消息)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='好友表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend`
--

LOCK TABLES `friend` WRITE;
/*!40000 ALTER TABLE `friend` DISABLE KEYS */;
/*!40000 ALTER TABLE `friend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friendlink`
--

DROP TABLE IF EXISTS `friendlink`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `friendlink` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext COMMENT '图片',
  `url` longtext COMMENT '链接',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='友情链接';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friendlink`
--

LOCK TABLES `friendlink` WRITE;
/*!40000 ALTER TABLE `friendlink` DISABLE KEYS */;
INSERT INTO `friendlink` VALUES (1,'2024-01-29 06:14:17','爱奇艺','upload/fl_aqy.png','https://www.iqiyi.com/'),(2,'2024-01-29 06:14:17','百度','upload/fl_bd.png','https://www.baidu.com/'),(3,'2024-01-29 06:14:17','京东','upload/fl_jd.png','https://www.jd.com/'),(4,'2024-01-29 06:14:17','搜狐','upload/fl_sh.png','https://www.sohu.com/'),(5,'2024-01-29 06:14:17','腾讯','upload/fl_tx.png','https://www.qq.com/'),(6,'2024-01-29 06:14:17','网易','upload/fl_wy.png','https://www.163.com/'),(7,'2024-01-29 06:14:17','新浪','upload/fl_xl.png','https://www.sina.com.cn/'),(8,'2024-01-29 06:14:17','知乎','upload/fl_zh.png','https://www.zhihu.com/');
/*!40000 ALTER TABLE `friendlink` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `typename` varchar(200) DEFAULT NULL COMMENT '分类名称',
  `name` varchar(200) DEFAULT NULL COMMENT '发布人',
  `headportrait` longtext COMMENT '头像',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  `picture` longtext NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=279 DEFAULT CHARSET=utf8 COMMENT='公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (271,'2024-01-29 06:14:17','趁着年轻，输得起，看得开，去经历','我在大学一年级那一年，毫无悬念地把自己吃成了一个胖子。不是那种巨大的胖子，而是介于正规的肥胖和臃肿之间的尴尬体型，比标准体型重了15斤。于是，我的整个大学生活变成了电影《蝴蝶效应》系列，那只蝴蝶重达15斤','分类名称1','发布人1','upload/news_headportrait1.jpg',1,'2024-01-29 14:14:17',1,1,1,'upload/news_picture1.jpg','<p>我在大学一年级那一年，毫无悬念地把自己吃成了一个胖子。不是那种巨大的胖子，而是介于正规的肥胖和臃肿之间的尴尬体型，比标准体型重了15斤。于是，我的整个大学生活变成了电影《蝴蝶效应》系列，那只蝴蝶重达15斤。</p><p>  首先，我皈依了减肥。我可以整整一天滴水不进，然后第二天中午，一个小时之内连续去三个食堂吃午饭，每次都是两荤一素、一两米饭加一瓶大可乐，像是一个人孢子分裂出了三个暴食症患者。其次，因为要么饿得百爪挠心，要么撑得寝食难安，我变成了一个昼夜颠倒的人，再加上觉得自己邋遢难看，不愿见人，便逃掉了很多课。其三，逃课的空虚让我花了大量时间网购，击败了全国90%以上的电商消费者，和快递员结下了深厚的友谊。我买的大多数是衣服，衣服又穿不进，羞愤难当，继续皈依减肥。总之，那是我非常不快乐的几年。因为难以接受自己，所以蜷缩着，拒绝他人。</p><p>    我很久之后才知道，人用来自憎的大脑边缘系统，在童年时就已经形成。可是，用来开导自己、原谅自己、使自己变得强大的智慧，却往往在我们本该成熟的年纪依然不具备。每一世代的年轻人都是脆弱的、敏感的、容易受他人影响的。而对于正年轻的一代来说，这个挑战异乎寻常的艰难。</p><p> 电影《楚门的世界》中提出了一个假设以及相应的解答:当一个人活在所有人的窥探之下，他应该怎么办?答案是:他逃走，获得自由。然而，如果所有人活在所有人的窥探之下，那又该如何逃避?这不是假设，而是正在悄然发生的现实。我们无时无刻不在朋友圈、微博、贴吧、个人主页上展现自己的生活，同时，也在同样的平台上窥探他人的生活。我们无时无刻不在评估他人，同时，也在接受他人的评估。“个性张扬”只是狐假虎威的外衣，为的是掩饰自卑与自恋此起彼伏、相爱相杀的脆弱。我们羡慕嫉妒他人，也努力把自己的生活修饰得让他人羡慕嫉妒。我们对他人的意见过于敏感，无法忍受不被“点赞”的人生。</p><p>  社交网络的核心在于“社交”，社交的动力，是出于人们无法忍受孤独;人们之所以无法忍受孤独，是因为人们无法拷问自己。可是，总有一天，我们要站在镜子前，发现我们并不是自己创造出来的那个有趣、可爱、有吸引力、有能力的人。那么，你还喜欢镜子里的自己吗?或者，镜子里的你还喜欢自己吗?这个世界是否称赞你、羡慕你、爱你，在某种程度上是个不断膨胀的谎言。关键的问题在于，你是否对自己足够诚实，并且接受诚实之后的不完美。</p><p>   失去的痛苦、被拒绝的痛苦、被伤害的痛苦、分别的痛苦，它们如此显眼地横在前行的路上，让人想逃遁到那个充满着“赞”的虚幻世界里。然而，我们是人，走在一条从摇篮到坟墓的路上，年轻在途中，衰老在途中。必须和真实的世界发生联系，而不是兀自为尚未发生的事情恐惧;必须和真实的人发生各种关系，而不是如一座座只能遥远眺望的孤岛。</p><p>那些杀不死我们的，它们有时并不会让我们更加强大，而只是成为一段诗意或自嘲的记忆。趁着年轻，输得起，看得开，去经历。那些杀不死我们的，它们在混沌而无序的未来里，并不能成为我们手中的武器，却为我们的存活，增加了反抗脆弱与敏感的韧性。</p>'),(272,'2024-01-29 06:14:17','大学就该抓住青春，用汗水实现梦想','大学之青春，人生之春，人生之王，人生之华也，宝贵的时光我们理当去珍惜。然而，当我们在青春布满藤墓的围墙上缓慢的攀行时;依旧游离在青春摇摆不定的尾巴上时;奋力想抓却抓不住，用力一扯，却又是散落一地的音符时;我们是否该回头思考了。零零碎碎的记忆，偶尔会闪过寂寞的长空，飘然在无际的苍穹，仅仅留下几颗闪烁的残星让我们自己深思，青春易逝，好比东逝的水—去不复还','分类名称2','发布人2','upload/news_headportrait2.jpg',2,'2024-01-29 14:14:17',2,2,2,'upload/news_picture2.jpg','<p>  大学之青春，人生之春，人生之王，人生之华也，宝贵的时光我们理当去珍惜。然而，当我们在青春布满藤墓的围墙上缓慢的攀行时;依旧游离在青春摇摆不定的尾巴上时;奋力想抓却抓不住，用力一扯，却又是散落一地的音符时;我们是否该回头思考了。零零碎碎的记忆，偶尔会闪过寂寞的长空，飘然在无际的苍穹，仅仅留下几颗闪烁的残星让我们自己深思，青春易逝，好比东逝的水—去不复还。</p><p>  青春是属于我们的，是人生最最美好的时光。我们应该好好把握住现在象牙塔的点点滴滴。大学对于我们来说很重要，这里充满了好奇、机遇和挑战。当我懵懵懂懂的走过了两年才突然发现原来大学是这样的，每个人有不同的选择，有不同的理想，也有不同的人生。但是无论怎样都是一个博学的过程，学做人，学知识，学生活..…...春是疯狂的，是充满激情的，是奋斗的，最重要的是我们要坚定我们的梦想，为了梦想付出一切，为了梦想坚持到底，这才是真正的青春。青春的梦想就是黑夜里的灯塔在我们迷茫时给予我们方向，就是力量的源泉在我们身陷逆境时给予我们最大的动力，就是爱的港湾在我们屡次失败时给予我们受伤的心灵以安慰。因此无论何时何地，都不能忘却心里坚守的那份沉甸甸的梦想。</p><p>   青春的梦想很简单，可能是梦想成为学习的佼佼者让GPA无限趋于4.0，可能是梦想成为学生工作的杰出者当上主席为自己的从政事业奠定基础，也可能是梦想成为运动场上的超级明星拥有大量的球迷粉丝，也可能是梦想成为职场达人，面试无压力，就业有保障...….或许你觉得这些都算不上梦想，其实梦想并不分大小和轻重，不能说只有中国梦才算是梦想，梦想就是这样每个人有不同的定位，但都是值得去追逐的，去为之奋斗的。()拥有了梦想，就有了坚定的信念，海风再大海浪再大，也无法扼杀我们追逐胜利的信念。信念给我们坚持的勇气，勇气赐我们昂扬的斗志，斗志带我们摆脱厄运;拥有了梦想，就能化压力为动力，梦想会时刻在鞭策我们，鼓励我们，让我们审视自己，发现不足，奋力补救，让自己保持不懈的前进动力;拥有了梦想，我们就不会在迷茫的路上更加迷茫，我们就能在青春之歌复杂的五线谱中听到动人的旋律。</p><p>   我们是大学生，是祖国的未来，是民族复兴的脊梁，面对如此重任，怎么能不胸怀大志，坚定梦想，在青春的道路上奋斗。“恰同学少年，风华正茂，书生意气，挥斥方道。”青春是黄金时段，我们要以梦想为方向，扬帆起航，努力拼搏，给我们即将失去的青春以最好的结局。人因梦想而伟大，让我们一起奏响青春的梦想之歌，为各自的梦想努力进发吧!</p>'),(273,'2024-01-29 06:14:17','留退路就没有出路','公元前一世纪，凯撒大帝率领他的军队抵达了英格兰，他决心要赢得这场战争，不管遇到什么情况都不会退却。为了让士兵们明白自己必胜的决心和信心，也为了断绝士兵们逃跑退缩的念头，凯撒命令士兵将运载他们的所有船只都烧毁。这使得军队的士气受到了莫大的鼓舞。后来他们获胜了','分类名称3','发布人3','upload/news_headportrait3.jpg',3,'2024-01-29 14:14:17',3,3,3,'upload/news_picture3.jpg','<p>  公元前一世纪，凯撒大帝率领他的军队抵达了英格兰，他决心要赢得这场战争，不管遇到什么情况都不会退却。为了让士兵们明白自己必胜的决心和信心，也为了断绝士兵们逃跑退缩的念头，凯撒命令士兵将运载他们的所有船只都烧毁。这使得军队的士气受到了莫大的鼓舞。后来他们获胜了。</p><p>  很多人在处理重要问题的时候，总是喜欢把这些问题暂且搁置在一边，等以后再做。他们没有决定的勇气和魄力，总是在着手做事的时候想给自己留一条后路，以免没有出路。对于他们来说，退路就是出路。但是，事实证明，这样是不会有任何成就的。</p><p>背水一战、破釜沉舟的军队往往能获得胜利。同样，一个做事不留退路、一心向前的人，不管遇到什么困难和障碍，他都不会后退，因为他没有路可以退。而那些人在为自己准备退路的同时就是在后退，他们立志不坚，把精力和时间投入到退缩的准备上，这种人绝不会获得成功。</p><p>  一个人能否成功，关键在于他意志力的强弱。意志坚强的人不管遇到什么困难和障碍，都会百折不挠，想方设法地克服;意志薄弱的人一遇到麻烦，甚至在挫折还没有到来之前，他们就开始庸人自扰，彷徨失措，把精力都放在如何规避问题上，放在为自己铺设后路上。当困难一个接一个来时，他们就一步接一步后退，最后他们终将无路可退。</p><p>现实生活中，到处都充斥着这样的青年，他们富有上进心，希望有一番成就和作为，但是他们意志薄弱，没有必胜的决心，不敢破釜沉舟;他们始终左摇右摆，没有坚定的信念，一遇到挫折和困难，马上就缩回了进取的手和脚。这样的人，这样的心态，最后遭受失败也不足为奇。</p><p>   不给自己留后路，让自己没有回旋的余地，方能竭尽全力，锐意进取，就算遇到千万困难，也不会退缩，因为回头也没有路了，不如不顾一切地前进，还能找到一线希望。有了这样一种“拼命”和“豁出去”了的信念，才能彻彻底底地消除心中的恐惧、犹豫、胆怯。当一个人不给自己任何退路的时候，他就什么都不怕了，勇气、信心、热忱等从心底油然而生，到最后自然能“置之死地而后生”。</p><p>    面对严峻的问题和重要环节，周全而细致地考虑问题的各个方面也是应该的，但是过多地权衡，前怕狼后怕虎，一会儿这样一会儿那样，最终却还是原样，可以肯定地说，你不会有任何进展，甚至还会变得—塌糊涂。</p><p>出路和退路不是同义词，而是反义词，留退路就没有出路，因此，你应该只找出路，不留退路。大学生励志青春文章:培养积极的思维模式。</p>'),(274,'2024-01-29 06:14:17','在大学给自己定个目标','最近和几名大一的学生聊天，几名同学认为身边的人普遍都很迷茫，不知道该干什么，业余时间要么是对着电脑、要么是抱着手机刷微博。我问道:“为什么不找点事情做做，制定一个计划，哪怕是锻炼身体也好?4年也可以把身体锻炼得结实些。”当然，我也清楚，我的这些建议对他们来说，未必能有多大用。许多学生因为意志不坚定，没有老师的监督、逼迫，根本就无法做到','分类名称4','发布人4','upload/news_headportrait4.jpg',4,'2024-01-29 14:14:17',4,4,4,'upload/news_picture4.jpg','<p>  最近和几名大一的学生聊天，几名同学认为身边的人普遍都很迷茫，不知道该干什么，业余时间要么是对着电脑、要么是抱着手机刷微博。我问道:“为什么不找点事情做做，制定一个计划，哪怕是锻炼身体也好?4年也可以把身体锻炼得结实些。”当然，我也清楚，我的这些建议对他们来说，未必能有多大用。许多学生因为意志不坚定，没有老师的监督、逼迫，根本就无法做到。</p><p>   这让我想到前段时间蹿红网络的“悔过励志帖”——《同学，我大四了》，作者回首自己的大学4年，他感叹投入精力“充其量不过40%”︰每天上网时间少则4个小时，多则10个小时;考试永远是画画重点，在高呼“60分万岁”中与奖学金无缘。作者借自己求职受挫，写帖子以警醒后来人，不要等毕业时再后悔，就业难不仅仅是大学、社会的问题，也是自身的问题。</p><p>  也许，这样的大学生不是一个两个，而是一个群体。然而，我总是怀疑这样的励志帖，甚至教师在课堂上苦口婆心地劝说，能对现实中的大学和大学生起到多大的影响和作用，很多时候恐怕只有“三分钟热度”的效应。毕竟，现实的窘境不是一天积累起来的，从小学到高中，学生们的学习都是被动地接受应试，隐藏着功利性的目的，也许从没有为主动学习感到过快乐，而在高中时代，有的教师甚至打出这样的励志宣言:等你考上大学，你就可以想干什么干什么了..…..乎，高中时代的目标是很清晰的，就是为了考上大学，而在一些高中生的眼里，大学甚至就好比是天堂，进了大学的门就可以放轻松了。</p><p> 此前，有很多声音都认为大学越来越像培训机构，功利性学习正在整个大学蔓延，考证热、过早地职业化都是大学功利性学习最好的表现形式。在这种批判的声音中，“培训机构”总有被贬低的意味，难与大学之学术思想殿堂的高雅相媲美。但是，在这种批判的背后，还有一个现实问题被遮蔽，那就是很多大学生对自己的学习、对大学生活没有任何目标。</p><p>暨南大学舆情研究中心曾就“当代广州大学生生活与思想现状”作过详细的问卷调查，其中，接受调查的广州高校在读本科生共有191份有效样本，就“读大学的原因”、“大学第一印象”、“专业选择首要因素”等问题制作问卷调查并进行分析。结果显示，在未来规划方面，73.3%的同学表示只有粗略的想法，并无非常明确的目标。</p><p>  如果说功利化的学习毕竟还有一个前进的目标，至少能体现出一种为了目标而奋斗的精神和奔头，而没有任何目标，漫无目的地混日子则更可怕，它体现的是一种虚无、意义的缺失。说实话，没有引导学生树立明确的奋斗目标、进而指引学生为之努力的大学，学生很难找到努力的方向，也找不到努力的意义，这还不如“培训机构”来得实在、来得有效用，至少，培训机构的目标很清晰，它能够给学生们一个实实在在看得见的效果，而没有任何目标、浑浑噩噩的大学生活，也许只会给很多学生带来悔过。</p><p>无论如何，混日子的大学生活是不可取的。一方面，高校应该在新生入学的时候，作好目标和方向的引导，甚至贯穿大学4年的学习过程;另一方面，还在迷途的大学生，应尽早为自己找个前进的方向，作好自我规划，对自己的未来和前途负责。</p>'),(275,'2024-01-29 06:14:17','做个真正的学生','最坚强的人，是以宽容的态度面对自己缺点的人，而懦弱的人，则不敢面对自己的缺点，最终自暴自弃，葬送自己。只要有进取心，我们都能从失败的领域中，发现到达成功的途径;只要有自信心，我们身上的每一个缺陷，也都可以成为与众不同的优点','分类名称5','发布人5','upload/news_headportrait5.jpg',5,'2024-01-29 14:14:17',5,5,5,'upload/news_picture5.jpg','<p>  最坚强的人，是以宽容的态度面对自己缺点的人，而懦弱的人，则不敢面对自己的缺点，最终自暴自弃，葬送自己。只要有进取心，我们都能从失败的领域中，发现到达成功的途径;只要有自信心，我们身上的每一个缺陷，也都可以成为与众不同的优点。</p><p>曾经有人特地赶赴日本，向三宅一生服装设计大师请教如何设计出独具一格的服装款式。三宅一生大师提出两个很有意思的观点:一是，设计的衣服，其实都是没有全部完成的，其余的创作空间，则是留给穿衣服的人去完成的;二是，选择布料时，会请厂商提供纺织、印染失败的布料，从这些“残次”的作品中寻找泉涌般的创作灵感，设计出最具独创性的作品。</p><p>这样一来，顾客才能穿出自己的风格，并使得同一件衣服，在不同的人身上，能有不同的效果。而且，以这样的概念设计出来的衣服，也不容易失败。正是因为这两个观点，三宅一生所设计的服装总是独一无二地能够引领世界潮流。</p><p>  在艺术家的眼中，任何事物都是创作的最好材料，不管是枯木还是残破的布料，对他们而言，都是最具生命力的事物，在他们手中都能画腐朽为神奇。</p><p>朽木也能精雕，更何况我们自己。那些看起来弯曲、盘旋、似乎毫无用处的木料，往往最终能成为艺术品的原材料，因为这种不同，才特别珍贵。花点心思，身上的缺点也能变成独特的优点，就像艺术家们一般，顺着曲折的木头，创造出与众不同、完美无缺的惊世杰作。</p><p>励志文章3:一生学习，成就一生无知的人并不是没有学问的人，而是不明了自己的人。当一个有学问的人信赖书本、知识和权威，借着它们而了解自己，那么他便是愚蠢的。了解是由自我认识而来，而自我认识乃是一个人明白他自己的整个心理过程。因此，教育的真正意义是自我了解，因为整个生活是汇聚于我们每个人的身心的最高“机密”。</p><p>   目前我们所谓的教育，只是由书本聚集见闻、知识，这是任何懂得阅读的人都办得到的。这种教育提供了一条巧妙的逃避自我之途，如同其他所有的逃避方式一样，它无可避免地制造出有增无减的苦难。冲突和混乱是由于我们和他人、事物、概念之间差错的关系而产生，除非我们了解此项关系而改变它，否则，知识的学习和堆砌，各种技能的获取，都只会将我们导向更深的混乱和毁灭。</p><p> 我们将子女送入学校，学习一些技能，并希望借此来带动整个家庭的长久繁荣，至少在家长们年老的时候有养老保险，有稳定的照顾。我们对孩子最急切的渴望，就是将他塑造成一个能在一个领域中出类拔萃之人，希望给予他一个安全的经济地位。物质的获得有时候并不难，然而，技术的训练能使我们了解自己吗?</p><p>虽然，懂得念书写字、学习土木工程或其他某种职业，是必需的，然而技术能给予我们了解生活的能力吗?技术，无疑是次要的;如果技术是我们惟一奋力以求的东西，那么我们就摒弃了生活中最主要的东西了。</p><p>    生活，是痛苦、喜悦、美、丑、爱等多种感受的综合，一旦我们将它整体地加以了解，那么这项了解在各方面都会创出它应有的技术。不过，相反的说法就不是真的了∶技术永远无法产生创造性的了解。</p><p>如果过分强调技术，我们便毁灭了人。磨练技能和效率，然而对生活却不了解，对思想、欲望的行踪不能领悟，只会使我们变得日益残暴无情，以致于触发战争，危害了我们肉体上的安全。由于我们的教育过重于单单培养技术，已经制造出许多科学家、数学家、造桥工程师、征服太空的人，但这些人了解生活的整体过程吗?一个专家能把生活本身完整地体验感受表达出来吗?或者他真的体验到生活了吗?有时候，当他不是专家时，反而更能直指生活的本质。一颗能够给予人辉煌一生的企图心，首先应当是一颗敏感的善良的热情的心，让我们对周围的一切保持孩童一样旺盛的好奇心。我们应当渴望了解新奇的事物，渴望探索未知的领域。只有在这种理念的支配下，我们才能不断地、孜孜以求地、乐此不疲地提升自己的认知和理解能力，改善自我，从而更接近成功的巅峰。</p>'),(276,'2024-01-29 06:14:17','远大的目标是成功的磁石','上天对每个老实人都是公平的，每个人每一天都是二十四个小时，每个人的所有时间都是一生;同时上天对每个老实人又是不公平的，给每一个人的时间不都是二十四个小时，给每一个人的所有时间不都是一生。这之间的区别就在于有无远大目标','分类名称6','发布人6','upload/news_headportrait6.jpg',6,'2024-01-29 14:14:17',6,6,6,'upload/news_picture6.jpg','<p>  上天对每个老实人都是公平的，每个人每一天都是二十四个小时，每个人的所有时间都是一生;同时上天对每个老实人又是不公平的，给每一个人的时间不都是二十四个小时，给每一个人的所有时间不都是一生。这之间的区别就在于有无远大目标。</p><p>    有大目标的人，生活永远是积极的，他们会朝着自己的目标不断前进;没有大目标的老实人浑浑噩噩，不思进取，最后被生活淘汰。</p><p> 从前有个叫阿巴格的人生活在内蒙古草原上。有一次，年少的阿巴格和爸爸在草原上迷了路，阿巴格又累又怕，到最后快走不动了。爸爸就从兜里掏出五枚硬币，把一枚硬币埋在草地里，把其余四枚放在阿巴格的手上，说:“人生有五枚金币，童年、少年、青年、中年、老年各有一枚，你现在才用了一枚，就是埋在草地里的那一枚，你不能把五枚都扔在草原里，你要一点点地用，每一次都用出不同来，这样才不枉人生一世。今天我们一定要走出草原，你将来也一定要走出草原。世界很大，人活着，就要多走些地方，多看看，不要让你的金币没有用就扔掉。”在父亲的鼓励下，阿巴格走出了草原。长大后，阿巴格离开了家乡，成了一名十分优秀的船长。</p><p>  目标是与一个人的愿望相联系的，是对未来的一种设想，它往往和目前的行动不直接联系。但目标又不能脱离现实的生活，现实生活中的某些现象如果符合了个人的需要，与个人的世界观一致，这些现实的因素就会以个人目标的形式表现出来。目标总是对现实生活的重新加工，舍弃其中某些成分，又对某些因素给予强调的过程，但它必须以对客观规律的认识为基础，符合客观规律。</p><p> 能实现自己目标的老实人，对他个人而言，他是一个成功者，也是个幸福者。目标是成功的必要条件，虽然仅仅拥有目标，你不一定能取得成功;但是如果没有目标，成功对你而言就无从谈起。</p><p>远大的美好目标能吸引人努力为实现它而奋斗不止。</p>'),(277,'2024-01-29 06:14:17','做一个最好的自己','自信是成功的前提，你拥有自信，就拥有成功的一半机会。相信自己是最棒的就一定会成就一定的事业。拥有自信的人之所以会心想事成、走向成功，是因为他们都有着巨大无比的潜能等着去开发;消极失败的心态之所以会使人怯弱无能、走向失败，是因为它使人放弃潜能的开发，让潜能在那里沉睡、白白浪费','分类名称7','发布人7','upload/news_headportrait7.jpg',7,'2024-01-29 14:14:17',7,7,7,'upload/news_picture7.jpg','<p>自信是成功的前提，你拥有自信，就拥有成功的一半机会。相信自己是最棒的就一定会成就一定的事业。拥有自信的人之所以会心想事成、走向成功，是因为他们都有着巨大无比的潜能等着去开发;消极失败的心态之所以会使人怯弱无能、走向失败，是因为它使人放弃潜能的开发，让潜能在那里沉睡、白白浪费。</p><p>我们大家都知道的人大脑拥有140亿个脑细胞，但我们思维意识只利用了脑细胞的很少部分，如能将更多的脑细胞从睡眠中激活出来，人的思维意识将更加强大。如果我们都能充满自信，就能创造人间奇迹，亦能创造一个最好的自己。</p><p> 一个人相信自己是什么，就会是什么。一个人心里怎样想，就会成为怎样的人。这从心里学上讲是有一定的道理的。我们每一个人心里都有一幅心里蓝图，或是一幅自画像，有人称它为运作结果。如果你想象的是做最好的你，那么你就会在你内心的荧光屏上看到一个踌躇满志、不断进取、勇于开拓创新的自我。同时还会经常收到我做的很好，我以后还会做的更好之类的信息，这样你注定会成为一个最好的你。美国哲学家爱默生说:“人的一生正如他一天中所想的那样，你怎么想，怎么期待，就有怎样的人生。”美国有名的钢铁大王安德鲁·卡耐基就是一个充分发挥自己创造机会的楷模。他12岁时由英格兰移居美国，先是在一家纺织厂做工人，当时他的目标是“做全厂最出色的工人。”因为他经常这样想，以这样做，最终他实现了他的目标。后来命运有安排他当邮递员，他想的是怎样成为“全美最杰出的邮递员。”结果他的这一目标也实现了。他的一生总是根据自己所处的环境和地位塑造最佳的自己，他的座右铭就是“相信自己是最棒的。“</p><p>做一个最好的自己，不一定非要当什么“家”，也不一定非要出什么“名”，更不要与别人比高低、比大小。就像人的手指，有大有小，有长有短，他们各有所长，各有所短，你能说拇指比食指好吗?决定最好的你，既不是你拥有的物质财富的多少，也不是你身份的贵贱，关键是看你是否拥有实现自己理想的强烈愿望的程度，看你身上的潜力能否充分发挥。人们熟知的一些英雄模范，就是在平凡的工作岗位上充分发挥人的创新能力，做好自己身边的每一件小事，创造了做好的自己。</p><p>“塑造一个最好的自己”，这个目标人人都可以实现。你只意识到自己是大自然的一分子，坚信自己拥有“无限的能力”与“无限的可能”，这种坚定的信心能帮助你创造和谐的心理、生理韵律，建立起自己理想的自我形象，体现自己人格行为应该具有的魅力。</p>'),(278,'2024-01-29 06:14:17','有了梦想就不会感到疲惫','一段时间以前，一位在港的大陆学生，因为学业的压力、前途的渺茫等诸多原因，选择了自杀。在讨论和反思的潮流中，有一位毕业生在校内网匿名发表了自己的故事。他说，自己当年在学校也曾经面临绝境，一文不名。他选择了做“乞丐学生”，坚持着念完了课程。回忆的一些情节让我印象深刻，比如，平时偷偷住电梯间，蓬头垢面如乞丐;实在很饿，学校举办餐会的时候默默进场埋头大吃','分类名称8','发布人8','upload/news_headportrait8.jpg',8,'2024-01-29 14:14:17',8,8,8,'upload/news_picture8.jpg','<p>  一段时间以前，一位在港的大陆学生，因为学业的压力、前途的渺茫等诸多原因，选择了自杀。在讨论和反思的潮流中，有一位毕业生在校内网匿名发表了自己的故事。他说，自己当年在学校也曾经面临绝境，一文不名。他选择了做“乞丐学生”，坚持着念完了课程。回忆的一些情节让我印象深刻，比如，平时偷偷住电梯间，蓬头垢面如乞丐;实在很饿，学校举办餐会的时候默默进场埋头大吃。</p><p>“峣峣者易折，皎皎者易污。”能够从内地高校到香港读书的学子，都是一些很优秀的年轻人。不知道曾经高居象牙塔的书生，怎样狠下心，咬牙面对那一个天渊般的落差，以及旁人的目光和议论。</p><p>  说到这里，很像一个《读者》式的励志故事。但是这种励志故事从来就不缺乏感动人的力量，因为虽然光明的尾巴不是人人都能够拥有，但是人人都有梦想，面对实现过程中的困难，其奋斗或者说挣扎，却常常和平凡如你我的人们相遇。</p><p>    《当幸福来敲门/The Pursuit of Happyness》就是这样偶然被看到，又感动了我的电影。黑人克里斯是一名普普通通的医疗器械推销员，妻子忍受不了经济上的压力离开了他，留下5岁的儿子克里斯托夫和他相依为命。克里斯银行账户里只剩下21块钱，因为没钱付房租，他和儿子被撵出了公寓。费尽周折，克里斯赢得了在一家着名股票投资公司实习的机会，但是实习期间没有薪水，而且最终只有一人可以成功进入公司。</p><p>    学妹曾经告诉我一个故事，让我每次想到都觉得莫名恐怖。她说，她硕士毕业去广东求职，一个中学要招几个老师，结果南来北往的硕士博士挤了快有一个礼堂。可想而知，竞争有多么残酷。看来，中外求职者都面临着同样的挑战。但是克里斯和许多“80后”的大学毕业生不同，他更加坚韧:为了节省时间，上班时候不喝水，以避免上厕所。以疯狂的速度给客户打电话，打完一个，直接按挂机键就拨下一个电话。白天，克里斯忍受着一次又一次被拒绝的失望，带着微笑在公司和客户之间穿梭。回家，则要带着儿子穿过污秽的街道，忍受房东的咆哮。</p><p>    终于，交不起房租的父子俩流落街头。克里斯和儿子在午夜地铁里相对无言，儿子不能理解为什么不能回家住，爸爸却开始玩游戏:“我们通过时光机，到达古代了!”儿子立刻兴奋地配合起来，环顾左右。父子俩在“恐龙”的追杀下，逃到了一个“山洞”里，“山洞”是什么呢，其实是一间男厕所。克里斯搂着熟睡的儿子，坐靠在厕所的墙面。午夜的灯光很惨白，这个消瘦的、营养不良的父亲，默默地流下了泪水。</p><p>    父子俩依旧为了幸福到来而努力。他们开始住收容所，面对有限的床位，这个奔跑起来像猎豹一样的人，有时候得把草原上的爆发力运用到打架上面来。儿子在简陋的收容所床上睡着了，父亲还在埋头修理推销的医疗器械，或者翻那本厚厚的笔试全书。</p><p>   钱包磨损得厉害，而且，太瘪了，每张钱都很熟悉。老板要借5块钱，犹豫再三，摩挚着纸币，最终还是把钱送了出去。卖血。鲜血在塑料袋里面渗开，那是一个男人所能奉献的最后。拿着卖血的钱，克里斯仍然去买电子元件。一点点的希望，都要去坚持。</p><p>对于父母，最心酸的事儿是什么呢?就是子女的一点可怜的愿望得不到满足。克里斯托夫的惟一的玩偶“美国英雄”，在一次挤车的过程中掉到了地上。5岁的男孩悲伤欲绝，克里斯坚硬的表情下，读出的是面对困难的凶狠和惨痛。但是，无论多么深切的无望，都没有摧毁父子间的亲情与他们的信念，他们相信幸福总会落到自己的身上。“你是个好爸爸”，克里斯托夫跟着爸爸四处流浪，可是孩子的心灵，衡量的砝码和天使是—样的。</p><p>  克里斯最终成为了投资公司的员工，看似冷漠的白人老板们，此时显出他们的些微温情。他忍住了泪水，颤抖着拿起自己的物品，走入了茫茫人海。在熙熙攘攘的人群中间，克里斯举起手，为自己鼓掌，那无声的，一下下重重的掌声，是在为自己喝彩。其实，克里斯托夫的“美国英雄”并没有失落。</p><p>  这是一个非常典型的“美国梦”:一个人通过自己的努力，可以实现自己的梦想，幸福，会来敲门。很多人往往会关注对于梦想的树立，而往往忽略过程的艰辛。特别是，当面对一个看似无望的现实的时候，有多少人会坚持，多少人会放弃呢?生活总是在不断地修正，并且提醒我们，顺应大潮的人总是较有可能抵达成功的彼岸。可是，确实是有些人，愿意逆流而上。我相信，这是导演对于逆行者的一点鼓励。</p><p>那个香港的匿名毕业生后来博士毕业，找到了一份不错的工作，有了漂亮的妻子和可爱的孩子。这个强人在帖子里说，有什么坚持不下来的呢?只要有梦想</p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `newstype`
--

DROP TABLE IF EXISTS `newstype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `newstype` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `typename` varchar(200) NOT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=269 DEFAULT CHARSET=utf8 COMMENT='公告分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `newstype`
--

LOCK TABLES `newstype` WRITE;
/*!40000 ALTER TABLE `newstype` DISABLE KEYS */;
INSERT INTO `newstype` VALUES (261,'2024-01-29 06:14:17','分类名称1'),(262,'2024-01-29 06:14:17','分类名称2'),(263,'2024-01-29 06:14:17','分类名称3'),(264,'2024-01-29 06:14:17','分类名称4'),(265,'2024-01-29 06:14:17','分类名称5'),(266,'2024-01-29 06:14:17','分类名称6'),(267,'2024-01-29 06:14:17','分类名称7'),(268,'2024-01-29 06:14:17','分类名称8');
/*!40000 ALTER TABLE `newstype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nongchangfeiyong`
--

DROP TABLE IF EXISTS `nongchangfeiyong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nongchangfeiyong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `piaoju` longtext COMMENT '票据',
  `feiliaozhichu` double DEFAULT NULL COMMENT '肥料支出',
  `rengongchengben` double DEFAULT NULL COMMENT '人工成本',
  `nongyaozhichu` double DEFAULT NULL COMMENT '农药支出',
  `zhongzizhichu` double DEFAULT NULL COMMENT '种子支出',
  `hejizhichu` double DEFAULT NULL COMMENT '合计支出',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=149 DEFAULT CHARSET=utf8 COMMENT='农场费用';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nongchangfeiyong`
--

LOCK TABLES `nongchangfeiyong` WRITE;
/*!40000 ALTER TABLE `nongchangfeiyong` DISABLE KEYS */;
INSERT INTO `nongchangfeiyong` VALUES (141,'2024-01-29 06:14:16','农场主账号1','农场主1','2024-01-29','标题1','upload/nongchangfeiyong_piaoju1.jpg,upload/nongchangfeiyong_piaoju2.jpg,upload/nongchangfeiyong_piaoju3.jpg',1,1,1,1,1),(142,'2024-01-29 06:14:16','农场主账号2','农场主2','2024-01-29','标题2','upload/nongchangfeiyong_piaoju2.jpg,upload/nongchangfeiyong_piaoju3.jpg,upload/nongchangfeiyong_piaoju4.jpg',2,2,2,2,2),(143,'2024-01-29 06:14:16','农场主账号3','农场主3','2024-01-29','标题3','upload/nongchangfeiyong_piaoju3.jpg,upload/nongchangfeiyong_piaoju4.jpg,upload/nongchangfeiyong_piaoju5.jpg',3,3,3,3,3),(144,'2024-01-29 06:14:16','农场主账号4','农场主4','2024-01-29','标题4','upload/nongchangfeiyong_piaoju4.jpg,upload/nongchangfeiyong_piaoju5.jpg,upload/nongchangfeiyong_piaoju6.jpg',4,4,4,4,4),(145,'2024-01-29 06:14:16','农场主账号5','农场主5','2024-01-29','标题5','upload/nongchangfeiyong_piaoju5.jpg,upload/nongchangfeiyong_piaoju6.jpg,upload/nongchangfeiyong_piaoju7.jpg',5,5,5,5,5),(146,'2024-01-29 06:14:16','农场主账号6','农场主6','2024-01-29','标题6','upload/nongchangfeiyong_piaoju6.jpg,upload/nongchangfeiyong_piaoju7.jpg,upload/nongchangfeiyong_piaoju8.jpg',6,6,6,6,6),(147,'2024-01-29 06:14:16','农场主账号7','农场主7','2024-01-29','标题7','upload/nongchangfeiyong_piaoju7.jpg,upload/nongchangfeiyong_piaoju8.jpg,upload/nongchangfeiyong_piaoju9.jpg',7,7,7,7,7),(148,'2024-01-29 06:14:16','农场主账号8','农场主8','2024-01-29','标题8','upload/nongchangfeiyong_piaoju8.jpg,upload/nongchangfeiyong_piaoju9.jpg,upload/nongchangfeiyong_piaoju10.jpg',8,8,8,8,8);
/*!40000 ALTER TABLE `nongchangfeiyong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nongchangzhu`
--

DROP TABLE IF EXISTS `nongchangzhu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nongchangzhu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `nongchangzhuzhanghao` varchar(200) NOT NULL COMMENT '农场主账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `touxiang` longtext COMMENT '头像',
  `nongchangzhudianhua` varchar(200) DEFAULT NULL COMMENT '农场主电话',
  PRIMARY KEY (`id`),
  UNIQUE KEY `nongchangzhuzhanghao` (`nongchangzhuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='农场主';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nongchangzhu`
--

LOCK TABLES `nongchangzhu` WRITE;
/*!40000 ALTER TABLE `nongchangzhu` DISABLE KEYS */;
INSERT INTO `nongchangzhu` VALUES (31,'2024-01-29 06:14:16','农场主账号1','123456','农场主1','男','年龄1','upload/nongchangzhu_touxiang1.jpg','13823888881'),(32,'2024-01-29 06:14:16','农场主账号2','123456','农场主2','男','年龄2','upload/nongchangzhu_touxiang2.jpg','13823888882'),(33,'2024-01-29 06:14:16','农场主账号3','123456','农场主3','男','年龄3','upload/nongchangzhu_touxiang3.jpg','13823888883'),(34,'2024-01-29 06:14:16','农场主账号4','123456','农场主4','男','年龄4','upload/nongchangzhu_touxiang4.jpg','13823888884'),(35,'2024-01-29 06:14:16','农场主账号5','123456','农场主5','男','年龄5','upload/nongchangzhu_touxiang5.jpg','13823888885'),(36,'2024-01-29 06:14:16','农场主账号6','123456','农场主6','男','年龄6','upload/nongchangzhu_touxiang6.jpg','13823888886'),(37,'2024-01-29 06:14:16','农场主账号7','123456','农场主7','男','年龄7','upload/nongchangzhu_touxiang7.jpg','13823888887'),(38,'2024-01-29 06:14:16','农场主账号8','123456','农场主8','男','年龄8','upload/nongchangzhu_touxiang8.jpg','13823888888');
/*!40000 ALTER TABLE `nongchangzhu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nongyejishuyuan`
--

DROP TABLE IF EXISTS `nongyejishuyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nongyejishuyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jishuyuanzhanghao` varchar(200) NOT NULL COMMENT '技术员账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `jishuyuan` varchar(200) DEFAULT NULL COMMENT '技术员',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` varchar(200) DEFAULT NULL COMMENT '年龄',
  `touxiang` longtext COMMENT '头像',
  `jishuyuanshouji` varchar(200) DEFAULT NULL COMMENT '技术员手机',
  `gerenjieshao` longtext COMMENT '个人介绍',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jishuyuanzhanghao` (`jishuyuanzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='农业技术员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nongyejishuyuan`
--

LOCK TABLES `nongyejishuyuan` WRITE;
/*!40000 ALTER TABLE `nongyejishuyuan` DISABLE KEYS */;
INSERT INTO `nongyejishuyuan` VALUES (11,'2024-01-29 06:14:16','技术员账号1','123456','技术员1','男','年龄1','upload/nongyejishuyuan_touxiang1.jpg','13823888881','个人介绍1'),(12,'2024-01-29 06:14:16','技术员账号2','123456','技术员2','男','年龄2','upload/nongyejishuyuan_touxiang2.jpg','13823888882','个人介绍2'),(13,'2024-01-29 06:14:16','技术员账号3','123456','技术员3','男','年龄3','upload/nongyejishuyuan_touxiang3.jpg','13823888883','个人介绍3'),(14,'2024-01-29 06:14:16','技术员账号4','123456','技术员4','男','年龄4','upload/nongyejishuyuan_touxiang4.jpg','13823888884','个人介绍4'),(15,'2024-01-29 06:14:16','技术员账号5','123456','技术员5','男','年龄5','upload/nongyejishuyuan_touxiang5.jpg','13823888885','个人介绍5'),(16,'2024-01-29 06:14:16','技术员账号6','123456','技术员6','男','年龄6','upload/nongyejishuyuan_touxiang6.jpg','13823888886','个人介绍6'),(17,'2024-01-29 06:14:16','技术员账号7','123456','技术员7','男','年龄7','upload/nongyejishuyuan_touxiang7.jpg','13823888887','个人介绍7'),(18,'2024-01-29 06:14:16','技术员账号8','123456','技术员8','男','年龄8','upload/nongyejishuyuan_touxiang8.jpg','13823888888','个人介绍8');
/*!40000 ALTER TABLE `nongyejishuyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nongzuowu`
--

DROP TABLE IF EXISTS `nongzuowu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `nongzuowu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `zhongzhimianji` double DEFAULT NULL COMMENT '种植面积(㎡)',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `zuowumingcheng` varchar(200) NOT NULL COMMENT '作物名称',
  `zhongzhishijian` date DEFAULT NULL COMMENT '种植时间',
  `yujishouhuo` date DEFAULT NULL COMMENT '预计收获',
  `shifeijihua` longtext COMMENT '施肥计划',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `zhongzhitupian` longtext COMMENT '种植图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8 COMMENT='农作物';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nongzuowu`
--

LOCK TABLES `nongzuowu` WRITE;
/*!40000 ALTER TABLE `nongzuowu` DISABLE KEYS */;
INSERT INTO `nongzuowu` VALUES (51,'2024-01-29 06:14:16','地块编号1',1,'农场主账号1','农场主1','作物名称1','2024-01-29','2024-01-29','施肥计划1','种植户账号1','种植户1','upload/nongzuowu_zhongzhitupian1.jpg,upload/nongzuowu_zhongzhitupian2.jpg,upload/nongzuowu_zhongzhitupian3.jpg'),(52,'2024-01-29 06:14:16','地块编号2',2,'农场主账号2','农场主2','作物名称2','2024-01-29','2024-01-29','施肥计划2','种植户账号2','种植户2','upload/nongzuowu_zhongzhitupian2.jpg,upload/nongzuowu_zhongzhitupian3.jpg,upload/nongzuowu_zhongzhitupian4.jpg'),(53,'2024-01-29 06:14:16','地块编号3',3,'农场主账号3','农场主3','作物名称3','2024-01-29','2024-01-29','施肥计划3','种植户账号3','种植户3','upload/nongzuowu_zhongzhitupian3.jpg,upload/nongzuowu_zhongzhitupian4.jpg,upload/nongzuowu_zhongzhitupian5.jpg'),(54,'2024-01-29 06:14:16','地块编号4',4,'农场主账号4','农场主4','作物名称4','2024-01-29','2024-01-29','施肥计划4','种植户账号4','种植户4','upload/nongzuowu_zhongzhitupian4.jpg,upload/nongzuowu_zhongzhitupian5.jpg,upload/nongzuowu_zhongzhitupian6.jpg'),(55,'2024-01-29 06:14:16','地块编号5',5,'农场主账号5','农场主5','作物名称5','2024-01-29','2024-01-29','施肥计划5','种植户账号5','种植户5','upload/nongzuowu_zhongzhitupian5.jpg,upload/nongzuowu_zhongzhitupian6.jpg,upload/nongzuowu_zhongzhitupian7.jpg'),(56,'2024-01-29 06:14:16','地块编号6',6,'农场主账号6','农场主6','作物名称6','2024-01-29','2024-01-29','施肥计划6','种植户账号6','种植户6','upload/nongzuowu_zhongzhitupian6.jpg,upload/nongzuowu_zhongzhitupian7.jpg,upload/nongzuowu_zhongzhitupian8.jpg'),(57,'2024-01-29 06:14:16','地块编号7',7,'农场主账号7','农场主7','作物名称7','2024-01-29','2024-01-29','施肥计划7','种植户账号7','种植户7','upload/nongzuowu_zhongzhitupian7.jpg,upload/nongzuowu_zhongzhitupian8.jpg,upload/nongzuowu_zhongzhitupian9.jpg'),(58,'2024-01-29 06:14:16','地块编号8',8,'农场主账号8','农场主8','作物名称8','2024-01-29','2024-01-29','施肥计划8','种植户账号8','种植户8','upload/nongzuowu_zhongzhitupian8.jpg,upload/nongzuowu_zhongzhitupian9.jpg,upload/nongzuowu_zhongzhitupian10.jpg');
/*!40000 ALTER TABLE `nongzuowu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeiweihuqingkuang`
--

DROP TABLE IF EXISTS `shebeiweihuqingkuang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeiweihuqingkuang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shebeibianhao` varchar(200) DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(200) DEFAULT NULL COMMENT '设备名称',
  `xinghao` varchar(200) DEFAULT NULL COMMENT '型号',
  `shebeifenlei` varchar(200) DEFAULT NULL COMMENT '设备分类',
  `tupian` longtext COMMENT '图片',
  `shebeiweizhi` varchar(200) DEFAULT NULL COMMENT '设备位置',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `weihushijian` date DEFAULT NULL COMMENT '维护时间',
  `weihuneirong` longtext COMMENT '维护内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=169 DEFAULT CHARSET=utf8 COMMENT='设备维护情况';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeiweihuqingkuang`
--

LOCK TABLES `shebeiweihuqingkuang` WRITE;
/*!40000 ALTER TABLE `shebeiweihuqingkuang` DISABLE KEYS */;
INSERT INTO `shebeiweihuqingkuang` VALUES (161,'2024-01-29 06:14:16','设备编号1','设备名称1','型号1','设备分类1','upload/shebeiweihuqingkuang_tupian1.jpg,upload/shebeiweihuqingkuang_tupian2.jpg,upload/shebeiweihuqingkuang_tupian3.jpg','设备位置1','农场主账号1','农场主1','2024-01-29','维护内容1'),(162,'2024-01-29 06:14:16','设备编号2','设备名称2','型号2','设备分类2','upload/shebeiweihuqingkuang_tupian2.jpg,upload/shebeiweihuqingkuang_tupian3.jpg,upload/shebeiweihuqingkuang_tupian4.jpg','设备位置2','农场主账号2','农场主2','2024-01-29','维护内容2'),(163,'2024-01-29 06:14:16','设备编号3','设备名称3','型号3','设备分类3','upload/shebeiweihuqingkuang_tupian3.jpg,upload/shebeiweihuqingkuang_tupian4.jpg,upload/shebeiweihuqingkuang_tupian5.jpg','设备位置3','农场主账号3','农场主3','2024-01-29','维护内容3'),(164,'2024-01-29 06:14:16','设备编号4','设备名称4','型号4','设备分类4','upload/shebeiweihuqingkuang_tupian4.jpg,upload/shebeiweihuqingkuang_tupian5.jpg,upload/shebeiweihuqingkuang_tupian6.jpg','设备位置4','农场主账号4','农场主4','2024-01-29','维护内容4'),(165,'2024-01-29 06:14:16','设备编号5','设备名称5','型号5','设备分类5','upload/shebeiweihuqingkuang_tupian5.jpg,upload/shebeiweihuqingkuang_tupian6.jpg,upload/shebeiweihuqingkuang_tupian7.jpg','设备位置5','农场主账号5','农场主5','2024-01-29','维护内容5'),(166,'2024-01-29 06:14:16','设备编号6','设备名称6','型号6','设备分类6','upload/shebeiweihuqingkuang_tupian6.jpg,upload/shebeiweihuqingkuang_tupian7.jpg,upload/shebeiweihuqingkuang_tupian8.jpg','设备位置6','农场主账号6','农场主6','2024-01-29','维护内容6'),(167,'2024-01-29 06:14:16','设备编号7','设备名称7','型号7','设备分类7','upload/shebeiweihuqingkuang_tupian7.jpg,upload/shebeiweihuqingkuang_tupian8.jpg,upload/shebeiweihuqingkuang_tupian9.jpg','设备位置7','农场主账号7','农场主7','2024-01-29','维护内容7'),(168,'2024-01-29 06:14:16','设备编号8','设备名称8','型号8','设备分类8','upload/shebeiweihuqingkuang_tupian8.jpg,upload/shebeiweihuqingkuang_tupian9.jpg,upload/shebeiweihuqingkuang_tupian10.jpg','设备位置8','农场主账号8','农场主8','2024-01-29','维护内容8');
/*!40000 ALTER TABLE `shebeiweihuqingkuang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeixinxi`
--

DROP TABLE IF EXISTS `shebeixinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeixinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shebeibianhao` varchar(200) DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(200) NOT NULL COMMENT '设备名称',
  `xinghao` varchar(200) DEFAULT NULL COMMENT '型号',
  `shebeifenlei` varchar(200) NOT NULL COMMENT '设备分类',
  `jutigongneng` varchar(200) DEFAULT NULL COMMENT '具体功能',
  `tupian` longtext COMMENT '图片',
  `shebeiweizhi` varchar(200) DEFAULT NULL COMMENT '设备位置',
  `baoyangzhouqi` varchar(200) DEFAULT NULL COMMENT '保养周期',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shebeibianhao` (`shebeibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8 COMMENT='设备信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeixinxi`
--

LOCK TABLES `shebeixinxi` WRITE;
/*!40000 ALTER TABLE `shebeixinxi` DISABLE KEYS */;
INSERT INTO `shebeixinxi` VALUES (151,'2024-01-29 06:14:16','1111111111','设备名称1','型号1','设备分类1','具体功能1','upload/shebeixinxi_tupian1.jpg,upload/shebeixinxi_tupian2.jpg,upload/shebeixinxi_tupian3.jpg','设备位置1','保养周期1','农场主账号1','农场主1'),(152,'2024-01-29 06:14:16','2222222222','设备名称2','型号2','设备分类2','具体功能2','upload/shebeixinxi_tupian2.jpg,upload/shebeixinxi_tupian3.jpg,upload/shebeixinxi_tupian4.jpg','设备位置2','保养周期2','农场主账号2','农场主2'),(153,'2024-01-29 06:14:16','3333333333','设备名称3','型号3','设备分类3','具体功能3','upload/shebeixinxi_tupian3.jpg,upload/shebeixinxi_tupian4.jpg,upload/shebeixinxi_tupian5.jpg','设备位置3','保养周期3','农场主账号3','农场主3'),(154,'2024-01-29 06:14:16','4444444444','设备名称4','型号4','设备分类4','具体功能4','upload/shebeixinxi_tupian4.jpg,upload/shebeixinxi_tupian5.jpg,upload/shebeixinxi_tupian6.jpg','设备位置4','保养周期4','农场主账号4','农场主4'),(155,'2024-01-29 06:14:16','5555555555','设备名称5','型号5','设备分类5','具体功能5','upload/shebeixinxi_tupian5.jpg,upload/shebeixinxi_tupian6.jpg,upload/shebeixinxi_tupian7.jpg','设备位置5','保养周期5','农场主账号5','农场主5'),(156,'2024-01-29 06:14:16','6666666666','设备名称6','型号6','设备分类6','具体功能6','upload/shebeixinxi_tupian6.jpg,upload/shebeixinxi_tupian7.jpg,upload/shebeixinxi_tupian8.jpg','设备位置6','保养周期6','农场主账号6','农场主6'),(157,'2024-01-29 06:14:16','7777777777','设备名称7','型号7','设备分类7','具体功能7','upload/shebeixinxi_tupian7.jpg,upload/shebeixinxi_tupian8.jpg,upload/shebeixinxi_tupian9.jpg','设备位置7','保养周期7','农场主账号7','农场主7'),(158,'2024-01-29 06:14:16','8888888888','设备名称8','型号8','设备分类8','具体功能8','upload/shebeixinxi_tupian8.jpg,upload/shebeixinxi_tupian9.jpg,upload/shebeixinxi_tupian10.jpg','设备位置8','保养周期8','农场主账号8','农场主8');
/*!40000 ALTER TABLE `shebeixinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shengzhangqingkuang`
--

DROP TABLE IF EXISTS `shengzhangqingkuang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shengzhangqingkuang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `zhongzhimianji` varchar(200) DEFAULT NULL COMMENT '种植面积(㎡)',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `zuowumingcheng` varchar(200) DEFAULT NULL COMMENT '作物名称',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `zhongzhitupian` longtext COMMENT '种植图片',
  `shengzhangjieduan` varchar(200) NOT NULL COMMENT '生长阶段',
  `yepianzhuangkuang` varchar(200) DEFAULT NULL COMMENT '叶片状况',
  `huaguozhuangkuang` varchar(200) DEFAULT NULL COMMENT '花果状况',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='生长情况';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shengzhangqingkuang`
--

LOCK TABLES `shengzhangqingkuang` WRITE;
/*!40000 ALTER TABLE `shengzhangqingkuang` DISABLE KEYS */;
INSERT INTO `shengzhangqingkuang` VALUES (61,'2024-01-29 06:14:16','地块编号1','种植面积(㎡)1','农场主账号1','农场主1','作物名称1','种植户账号1','种植户1','upload/shengzhangqingkuang_zhongzhitupian1.jpg,upload/shengzhangqingkuang_zhongzhitupian2.jpg,upload/shengzhangqingkuang_zhongzhitupian3.jpg','种子期','叶片状况1','花果状况1','2024-01-29'),(62,'2024-01-29 06:14:16','地块编号2','种植面积(㎡)2','农场主账号2','农场主2','作物名称2','种植户账号2','种植户2','upload/shengzhangqingkuang_zhongzhitupian2.jpg,upload/shengzhangqingkuang_zhongzhitupian3.jpg,upload/shengzhangqingkuang_zhongzhitupian4.jpg','种子期','叶片状况2','花果状况2','2024-01-29'),(63,'2024-01-29 06:14:16','地块编号3','种植面积(㎡)3','农场主账号3','农场主3','作物名称3','种植户账号3','种植户3','upload/shengzhangqingkuang_zhongzhitupian3.jpg,upload/shengzhangqingkuang_zhongzhitupian4.jpg,upload/shengzhangqingkuang_zhongzhitupian5.jpg','种子期','叶片状况3','花果状况3','2024-01-29'),(64,'2024-01-29 06:14:16','地块编号4','种植面积(㎡)4','农场主账号4','农场主4','作物名称4','种植户账号4','种植户4','upload/shengzhangqingkuang_zhongzhitupian4.jpg,upload/shengzhangqingkuang_zhongzhitupian5.jpg,upload/shengzhangqingkuang_zhongzhitupian6.jpg','种子期','叶片状况4','花果状况4','2024-01-29'),(65,'2024-01-29 06:14:16','地块编号5','种植面积(㎡)5','农场主账号5','农场主5','作物名称5','种植户账号5','种植户5','upload/shengzhangqingkuang_zhongzhitupian5.jpg,upload/shengzhangqingkuang_zhongzhitupian6.jpg,upload/shengzhangqingkuang_zhongzhitupian7.jpg','种子期','叶片状况5','花果状况5','2024-01-29'),(66,'2024-01-29 06:14:16','地块编号6','种植面积(㎡)6','农场主账号6','农场主6','作物名称6','种植户账号6','种植户6','upload/shengzhangqingkuang_zhongzhitupian6.jpg,upload/shengzhangqingkuang_zhongzhitupian7.jpg,upload/shengzhangqingkuang_zhongzhitupian8.jpg','种子期','叶片状况6','花果状况6','2024-01-29'),(67,'2024-01-29 06:14:16','地块编号7','种植面积(㎡)7','农场主账号7','农场主7','作物名称7','种植户账号7','种植户7','upload/shengzhangqingkuang_zhongzhitupian7.jpg,upload/shengzhangqingkuang_zhongzhitupian8.jpg,upload/shengzhangqingkuang_zhongzhitupian9.jpg','种子期','叶片状况7','花果状况7','2024-01-29'),(68,'2024-01-29 06:14:16','地块编号8','种植面积(㎡)8','农场主账号8','农场主8','作物名称8','种植户账号8','种植户8','upload/shengzhangqingkuang_zhongzhitupian8.jpg,upload/shengzhangqingkuang_zhongzhitupian9.jpg,upload/shengzhangqingkuang_zhongzhitupian10.jpg','种子期','叶片状况8','花果状况8','2024-01-29');
/*!40000 ALTER TABLE `shengzhangqingkuang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shifeijiaoshui`
--

DROP TABLE IF EXISTS `shifeijiaoshui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shifeijiaoshui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `zhongzhimianji` varchar(200) DEFAULT NULL COMMENT '种植面积(㎡)',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `zuowumingcheng` varchar(200) DEFAULT NULL COMMENT '作物名称',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `zhongzhitupian` longtext COMMENT '种植图片',
  `shifeiliang` varchar(200) NOT NULL COMMENT '施肥量',
  `jiaoshuiliang` varchar(200) DEFAULT NULL COMMENT '浇水量',
  `dengjishijian` date DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8 COMMENT='施肥浇水';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shifeijiaoshui`
--

LOCK TABLES `shifeijiaoshui` WRITE;
/*!40000 ALTER TABLE `shifeijiaoshui` DISABLE KEYS */;
INSERT INTO `shifeijiaoshui` VALUES (81,'2024-01-29 06:14:16','地块编号1','种植面积(㎡)1','农场主账号1','农场主1','作物名称1','种植户账号1','种植户1','upload/shifeijiaoshui_zhongzhitupian1.jpg,upload/shifeijiaoshui_zhongzhitupian2.jpg,upload/shifeijiaoshui_zhongzhitupian3.jpg','施肥量1','浇水量1','2024-01-29'),(82,'2024-01-29 06:14:16','地块编号2','种植面积(㎡)2','农场主账号2','农场主2','作物名称2','种植户账号2','种植户2','upload/shifeijiaoshui_zhongzhitupian2.jpg,upload/shifeijiaoshui_zhongzhitupian3.jpg,upload/shifeijiaoshui_zhongzhitupian4.jpg','施肥量2','浇水量2','2024-01-29'),(83,'2024-01-29 06:14:16','地块编号3','种植面积(㎡)3','农场主账号3','农场主3','作物名称3','种植户账号3','种植户3','upload/shifeijiaoshui_zhongzhitupian3.jpg,upload/shifeijiaoshui_zhongzhitupian4.jpg,upload/shifeijiaoshui_zhongzhitupian5.jpg','施肥量3','浇水量3','2024-01-29'),(84,'2024-01-29 06:14:16','地块编号4','种植面积(㎡)4','农场主账号4','农场主4','作物名称4','种植户账号4','种植户4','upload/shifeijiaoshui_zhongzhitupian4.jpg,upload/shifeijiaoshui_zhongzhitupian5.jpg,upload/shifeijiaoshui_zhongzhitupian6.jpg','施肥量4','浇水量4','2024-01-29'),(85,'2024-01-29 06:14:16','地块编号5','种植面积(㎡)5','农场主账号5','农场主5','作物名称5','种植户账号5','种植户5','upload/shifeijiaoshui_zhongzhitupian5.jpg,upload/shifeijiaoshui_zhongzhitupian6.jpg,upload/shifeijiaoshui_zhongzhitupian7.jpg','施肥量5','浇水量5','2024-01-29'),(86,'2024-01-29 06:14:16','地块编号6','种植面积(㎡)6','农场主账号6','农场主6','作物名称6','种植户账号6','种植户6','upload/shifeijiaoshui_zhongzhitupian6.jpg,upload/shifeijiaoshui_zhongzhitupian7.jpg,upload/shifeijiaoshui_zhongzhitupian8.jpg','施肥量6','浇水量6','2024-01-29'),(87,'2024-01-29 06:14:16','地块编号7','种植面积(㎡)7','农场主账号7','农场主7','作物名称7','种植户账号7','种植户7','upload/shifeijiaoshui_zhongzhitupian7.jpg,upload/shifeijiaoshui_zhongzhitupian8.jpg,upload/shifeijiaoshui_zhongzhitupian9.jpg','施肥量7','浇水量7','2024-01-29'),(88,'2024-01-29 06:14:16','地块编号8','种植面积(㎡)8','农场主账号8','农场主8','作物名称8','种植户账号8','种植户8','upload/shifeijiaoshui_zhongzhitupian8.jpg,upload/shifeijiaoshui_zhongzhitupian9.jpg,upload/shifeijiaoshui_zhongzhitupian10.jpg','施肥量8','浇水量8','2024-01-29');
/*!40000 ALTER TABLE `shifeijiaoshui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shujufenxiyuyouhua`
--

DROP TABLE IF EXISTS `shujufenxiyuyouhua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shujufenxiyuyouhua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `zhongzhimianji` varchar(200) DEFAULT NULL COMMENT '种植面积(㎡)',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `zuowumingcheng` varchar(200) NOT NULL COMMENT '作物名称',
  `zhongzhishijian` varchar(200) DEFAULT NULL COMMENT '种植时间',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `zhongzhitupian` longtext COMMENT '种植图片',
  `jishuyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '技术员账号',
  `jishuyuan` varchar(200) DEFAULT NULL COMMENT '技术员',
  `jishuyuanshouji` varchar(200) DEFAULT NULL COMMENT '技术员手机',
  `fenxineirong` varchar(200) NOT NULL COMMENT '分析内容',
  `youhuamubiao` varchar(200) NOT NULL COMMENT '优化目标',
  `youhuafangan` longtext COMMENT '优化方案',
  `fenxishijian` date DEFAULT NULL COMMENT '分析时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=209 DEFAULT CHARSET=utf8 COMMENT='数据分析与优化';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shujufenxiyuyouhua`
--

LOCK TABLES `shujufenxiyuyouhua` WRITE;
/*!40000 ALTER TABLE `shujufenxiyuyouhua` DISABLE KEYS */;
INSERT INTO `shujufenxiyuyouhua` VALUES (201,'2024-01-29 06:14:16','地块编号1','种植面积(㎡)1','农场主账号1','农场主1','作物名称1','种植时间1','种植户账号1','种植户1','upload/shujufenxiyuyouhua_zhongzhitupian1.jpg,upload/shujufenxiyuyouhua_zhongzhitupian2.jpg,upload/shujufenxiyuyouhua_zhongzhitupian3.jpg','技术员账号1','技术员1','技术员手机1','分析内容1','优化目标1','优化方案1','2024-01-29'),(202,'2024-01-29 06:14:16','地块编号2','种植面积(㎡)2','农场主账号2','农场主2','作物名称2','种植时间2','种植户账号2','种植户2','upload/shujufenxiyuyouhua_zhongzhitupian2.jpg,upload/shujufenxiyuyouhua_zhongzhitupian3.jpg,upload/shujufenxiyuyouhua_zhongzhitupian4.jpg','技术员账号2','技术员2','技术员手机2','分析内容2','优化目标2','优化方案2','2024-01-29'),(203,'2024-01-29 06:14:16','地块编号3','种植面积(㎡)3','农场主账号3','农场主3','作物名称3','种植时间3','种植户账号3','种植户3','upload/shujufenxiyuyouhua_zhongzhitupian3.jpg,upload/shujufenxiyuyouhua_zhongzhitupian4.jpg,upload/shujufenxiyuyouhua_zhongzhitupian5.jpg','技术员账号3','技术员3','技术员手机3','分析内容3','优化目标3','优化方案3','2024-01-29'),(204,'2024-01-29 06:14:16','地块编号4','种植面积(㎡)4','农场主账号4','农场主4','作物名称4','种植时间4','种植户账号4','种植户4','upload/shujufenxiyuyouhua_zhongzhitupian4.jpg,upload/shujufenxiyuyouhua_zhongzhitupian5.jpg,upload/shujufenxiyuyouhua_zhongzhitupian6.jpg','技术员账号4','技术员4','技术员手机4','分析内容4','优化目标4','优化方案4','2024-01-29'),(205,'2024-01-29 06:14:16','地块编号5','种植面积(㎡)5','农场主账号5','农场主5','作物名称5','种植时间5','种植户账号5','种植户5','upload/shujufenxiyuyouhua_zhongzhitupian5.jpg,upload/shujufenxiyuyouhua_zhongzhitupian6.jpg,upload/shujufenxiyuyouhua_zhongzhitupian7.jpg','技术员账号5','技术员5','技术员手机5','分析内容5','优化目标5','优化方案5','2024-01-29'),(206,'2024-01-29 06:14:16','地块编号6','种植面积(㎡)6','农场主账号6','农场主6','作物名称6','种植时间6','种植户账号6','种植户6','upload/shujufenxiyuyouhua_zhongzhitupian6.jpg,upload/shujufenxiyuyouhua_zhongzhitupian7.jpg,upload/shujufenxiyuyouhua_zhongzhitupian8.jpg','技术员账号6','技术员6','技术员手机6','分析内容6','优化目标6','优化方案6','2024-01-29'),(207,'2024-01-29 06:14:16','地块编号7','种植面积(㎡)7','农场主账号7','农场主7','作物名称7','种植时间7','种植户账号7','种植户7','upload/shujufenxiyuyouhua_zhongzhitupian7.jpg,upload/shujufenxiyuyouhua_zhongzhitupian8.jpg,upload/shujufenxiyuyouhua_zhongzhitupian9.jpg','技术员账号7','技术员7','技术员手机7','分析内容7','优化目标7','优化方案7','2024-01-29'),(208,'2024-01-29 06:14:16','地块编号8','种植面积(㎡)8','农场主账号8','农场主8','作物名称8','种植时间8','种植户账号8','种植户8','upload/shujufenxiyuyouhua_zhongzhitupian8.jpg,upload/shujufenxiyuyouhua_zhongzhitupian9.jpg,upload/shujufenxiyuyouhua_zhongzhitupian10.jpg','技术员账号8','技术员8','技术员手机8','分析内容8','优化目标8','优化方案8','2024-01-29');
/*!40000 ALTER TABLE `shujufenxiyuyouhua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `syslog`
--

DROP TABLE IF EXISTS `syslog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `syslog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `username` varchar(200) NOT NULL COMMENT '用户名',
  `operation` varchar(200) NOT NULL COMMENT '用户操作',
  `method` varchar(200) DEFAULT NULL COMMENT '请求方法',
  `params` longtext COMMENT '请求参数',
  `time` bigint(20) DEFAULT NULL COMMENT '请求时长(毫秒)',
  `ip` varchar(200) DEFAULT NULL COMMENT 'IP地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统日志';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syslog`
--

LOCK TABLES `syslog` WRITE;
/*!40000 ALTER TABLE `syslog` DISABLE KEYS */;
/*!40000 ALTER TABLE `syslog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `systemintro`
--

DROP TABLE IF EXISTS `systemintro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `systemintro` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `subtitle` varchar(200) DEFAULT NULL COMMENT '副标题',
  `content` longtext NOT NULL COMMENT '内容',
  `picture1` longtext COMMENT '图片1',
  `picture2` longtext COMMENT '图片2',
  `picture3` longtext COMMENT '图片3',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='系统简介';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `systemintro`
--

LOCK TABLES `systemintro` WRITE;
/*!40000 ALTER TABLE `systemintro` DISABLE KEYS */;
INSERT INTO `systemintro` VALUES (1,'2024-01-29 06:14:17','系统简介','SYSTEM INTRODUCTION','在平静的海平面上，每个人都可以成为领航员。但如果只有阳光而没有阴影，只有欢乐而没有痛苦，那就不是完整的人生。就拿最幸福的人来说吧——他的幸福是一团纠结的纱线。痛苦和幸福轮番而至，让我们悲喜交集，甚至死亡都让人生更加可爱。人在生命的严肃时刻，在悲伤与丧亲的阴影下，才最接近真实的自我。在生活和事业的各个方面，才智的功能远不如性格，头脑的功能远不如心性，天分远不如自制力、毅力与教养。我始终认为内心开始过严肃生活的人，他外在的生活会开始变得更为俭朴。在一个奢侈浪费的年代，但愿我能让世人了解：人类真正的需求是多么的稀少。不重蹈覆辙才是真正的醒悟。比别人优秀并无任何高贵之处，真正的高贵在于超越从前的自我。','upload/systemintro_picture1.jpg','upload/systemintro_picture2.jpg','upload/systemintro_picture3.jpg');
/*!40000 ALTER TABLE `systemintro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,32,'农场主账号2','nongchangzhu','农场主','ed4imhycbi1j6oubbvvnewhr3n1cr7j5','2024-01-29 06:21:59','2024-01-29 07:21:59'),(2,1,'admin','users','管理员','58s9oasisyx3wppaealounxy2qrskh1g','2024-01-29 06:22:49','2024-01-29 07:22:50'),(3,28,'种植户账号8','zhongzhihu','种植户','4hcsiqe2fcd0857qobnrakdlf87hpkdo','2024-01-29 06:23:10','2024-01-29 07:23:10');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tudi`
--

DROP TABLE IF EXISTS `tudi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tudi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `mianji` double DEFAULT NULL COMMENT '面积(㎡)',
  `turangqingkuang` varchar(200) DEFAULT NULL COMMENT '土壤情况',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `tuditupian` longtext COMMENT '土地图片',
  `tudiweizhi` varchar(200) DEFAULT NULL COMMENT '土地位置',
  `turangzhiliang` varchar(200) DEFAULT NULL COMMENT '土壤质量',
  PRIMARY KEY (`id`),
  UNIQUE KEY `dikuaibianhao` (`dikuaibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='土地';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tudi`
--

LOCK TABLES `tudi` WRITE;
/*!40000 ALTER TABLE `tudi` DISABLE KEYS */;
INSERT INTO `tudi` VALUES (41,'2024-01-29 06:14:16','1111111111',1,'土壤情况1','农场主账号1','农场主1','upload/tudi_tuditupian1.jpg,upload/tudi_tuditupian2.jpg,upload/tudi_tuditupian3.jpg','土地位置1','高'),(42,'2024-01-29 06:14:16','2222222222',2,'土壤情况2','农场主账号2','农场主2','upload/tudi_tuditupian2.jpg,upload/tudi_tuditupian3.jpg,upload/tudi_tuditupian4.jpg','土地位置2','高'),(43,'2024-01-29 06:14:16','3333333333',3,'土壤情况3','农场主账号3','农场主3','upload/tudi_tuditupian3.jpg,upload/tudi_tuditupian4.jpg,upload/tudi_tuditupian5.jpg','土地位置3','高'),(44,'2024-01-29 06:14:16','4444444444',4,'土壤情况4','农场主账号4','农场主4','upload/tudi_tuditupian4.jpg,upload/tudi_tuditupian5.jpg,upload/tudi_tuditupian6.jpg','土地位置4','高'),(45,'2024-01-29 06:14:16','5555555555',5,'土壤情况5','农场主账号5','农场主5','upload/tudi_tuditupian5.jpg,upload/tudi_tuditupian6.jpg,upload/tudi_tuditupian7.jpg','土地位置5','高'),(46,'2024-01-29 06:14:16','6666666666',6,'土壤情况6','农场主账号6','农场主6','upload/tudi_tuditupian6.jpg,upload/tudi_tuditupian7.jpg,upload/tudi_tuditupian8.jpg','土地位置6','高'),(47,'2024-01-29 06:14:16','7777777777',7,'土壤情况7','农场主账号7','农场主7','upload/tudi_tuditupian7.jpg,upload/tudi_tuditupian8.jpg,upload/tudi_tuditupian9.jpg','土地位置7','高'),(48,'2024-01-29 06:14:16','8888888888',8,'土壤情况8','农场主账号8','农场主8','upload/tudi_tuditupian8.jpg,upload/tudi_tuditupian9.jpg,upload/tudi_tuditupian10.jpg','土地位置8','高');
/*!40000 ALTER TABLE `tudi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2024-01-29 06:14:17');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yongpinchuku`
--

DROP TABLE IF EXISTS `yongpinchuku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yongpinchuku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yongpinbianhao` varchar(200) DEFAULT NULL COMMENT '用品编号',
  `yongpinmingcheng` varchar(200) DEFAULT NULL COMMENT '用品名称',
  `yongpinleixing` varchar(200) DEFAULT NULL COMMENT '用品类型',
  `gongyingshang` varchar(200) DEFAULT NULL COMMENT '供应商',
  `yongpintupian` longtext COMMENT '用品图片',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `kucun` int(11) NOT NULL COMMENT '出库数量',
  `chukushijian` datetime DEFAULT NULL COMMENT '出库时间',
  `chukubeizhu` varchar(200) DEFAULT NULL COMMENT '出库备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=199 DEFAULT CHARSET=utf8 COMMENT='用品出库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yongpinchuku`
--

LOCK TABLES `yongpinchuku` WRITE;
/*!40000 ALTER TABLE `yongpinchuku` DISABLE KEYS */;
INSERT INTO `yongpinchuku` VALUES (191,'2024-01-29 06:14:16','用品编号1','用品名称1','用品类型1','供应商1','upload/yongpinchuku_yongpintupian1.jpg,upload/yongpinchuku_yongpintupian2.jpg,upload/yongpinchuku_yongpintupian3.jpg','农场主账号1',1,'2024-01-29 14:14:16','出库备注1'),(192,'2024-01-29 06:14:16','用品编号2','用品名称2','用品类型2','供应商2','upload/yongpinchuku_yongpintupian2.jpg,upload/yongpinchuku_yongpintupian3.jpg,upload/yongpinchuku_yongpintupian4.jpg','农场主账号2',2,'2024-01-29 14:14:16','出库备注2'),(193,'2024-01-29 06:14:16','用品编号3','用品名称3','用品类型3','供应商3','upload/yongpinchuku_yongpintupian3.jpg,upload/yongpinchuku_yongpintupian4.jpg,upload/yongpinchuku_yongpintupian5.jpg','农场主账号3',3,'2024-01-29 14:14:16','出库备注3'),(194,'2024-01-29 06:14:16','用品编号4','用品名称4','用品类型4','供应商4','upload/yongpinchuku_yongpintupian4.jpg,upload/yongpinchuku_yongpintupian5.jpg,upload/yongpinchuku_yongpintupian6.jpg','农场主账号4',4,'2024-01-29 14:14:16','出库备注4'),(195,'2024-01-29 06:14:16','用品编号5','用品名称5','用品类型5','供应商5','upload/yongpinchuku_yongpintupian5.jpg,upload/yongpinchuku_yongpintupian6.jpg,upload/yongpinchuku_yongpintupian7.jpg','农场主账号5',5,'2024-01-29 14:14:16','出库备注5'),(196,'2024-01-29 06:14:16','用品编号6','用品名称6','用品类型6','供应商6','upload/yongpinchuku_yongpintupian6.jpg,upload/yongpinchuku_yongpintupian7.jpg,upload/yongpinchuku_yongpintupian8.jpg','农场主账号6',6,'2024-01-29 14:14:16','出库备注6'),(197,'2024-01-29 06:14:16','用品编号7','用品名称7','用品类型7','供应商7','upload/yongpinchuku_yongpintupian7.jpg,upload/yongpinchuku_yongpintupian8.jpg,upload/yongpinchuku_yongpintupian9.jpg','农场主账号7',7,'2024-01-29 14:14:16','出库备注7'),(198,'2024-01-29 06:14:16','用品编号8','用品名称8','用品类型8','供应商8','upload/yongpinchuku_yongpintupian8.jpg,upload/yongpinchuku_yongpintupian9.jpg,upload/yongpinchuku_yongpintupian10.jpg','农场主账号8',8,'2024-01-29 14:14:16','出库备注8');
/*!40000 ALTER TABLE `yongpinchuku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yongpinruku`
--

DROP TABLE IF EXISTS `yongpinruku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yongpinruku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yongpinbianhao` varchar(200) DEFAULT NULL COMMENT '用品编号',
  `yongpinmingcheng` varchar(200) DEFAULT NULL COMMENT '用品名称',
  `yongpinleixing` varchar(200) DEFAULT NULL COMMENT '用品类型',
  `gongyingshang` varchar(200) DEFAULT NULL COMMENT '供应商',
  `yongpintupian` longtext COMMENT '用品图片',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `kucun` int(11) NOT NULL COMMENT '采购数量',
  `caigoudanjia` double DEFAULT NULL COMMENT '采购单价',
  `heji` double DEFAULT NULL COMMENT '合计',
  `caigoushijian` datetime DEFAULT NULL COMMENT '采购时间',
  `caigoubeizhu` varchar(200) DEFAULT NULL COMMENT '采购备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=189 DEFAULT CHARSET=utf8 COMMENT='用品入库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yongpinruku`
--

LOCK TABLES `yongpinruku` WRITE;
/*!40000 ALTER TABLE `yongpinruku` DISABLE KEYS */;
INSERT INTO `yongpinruku` VALUES (181,'2024-01-29 06:14:16','用品编号1','用品名称1','用品类型1','供应商1','upload/yongpinruku_yongpintupian1.jpg,upload/yongpinruku_yongpintupian2.jpg,upload/yongpinruku_yongpintupian3.jpg','农场主账号1',1,1,1,'2024-01-29 14:14:16','采购备注1'),(182,'2024-01-29 06:14:16','用品编号2','用品名称2','用品类型2','供应商2','upload/yongpinruku_yongpintupian2.jpg,upload/yongpinruku_yongpintupian3.jpg,upload/yongpinruku_yongpintupian4.jpg','农场主账号2',2,2,2,'2024-01-29 14:14:16','采购备注2'),(183,'2024-01-29 06:14:16','用品编号3','用品名称3','用品类型3','供应商3','upload/yongpinruku_yongpintupian3.jpg,upload/yongpinruku_yongpintupian4.jpg,upload/yongpinruku_yongpintupian5.jpg','农场主账号3',3,3,3,'2024-01-29 14:14:16','采购备注3'),(184,'2024-01-29 06:14:16','用品编号4','用品名称4','用品类型4','供应商4','upload/yongpinruku_yongpintupian4.jpg,upload/yongpinruku_yongpintupian5.jpg,upload/yongpinruku_yongpintupian6.jpg','农场主账号4',4,4,4,'2024-01-29 14:14:16','采购备注4'),(185,'2024-01-29 06:14:16','用品编号5','用品名称5','用品类型5','供应商5','upload/yongpinruku_yongpintupian5.jpg,upload/yongpinruku_yongpintupian6.jpg,upload/yongpinruku_yongpintupian7.jpg','农场主账号5',5,5,5,'2024-01-29 14:14:16','采购备注5'),(186,'2024-01-29 06:14:16','用品编号6','用品名称6','用品类型6','供应商6','upload/yongpinruku_yongpintupian6.jpg,upload/yongpinruku_yongpintupian7.jpg,upload/yongpinruku_yongpintupian8.jpg','农场主账号6',6,6,6,'2024-01-29 14:14:16','采购备注6'),(187,'2024-01-29 06:14:16','用品编号7','用品名称7','用品类型7','供应商7','upload/yongpinruku_yongpintupian7.jpg,upload/yongpinruku_yongpintupian8.jpg,upload/yongpinruku_yongpintupian9.jpg','农场主账号7',7,7,7,'2024-01-29 14:14:16','采购备注7'),(188,'2024-01-29 06:14:16','用品编号8','用品名称8','用品类型8','供应商8','upload/yongpinruku_yongpintupian8.jpg,upload/yongpinruku_yongpintupian9.jpg,upload/yongpinruku_yongpintupian10.jpg','农场主账号8',8,8,8,'2024-01-29 14:14:16','采购备注8');
/*!40000 ALTER TABLE `yongpinruku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiliangjiancehesuyuan`
--

DROP TABLE IF EXISTS `zhiliangjiancehesuyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiliangjiancehesuyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `zhongzhimianji` varchar(200) DEFAULT NULL COMMENT '种植面积(㎡)',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `zuowumingcheng` varchar(200) DEFAULT NULL COMMENT '作物名称',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `jishuyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '技术员账号',
  `jishuyuan` varchar(200) DEFAULT NULL COMMENT '技术员',
  `jishuyuanshouji` varchar(200) DEFAULT NULL COMMENT '技术员手机',
  `jiancexiangmu` varchar(200) NOT NULL COMMENT '检测项目',
  `jiancejieguo` varchar(200) NOT NULL COMMENT '检测结果',
  `suyuanma` longtext COMMENT '溯源码',
  `renzhengjigou` varchar(200) NOT NULL COMMENT '认证机构',
  `jiancebaogao` longtext COMMENT '检测报告',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8 COMMENT='质量检测和溯源';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiliangjiancehesuyuan`
--

LOCK TABLES `zhiliangjiancehesuyuan` WRITE;
/*!40000 ALTER TABLE `zhiliangjiancehesuyuan` DISABLE KEYS */;
INSERT INTO `zhiliangjiancehesuyuan` VALUES (111,'2024-01-29 06:14:16','地块编号1','种植面积(㎡)1','农场主账号1','农场主1','作物名称1','种植户账号1','种植户1','技术员账号1','技术员1','技术员手机1','检测项目1','正常','upload/zhiliangjiancehesuyuan_suyuanma1.jpg,upload/zhiliangjiancehesuyuan_suyuanma2.jpg,upload/zhiliangjiancehesuyuan_suyuanma3.jpg','认证机构1','检测报告1'),(112,'2024-01-29 06:14:16','地块编号2','种植面积(㎡)2','农场主账号2','农场主2','作物名称2','种植户账号2','种植户2','技术员账号2','技术员2','技术员手机2','检测项目2','正常','upload/zhiliangjiancehesuyuan_suyuanma2.jpg,upload/zhiliangjiancehesuyuan_suyuanma3.jpg,upload/zhiliangjiancehesuyuan_suyuanma4.jpg','认证机构2','检测报告2'),(113,'2024-01-29 06:14:16','地块编号3','种植面积(㎡)3','农场主账号3','农场主3','作物名称3','种植户账号3','种植户3','技术员账号3','技术员3','技术员手机3','检测项目3','正常','upload/zhiliangjiancehesuyuan_suyuanma3.jpg,upload/zhiliangjiancehesuyuan_suyuanma4.jpg,upload/zhiliangjiancehesuyuan_suyuanma5.jpg','认证机构3','检测报告3'),(114,'2024-01-29 06:14:16','地块编号4','种植面积(㎡)4','农场主账号4','农场主4','作物名称4','种植户账号4','种植户4','技术员账号4','技术员4','技术员手机4','检测项目4','正常','upload/zhiliangjiancehesuyuan_suyuanma4.jpg,upload/zhiliangjiancehesuyuan_suyuanma5.jpg,upload/zhiliangjiancehesuyuan_suyuanma6.jpg','认证机构4','检测报告4'),(115,'2024-01-29 06:14:16','地块编号5','种植面积(㎡)5','农场主账号5','农场主5','作物名称5','种植户账号5','种植户5','技术员账号5','技术员5','技术员手机5','检测项目5','正常','upload/zhiliangjiancehesuyuan_suyuanma5.jpg,upload/zhiliangjiancehesuyuan_suyuanma6.jpg,upload/zhiliangjiancehesuyuan_suyuanma7.jpg','认证机构5','检测报告5'),(116,'2024-01-29 06:14:16','地块编号6','种植面积(㎡)6','农场主账号6','农场主6','作物名称6','种植户账号6','种植户6','技术员账号6','技术员6','技术员手机6','检测项目6','正常','upload/zhiliangjiancehesuyuan_suyuanma6.jpg,upload/zhiliangjiancehesuyuan_suyuanma7.jpg,upload/zhiliangjiancehesuyuan_suyuanma8.jpg','认证机构6','检测报告6'),(117,'2024-01-29 06:14:16','地块编号7','种植面积(㎡)7','农场主账号7','农场主7','作物名称7','种植户账号7','种植户7','技术员账号7','技术员7','技术员手机7','检测项目7','正常','upload/zhiliangjiancehesuyuan_suyuanma7.jpg,upload/zhiliangjiancehesuyuan_suyuanma8.jpg,upload/zhiliangjiancehesuyuan_suyuanma9.jpg','认证机构7','检测报告7'),(118,'2024-01-29 06:14:16','地块编号8','种植面积(㎡)8','农场主账号8','农场主8','作物名称8','种植户账号8','种植户8','技术员账号8','技术员8','技术员手机8','检测项目8','正常','upload/zhiliangjiancehesuyuan_suyuanma8.jpg,upload/zhiliangjiancehesuyuan_suyuanma9.jpg,upload/zhiliangjiancehesuyuan_suyuanma10.jpg','认证机构8','检测报告8');
/*!40000 ALTER TABLE `zhiliangjiancehesuyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhongzhifeiyong`
--

DROP TABLE IF EXISTS `zhongzhifeiyong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhongzhifeiyong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `piaoju` longtext COMMENT '票据',
  `zhichuleixing` varchar(200) NOT NULL COMMENT '支出类型',
  `zhichufeiyong` double NOT NULL COMMENT '支出费用',
  `dengjiriqi` date DEFAULT NULL COMMENT '登记日期',
  `gongzuoliang` longtext NOT NULL COMMENT '工作量',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8 COMMENT='种植费用';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhongzhifeiyong`
--

LOCK TABLES `zhongzhifeiyong` WRITE;
/*!40000 ALTER TABLE `zhongzhifeiyong` DISABLE KEYS */;
INSERT INTO `zhongzhifeiyong` VALUES (91,'2024-01-29 06:14:16','种植户账号1','种植户1','联系方式1','upload/zhongzhifeiyong_piaoju1.jpg,upload/zhongzhifeiyong_piaoju2.jpg,upload/zhongzhifeiyong_piaoju3.jpg','种子',1,'2024-01-29','工作量1','备注1'),(92,'2024-01-29 06:14:16','种植户账号2','种植户2','联系方式2','upload/zhongzhifeiyong_piaoju2.jpg,upload/zhongzhifeiyong_piaoju3.jpg,upload/zhongzhifeiyong_piaoju4.jpg','种子',2,'2024-01-29','工作量2','备注2'),(93,'2024-01-29 06:14:16','种植户账号3','种植户3','联系方式3','upload/zhongzhifeiyong_piaoju3.jpg,upload/zhongzhifeiyong_piaoju4.jpg,upload/zhongzhifeiyong_piaoju5.jpg','种子',3,'2024-01-29','工作量3','备注3'),(94,'2024-01-29 06:14:16','种植户账号4','种植户4','联系方式4','upload/zhongzhifeiyong_piaoju4.jpg,upload/zhongzhifeiyong_piaoju5.jpg,upload/zhongzhifeiyong_piaoju6.jpg','种子',4,'2024-01-29','工作量4','备注4'),(95,'2024-01-29 06:14:16','种植户账号5','种植户5','联系方式5','upload/zhongzhifeiyong_piaoju5.jpg,upload/zhongzhifeiyong_piaoju6.jpg,upload/zhongzhifeiyong_piaoju7.jpg','种子',5,'2024-01-29','工作量5','备注5'),(96,'2024-01-29 06:14:16','种植户账号6','种植户6','联系方式6','upload/zhongzhifeiyong_piaoju6.jpg,upload/zhongzhifeiyong_piaoju7.jpg,upload/zhongzhifeiyong_piaoju8.jpg','种子',6,'2024-01-29','工作量6','备注6'),(97,'2024-01-29 06:14:16','种植户账号7','种植户7','联系方式7','upload/zhongzhifeiyong_piaoju7.jpg,upload/zhongzhifeiyong_piaoju8.jpg,upload/zhongzhifeiyong_piaoju9.jpg','种子',7,'2024-01-29','工作量7','备注7'),(98,'2024-01-29 06:14:16','种植户账号8','种植户8','联系方式8','upload/zhongzhifeiyong_piaoju8.jpg,upload/zhongzhifeiyong_piaoju9.jpg,upload/zhongzhifeiyong_piaoju10.jpg','种子',8,'2024-01-29','工作量8','备注8');
/*!40000 ALTER TABLE `zhongzhifeiyong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhongzhihu`
--

DROP TABLE IF EXISTS `zhongzhihu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhongzhihu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhongzhihuzhanghao` varchar(200) NOT NULL COMMENT '种植户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zhongzhihu` varchar(200) NOT NULL COMMENT '种植户',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhongzhihuzhanghao` (`zhongzhihuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='种植户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhongzhihu`
--

LOCK TABLES `zhongzhihu` WRITE;
/*!40000 ALTER TABLE `zhongzhihu` DISABLE KEYS */;
INSERT INTO `zhongzhihu` VALUES (21,'2024-01-29 06:14:16','种植户账号1','123456','种植户1',1,'男','13823888881','773890001@qq.com','upload/zhongzhihu_touxiang1.jpg'),(22,'2024-01-29 06:14:16','种植户账号2','123456','种植户2',2,'男','13823888882','773890002@qq.com','upload/zhongzhihu_touxiang2.jpg'),(23,'2024-01-29 06:14:16','种植户账号3','123456','种植户3',3,'男','13823888883','773890003@qq.com','upload/zhongzhihu_touxiang3.jpg'),(24,'2024-01-29 06:14:16','种植户账号4','123456','种植户4',4,'男','13823888884','773890004@qq.com','upload/zhongzhihu_touxiang4.jpg'),(25,'2024-01-29 06:14:16','种植户账号5','123456','种植户5',5,'男','13823888885','773890005@qq.com','upload/zhongzhihu_touxiang5.jpg'),(26,'2024-01-29 06:14:16','种植户账号6','123456','种植户6',6,'男','13823888886','773890006@qq.com','upload/zhongzhihu_touxiang6.jpg'),(27,'2024-01-29 06:14:16','种植户账号7','123456','种植户7',7,'男','13823888887','773890007@qq.com','upload/zhongzhihu_touxiang7.jpg'),(28,'2024-01-29 06:14:16','种植户账号8','123456','种植户8',8,'男','13823888888','773890008@qq.com','upload/zhongzhihu_touxiang8.jpg');
/*!40000 ALTER TABLE `zhongzhihu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhongzhijihua`
--

DROP TABLE IF EXISTS `zhongzhijihua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhongzhijihua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) NOT NULL COMMENT '标题',
  `fengmiantupian` longtext COMMENT '封面图片',
  `jishuyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '技术员账号',
  `jishuyuan` varchar(200) DEFAULT NULL COMMENT '技术员',
  `jishuyuanshouji` varchar(200) DEFAULT NULL COMMENT '技术员手机',
  `pHzhi` varchar(200) DEFAULT NULL COMMENT 'pH值',
  `zhidi` varchar(200) DEFAULT NULL COMMENT '质地',
  `yangfenhanliang` varchar(200) DEFAULT NULL COMMENT '养分含量',
  `shuifenzhuangkuang` varchar(200) DEFAULT NULL COMMENT '水分状况',
  `wendu` varchar(200) DEFAULT NULL COMMENT '温度(℃)',
  `shidu` varchar(200) DEFAULT NULL COMMENT '湿度(%rh)',
  `rizhaoshishu` varchar(200) DEFAULT NULL COMMENT '日照时数',
  `jiangshuiliang` varchar(200) DEFAULT NULL COMMENT '降水量',
  `zhongzhijihua` longtext COMMENT '种植计划',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='种植计划';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhongzhijihua`
--

LOCK TABLES `zhongzhijihua` WRITE;
/*!40000 ALTER TABLE `zhongzhijihua` DISABLE KEYS */;
INSERT INTO `zhongzhijihua` VALUES (101,'2024-01-29 06:14:16','标题1','upload/zhongzhijihua_fengmiantupian1.jpg,upload/zhongzhijihua_fengmiantupian2.jpg,upload/zhongzhijihua_fengmiantupian3.jpg','技术员账号1','技术员1','技术员手机1','pH值1','质地1','养分含量1','水分状况1','温度(℃)1','湿度(%rh)1','日照时数1','降水量1','种植计划1','2024-01-29','2024-01-29 14:14:16',1,1),(102,'2024-01-29 06:14:16','标题2','upload/zhongzhijihua_fengmiantupian2.jpg,upload/zhongzhijihua_fengmiantupian3.jpg,upload/zhongzhijihua_fengmiantupian4.jpg','技术员账号2','技术员2','技术员手机2','pH值2','质地2','养分含量2','水分状况2','温度(℃)2','湿度(%rh)2','日照时数2','降水量2','种植计划2','2024-01-29','2024-01-29 14:14:16',2,2),(103,'2024-01-29 06:14:16','标题3','upload/zhongzhijihua_fengmiantupian3.jpg,upload/zhongzhijihua_fengmiantupian4.jpg,upload/zhongzhijihua_fengmiantupian5.jpg','技术员账号3','技术员3','技术员手机3','pH值3','质地3','养分含量3','水分状况3','温度(℃)3','湿度(%rh)3','日照时数3','降水量3','种植计划3','2024-01-29','2024-01-29 14:14:16',3,3),(104,'2024-01-29 06:14:16','标题4','upload/zhongzhijihua_fengmiantupian4.jpg,upload/zhongzhijihua_fengmiantupian5.jpg,upload/zhongzhijihua_fengmiantupian6.jpg','技术员账号4','技术员4','技术员手机4','pH值4','质地4','养分含量4','水分状况4','温度(℃)4','湿度(%rh)4','日照时数4','降水量4','种植计划4','2024-01-29','2024-01-29 14:14:16',4,4),(105,'2024-01-29 06:14:16','标题5','upload/zhongzhijihua_fengmiantupian5.jpg,upload/zhongzhijihua_fengmiantupian6.jpg,upload/zhongzhijihua_fengmiantupian7.jpg','技术员账号5','技术员5','技术员手机5','pH值5','质地5','养分含量5','水分状况5','温度(℃)5','湿度(%rh)5','日照时数5','降水量5','种植计划5','2024-01-29','2024-01-29 14:14:16',5,5),(106,'2024-01-29 06:14:16','标题6','upload/zhongzhijihua_fengmiantupian6.jpg,upload/zhongzhijihua_fengmiantupian7.jpg,upload/zhongzhijihua_fengmiantupian8.jpg','技术员账号6','技术员6','技术员手机6','pH值6','质地6','养分含量6','水分状况6','温度(℃)6','湿度(%rh)6','日照时数6','降水量6','种植计划6','2024-01-29','2024-01-29 14:14:16',6,6),(107,'2024-01-29 06:14:16','标题7','upload/zhongzhijihua_fengmiantupian7.jpg,upload/zhongzhijihua_fengmiantupian8.jpg,upload/zhongzhijihua_fengmiantupian9.jpg','技术员账号7','技术员7','技术员手机7','pH值7','质地7','养分含量7','水分状况7','温度(℃)7','湿度(%rh)7','日照时数7','降水量7','种植计划7','2024-01-29','2024-01-29 14:14:16',7,7),(108,'2024-01-29 06:14:16','标题8','upload/zhongzhijihua_fengmiantupian8.jpg,upload/zhongzhijihua_fengmiantupian9.jpg,upload/zhongzhijihua_fengmiantupian10.jpg','技术员账号8','技术员8','技术员手机8','pH值8','质地8','养分含量8','水分状况8','温度(℃)8','湿度(%rh)8','日照时数8','降水量8','种植计划8','2024-01-29','2024-01-29 14:14:16',8,8);
/*!40000 ALTER TABLE `zhongzhijihua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zuowushiyingxingpinggu`
--

DROP TABLE IF EXISTS `zuowushiyingxingpinggu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zuowushiyingxingpinggu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dikuaibianhao` varchar(200) DEFAULT NULL COMMENT '地块编号',
  `zhongzhimianji` varchar(200) DEFAULT NULL COMMENT '种植面积(㎡)',
  `nongchangzhuzhanghao` varchar(200) DEFAULT NULL COMMENT '农场主账号',
  `nongchangzhu` varchar(200) DEFAULT NULL COMMENT '农场主',
  `zuowumingcheng` varchar(200) DEFAULT NULL COMMENT '作物名称',
  `zhongzhishijian` varchar(200) DEFAULT NULL COMMENT '种植时间',
  `zhongzhihuzhanghao` varchar(200) DEFAULT NULL COMMENT '种植户账号',
  `zhongzhihu` varchar(200) DEFAULT NULL COMMENT '种植户',
  `pinggutupian` longtext COMMENT '评估图片',
  `jishuyuanzhanghao` varchar(200) DEFAULT NULL COMMENT '技术员账号',
  `jishuyuan` varchar(200) DEFAULT NULL COMMENT '技术员',
  `jishuyuanshouji` varchar(200) DEFAULT NULL COMMENT '技术员手机',
  `qihoutiaojian` varchar(200) NOT NULL COMMENT '气候条件',
  `turangleixing` varchar(200) NOT NULL COMMENT '土壤类型',
  `chanliangbiaoxian` varchar(200) DEFAULT NULL COMMENT '产量表现',
  `shiyingxingpinggu` longtext COMMENT '适应性评估',
  `pinggushijian` date DEFAULT NULL COMMENT '评估时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=139 DEFAULT CHARSET=utf8 COMMENT='作物适应性评估';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zuowushiyingxingpinggu`
--

LOCK TABLES `zuowushiyingxingpinggu` WRITE;
/*!40000 ALTER TABLE `zuowushiyingxingpinggu` DISABLE KEYS */;
INSERT INTO `zuowushiyingxingpinggu` VALUES (131,'2024-01-29 06:14:16','地块编号1','种植面积(㎡)1','农场主账号1','农场主1','作物名称1','种植时间1','种植户账号1','种植户1','upload/zuowushiyingxingpinggu_pinggutupian1.jpg,upload/zuowushiyingxingpinggu_pinggutupian2.jpg,upload/zuowushiyingxingpinggu_pinggutupian3.jpg','技术员账号1','技术员1','技术员手机1','气候条件1','砂质土','产量表现1','适应性评估1','2024-01-29'),(132,'2024-01-29 06:14:16','地块编号2','种植面积(㎡)2','农场主账号2','农场主2','作物名称2','种植时间2','种植户账号2','种植户2','upload/zuowushiyingxingpinggu_pinggutupian2.jpg,upload/zuowushiyingxingpinggu_pinggutupian3.jpg,upload/zuowushiyingxingpinggu_pinggutupian4.jpg','技术员账号2','技术员2','技术员手机2','气候条件2','砂质土','产量表现2','适应性评估2','2024-01-29'),(133,'2024-01-29 06:14:16','地块编号3','种植面积(㎡)3','农场主账号3','农场主3','作物名称3','种植时间3','种植户账号3','种植户3','upload/zuowushiyingxingpinggu_pinggutupian3.jpg,upload/zuowushiyingxingpinggu_pinggutupian4.jpg,upload/zuowushiyingxingpinggu_pinggutupian5.jpg','技术员账号3','技术员3','技术员手机3','气候条件3','砂质土','产量表现3','适应性评估3','2024-01-29'),(134,'2024-01-29 06:14:16','地块编号4','种植面积(㎡)4','农场主账号4','农场主4','作物名称4','种植时间4','种植户账号4','种植户4','upload/zuowushiyingxingpinggu_pinggutupian4.jpg,upload/zuowushiyingxingpinggu_pinggutupian5.jpg,upload/zuowushiyingxingpinggu_pinggutupian6.jpg','技术员账号4','技术员4','技术员手机4','气候条件4','砂质土','产量表现4','适应性评估4','2024-01-29'),(135,'2024-01-29 06:14:16','地块编号5','种植面积(㎡)5','农场主账号5','农场主5','作物名称5','种植时间5','种植户账号5','种植户5','upload/zuowushiyingxingpinggu_pinggutupian5.jpg,upload/zuowushiyingxingpinggu_pinggutupian6.jpg,upload/zuowushiyingxingpinggu_pinggutupian7.jpg','技术员账号5','技术员5','技术员手机5','气候条件5','砂质土','产量表现5','适应性评估5','2024-01-29'),(136,'2024-01-29 06:14:16','地块编号6','种植面积(㎡)6','农场主账号6','农场主6','作物名称6','种植时间6','种植户账号6','种植户6','upload/zuowushiyingxingpinggu_pinggutupian6.jpg,upload/zuowushiyingxingpinggu_pinggutupian7.jpg,upload/zuowushiyingxingpinggu_pinggutupian8.jpg','技术员账号6','技术员6','技术员手机6','气候条件6','砂质土','产量表现6','适应性评估6','2024-01-29'),(137,'2024-01-29 06:14:16','地块编号7','种植面积(㎡)7','农场主账号7','农场主7','作物名称7','种植时间7','种植户账号7','种植户7','upload/zuowushiyingxingpinggu_pinggutupian7.jpg,upload/zuowushiyingxingpinggu_pinggutupian8.jpg,upload/zuowushiyingxingpinggu_pinggutupian9.jpg','技术员账号7','技术员7','技术员手机7','气候条件7','砂质土','产量表现7','适应性评估7','2024-01-29'),(138,'2024-01-29 06:14:16','地块编号8','种植面积(㎡)8','农场主账号8','农场主8','作物名称8','种植时间8','种植户账号8','种植户8','upload/zuowushiyingxingpinggu_pinggutupian8.jpg,upload/zuowushiyingxingpinggu_pinggutupian9.jpg,upload/zuowushiyingxingpinggu_pinggutupian10.jpg','技术员账号8','技术员8','技术员手机8','气候条件8','砂质土','产量表现8','适应性评估8','2024-01-29');
/*!40000 ALTER TABLE `zuowushiyingxingpinggu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-18 10:39:29
