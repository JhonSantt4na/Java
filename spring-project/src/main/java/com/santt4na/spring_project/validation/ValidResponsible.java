package com.santt4na.spring_project.validation;

import com.santt4na.spring_project.enums.Status;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD}) // Onde pode ser usada (FIELD(Atributos), METHOD, TYPE(Classes ou interfaces), PARAMETER)
@Retention(RetentionPolicy.RUNTIME) // Quando está disponível (RUNTIME (Em tempo de execução), SOURCE (Apenas no Código fonte, some na compilação), CLASS (Existe no .class))
@Constraint(validatedBy = ResponsibleValidator.class) // Informa ao Bean qual classe tem a lógica de validação
@Documented
public @interface ValidResponsible {
	// Mensagem Padrão de Erro, quando a validação falhar, Podendo ser sobrescrita na hora de usar a anotação:
	String message() default "Mandatory responsible for IN_PROGRESS and DONE statuses";
	
	// São parâmetros obrigatórios para toda a anotação, mesmo que você não use.
	// groups → permite criar validações “por cenário”, tipo: criação, atualização etc.
	// payload → usado em frameworks que processam metadados extras (raro em aplicações comuns).
	// Na prática, você quase sempre deixa como default {}.
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
	
	// Passar parâmetros que vão ser lidos pelo ConstraintValidator.
	// Depois, no validator (ResponsibleValidator), você pega esse valor e aplica a lógica:
	Status[] statusAccept();
	
	// Obs: Para validações que dependem de outro campo,
	// você precisa que o validator receba o objeto inteiro, não só o atributo.
	// É por isso que colocamos status no DTO ou criamos uma anotação de nível classe, que recebe o DTO todo.
}