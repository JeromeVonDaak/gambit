package com.gambit.Gambit;

import com.gambit.Gambit.properties.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * Die Hauptmethode die das Ganze Programm startet.
 * "@SpringBootApplication" lässt SpringBoot die Main Application automatisch erkennen
 * und macht noch einiges im Hintergrund
 * @see <a href="https://spring.io/guides/gs/spring-boot">Einfacher Einstieg</a>
 *
 * @see <a href="gambit.vendata.de">Die Webseite</a>
 * @since 1.0
 * @author Jerome von Daak
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@EnableConfigurationProperties(StorageProperties.class)
@PropertySource("file:${user.dir}/.env")
public class GambitApplication {
	public static void main(String[] args) {
		SpringApplication.run(GambitApplication.class, args);
	}
}
