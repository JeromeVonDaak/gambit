package com.gambit.Gambit.repos;

import com.gambit.Gambit.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;



/**
 * Die User Repository sammelt Methoden zum Interagieren mit dem UserModel
 * Dieses ist mit der Mysql Datenbank verbunden
 * Dank der geerbten JpaRepository werden automatisch CRUD Operationen für User Übernommen
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Repository
public interface UserRep extends JpaRepository<User, Integer> {
    UserDetails findByLogin(String login);
}
