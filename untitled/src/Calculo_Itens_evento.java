import java.util.Scanner;

public class Calculo_Itens_evento {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int qtdPessoas, qtdSalgadinho;
        double qtdAgua, qtdCafe;

        System.out.println("Por favor digite a quantidade de pessoas que você convidou para o evento: ");
        qtdPessoas = sc.nextInt();
        if(qtdPessoas >350 || qtdPessoas <=0){
        System.out.println("Valor inválido, por favor digite valores ente 1 e 350");
        }
        else{
        qtdAgua = (qtdPessoas*0.50);
        qtdCafe = (qtdPessoas*0.20);
        qtdSalgadinho = (qtdPessoas*7);

        System.out.println("Para o seu evento com " +qtdPessoas+"a quantidade de café que voce vai precisar é de "+qtdCafe+" litros, a quantidade de água que você vai precisar é de  "+qtdAgua+" litros, a quantidade de salgadinhos que você vai precisar é de "+qtdSalgadinho+" unidades");
    }
}
}
