package com.gec.spring5demo3.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Component(value = "User")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
}
