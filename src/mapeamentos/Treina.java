/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamentos;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Treina implements Serializable {
    
    @EmbeddedId
    private TreinaPk chaveComposta;

    private int nota;
    
    public TreinaPk getChaveComposta() {
        return chaveComposta;
    }

    public void setChaveComposta(TreinaPk chaveComposta) {
        this.chaveComposta = chaveComposta;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
    
    
}
