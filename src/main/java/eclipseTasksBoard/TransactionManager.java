package eclipseTasksBoard;

import functionalInterfaces.TransactionCallback;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TransactionManager {
	
	 public static void performTransaction(TransactionCallback callback) {
	        Transaction transaction = null;

	        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	            transaction = session.beginTransaction();

	            // Invoke the callback for database operations
	            callback.execute(session);

	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            throw new RuntimeException("Error performing transaction", e);
	        }
	    }

}
