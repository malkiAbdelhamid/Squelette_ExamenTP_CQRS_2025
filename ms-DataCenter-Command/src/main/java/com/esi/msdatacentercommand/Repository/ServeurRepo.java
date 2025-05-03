package com.esi.msdatacentercommand.Repository;

import com.esi.msdatacentercommand.Aggregate.ServeurAggregate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServeurRepo extends JpaRepository<ServeurAggregate,Long> {
}
