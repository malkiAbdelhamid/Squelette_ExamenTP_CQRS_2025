package com.esi.msquerymongo.Projection;


import com.esi.coreapi.events.DataCenter.DataCenterAddedEvent;
import com.esi.coreapi.events.DataCenter.ServeurAddedEvent;
import com.esi.coreapi.events.Vm.VmAddedEvent;
import com.esi.coreapi.events.Vm.VmDeletedEvent;
import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StatusProjection {


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
    public void AddVm (VmAddedEvent event)  {
        //---à completer

    }



    @EventHandler
    public void DeleteVm (VmDeletedEvent event)  {
        //---à completer

    }



}
