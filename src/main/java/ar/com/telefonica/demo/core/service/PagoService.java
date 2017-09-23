package ar.com.telefonica.demo.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.telefonica.demo.core.dao.PagoDao;
import ar.com.telefonica.demo.core.model.Pago;

@Service
public class PagoService {
	@Autowired
	private PagoDao pagoDao;

	public List<Pago> findAll() {
		return pagoDao.findAll();
	}
}
