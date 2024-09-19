package br.ufjf.dcc.dcc025.questao2;
//GUSTAVO VIEIRA FERNANDES RIBEIRO
//202165059AB
public class ContaBancaria {

    public int id;
    protected String cpf;
    private String nome;
    private float saldo;
    public static int totalContas;
    

    //construtor padrao
    public ContaBancaria() {
        this.id = 0;
        this.cpf = null;
        this.nome = null;
        this.saldo = 0.0f;
        totalContas = 0;
    }

    //construtor parametrizado
    public void abrirConta(int i, String c, String n,float s, int nc) {
        setId(i);
        setNome("Cliente " + i);
        setSaldo(i ,s);
        setTotalContas(nc);
        setCpf(c);
        System.out.println("[ " + "Numero: " + getId() +  " CPF = " + getCpf() + " NomeCliente= " + getNome() + " Saldo: " + getSaldo() + " ]");
    }

    //getters e setter 

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i++;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String c) {
        this.cpf = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(int i, float s) {
        this.saldo = s;
    }

    public static int getTotalContas() {
        return totalContas;
    }

    public void setTotalContas(int nc) {
        for(nc = 0; nc <= id; nc++)
        totalContas = nc;
    }


    //DEPOSITAR
    public boolean depositar(int i, float s) {
        if(nome != null) {
            setSaldo(i, getSaldo() + s);
            System.out.println("Novo saldo apos depositar: " + getSaldo() + "R$");
        }
        else {
            System.out.println("Impossivel depositar!");
        }

        return true;
    }


    //SACAR
    public boolean sacar(int i, float s) {
        if(nome != null) {
            if(saldo >= s) {
                setSaldo(i, getSaldo() - s);
                System.out.println("Novo saldo apos sacar: " + getSaldo() + "R$");
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("Impossivel sacar!");
        }

        return true;
    }


    //TRANSFERENCIA
    public void tranfere(int i, float s) {
        if(getId() != getId() ) {
            setSaldo(i, getSaldo() - s);
            setSaldo(i, getSaldo() + s);
            System.out.println("Transferência realizada com sucesso para conta " + getId());
        }

    }
}
