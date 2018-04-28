/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamentos;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "treinador_seq", sequenceName = "treinador_seq", allocationSize = 1)
public class Treinador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "treinador_seq")
    private int codTreinador;

    private String nome;

    @OneToOne
    private Endereco endereco;

    @OneToMany(mappedBy = "treina",
            targetEntity = Treinador.class,
            fetch = FetchType.LAZY)
    private Collection<Treina> treina;

    public int getCodTreinador() {
        return codTreinador;
    }

    public void setCodTreinador(int codTreinador) {
        this.codTreinador = codTreinador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Collection<Treina> getTreina() {
        return treina;
    }

    public void setTreina(Collection<Treina> treina) {
        this.treina = treina;
    }

    public void setEndereco(Treinador treinador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
