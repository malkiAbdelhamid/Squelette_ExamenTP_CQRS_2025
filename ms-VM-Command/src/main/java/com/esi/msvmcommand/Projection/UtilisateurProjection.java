package com.esi.msvmcommand.Projection;

import com.esi.coreapi.events.Vm.UserAddedEvent;
import com.esi.coreapi.events.Vm.VmAddedEvent;
import com.esi.coreapi.events.Vm.VmDeletedEvent;

import com.esi.msvmcommand.Aggregate.UtilisateurAggregate;
import com.esi.msvmcommand.Aggregate.VmAggregate;
import com.esi.msvmcommand.Repository.UtilisateurRepo;
import com.esi.msvmcommand.Repository.VmRepo;

import lombok.RequiredArgsConstructor;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UtilisateurProjection {

    public final UtilisateurRepo utilisateurRepo;
    public final VmRepo vmRepo;

    @EventHandler
    public void  AddUser(UserAddedEvent event)
    {
        UtilisateurAggregate utilisateurAggregate=
                 new UtilisateurAggregate(event.getIdUtilisateur(),event.getNom(),event.getEmail(), null);
    utilisateurRepo.save(utilisateurAggregate);
    }

    @EventHandler
    public void AddVm (VmAddedEvent event)  {
        //---à completer
    }



    @EventHandler
    public void removeVm(VmDeletedEvent event) {

        //---à completer
    }
}
