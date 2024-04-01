package com.gambit.Gambit.models;

/**
 *
 * Kopiert aus Guide. Teil der Authentification via JWT Tokens
 *
 * @since 1.0
 * @see <a href="https://dev.to/m1guelsb/authentication-and-authorization-with-spring-boot-4m2n">JWT with Springboot</a>
 * @author Jerome von Daak
 */
public enum UserRole {
    ADMIN("admin"),
    USER("user");

    private String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getValue() {
        return role;
    }
}
