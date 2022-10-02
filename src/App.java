import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
    
        System.out.println("Nome do aluno");
        
        String digite = nome.nextLine();
        int faltas;
        double nota;
        float frequencia;
        
        System.out.println("Qual a frequencia do aluno");
        faltas = entrada.nextInt();
        frequencia = faltas /200;

        System.out.println("A frequencia deste aluno é: " + frequencia);
        System.out.println("Digite a nota do aluno");
        nota = entrada.nextDouble();

        if(nota>=70 && frequencia>=0.70){
            System.out.println("Aprovado !^u^!");

        }else if ((nota<=40 || nota<70) && frequencia>=0.75){
            System.out.println("Recuperação !*_*! ");

        }else{
            System.out.println("Reprovado !-_-!");
        }
    }
}
