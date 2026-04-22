package com.ncruz.infraestructura.output;

import com.ncruz.domain.GreetingRepository;
import com.ncruz.infraestructura.input.GreetingResponse;
import com.ncruz.infraestructura.output.dto.DragonBallApiResponse;
import com.ncruz.infraestructura.output.dto.RestClientConfig;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.rest.client.RestClientBuilder;

import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class DragonBallApiServiceImpl implements GreetingRepository {

    private String baseUrl = "https://dragonball-api.com";
    private RestClientConfig restClientConfig;

    @PostConstruct
    public void init(){

        this.restClientConfig = RestClientBuilder
                .newBuilder()
                .baseUri(URI.create(baseUrl))
                .connectTimeout(2, TimeUnit.SECONDS)
                .readTimeout(2, TimeUnit.SECONDS)
                .build(RestClientConfig.class);
    }

    @Override
    public GreetingResponse getCharacterById(Long id) {
        DragonBallApiResponse response = restClientConfig.getCharacter(id);

        //correccion en java debes usar getters, no acceso directo a campos (.id)
        return GreetingResponse.builder()
                .id(response.getId())
                .name(response.getName())
                .maxKi(response.getMaxKi())
                .race(response.getRace())
                .description(response.getDescription())
                .image(response.getImage())
                .build();
    }

    @Override
    public List<GreetingResponse> getAllCharacters() {
        return restClientConfig.getCharacters().getItems().stream()
                .map(response -> GreetingResponse.builder()
                        .id(response.getId())
                        .name(response.getName())
                        .maxKi(response.getMaxKi())
                        .race(response.getRace())
                        .description(response.getDescription())
                        .image(response.getImage())
                        .build())
                .toList();
    }


}
