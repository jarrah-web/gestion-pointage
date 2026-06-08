package sn.epf.pointage.model;

import jakarta.persistence.*;

@Entity
@Table(name = "salles")
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCapacite() {
        return capacite;
    }

    public void setCapacite(Integer capacite) {
        this.capacite = capacite;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public String getEquipements() {
        return equipements;
    }

    public void setEquipements(String equipements) {
        this.equipements = equipements;
    }

    @Column(unique = true, nullable = false)
    private String nom;

    private Integer capacite;

    private String batiment;

    public Salle(Long id, String nom, Integer capacite, String batiment, String equipements) {
        this.id = id;
        this.nom = nom;
        this.capacite = capacite;
        this.batiment = batiment;
        this.equipements = equipements;
    }

    private String equipements;

    // Constructeur vide (obligatoire pour Hibernate)
    public Salle() {
    }
}
