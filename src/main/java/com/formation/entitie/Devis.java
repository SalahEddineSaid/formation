package com.formation.entitie;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "devis")
public class Devis implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String designation;
    private String unite;
    private long quantite;
    private long prixUnitaireTtc;
    private long prixTotalTtc;
    private boolean tag;


    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn (name = "id_client", nullable = false)
    private Client client;

    public Devis() {

    }

    public Devis(Long id, String designation, String unite, long quantite, long prixUnitaireTtc, long prixTotalTtc, boolean tag, Client client) {
        this.id = id;
        this.designation = designation;
        this.unite = unite;
        this.quantite = quantite;
        this.prixUnitaireTtc = prixUnitaireTtc;
        this.prixTotalTtc = prixTotalTtc;
        this.tag = tag;
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public long getQuantite() {
        return quantite;
    }

    public void setQuantite(long quantite) {
        this.quantite = quantite;
    }

    public long getPrixUnitaireTtc() {
        return prixUnitaireTtc;
    }

    public void setPrixUnitaireTtc(long prixUnitaireTtc) {
        this.prixUnitaireTtc = prixUnitaireTtc;
    }

    public long getPrixTotalTtc() {
        return prixTotalTtc;
    }

    public void setPrixTotalTtc(long prixTotalTtc) {
        this.prixTotalTtc = prixTotalTtc;
    }

    public boolean isTag() {
        return tag;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
