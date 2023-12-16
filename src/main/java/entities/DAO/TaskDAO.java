package entities.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import eclipseTasksBoard.HibernateUtil;
import entities.Task;
import entities.InterfaceDAO.ITaskDAO;

public class TaskDAO implements ITaskDAO {

	@Override
	public void update(Task task) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction transaction = session.beginTransaction();

			try {

				session.update(task);

				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				throw e; // Re-throw the exception after rolling back the transaction
			}
		}

	}

	@Override
	public void add(Task task) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction transaction = session.beginTransaction();

			try {

				session.update(task);

				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				throw e; // Re-throw the exception after rolling back the transaction
			}
		}

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Task findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void entityArchiving(long id) {
		// TODO Auto-generated method stub

	}

}
