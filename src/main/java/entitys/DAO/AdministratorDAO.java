package entitys.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import eclipseTasksBoard.HibernateUtil;
import entitys.Administrator;
import entitys.InterfaceDAO.IAdministratorDAO;

public class AdministratorDAO implements IAdministratorDAO {

	@Override
	public void add(Administrator administrator) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			Transaction transaction = session.beginTransaction();

			try {

				session.save(administrator);

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
	public Administrator findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
