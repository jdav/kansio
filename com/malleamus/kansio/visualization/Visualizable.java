package com.malleamus.kansio.visualization;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.Form;

public interface Visualizable {
	
	public Visualization render(Authorization authorization, Form form, Visualization canvas);

}

