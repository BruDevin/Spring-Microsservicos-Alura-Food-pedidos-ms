package com.example.alurafoodpedidosms.repository;

import com.example.alurafoodpedidosms.model.Pedido;
import com.example.alurafoodpedidosms.model.Status;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("UPDATE Pedido p set p.status = :status WHERE p = :pedido")
    void atualizaStatus(Status status, Pedido pedido);

    @Query(value = "SELECT p from Pedido p LEFT JOIN FETCH p.itens WHERE p.id = :id")
    Pedido porIdComItens(Long id);

}
