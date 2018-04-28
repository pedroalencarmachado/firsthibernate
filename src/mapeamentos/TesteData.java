/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapeamentos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class TesteData {
    @Id
    private int codTestData;
    
    @Temporal(TemporalType.DATE)
    private java.util.Date date;

    public int getCodTestData() {
        return codTestData;
    }

    public void setCodTestData(int codTestData) {
        this.codTestData = codTestData;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
