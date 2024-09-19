package br.ufjf.dcc.dcc025.questao2;
//GUSTAVO VIEIRA FERNANDES RIBEIRO
//202165059AB
public class TesteContaBancaria {
    public static void main(String[] args) {
        
        System.out.println("Boa prova!");
        System.out.println("****BANCO VIRTUAL****");
       //Objeto 1
        System.out.println("****CLIENTE 1****");
        ContaBancaria c1 = new ContaBancaria();
        c1.abrirConta(1,"832.373.583-20" , "Cliente 1", 0.0f, 0);
        System.out.println(c1.toString());
        System.out.println("Numero de contas criadas = " + ContaBancaria.getTotalContas());
        if (c1.depositar(1, 1000.0f) )
        msgDeposito();
        else
        msgErro();
        if (c1.sacar(1, 250) )
        msgSaque();
        else
        msgErro();
        
        System.out.println("Novo Saldo: R$ " + c1.getSaldo());
        
        //Objeto 2
        System.out.println("****CLIENTE 2****");
        ContaBancaria c2 = new ContaBancaria();
        c2.abrirConta(2, "123.456.879-00", "Cliente 2", 1000.0f, 0);   
        System.out.println(c2.toString());
        System.out.println("Numero de contas criadas = " + ContaBancaria.getTotalContas());
        // 
//        //Objeto 3
        System.out.println("****CLIENTE 3****");
        ContaBancaria c3 = new ContaBancaria();           
        c3.abrirConta(3, "117.177.425-72", "Cliente 3", 300.0f, 0); 
        System.out.println(c2.toString());
        System.out.println("Numero de contas criadas = " + ContaBancaria.getTotalContas());
        c3.tranfere(1, 100);
        
    }

    public static void msgDeposito()
    {
        System.out.println("Depósito realizado com sucesso!" );
    }

    public static void msgSaque()
    {
        System.out.println("Saque realizado com sucesso!" );
    }

    public static void msgErro()
    {
        System.out.println("Operação não pode ser realizada");
    }

    // public static void msgTransferencia(ContaBancaria destino)
    // {
    //     System.out.println("Transferência realizada com sucesso para conta " + destino.getId());
    // }


}
