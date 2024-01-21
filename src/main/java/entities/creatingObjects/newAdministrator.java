package entities.creatingObjects;

import entities.Administrator;


public class newAdministrator {
	
	
	
	
	public void newAdministratorCreating() {
		
		Administrator newAdministrator = new Administrator();
		newGeneralPanel newGeneralPanel = new newGeneralPanel();
		
		
			
		newAdministrator.setGeneralPanel(newGeneralPanel.creatingGeneralPanel());
		
		//TODO: implement getting Admin informations: login , name and so on;
		
		
	}

}
