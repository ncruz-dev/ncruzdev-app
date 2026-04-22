package com.ncruz.domain;

import com.ncruz.infraestructura.input.GreetingResponse;

import java.util.List;

public interface GreetingRepository {

    GreetingResponse getCharacterById(Long id);

    List<GreetingResponse> getAllCharacters();

}
