package com.tianque.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author fades
 * @description
 * @date 2022/7/13 16:29
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "tb_department_info")
public class Department {

  @TableField(value = "name")
  private String name;

  @TableField(value = "create_user")
  private String createUser;

  @TableField(value = "update_user")
  private String updateUser;

  @TableField(value = "create_date")
  private Timestamp createDate;

  @TableField(value = "update_date")
  private Timestamp updateDate;

  @TableField(value = "create_dept_code")
  private String createDeptCode;

  @TableField(value = "belong_dept_code")
  private String belongDeptCode;

  @TableField(value = "code")
  private String code;

  @TableField(value = "id_delete")
  private Byte isDelete;
}
