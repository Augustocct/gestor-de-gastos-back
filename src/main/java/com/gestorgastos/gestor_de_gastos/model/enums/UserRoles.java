package com.gestorgastos.gestor_de_gastos.model.enums;

public enum UserRoles {
    USER("user"),
    ADMIN("admin");

    private String role;

    UserRoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
