 package sn.epf.pointage.model;

import jakarta.persistence.*;

    @Entity
    @Table(name = "cours")
    public class Cours {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true, nullable = false)
        private String code;

        @Column(nullable = false)
        private String intitule;

        @Column(name = "volume_horaire_total")
        private Integer volumeHoraireTotal;

        @Column(name = "niveau_etude")
        private String niveauEtude;

        private String filiere;

        private String semestre;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getIntitule() {
            return intitule;
        }

        public void setIntitule(String intitule) {
            this.intitule = intitule;
        }

        public Integer getVolumeHoraireTotal() {
            return volumeHoraireTotal;
        }

        public void setVolumeHoraireTotal(Integer volumeHoraireTotal) {
            this.volumeHoraireTotal = volumeHoraireTotal;
        }

        public String getNiveauEtude() {
            return niveauEtude;
        }

        public void setNiveauEtude(String niveauEtude) {
            this.niveauEtude = niveauEtude;
        }

        public String getFiliere() {
            return filiere;
        }

        public void setFiliere(String filiere) {
            this.filiere = filiere;
        }

        public Cours(String semestre, String filiere, String niveauEtude, Integer volumeHoraireTotal, String intitule, String code, Long id) {
            this.semestre = semestre;
            this.filiere = filiere;
            this.niveauEtude = niveauEtude;
            this.volumeHoraireTotal = volumeHoraireTotal;
            this.intitule = intitule;
            this.code = code;
            this.id = id;
        }

        public String getSemestre() {
            return semestre;
        }

        public void setSemestre(String semestre) {
            this.semestre = semestre;
        }

        // Constructeur vide (obligatoire pour Hibernate)
        public Cours() {
        }


    }

