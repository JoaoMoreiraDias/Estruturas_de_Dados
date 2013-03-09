package p1;

public class Pessoa {
   
    private String nome;
    private Pessoa proxP;
   
    public Pessoa(String novo_nome)
    {
        nome=novo_nome;
    }
   
    public Pessoa getProx()
    {
        return proxP;
    }
   
    public void adicionarProximo(Pessoa novoProximo)
    {
        proxP=novoProximo;
    }
   
    public String getNome()
    {
        return nome;
    }
   
    public void setNome(String novo)
    {
        nome= novo;
    }
   
    public String toString()
    {
        return nome+" "+proxP;
    }
}

