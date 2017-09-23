package ar.com.telefonica.demo.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.telefonica.demo.core.model.Pago;

public interface PagoDao extends JpaRepository<Pago,String >{
}
