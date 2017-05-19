package com.malleamus.kansio.visualization;

import com.malleamus.kansio.Authorization;

public interface VisualConstruct {
	
	public void setBoundaries(Authorization authorization, Boundaries boundaries);
	public void show(Authorization authorization);
	public void hide(Authorization authorization);
	
}
