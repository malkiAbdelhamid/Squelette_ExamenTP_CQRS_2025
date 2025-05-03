package com.esi.coreapi.commands.Vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUserCommand {
    @TargetAggregateIdentifier
    private Long idUtilisateur;
    private String nom;
    private String email;
}
