package com.gestorgastos.gestor_de_gastos.repository;

import com.gestorgastos.gestor_de_gastos.model.Loans;
import com.gestorgastos.gestor_de_gastos.model.enums.Status;
import com.gestorgastos.gestor_de_gastos.model.enums.Type;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoansRepository extends JpaRepository<Loans, Long> {

    List<Loans>findByType(@NotNull Type type);

    List<Loans>findByStatus(@NotNull Status status);

    List<Loans>findByPerson(@NotNull String person);

}
