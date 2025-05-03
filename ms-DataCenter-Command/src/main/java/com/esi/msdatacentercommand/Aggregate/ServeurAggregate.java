package com.esi.msdatacentercommand.Aggregate;

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
public class ServeurAggregate {
    //---à completer
    private Long idServeur;
    @Embedded
    private Configuration configuration;
    @ManyToOne
    private DataCenterAggregate dataCenter;

}
