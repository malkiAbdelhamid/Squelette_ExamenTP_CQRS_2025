package com.esi.msvmcommand.Repository;

import com.esi.msvmcommand.Aggregate.VmAggregate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VmRepo extends JpaRepository<VmAggregate,Long> {
}
