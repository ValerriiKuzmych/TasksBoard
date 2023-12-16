package entities.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import eclipseTasksBoard.HibernateUtil;
import entities.TasksBoard;
import entities.InterfaceDAO.ITasksBoardDAO;

public class TasksBoardDAO implements ITasksBoardDAO {

	@Override
	public void add(TasksBoard tasksBoard) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction transaction = session.beginTransaction();

			try {
				session.save(tasksBoard);

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
	public TasksBoard findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void entityArchiving(long id) {
		// TODO Auto-generated method stub

	}

}
