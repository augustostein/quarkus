package br.com.syonet.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table( name = "syo_livro" )
public class Livro {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer id;
	
	@Column( nullable = false )
	private String tituloLivro;
	
	@Column( nullable = true )
	private String tituloOriginal;
	
	@ManyToMany
	@JoinTable( name = "syo_livro_autor", joinColumns = @JoinColumn(name = "livro_id"),
	inverseJoinColumns = @JoinColumn(name="autor_id"))
	private List<Autor> autores;

	
	@Column( nullable = true)
	private String editora;
	
	
	
	public Livro() {
	super();
}
	public Livro(String tituloLivro, String tituloOriginal, List<Autor> autores, String editora,
		Integer no_paginas, Integer no_edicao) {
	super();
	this.tituloLivro = tituloLivro;
	this.tituloOriginal = tituloOriginal;
	this.autores = autores;
	this.editora = editora;
	this.no_paginas = no_paginas;
	this.no_edicao = no_edicao;
}
	public List<Autor> getAutor() {
		return autores;
	}
	public void setAutor(List<Autor> autores) {
		this.autores = autores;
	}
	@Column( nullable = true)
	private Integer no_paginas;
	
	@Column( nullable = true)
	private Integer no_edicao;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTituloLivro() {
		return tituloLivro;
	}
	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Integer getNo_Paginas() {
		return no_paginas;
	}
	public void setNo_Paginas(Integer no_paginas) {
		this.no_paginas = no_paginas;
	}
	public Integer getNo_Edicao() {
		return no_edicao;
	}
	public void setNo_Edicao(Integer no_edicao) {
		this.no_edicao = no_edicao;
	}
	
	
}
