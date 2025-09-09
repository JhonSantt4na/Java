package Datas_Horarios_intervalos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class FormatacaoDataeHora {
	public static void main(String[] args) {
		/**
		 * @DateTimeFormatter: obejto para formatar datas e horas;
		 * Tabela aqui de Formatação de Data ou Hora (yy,yyyy) etc...
		 */
		
		LocalDateTime porDoSolDeNatal = LocalDateTime.of(2025,12,25,17,36,00);
		DateTimeFormatter dft1 = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, HH:mm:ss");
		System.out.println(porDoSolDeNatal.format(dft1));   // qui., 25/12/2025, 17:35:33
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy, 'às' HH:mm");
		System.out.println(porDoSolDeNatal.format(dtf2));   // quinta-feira, 25 de dezembro de 2025, às 17:36
	
		LocalDateTime porDoSol = LocalDateTime.of(2020,12,25,17,36);
		Set<String> regioes = ZoneId.getAvailableZoneIds();
		for (String regiao : regioes) {
			if (regiao.contains("America")){
				System.out.println(regiao);
			}
		}
		
		System.out.printf("%d regiões disponíveis.%n", regioes.size());
		
		ZoneId norteBr = ZoneId.of("America/Manaus");
		
		ZonedDateTime fusoNorteBR = ZonedDateTime.of(porDoSol, norteBr);
		
		System.out.println(fusoNorteBR);   // 2020-12-25T17:36-04:00[America/Manaus]
	}
}
