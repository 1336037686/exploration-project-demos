package com.lgx.chapter01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LGX_TvT <br>
 * @version 1.0 <br>
 * Create by 2023-08-31 16:05 <br>
 * @description: Person <br>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
}
