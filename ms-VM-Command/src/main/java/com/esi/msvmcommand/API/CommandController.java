package com.esi.msvmcommand.API;


import com.esi.coreapi.DTO.UserDTO;
import com.esi.coreapi.DTO.VmDTO;
import com.esi.coreapi.commands.Vm.AddUserCommand;
import com.esi.coreapi.commands.Vm.AddVmCommand;
import com.esi.coreapi.commands.Vm.DeleteVmCommand;
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

    //add user
    @PostMapping("/utilisateur")
    public CompletableFuture<String> AddUser(@RequestBody UserDTO userDTO){
        CompletableFuture<String> response= commandGateway.send(
                      new AddUserCommand(userDTO.getIdUtilisateur(), userDTO.getNom(), userDTO.getEmail()));

        return  response;
    }

    //add vm
    @PostMapping("utilisateur/{userid}/vm")
    public CompletableFuture<String> addVm(@PathVariable Long userid, @RequestBody VmDTO vmDTO ){
        CompletableFuture<String> response= commandGateway.send(
                new AddVmCommand(userid, vmDTO.getIdVm(), vmDTO.getConfiguration(), vmDTO.getIdServeur()));
        return response;
    }


    // delete VM
    @DeleteMapping("utilisateur/{userid}/{idvm}")
    public CompletableFuture<String> removeVm(@PathVariable Long userid, @PathVariable Long idvm) {
        CompletableFuture<String> response= commandGateway.send(
                        new DeleteVmCommand(userid, idvm));
        return response;
    }
}

