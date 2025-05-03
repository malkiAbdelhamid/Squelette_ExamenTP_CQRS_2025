package com.esi.coreapi.commands.Vm;

import com.esi.coreapi.Configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddVmCommand {
    @TargetAggregateIdentifier
    private Long idUtilisateur;
    private Long idVm;
    private Configuration configuration;
    private Long idServeur;
}
