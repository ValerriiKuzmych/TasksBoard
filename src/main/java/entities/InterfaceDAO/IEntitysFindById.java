package entities.InterfaceDAO;

public interface IEntitysFindById<T> {
	
	  T findById(long id);

}
