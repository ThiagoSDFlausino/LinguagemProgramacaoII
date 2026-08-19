package demo.aluno.dto;

import demo.aluno.model.Aluno;

public record AlunoDTO(Integer id, String nome, String email) {
	
	public static AlunoDTO from(Aluno a) {
		
		AlunoDTO dto = new AlunoDTO(a.getId(), a.getNome(), a.getEmail());
		return dto;
	}
}
