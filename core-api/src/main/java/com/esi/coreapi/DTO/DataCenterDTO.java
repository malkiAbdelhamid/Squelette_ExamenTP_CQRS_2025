package com.esi.coreapi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor
public class DataCenterDTO {
    private Long idDataCenter;
    private String ville;
    private int capacity;
}
