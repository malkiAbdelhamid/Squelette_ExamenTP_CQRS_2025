package com.esi.msdatacentercommand.API;


import com.esi.coreapi.DTO.DataCenterDTO;
import com.esi.coreapi.DTO.ServeurDTO;

import com.esi.coreapi.commands.DataCenter.AddDataCenterCommand;
import com.esi.coreapi.commands.DataCenter.AddServeurCommand;
import com.esi.coreapi.commands.DataCenter.DeleteServeurCommand;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("command")
public class CommandController {

    private final CommandGateway commandGateway;

    public CommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    //add DataCenter
    @PostMapping("/datacenter")
    public CompletableFuture<String> AddDataCenter(@RequestBody DataCenterDTO dataCenterDTO){
        CompletableFuture<String> response= commandGateway.send(
                      new AddDataCenterCommand(dataCenterDTO.getIdDataCenter(), dataCenterDTO.getVille(), dataCenterDTO.getCapacity()));

        return  response;
    }

    //add Serveur
    @PostMapping("/datacenter/{idDataCenter}/serveur")
    public CompletableFuture<String> addServeur(@PathVariable Long idDataCenter, @RequestBody ServeurDTO serveurDTO ){
        CompletableFuture<String> response= commandGateway.send(
               new AddServeurCommand(idDataCenter, serveurDTO.getIdServeur(), serveurDTO.getConfiguration()));
        return response;
    }


    // delete Serveur
    @DeleteMapping("/datacenter/{idDataCenter}/{idServeur}")
    public CompletableFuture<String> removeServeur(@PathVariable Long idDataCenter, @PathVariable Long idServeur) {
        CompletableFuture<String> response= commandGateway.send(
                        new DeleteServeurCommand(idDataCenter, idServeur));
        return response;
    }
}

