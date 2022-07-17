package com.tianque.entity;



import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author fades
 * @description
 * @date 2022/7/10 17:20
 */

//@Data注解能在编译是自动生成get和set方法
@Data
@ToString
@TableName(value = "tb_newbee_mall_user", schema = "myschema")
public class User {

    private String testAttributeMasterMaster;
    private String testAttributeHotFix;
    private String testPush;
    private String testPull;
    //用户主键id
    private Integer user_id;
    //用户昵称
    private String nick_name;
    //登陆名称(默认为手机号)
    private String login_name;
    //MD5加密后的密码
    private String password_md5;
    //个性签名
    private String introduce_sign;
    //收货地址
    private String address;
    //注销标识字段(0-正常 1-已注销)
    private Byte is_deleted;
    //锁定标识字段(0-未锁定 1-已锁定)
    private Byte locked_flag;
    //注册时间
    private Date create_time;
}
