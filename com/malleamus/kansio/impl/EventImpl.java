package com.malleamus.kansio.impl;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.DateTime;
import com.malleamus.kansio.Form;
import com.malleamus.kansio.dossier.History;
import com.malleamus.kansio.dossier.Text;
import com.malleamus.kansio.information.Event;
import com.malleamus.kansio.visualization.Visualization;

public class EventImpl implements Event {
	
	@Override
	public InformationList getInvolved() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public DateTime getStart() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public DateTime getStop() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Text getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Text getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public History getHistory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hide(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reveal(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void seal(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unseal(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void freeze(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void thaw(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrow(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reeturn(Authorization authorization) {
		// TODO Auto-generated method stub

	}

	@Override
	public Visualization render(Authorization authorization, Form form,
			Visualization canvas) {
		// TODO Auto-generated method stub
		return null;
	}

}
