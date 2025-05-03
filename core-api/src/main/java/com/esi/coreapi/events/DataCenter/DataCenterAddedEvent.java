package com.esi.coreapi.events.DataCenter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataCenterAddedEvent {
    private Long idDataCenter;
    private String ville;
    private int capacity;
}
