package com.nelioalves.cursomc.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nelioalves.cursomc.domain.Pedido;

@Repository

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
