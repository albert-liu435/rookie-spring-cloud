CREATE DATABASE mall_goods;

CREATE TABLE `goods` (
                         `id` int unsigned NOT NULL AUTO_INCREMENT,
                         `goods_name` varchar(524) DEFAULT NULL COMMENT '商品名称',
                         `price` int DEFAULT NULL COMMENT '商品价格(分)',
                         `goods_img` varchar(524) DEFAULT NULL COMMENT '商品封⾯图',
                         `summary` varchar(1026) DEFAULT NULL COMMENT '概述',
                         `create_time` datetime DEFAULT NULL COMMENT '创建时间',
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT INTO `goods` (`id`, `goods_name`, `price`, `goods_img`, `summary`, `create_time`)
VALUES
    (1,'男士纯棉短袖T恤',1800,'www.txun.com','很休闲的一款T恤','2021-04-03 11:48:46'),
    (2,'2021秋季风衣女装',7200,'www.fy.com','很好的一件风衣','2021-04-03 11:48:46'),
    (3,'2021春装新款简约显瘦圆领连衣裙',3600,'www.lyq.com','很好一件连衣裙','2021-04-03 11:48:46');

CREATE DATABASE mall_orders;

CREATE TABLE `goods_order` (
                               `id` int unsigned NOT NULL AUTO_INCREMENT,
                               `order_no` varchar(64) DEFAULT NULL COMMENT '订单号',
                               `total_fee` int DEFAULT NULL COMMENT '⽀付⾦额，单位分',
                               `goods_id` int DEFAULT NULL COMMENT '商品ID',
                               `goods_title` varchar(256) DEFAULT NULL COMMENT '商品标题',
                               `goods_img` varchar(256) DEFAULT NULL COMMENT '商品图⽚',
                               `user_id` int DEFAULT NULL COMMENT '⽤户id',
                               `state` int DEFAULT NULL COMMENT '0表示未⽀付，1表示已⽀付',
                               `create_time` datetime DEFAULT NULL COMMENT '订单⽣成时间',
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO `goods_order` (`id`, `order_no`, `total_fee`, `goods_id`, `goods_title`, `goods_img`, `user_id`, `state`, `create_time`)
VALUES
    (1,'2021033000001-1',1800,1,'男士纯棉短袖T恤','www.txun.com',1,1,'2021-04-03 11:48:46'),
    (2,'2021033000001-2',7200,2,'2021秋季风衣女装','www.fy.com',2,1,'2021-04-03 11:48:46');


CREATE DATABASE mall_user;

CREATE TABLE `user` (
                        `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
                        `phone` varchar(32) DEFAULT NULL  COMMENT '手机号',
                        `pwd` varchar(128) DEFAULT NULL  COMMENT '密码',
                        `sex` int(2) DEFAULT NULL  COMMENT '性别',
                        `img` varchar(128) DEFAULT NULL  COMMENT '头像',
                        `username` varchar(128) DEFAULT NULL  COMMENT '用户名',
                        `create_time` datetime DEFAULT NULL   COMMENT '创建时间',
                        PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARSET = utf8mb4;

INSERT INTO `user` (`id`, `phone`, `pwd`, `sex`, `img`, `username`, `create_time`)
VALUES
    (1,'18812345678','123456',1,'www.touxiang.com','小小','2021-04-03 11:48:46'),
    (2,'18887654321','654321',2,'www.touxiang.com','张三','2021-04-03 11:48:46');


