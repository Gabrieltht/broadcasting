package com.example.entity.dto;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;

import java.util.Date;


@Data
@TableName("db_account")
@AllArgsConstructor
public class Account {
    @TableId(type = IdType.AUTO)
    Integer id;
    String username;
    String password;
    String email;
    String role;
    Date regiterDate;
}
