package ex04;

public class Municipio {
    private int codigo;
    private int UF;
    private String nome;

    public Municipio(int codigo, int UF, String nome) {
        this.codigo = codigo;
        this.UF = UF;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getUF() {
        return UF;
    }

    public void setUF(int UF) {
        this.UF = UF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Municipio{" +
                "codigo=" + codigo +
                ", UF='" + UF + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
