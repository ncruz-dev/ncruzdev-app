package com.ncruz.infraestructura.output.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DragonBallApiResponse {

    private Integer id;
    private String name;
    private String maxKi;
    private String race;
    private String description;

}
