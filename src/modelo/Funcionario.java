package modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Funcionario extends Pessoa {
    private float salario;
    private String sexo;
    private LocalDate dataAdmissao;
    private String cargo;
    private String rua;
    private String bairro;
    private String cidade;
    
    public Funcionario(float salario, String sexo, LocalDate dataAdmissao, 
            String cargo, String rua, String bairro, String cidade, 
            String cpf, String nome, String telefone, 
            LocalDate dataNascimento) {
        
        super(cpf, nome, telefone, dataNascimento);
        this.salario = salario;
        this.sexo = sexo;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + this.getNome() + ", salario="
                + salario + ", sexo=" + sexo + ", " + "dataAdmissao="
                + dataAdmissao + ", cargo=" + cargo + "," + "rua=" + rua
                + ", bairro=" + bairro + ", cidade=" + cidade + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Float.floatToIntBits(this.salario);
        hash = 47 * hash + Objects.hashCode(this.sexo);
        hash = 47 * hash + Objects.hashCode(this.dataAdmissao);
        hash = 47 * hash + Objects.hashCode(this.cargo);
        hash = 47 * hash + Objects.hashCode(this.rua);
        hash = 47 * hash + Objects.hashCode(this.bairro);
        hash = 47 * hash + Objects.hashCode(this.cidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.dataAdmissao, other.dataAdmissao)) {
            return false;
        }
        return true;
    }   
}
