package functionalInterfaces;

import org.hibernate.Session;

@FunctionalInterface
public interface TransactionCallback {
	
    void execute(Session session);
    
}

