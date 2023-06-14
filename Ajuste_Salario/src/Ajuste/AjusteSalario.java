package Ajuste;

import java.util.Scanner;

public class AjusteSalario{

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
        
	   System.out.println("Digite seu salario:");
	   double salario = scan.nextDouble();
	   
	   int percentual = 0;
	   if (salario <= 280) {
		   percentual = 20;
	   }else if(salario > 280 && salario <= 700) {
		   percentual = 15;
	   }else if(salario >= 700 && salario <= 1500) {
		   percentual = 10;
	   }else if(salario >=1500) {
		   percentual = 5;
		   
	   }
	   double aumento = (salario / 100)* percentual;
	   double salarioAjustado = salario + aumento;
	   
	   System.out.println("salario:"+salario);
	   System.out.println("percentual:"+percentual);
	   System.out.println("aumento:"+aumento);
	   System.out.println("salarioAjustado:"+salarioAjustado);
	}

}
