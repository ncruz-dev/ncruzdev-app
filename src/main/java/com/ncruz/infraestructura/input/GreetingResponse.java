package com.ncruz.infraestructura.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GreetingResponse {

    private Integer id;
    private String name;
    private String maxKi;
    private String race;
    private String description;


}
