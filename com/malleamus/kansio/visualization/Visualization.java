package com.malleamus.kansio.visualization;

import com.malleamus.kansio.Authorization;

public interface Visualization extends VisualConstruct {

	public void addVisualizableContent(Authorization authorization, Visualizable visualizable);
	
}
