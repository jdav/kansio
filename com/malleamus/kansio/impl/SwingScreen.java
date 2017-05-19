package com.malleamus.kansio.impl;

import javax.swing.JFrame;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.visualization.Boundaries;
import com.malleamus.kansio.visualization.Screen;
import com.malleamus.kansio.visualization.VisualConstruct;
import com.malleamus.kansio.visualization.Visualizable;
import com.malleamus.kansio.visualization.Visualization;

public class SwingScreen extends JFrame implements Screen {
	
	public SwingScreen() {
		this.setTitle("Screen Name");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
		this.pack();
	}

	@Override
	public void setBoundaries(Authorization authorization, Boundaries boundaries) {
		// TODO Auto-generated method stub
	}

	@Override
	public void show(Authorization authorization) {
		this.setVisible(true);
	}

	@Override
	public void add(VisualConstruct construct) {
		SwingVisualization swingVisualization = (SwingVisualization) construct;
		this.add(swingVisualization.getSwingComponent());
	}

	@Override
	public void hide(Authorization authorization) {
		this.setVisible(false);
	}

}
