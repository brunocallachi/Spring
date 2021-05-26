package org.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity // essa classe vai ser uma entidade do JPA
@Table(name = "postagem") // que essa entidade dentro do banco de dados vai virar uma tabela com o nome postagem

public class Postagem {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY )	//no bd ele vai se tornar um primary key
	private long id;
	
	@NotNull // não pode deixar em branco
	@Size(min =10, max = 500) // quantidade de caractere SIZE
	private String titulo;
		
	@NotNull
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) // indica que estamos trabalhando com o tempo
	private Date date = new java.sql.Date(System.currentTimeMillis());

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
	
	
	

}