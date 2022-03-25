import java.util.*;

class SomarDoisNumeros {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) {
	int num1, num2, soma;
	
	System.out.println("Digite um numero");
	num1 = sc.nextInt();
	System.out.println("Digite um numero");
	num2 = sc.nextInt();
	
	soma = num1+num2;
	
	System.out.println("Soma:" + soma);
}


	package com.ti2cc;
	
	public class Usuario {
		
		private int codigo; private String login;
		private String senha; private char sexo;
	
		public Usuario() {
	this.codigo = -1; this.login = "";
	this.senha = ""; this.sexo = '*';
	}
	
	public Usuario(int codigo, String login, String senha, char sexo) {
	
		this.codigo = codigo; this.login = login;
		this.senha = senha; this.sexo = sexo;
	}
	public String toString() {
		return "SomarDoisNumeros []";
	}

	public static Scanner getSc() {
		return sc;
	}

	public static void setSc(Scanner sc) {
		SomarDoisNumeros.sc = sc;
	}
}