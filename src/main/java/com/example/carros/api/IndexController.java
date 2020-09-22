package com.example.carros.api;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String get() {
		return "API dos Carros";
	}
	
	@GetMapping("/userInfo")
	public UserDetails userInfo(@AuthenticationPrincipal UserDetails user) {
		return user;
	}
	
	
	/*
	 * @PostMapping("/login") public String loginPost(@RequestParam("login") String
	 * login,@RequestParam("senha") String senha) { return "Login:" + login +
	 * ", senha: " + senha; }
	 */
	 
	
	/*
	 * @GetMapping("/login/{login}/senha/{senha}") public String
	 * login(@PathVariable("login") String login,@PathVariable("senha") String
	 * senha) { return "Login:" + login + ", senha: " + senha; }
	 */
	
	/*
	 * @GetMapping("/carros/{id}") public String getCarroById(@PathVariable("id")
	 * Long id) { return "Carro id " + id; }
	 */
	
	/*
	 * @GetMapping("/carros/tipo/{tipo}") public String
	 * getCarroByTipo(@PathVariable("tipo") String tipo) { return "Carro tipo " +
	 * tipo; }
	 */
	
	
	/*
	 * @PostMapping public String post() { return "Post Spring Boot"; }
	 */
	
	/*
	 * @PutMapping public String put() { return "Put Spring Boot"; }
	 */
	
	/*
	 * @DeleteMapping public String delete() { return "Delete Spring Boot"; }
	 */

}
