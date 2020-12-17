package com.luo.mybatis.pojo;

import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

/**
 * @author luo Fuqiang
 * @date 2020/12/17 14:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "department")
@NameStyle(Style.camelhumpAndLowercase)
public class Department {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private String departmentName;
}
