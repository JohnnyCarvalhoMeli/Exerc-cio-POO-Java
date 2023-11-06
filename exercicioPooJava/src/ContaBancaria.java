import java.util.ArrayList;

public class ContaBancaria {


    private String nomeTitular, dataAbertura;
    private int id;

    private Long numero, agencia;

    private Double saldo = 0.00;
    private DataConta data = new DataConta();
    ArrayList<String> contas = new ArrayList<>();

    public ContaBancaria(String nomeTitular, String dataAbertura, Long numero, Long agencia, int identificador, Double saldo) {
        this.nomeTitular = nomeTitular;
        this.dataAbertura = dataAbertura;
        this.numero = numero;
        this.agencia = agencia;
        this.id = identificador;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public DataConta getData() {
        return data;
    }

    public void setData(DataConta data) {
        this.data = data;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        this.saldo += valor;

    }

    public void sacar(Double valor) {
        this.saldo -= valor;

    }

    public String recuperarDadosParaImpressao() {

        String dados = "";

        dados += "Id da conta: " + id;
        dados += "\nTitular: " +nomeTitular;
        dados += "\nNúmero da conta: " + numero;
        dados += "\nAgência: " + agencia;
        dados += "\nSaldo da conta R$: " + saldo;
        dados += "\nData abertura da conta: " + dataAbertura;

        return dados;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nomeTitular='" + nomeTitular + '\'' +
                ", dataAbertura='" + dataAbertura + '\'' +
                ", id=" + id +
                ", numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", data=" + data +
                '}';
    }
}
