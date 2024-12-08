package _05_EnumeracaoComposicao.StringBuilder.enttd;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date momento;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comentarios> comentarios = new ArrayList<>();
	
	public Post(){
	}
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	// Server para ter apenas uma copia para o codigo todo
	
	// Lembrando que List não vai no construtor
	public Post(Date momento, String title, String content, Integer likes) {
		this.momento = momento;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public List<Comentarios> getComentarios() {
		return comentarios;
	}
	
	// Removendo o Set que altera a lista
	
	public void addComents(Comentarios comentario){
		comentarios.add(comentario);
	}
	
	public void removeComents(Comentarios comentario){
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comentarios c: comentarios){
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
