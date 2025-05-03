package com.esi.msquerymongo;

import com.esi.coreapi.AxonConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
@Import({AxonConfig.class})

@RequiredArgsConstructor
public class MsQueryMongoApplication implements CommandLineRunner {

    public final RepositoryRestConfiguration config;
    public static void main(String[] args) {
        SpringApplication.run(MsQueryMongoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        config.exposeIdsFor(Status.class);
    }
}
