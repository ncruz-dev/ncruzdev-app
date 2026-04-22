package com.ncruz.application;

import com.ncruz.domain.GreetingRepository;
import com.ncruz.infraestructura.input.GreetingResponse;
import jakarta.inject.Inject;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ApplicationScoped
public class GreetingService {

    private final GreetingRepository repository;

    @Inject
    public GreetingService(GreetingRepository repository){
        this.repository = repository;
    }

    public GreetingResponse getGreetingFromCharacters(Long id){
        return repository.getCharacterById(id);
    }

}
