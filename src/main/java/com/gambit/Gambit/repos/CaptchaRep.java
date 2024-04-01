package com.gambit.Gambit.repos;

import com.gambit.Gambit.models.Captcha;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Die Captcha Repository sammelt Methoden zum Interagieren mit dem CaptchaModel
 * Dieses ist mit der Mysql Datenbank verbunden
 * Dank der geerbten JpaRepository werden automatisch CRUD Operationen für Captcha Übernommen
 *
 * @since 1.0
 * @author Jerome von Daak
 */
@Repository
public interface CaptchaRep extends CrudRepository<Captcha, Integer> {
}
