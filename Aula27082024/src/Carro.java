public class Carro
{
    // Atributos
    private String marca;
    private String modelo;
    private String cor;

    // Métodos
    public Carro(String marca, String modelo, String cor)
    {
        // O comando this.  acessa o que está dentro dos parâmetros inseridos acima
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        // Se aqui dentro você "setar" algo exato, mas deixar as variavéis, apenas o que está setado irá continuar fixo.
        // Exemplo: Se em this.cor = cor você escrever this.cor = "Vermelho"; Não importa o que você coloque nos outros, o carro sempre será vermelho.

    }

    public void acelerar()
    {
        System.out.println("RANDANDANDAN");
    }

    public void frear()
    {
        System.out.println("Carro freado!");
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getCor()
    {
        return cor;
    }

    public void setCor(String cor)
    {
        this.cor = cor;
    }
    // Quando você constrói esse método, você está querendo dizer para máquina que a classe vai receber o que o usuario digitar.
}
