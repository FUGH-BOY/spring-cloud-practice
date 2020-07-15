package com.fgh.entity;

import com.fgh.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //相当于同时使用了@ToString、@EqualsAndHashCode、@Getter、@Setter和@RequiredArgsConstrutor
@NoArgsConstructor //生成无参构造
@AllArgsConstructor //生成全部参数构造
// @EqualsAndHashCode //生成equals 和 hashCode
public class Order extends BaseEntity {
    private static final long serialVersionUID = 6008648238119458114L;
    private Long id;
    private String name;
}
