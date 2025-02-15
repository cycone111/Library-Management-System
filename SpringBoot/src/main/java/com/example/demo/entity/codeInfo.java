package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@TableName("codeInfo")
@Data
public class codeInfo {

    @TableId (type = IdType.AUTO)
    private Integer id;
    private String isbn;
    private String name;
    private String author;
    private String publisher;
    @JsonFormat(locale="zh",timezone="GMT+8", pattern="yyyy-MM-dd")
    private Date createTime;
    private String status;
}
