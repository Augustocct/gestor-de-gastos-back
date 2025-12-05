package com.gestorgastos.gestor_de_gastos.model;

import com.gestorgastos.gestor_de_gastos.model.enums.Status;
import com.gestorgastos.gestor_de_gastos.model.enums.Type;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "loans")
public class Loans {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private User userId;

    @Column(name = "person", nullable = false)
    private String person;

    @Column(name = "value", nullable = false)
    private BigDecimal value;

    @Column(name = "type", nullable = false)
    private Type type;

    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    public Long getId() {
        return id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
