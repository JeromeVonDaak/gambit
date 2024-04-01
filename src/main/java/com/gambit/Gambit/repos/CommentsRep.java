package com.gambit.Gambit.repos;

import com.gambit.Gambit.models.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Die Comments Repository sammelt Methoden zum Interagieren mit dem CommentsModel
 * Dieses ist mit der Mysql Datenbank verbunden
 * Dank der geerbten JpaRepository werden automatisch CRUD Operationen für Comments Übernommen
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Repository
public interface CommentsRep extends CrudRepository<Comments, Integer> {
}
