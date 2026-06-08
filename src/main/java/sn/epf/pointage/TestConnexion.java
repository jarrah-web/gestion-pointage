package sn.epf.pointage;

import org.hibernate.Session;
import sn.epf.pointage.config.HibernateUtil;

public class TestConnexion {
    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("🔄 TENTATIVE DE CONNEXION À MYSQL VIA HIBERNATE...");
        System.out.println("=================================================");

        try {
            // Tente d'ouvrir une session avec la base de données
            Session session = HibernateUtil.getSessionFactory().openSession();

            if (session != null && session.isOpen()) {
                System.out.println("\n✅ [SUCCÈS] Connexion établie avec brio !");
                System.out.println("La base 'gestion_pointage_db' est accessible et Hibernate est fonctionnel.\n");
                session.close();
            }

            // Fermeture propre du service
            HibernateUtil.shutdown();
            System.out.println("=================================================");

        } catch (Exception e) {
            System.err.println("\n❌ [ERREUR] La connexion a échoué !");
            System.err.println("Vérifie que WampServer est bien vert et actif.");
            System.err.println("Détails de l'erreur :");
            e.printStackTrace();
            System.err.println("=================================================");
        }
    }
}