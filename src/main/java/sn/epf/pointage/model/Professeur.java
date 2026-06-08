package sn.epf.pointage.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import sn.epf.pointage.model.enums.TypeContrat; // <-- L'import pour trouver ton Enum !

@Entity
@Table(name = "professeurs")
public class Professeur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String matricule;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;

    @Column(unique = true)
    private String email;

    private String telephone;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_contrat")
    private TypeContrat typeContrat;

    @Column(name = "taux_horaire_xof")
    private Double tauxHoraireXOF;

    @Column(name = "date_embauche")
    private LocalDate dateEmbauche;

    private String photo;

    @Column(columnDefinition = "boolean default true")
    private Boolean actif = true;

    // Constructeur vide (obligatoire pour Hibernate)
    public Professeur() {
    }

    public Long getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public Professeur(Long id, String matricule, String nom, String prenom, String email, String telephone, TypeContrat typeContrat, Double tauxHoraireXOF, LocalDate dateEmbauche, String photo, Boolean actif) {
        this.id = id;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.typeContrat = typeContrat;
        this.tauxHoraireXOF = tauxHoraireXOF;
        this.dateEmbauche = dateEmbauche;
        this.photo = photo;
        this.actif = actif;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public TypeContrat getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(TypeContrat typeContrat) {
        this.typeContrat = typeContrat;
    }

    public Double getTauxHoraireXOF() {
        return tauxHoraireXOF;
    }

    public void setTauxHoraireXOF(Double tauxHoraireXOF) {
        this.tauxHoraireXOF = tauxHoraireXOF;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setId(Long id) {
        this.id = id;
    }

}