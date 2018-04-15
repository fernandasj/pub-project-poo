package modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Funcionario extends Pessoa {
    private float salario;
    private LocalDate dataAdmissao;
    private String cargo;
    private String senha;
    
    public Funcionario(float salario, LocalDate dataAdmissao, 
            String cargo, String senha, String cpf, String nome, String telefone, 
            LocalDate dataNascimento) {
        
        super(cpf, nome, telefone, dataNascimento);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.senha = senha;
        
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return this.getNome() + "cpf=" + this.getCpf() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Float.floatToIntBits(this.salario);
        hash = 89 * hash + Objects.hashCode(this.dataAdmissao);
        hash = 89 * hash + Objects.hashCode(this.cargo);
        hash = 89 * hash + Objects.hashCode(this.senha);
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
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.dataAdmissao, other.dataAdmissao)) {
            return false;
        }
        return true;
    }

   
}
