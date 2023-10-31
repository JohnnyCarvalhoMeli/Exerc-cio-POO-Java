public class ContaBancaria {


    String nomeTitular, dataAbertura;
    int numero, agencia;
    Double saldo;

    public ContaBancaria(String nomeTitular, String dataAbertura, int numero, int agencia, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.dataAbertura = dataAbertura;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }


    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void recuperarDadosParaImpressao() {
        System.out.println("Aqui vai imprimir alguns dados do usuário.");
    }
}
