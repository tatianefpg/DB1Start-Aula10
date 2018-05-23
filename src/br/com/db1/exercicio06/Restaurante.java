package br.com.db1.exercicio06;

import java.util.Date;
import java.util.List;

public class Restaurante {
	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;

	Endereco endereco;
	List<Telefone> telefones;
	List<Pedido> pedidos;

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {

	}
}
