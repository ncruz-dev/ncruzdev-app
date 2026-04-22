package com.ncruz.domain;

import com.ncruz.infraestructura.input.GreetingResponse;

public interface GreetingRepository {

    GreetingResponse getCharacterById(Long id);

}
