package EnumeracaoComposicao.StringBuilder;

import EnumeracaoComposicao.StringBuilder.enttd.Comentarios;
import EnumeracaoComposicao.StringBuilder.enttd.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Programa {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentarios c1 = new Comentarios("Have a nice trip!");
		Comentarios c2 = new Comentarios("Woh that's awesome! ");
	
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
			"Traveling to New Zealand",
			"I'm going to visit this wonderful country !",
			12);
		
		p1.addComents(c1);
		p1.addComents(c2);
		
		Comentarios c3 = new Comentarios("Copa do Brasil e Brasileirão");
		Comentarios c4 = new Comentarios("Melhor time! ");
		
		Post p2 = new Post(sdf.parse("22/01/2024 07:20:25"),
			"Flamengo Campeão",
			"Eu estou muito feliz",
			420);
		
		p1.addComents(c1);
		p1.addComents(c2);
		
		p2.addComents(c3);
		p2.addComents(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
