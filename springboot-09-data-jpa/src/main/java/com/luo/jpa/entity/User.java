package com.luo.jpa.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 使用JPA配置映射关系
 * 注解@Entity告诉JPA这是一个实体类（和数据表映射的类）
 * 注解@Table(name = "user")来指定和哪个数据表对应，name省略，默认是类的首字母小写
 * @author luo Fuqiang
 * @date 2020/12/22 14:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "jpa_user")
public class User {

    /**
     * 用@Id标注是主键
     * 用@GeneratedValue标注为自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用@Column标注是列名
     */
    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column
    private String email;
}
