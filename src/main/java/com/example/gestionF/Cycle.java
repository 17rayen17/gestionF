package com.example.gestionF;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table
public class Cycle {
    @Id
    @Column
    private int numaction;
    @Column
    private int numsalle;
    @Column
    private String themedeformation;
    @Column
    private String modedeformation;
    @Column
    private String lieudederoulement;
    @Column
    private String gouvernorat ;

    private LocalDate periode = LocalDate.now();






    public Cycle (){
        this.periode=LocalDate.now();
    }

    public Cycle(int numaction, int numsalle, String themedeformation,
                 String modedeformation, String lieudederoulement, String gouvernorat) {
        this.numaction = numaction;
        this.numsalle = numsalle;
        this.themedeformation = themedeformation;
        this.modedeformation = modedeformation;
        this.lieudederoulement = lieudederoulement;
        this.gouvernorat = gouvernorat;
        this.periode=LocalDate.now();
    }

    public int getNumaction() {
        return numaction;
    }

    public int getNumsalle() {
        return numsalle;
    }

    public String getThemedeformation() {
        return themedeformation;
    }

    public String getModedeformation() {
        return modedeformation;
    }

    public String getLieudederoulement() {
        return lieudederoulement;
    }

    public String getGouvernorat() {
        return gouvernorat;
    }


    public LocalDate getPeriode() {
        return periode;
    }
}
