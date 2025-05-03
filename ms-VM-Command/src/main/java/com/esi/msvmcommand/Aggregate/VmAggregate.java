package com.esi.msvmcommand.Aggregate;

import com.esi.coreapi.Configuration;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.EntityId;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class VmAggregate {

    //---à completer
    private Long idVm;
    @Embedded
    private Configuration configuration;
    @ManyToOne
    private UtilisateurAggregate utilisateur;
    private Long idServeur;
}
