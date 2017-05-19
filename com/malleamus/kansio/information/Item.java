package com.malleamus.kansio.information;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.dossier.History;
import com.malleamus.kansio.dossier.Text;
import com.malleamus.kansio.visualization.Visualizable;

public interface Item extends Visualizable {
	
	public Text getTitle(); //mandatory field
	public Text getDescription(); //mandatory field
	public History getHistory(); //list of all workflow events associated with this information
	
	public void hide(Authorization authorization); //no one can see that it exists
	public void reveal(Authorization authorization);
	public void seal(Authorization authorization); //no one can see inside of it
	public void unseal(Authorization authorization);
	public void freeze(Authorization authorization); //no one can add to or delete from it
	public void thaw(Authorization authorization);
	public void borrow(Authorization authorization); //only the one who borrowed it can add to or delete from it
	public void reeturn(Authorization authorization);
	
}
