package com.esi.coreapi.DTO;


import com.esi.coreapi.Configuration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VmDTO {

    private Long idVm;
    private Configuration configuration;
    private Long idServeur;
}
