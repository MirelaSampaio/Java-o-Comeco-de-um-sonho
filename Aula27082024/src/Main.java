import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa("Mirela", "20");

        // Somente para mostrar o que eu coloquei
        System.out.println("O nome padrão é: " + pessoa.getNome());
        System.out.println("A idade padrão é: " + pessoa.getIdade());

        pessoa.falar("Fala Padrão");


        // Para alterar para o que usuario deseja
        System.out.println("Digite o nome para qual deseja alterar: ");

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        pessoa.setNome(nome);

        System.out.println("Agora, digite a idade desejada: ");
        String idade = scanner.nextLine();
        pessoa.setIdade(idade);

        System.out.println("Digite a fala desejada: ");
        String fala = scanner.nextLine();
        pessoa.falar(fala);


        System.out.println(String.format("O nome inicial foi alterado para %s, e a idade foi alterada para %s, e a fala padrão agora é %s", nome, idade, fala));
    }



    public void Conteudo()
    {

        //Carro honda = new Carro("Honda", "Civic", "Vermelho");

        //honda.acelerar();
        //honda.frear();


        // Carro meuCarro ("Parametro01", "Parametro02")
        //meuCarro.setMarca("Jeep");
        //meuCarro.setModelo("Renegade");

        //Carro jeep = new Carro("Honda", "Civic", "Vermelho");

        //jeep.acelerar();
        //jeep.frear();




        // Esse é o comando utilizado para imprimir na tela:
        //System.out.println("Hello World!");

        // Comando NECESSARIO para ler a entrada de um usuario
        //Scanner scanner = new Scanner(System.in);

        // Recebe a entrada do usuario
        //String name = scanner.nextLine();

        // Imprime o que o usuario digitou dentro da variável
        //System.out.println("Hello " + name);


        //System.out.println("Olá! Seja bem-vindo ao Programa de Testes 01 da Misa!!");
        //System.out.println("Para prosseguirmos, por favor digite o seu nome");
        //String nome = scanner.nextLine();

        // Interpolação usando o símbolo de +
        //System.out.println("Seja bem-vindo ao meu programa " + nome);

        // Interpolação com format
        //System.out.println(String.format("Olá %s, seja bem-vindo ao meu programa!", nome));

    }
}