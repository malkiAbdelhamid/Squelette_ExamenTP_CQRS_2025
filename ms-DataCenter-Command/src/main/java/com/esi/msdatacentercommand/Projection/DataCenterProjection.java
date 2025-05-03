package com.esi.msdatacentercommand.Projection;

import com.esi.coreapi.events.DataCenter.DataCenterAddedEvent;
import com.esi.coreapi.events.DataCenter.ServeurAddedEvent;
import com.esi.coreapi.events.DataCenter.ServeurDeletedEvent;

import com.esi.msdatacentercommand.Aggregate.DataCenterAggregate;
import com.esi.msdatacentercommand.Aggregate.ServeurAggregate;
import com.esi.msdatacentercommand.Repository.DataCenterRepo;
import com.esi.msdatacentercommand.Repository.ServeurRepo;

import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataCenterProjection {

    public final DataCenterRepo dataCenterRepo;
    public final ServeurRepo serveurRepo;

    @EventHandler
    public void  AddDataCenter(DataCenterAddedEvent event)
    {
        //---à completer
    }

    @EventHandler
    public void AddServeur (ServeurAddedEvent event)  {
        //---à completer
    }




    @EventHandler
    public void removeServeur(ServeurDeletedEvent event) {

        //---à completer
        }
}
