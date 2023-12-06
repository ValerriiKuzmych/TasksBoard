package entitys.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entitys.User;

import eclipseTasksBoard.HibernateUtil;
//import eclipseTasksBoard.TransactionManager;
import entitys.User;
import entitys.InterfaceDAO.IUserDAO;

public class UserDAO implements IUserDAO {

	@Override
	public void add(User user) {
		

		
		//TransactionManager.performTransaction(session -> {session.save(user);});
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = session.beginTransaction();

	        try {
	            // Your database operations
	            session.save(user);

	            // Additional database operations
	            // ...

	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            throw e;  // Re-throw the exception after rolling back the transaction
	        }
	    }
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
