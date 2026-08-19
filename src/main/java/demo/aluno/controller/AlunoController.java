package demo.aluno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.aluno.dto.AlunoDTO;
import demo.aluno.model.Aluno;
import demo.aluno.service.AlunoService;

@RequestMapping(path = "/demo") // DEFINIDO ENDPOINT
@RestController
public class AlunoController {

	@Autowired
	private AlunoService alunoService;

	@PostMapping("/alunoString")
	public ResponseEntity<AlunoDTO> createString(@RequestParam String nome, @RequestParam String email) {
		try {
			Aluno a = new Aluno(nome, email);
			alunoService.save(a);

			return new ResponseEntity<>(AlunoDTO.from(a), HttpStatus.CREATED);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@GetMapping("/alunos")
	public @ResponseBody Iterable<Aluno> getAll() {
		return alunoService.getAll();

	}
}
