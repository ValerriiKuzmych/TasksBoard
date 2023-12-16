package entities.InterfaceDAO;

import entities.Task;

public interface ITaskDAO extends IEntitysAdd<Task>, IEntitysDelete, IEntitysFindById<Task>, EntityArchiving {

}
