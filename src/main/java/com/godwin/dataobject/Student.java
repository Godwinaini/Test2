package com.godwin.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by admin on 2021/3/14.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private int age;
    private String name;
    private String sex;
}
