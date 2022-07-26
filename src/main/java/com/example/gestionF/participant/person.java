package com.example.gestionF.participant;

import javax.persistence.Entity;
import java.sql.*;

@Entity
public class person {

    private int cin;
    private String nomprenom;
    private Date datedenaissance;
    private String mail;
    private int portable;
    private int codepostal;


    public person(int cin, String nomprenom, Date datedenaissance, String mail, int portable, int codepostal) {
        this.cin = cin;
        this.nomprenom = nomprenom;
        this.datedenaissance = datedenaissance;
        this.mail = mail;
        this.portable = portable;
        this.codepostal = codepostal;
    }

    public int getCin() {
        return cin;
    }

    public String getNomprenom() {
        return nomprenom;
    }

    public Date getDatedenaissance() {
        return datedenaissance;
    }

    public String getMail() {
        return mail;
    }

    public int getPortable() {
        return portable;
    }

    public int getCodepostal() {
        return codepostal;
    }
}
