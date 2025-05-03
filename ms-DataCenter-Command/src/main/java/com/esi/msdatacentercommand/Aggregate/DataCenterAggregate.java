package com.esi.msdatacentercommand.Aggregate;

import com.esi.coreapi.commands.DataCenter.AddDataCenterCommand;
import com.esi.coreapi.commands.DataCenter.AddServeurCommand;
import com.esi.coreapi.commands.DataCenter.DeleteServeurCommand;

import com.esi.coreapi.events.DataCenter.DataCenterAddedEvent;
import com.esi.coreapi.events.DataCenter.ServeurAddedEvent;
import com.esi.coreapi.events.DataCenter.ServeurDeletedEvent;

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
public class DataCenterAggregate {

    @AggregateIdentifier
    @Id
    private Long idDataCenter;
    private String ville;
    private int capacity;

    @JsonIgnore
    @OneToMany(mappedBy = "dataCenter")
    //---à completer
    private List<ServeurAggregate> serveurs;

    @CommandHandler
    public DataCenterAggregate(AddDataCenterCommand cmd) {

        AggregateLifecycle.apply(
              new DataCenterAddedEvent(cmd.getIdDataCenter(),cmd.getVille(),cmd.getCapacity()));
    }

    @EventSourcingHandler
    public void on(DataCenterAddedEvent event) {
        //---à completer
    }



    @CommandHandler
    public void addServeur(AddServeurCommand cmd) {
        AggregateLifecycle.apply(
               new ServeurAddedEvent(cmd.getIdDataCenter(),cmd.getIdServeur(),cmd.getConfiguration()));
    }

    @EventSourcingHandler
    public void on(ServeurAddedEvent event){
        //---à completer
    }


    @CommandHandler
    public void deleteServeur(DeleteServeurCommand cmd) {
        AggregateLifecycle.apply(
               new ServeurDeletedEvent(cmd.getIdDataCenter(),cmd.getIdServeur()));
    }

    @EventSourcingHandler
    public void on(ServeurDeletedEvent event){
        //---à completer
        }

}
