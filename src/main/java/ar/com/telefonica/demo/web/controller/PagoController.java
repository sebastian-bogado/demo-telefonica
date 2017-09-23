package ar.com.telefonica.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.telefonica.demo.core.service.PagoService;

@Controller
@RequestMapping("/admin/pago")
public class PagoController {

	private static final String PAGO = "pago";
	private static final String PAGOS = "pagos";

	@Autowired
	private PagoService pagoService;

	/**
	 * Unicamente realizo una lista de los perfiles;
	 *
	 * @return String (pagina web a devolver)
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String listPerfiles(Model model) {
		model.addAttribute(PAGOS, pagoService.findAll());
		return "admin/pagos/pagos_list";
	}


}
