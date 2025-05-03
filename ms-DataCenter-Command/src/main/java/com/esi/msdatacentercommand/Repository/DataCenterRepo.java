package com.esi.msdatacentercommand.Repository;

import com.esi.msdatacentercommand.Aggregate.DataCenterAggregate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataCenterRepo extends JpaRepository<DataCenterAggregate,Long> {
}
