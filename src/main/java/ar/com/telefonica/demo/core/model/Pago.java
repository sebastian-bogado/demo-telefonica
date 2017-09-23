package ar.com.telefonica.demo.core.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Pago {
	@Id
	private String id;
	private String familiaOT;
	private String zona;
	private String horaBaremo;
	private Double total;
	private String contratista;
}
