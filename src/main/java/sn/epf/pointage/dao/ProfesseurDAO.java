package sn.epf.pointage.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import sn.epf.pointage.config.HibernateUtil;
import sn.epf.pointage.model.Professeur;

    public class ProfesseurDAO {

        // Ajouter un professeur
        public void save(Professeur professeur) {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                session.persist(professeur);
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            }
        }

        // Tu peux ajouter d'autres méthodes ici :
        // findById, findAll, delete, etc.
    }
