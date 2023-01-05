import java.util.Scanner;

public class E02 {
    public static void main(String[] args){

        Scanner entrada=new Scanner(System.in);
        System.out.println("Insira a quantidade funcionarios :");
        double n1=entrada.nextInt();
        System.out.println("Insira a quantidade de horas : ");
        double n2=entrada.nextInt();
        System.out.println("Insira o valor da hora : ");
        double n3=entrada.nextInt();

        entrada.close();

        double salario=n2*n3;

        System.out.println("Número :"+n1+" Salário : "+salario);



    
}
}