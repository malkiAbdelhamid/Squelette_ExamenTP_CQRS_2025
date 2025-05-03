package com.esi.msvmcommand.Repository;

import com.esi.msvmcommand.Aggregate.UtilisateurAggregate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepo extends JpaRepository<UtilisateurAggregate,Long> {
}
