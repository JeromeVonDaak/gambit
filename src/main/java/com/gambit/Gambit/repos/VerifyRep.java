package com.gambit.Gambit.repos;

import com.gambit.Gambit.models.Verify;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Die Verify Repository sammelt Methoden zum Interagieren mit dem VerifyModel
 * Dieses ist mit der Mysql Datenbank verbunden
 * Dank der geerbten JpaRepository werden automatisch CRUD Operationen für Verify Übernommen
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Repository
public interface VerifyRep extends CrudRepository<Verify, Integer> {
}
