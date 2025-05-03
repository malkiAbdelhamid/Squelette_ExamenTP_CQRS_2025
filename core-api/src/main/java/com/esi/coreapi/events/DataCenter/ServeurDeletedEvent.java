package com.esi.coreapi.events.DataCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServeurDeletedEvent {
    private Long idDataCenter;
    private Long idServeur;

}
