package com.esi.coreapi.commands.DataCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddDataCenterCommand {
    @TargetAggregateIdentifier
    private Long idDataCenter;
    private String ville;
    private int capacity;
}
