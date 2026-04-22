package com.ncruz.infraestructura.output.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DragonBallCharactersResponse {

    private List<DragonBallApiResponse> items;

}

