package Exercicios;

import javax.swing.*;

import controller.Controller03;

public class Exercicio03 {
	
	public static void main (String[] args) {
		
		Controller03 Fatorial = new Controller03();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		 if (n < 0 || n > 12) {
	            JOptionPane.showMessageDialog(null, "Número inválido! Digite um número entre 0 e 12.");
	        } else {
	            int resultado = Fatorial.Fatorial(n);
	            JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é: " + resultado);
	        }
	    }
	}