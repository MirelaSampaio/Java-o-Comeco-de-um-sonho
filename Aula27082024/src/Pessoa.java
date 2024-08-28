public class Pessoa
{
        // Atributos
        private String nome;
        private String idade;



        // Métodos
        public Pessoa(String nome, String idade)
        {
            this.nome = nome;
            this.idade = idade;


        }

        public void falar(String fala)
        {
            System.out.println("Fala padrão");
        }


    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getIdade()
    {
        return idade;
    }

    public void setIdade(String idade)
    {
        this.idade = idade;
    }
}
