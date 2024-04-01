package com.gambit.Gambit.repos;

import com.gambit.Gambit.models.Videos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Die Videos Repository sammelt Methoden zum Interagieren mit dem VideosModel
 * Dieses ist mit der Mysql Datenbank verbunden
 * Dank der geerbten JpaRepository werden automatisch CRUD Operationen für Videos Übernommen
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Repository
public interface VideosRep extends CrudRepository<Videos, Integer> {
}
