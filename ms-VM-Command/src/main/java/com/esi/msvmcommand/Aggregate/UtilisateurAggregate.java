package com.esi.msvmcommand.Aggregate;

import com.esi.coreapi.commands.Vm.AddUserCommand;
import com.esi.coreapi.commands.Vm.AddVmCommand;
import com.esi.coreapi.commands.Vm.DeleteVmCommand;
import com.esi.coreapi.events.Vm.UserAddedEvent;
import com.esi.coreapi.events.Vm.VmAddedEvent;
import com.esi.coreapi.events.Vm.VmDeletedEvent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.ArrayList;
import java.util.List;

@Aggregate
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class UtilisateurAggregate {

    @AggregateIdentifier
    @Id
    private Long idUtilisateur;
    private String nom;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "utilisateur")
     //---à completer
    private List<VmAggregate> vms;

    @CommandHandler
    public UtilisateurAggregate(AddUserCommand cmd) {

        AggregateLifecycle.apply(
                new UserAddedEvent(cmd.getIdUtilisateur(), cmd.getNom(), cmd.getEmail()));
    }

    @EventSourcingHandler
    public void on(UserAddedEvent event) {
        //---à completer
    }



    @CommandHandler
    public void addVm(AddVmCommand cmd) {
        AggregateLifecycle.apply(
                new VmAddedEvent(cmd.getIdUtilisateur(), cmd.getIdVm(), cmd.getConfiguration(), cmd.getIdServeur()));
    }

    @EventSourcingHandler
    public void on(VmAddedEvent event){
        this.vms.add(new VmAggregate(event.getIdVm(),
                       event.getConfiguration(),
                                     this,
                                     event.getIdServeur()));
    }


    @CommandHandler
    public void deleteVm(DeleteVmCommand cmd) {
        AggregateLifecycle.apply(
                new VmDeletedEvent(cmd.getIdUtilisateur(), cmd.getIdVm()));
    }

    @EventSourcingHandler
    public void on(VmDeletedEvent event){
        //---à completer

    }

}
