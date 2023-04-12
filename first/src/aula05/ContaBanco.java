package aula05;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    //Métodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t))
        {
            //conta corrente
            this.setSaldo(50); //ou saldo = 50;
        }
        else if ("CP".equals(tipo)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void FecharConta() {
        if (this.saldo > 0) 
        {
            System.out.println("Conta com dinheiro!");
        }
        else if(this.saldo < 0) {
            System.out.println("Conta em Débito!");
        }
        else 
        {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void Depositar(float v) {
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);//saldo += v;

            System.out.println("Depósito realizado na conta de" + " " + this.getDono());
        }
        else 
        {
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }
    public void Sacar(float valor) {
        if (this.getStatus())
        {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado na conta de" + this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente para sacar!");
            }
        }
        else
        {
            System.out.println("Impossível sacar de uma conta fechada!");
        }   
    }
    public void PagarMensalidade() {
        int valor = 0;
        if (this.getTipo() == "CC") 
        {
            valor = 12;
        }
        else if (this.getTipo() =="CP")
        {
            valor = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Mensalidade paga com sucesso por" + this.getDono());
        }
        else 
        {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    //Métodos especiais
    public void estadoAtual() {
        System.out.println("------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public ContaBanco() {
        this.setSaldo(0);//this.saldo = 0;
        this.setStatus(false);//this.status = false;
    }
    public void setNumConta(int num) {
        this.numConta = num;
    }
    public int getNumConta() {
        return this.numConta;
    }
    public void setTipo(String t) {
        this.tipo = t;
    } 
    public String getTipo() {
        return this.tipo;
    }
    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return this.dono;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public void setStatus(boolean s) {
        this.status = s;
    }
    public boolean getStatus() {
        return this.status;
    }
}