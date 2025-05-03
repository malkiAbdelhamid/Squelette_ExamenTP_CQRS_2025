package com.esi.coreapi.events.Vm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddedEvent {
    private Long idUtilisateur;
    private String nom;
    private String email;
}
