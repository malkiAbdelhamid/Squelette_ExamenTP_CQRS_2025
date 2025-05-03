package com.esi.coreapi.events.Vm;

import com.esi.coreapi.Configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VmAddedEvent {
    private Long idUtilisateur;
    private Long idVm;
    private Configuration configuration;
    private Long idServeur;
}
