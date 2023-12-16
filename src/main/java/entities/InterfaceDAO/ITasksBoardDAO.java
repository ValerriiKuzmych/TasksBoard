package entities.InterfaceDAO;

import entities.TasksBoard;

public interface ITasksBoardDAO extends IEntitysAdd<TasksBoard>, IEntitysDelete, IEntitysFindById<TasksBoard>, EntityArchiving,  IEntitysUpdate<TasksBoard> {

}
