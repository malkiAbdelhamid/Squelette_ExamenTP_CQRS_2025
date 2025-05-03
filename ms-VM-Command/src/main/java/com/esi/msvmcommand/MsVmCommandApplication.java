package com.esi.msvmcommand;

import com.esi.coreapi.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AxonConfig.class})

public class MsVmCommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsVmCommandApplication.class, args);
    }

}
