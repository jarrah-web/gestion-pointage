package sn.epf.pointage;

import sn.epf.pointage.dao.UtilisateurDAO;
import sn.epf.pointage.model.Utilisateur;
import sn.epf.pointage.model.enums.RoleUtilisateur;

public class TestConnexion {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("🔄 TEST D'INSERTION D'UN UTILISATEUR...");
        System.out.println("=================================================");

        // 1. Création d'un utilisateur de test
        Utilisateur user = new Utilisateur();
        user.setNom("Testeur");
        user.setEmail("test@epf.sn");
        user.setMotDePasse("1234");
        user.setRole(RoleUtilisateur.ADMIN); // Assure-toi que cet Enum existe

        // 2. Utilisation du DAO pour sauvegarder
        UtilisateurDAO dao = new UtilisateurDAO();
        dao.save(user);

        System.out.println("✅ [SUCCÈS] Utilisateur ajouté en base de données !");
    }
}