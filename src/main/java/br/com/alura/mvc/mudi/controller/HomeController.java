package br.com.alura.mvc.mudi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;

@Controller
public class HomeController {

	@Autowired
	private PedidoRepository pedidoRepository;

	@GetMapping("/home")
	public String home(Model model) {

//		Pedido pedido = new Pedido();
//		pedido.setNomeProduto("Pat. Skatenet Max Pink - Led Bandeirante Pink");
//		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51WEV80YBiL._AC_SX522_.jpg");
//		pedido.setUrlProduto("https://a.co/d/dc05KtA");
//		pedido.setDescricao("O brinquedo perfeito para as manobras mais radicais! "
//				+ "Freio traseiro. Textura na base para maior aderência e segurança. "
//				+ "Suspensão dianteira ajuda no desenvolvimento da coordenação motora. "
//				+ "Rodas com luz de LED. Idade: +24 meses. Peso máximo suportado: 120kg");

//		List<Pedido> pedidos = Arrays.asList(pedido);

		List<Pedido> pedidos = pedidoRepository.recuperaTodosOsPedidos();
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
