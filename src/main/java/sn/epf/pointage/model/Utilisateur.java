package sn.epf.pointage.model;

import jakarta.persistence.*;
import sn.epf.pointage.model.enums.RoleUtilisateur;

    @Entity
    @Table(name = "utilisateur")
    public class Utilisateur {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String nom;

        @Column(nullable = false, unique = true)
        private String email;

        @Column(nullable = false)
        private String motDePasse;

        @Enumerated(EnumType.STRING)
        private RoleUtilisateur role;

        public Utilisateur(Long id, String nom, String email, String motDePasse, RoleUtilisateur role) {
            this.id = id;
            this.nom = nom;
            this.email = email;
            this.motDePasse = motDePasse;
            this.role = role;
        }


        public Utilisateur() {}



        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMotDePasse() {
            return motDePasse;
        }

        public void setMotDePasse(String motDePasse) {
            this.motDePasse = motDePasse;
        }

        public RoleUtilisateur getRole() {
            return role;
        }

        public void setRole(RoleUtilisateur role) {
            this.role = role;
        }
    }

