package com.malleamus.kansio.dossier;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.information.Item;
import com.malleamus.kansio.visualization.Visualizable;

public interface Dossier extends Visualizable {
	
	public Text getTitle(); //mandatory field
	public Text getDescription(); //mandatory field
	public Roster getRoster(); //list of all information on this dossier
	public History getHistory(); //list of all workflow events associated with this dossier

	public void hide(Authorization authorization); //no one can see that it exists
	public void reveal(Authorization authorization);
	public void seal(Authorization authorization); //no one can see inside of it
	public void unseal(Authorization authorization);
	public void freeze(Authorization authorization); //no one can add to or delete from it
	public void thaw(Authorization authorization);
	public void borrow(Authorization authorization, User borrower); //only the one who borrowed it can add to or delete from it
	public void reeturn(Authorization authorization);
	
	public void addInformation(Authorization authorization, Item information); 
	public void removeInformation(Authorization authorization, Item information); 
	
}
