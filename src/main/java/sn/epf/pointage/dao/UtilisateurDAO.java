package sn.epf.pointage.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.epf.pointage.config.HibernateUtil;
import sn.epf.pointage.model.Utilisateur;

public class UtilisateurDAO {

    public void save(Utilisateur utilisateur) {
        Transaction transaction = null;
        // On ouvre la session
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(utilisateur); // Sauvegarde l'objet
            transaction.commit();         // Valide la transaction
            System.out.println("✅ Sauvegarde réussie !");
        } catch (Exception e) {
            if (transaction != null && transaction.getStatus().canRollback()) {
                transaction.rollback(); // Annule si erreur
            }
            e.printStackTrace(); // Affiche l'erreur précise pour comprendre pourquoi ça a échoué
        }
    }

    // Ajoute ici tes futures méthodes : findById, delete, etc.

}