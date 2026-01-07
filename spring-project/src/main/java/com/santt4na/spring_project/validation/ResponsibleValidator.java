package com.santt4na.spring_project.validation;

import com.santt4na.spring_project.dto.Tasks.TaskCreateDTO;
import com.santt4na.spring_project.enums.Status;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class ResponsibleValidator implements ConstraintValidator<ValidResponsible, Object> {
	// Ao implementar o ConstraintValidator passamos a nossa anotação criada e o DTO/Classe que vamos usar;
	// nesse caso passei o Object e la na validação agente usa um Cast direto para o DTO/Classe que queremos.
	
	private Status[] statusAccept; // Criamos uma instância do nosso atributo que precisamos recuperar da nossa anotação
	
	// Ao implementar o ConstraintValidator temos que adicionar esses dois métodos:
	
	// initialize - Serve para pegar o valor que passamos na inicialização da anotação no DTO/Class
	// e salvamos o valor na nossa instância privada no caso statusAccept;
	@Override
	public void initialize(ValidResponsible constraintAnnotation) {
		this.statusAccept = constraintAnnotation.statusAccept(); // -> pega o array que passamos na anotação e salva no nosso statusAccept;
	}
	
	// isValid - esse é o metodo principal do validator, onde fica a regra de validação
	// Ele recebe
	// 		dto → o objeto que está a ser validado (no caso, Object porque usamos um genérico).
	//		Context → usado para construir mensagens de erro detalhadas e personalizadas.
	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		// Comerçamos verificando se o obj esta null
		if (obj == null) return true;
		
		// Pegando os valores a serem validados
		// Status e responsibleId
		
		// Obs - Aqui vamos fazer um cast para capturar o nosso dto, caso tenha outro so adicionar aqui tmb
		TaskCreateDTO dto;
		try {
			dto = (TaskCreateDTO) obj;
		} catch (ClassCastException e) {
			// se for outro tipo que não suporta essa validação
			return true;
		}
		
		Status status = dto.status(); // Pegamos do getter do (record DTO/Class)
		Long responsibleId = dto.responsibleUserId();
		
		// Se por algum motivo o status for nulo, não fazemos a validação.
		// Porque só queremos validar quando o status for IN_PROGRESS ou DONE.
		if (status == null) return true;
		
		if (Arrays.asList(statusAccept).contains(status)) { // Verifica se o status atual do DTO está na lista de status que exigem responsibleId.
			boolean valid = responsibleId != null; // responsibleId deve existir (não ser null) para os status definidos.
			if (!valid) {
				context.disableDefaultConstraintViolation(); // desativa a mensagem de erro padrão no objeto inteiro.
				context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate()) // define a mensagem de erro da annotation (message).
					.addPropertyNode("responsibleId") // associa o erro especificamente ao campo responsibleId, para que o JSON de erro mostre "responsibleId": ["message"] no Spring.
					.addConstraintViolation(); // adiciona a violação ao contexto.
			}
			return valid; // Retorna se a validação passou ou falhou.
		}
		return true; // Se o status não está na lista (TODO, por exemplo), não precisa validar responsibleId, então retornamos true.
	}
}
