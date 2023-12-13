package entitys.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import entitys.User;

import eclipseTasksBoard.HibernateUtil;
import entitys.InterfaceDAO.IUserDAO;

public class UserDAO implements IUserDAO {

	@Override
	public void add(User user) {
		

		
		
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = session.beginTransaction();

	        try {
	           
	            session.save(user);

	            

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
	    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	        Transaction transaction = null;

	        try {
	            transaction = session.beginTransaction();

	            // Retrieve the user by id
	            User user = session.get(User.class, id);

	            transaction.commit();

	            return user;
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            throw e;  // Re-throw the exception after rolling back the transaction
	        }
	    }
	}
}