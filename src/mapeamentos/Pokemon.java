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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="pokemon_seq", sequenceName="pokemon_seq", allocationSize=1)
public class Pokemon implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pokemon_seq")
    private int codPokemon;
    
    private String nome;

    @ManyToOne
    @JoinColumn(name = "codTipo")
    private Tipo tipo;

    
    @OneToMany(mappedBy = "treina",
            targetEntity = Pokemon.class,
            fetch = FetchType.LAZY)
    private Collection<Treina> treina;
    
   
    public int getCodPokemon() {
        return codPokemon;
    }

    public void setCodPokemon(int codPokemon) {
        this.codPokemon = codPokemon;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Collection<Treina> getTreina() {
        return treina;
    }

    public void setTreina(Collection<Treina> treina) {
        this.treina = treina;
    }

    

    
}
