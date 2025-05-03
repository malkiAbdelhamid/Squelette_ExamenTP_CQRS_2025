package com.esi.coreapi.commands.DataCenter;

import com.esi.coreapi.Configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddServeurCommand {

    @TargetAggregateIdentifier
    private Long idDataCenter;
    private Long idServeur;
    private Configuration configuration;
}
