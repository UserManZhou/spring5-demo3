package com.gec.spring5demo3.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component(value = "Persion2")
public class Persion {
    @Value("nihao")
    private String p_name;
}
