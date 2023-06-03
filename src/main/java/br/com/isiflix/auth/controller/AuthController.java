package br.com.isiflix.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isiflix.auth.model.Usuario;
import br.com.isiflix.auth.security.AuthToken;
import br.com.isiflix.auth.security.TokenUtil;

@RestController
public class AuthController {

	@GetMapping("/free")
	public String sayFreeHello() {
		return "Este endpoint eh free";
	}

	@GetMapping("/auth")
	public String sayAuthHello() {
		return "Este endpoint necessita de validacao";
	}

	@PostMapping("/login")
	public ResponseEntity<AuthToken> realizarLogin(@RequestBody Usuario u) {
		if (u.getLogin().equals("isidro") && u.getSenha().equals("1234")) {
			return ResponseEntity.ok(TokenUtil.encodeToken(u));
		}
		return ResponseEntity.status(403).build();
	}

}
