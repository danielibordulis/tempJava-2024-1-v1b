import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//       Scanner teclado = new Scanner(System.in);
//       System.out.print("Nome do Aluno: ");
//       String nome = teclado.nextLine();
//
//       System.out.print("primeira nota: ");
//       float nota = teclado.nextFloat();
//
//       System.out.print("segunda nota: ");
//       float nota2 = teclado.nextFloat();
//
//       System.out.print("terceira nota: ");
//       float nota3 = teclado.nextFloat();
//
//        System.out.printf("As notas do aluno %s são: %.1f %.1f %.1f\n",nome, nota, nota2, nota3);
//
//        float media = (nota + nota2 + nota3)/3;
//        System.out.printf("A média do aluno é: %.1f" ,nome, media);
//
//        if(media >=7){
//            System.out.println("Passou");
//
//        }else{
//            System.out.println("Não foi dessa vez");
//        }


//    JOptionPane.showMessageDialog(null,"Olá mundo");
//    int idade= Integer.parseInt( JOptionPane.showInputDialog("Digite sua idade:"));
//    System.out.println(idade);

//    System.out.println( JOptionPane.showConfirmDialog(null, "Tem certeza?"));
//    System.out.println( JOptionPane.showConfirmDialog(null, "Tem certeza?"));
//    System.out.println( JOptionPane.showConfirmDialog(null, "Tem certeza?"));
//
//

//        Escreva um programa que determine se um número é positivo, negativo ou zero.

//        Scanner numeros = new Scanner(System.in);
//        System.out.print("Digite um numero: ");
//        float numero = numeros.nextFloat();
//
//        if(numero >0){
//            System.out.println("O número é positivo.");
//
//        } else if (numero<0) {
//            System.out.println("O número é negativo.");
//        }else{
//            System.out.println("O número é zero.");
//        }


//        Crie um programa que verifique se um ano é bissexto.

//        Scanner anos = new Scanner(System.in);
//        System.out.print("Digite um ano: ");
//        int ano = anos.nextInt();
//
//        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
//            System.out.println("O ano é bissexto.");
//        } else {
//            System.out.println("O ano não é bissexto.");
//        }

//        Desenvolva um programa que determine se um triângulo é escaleno,
//        isósceles ou equilátero, com base nos comprimentos dos seus lados.

//        Scanner comprimentos = new Scanner(System.in);
//        System.out.print ("Digite o comprimento do primeiro lado:");
//        float primeiro=comprimentos.nextFloat();
//
//        System.out.print ("Digite o comprimento do segundo lado:");
//        float segundo=comprimentos.nextFloat();
//
//        System.out.print ("Digite o comprimento do terceiro lado:");
//        float terceiro=comprimentos.nextFloat();
//
//        if (primeiro == segundo && segundo == terceiro) {
//            System.out.println("O triângulo é equilátero.");
//        } else if (primeiro!= segundo && segundo != terceiro && primeiro != terceiro) {
//            System.out.println("O triângulo é escaleno.");
//        } else {
//            System.out.println("O triângulo é isósceles.");
//        }



//        Escreva um programa que determine se um número é par e maior que 10.


//        Scanner numeros = new Scanner(System.in);
//        System.out.print ("Digite um número inteiro:");
//        int numero=numeros.nextInt();
//
//        if (numero % 2 == 0 && numero > 10) {
//            System.out.println("O número é par e maior que 10.");
//        } else {
//            System.out.println("O número não é par ou não é maior que 10.");
//        }



//
//        Crie um programa que classifique um aluno como aprovado se sua
//    nota for maior ou igual a 7 e sua frequência nas aulas for maior que 75%.

        Scanner avalicao = new Scanner(System.in);
        System.out.print ("Digite a nota do aluno:");
        float nota=avalicao.nextFloat();


        System.out.print("Digite a frequência do aluno (%):");
        float frequencia=avalicao.nextFloat();

        if (nota >= 7 && frequencia > 75) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }


    }

}