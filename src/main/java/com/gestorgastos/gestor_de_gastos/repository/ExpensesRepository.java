package com.gestorgastos.gestor_de_gastos.repository;

import com.gestorgastos.gestor_de_gastos.model.Expenses;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Long> {

    List<Expenses>findByUser_Id(@NotNull Long id);

    List<Expenses> findByCategory(@NotNull String category);
}
