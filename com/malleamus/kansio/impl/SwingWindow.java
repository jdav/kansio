package com.malleamus.kansio.impl;

import javax.swing.JScrollPane;
import javax.swing.JViewport;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.visualization.Boundaries;
import com.malleamus.kansio.visualization.Visualizable;
import com.malleamus.kansio.visualization.Visualization;
import com.malleamus.kansio.visualization.Window;

public class SwingWindow extends JScrollPane implements Window {
	
	private Boundaries boundaries = null;
	private JViewport viewport = null;
	
	public SwingWindow() {
		super();
		viewport = new JViewport();
		this.setViewport(viewport);
	}

	@Override
	public void show(Authorization authorization, Visualizable visualizable) {
		this.setVisible(true);
	}

	@Override
	public void setBoundaries(Boundaries boundaries) {
		this.boundaries = boundaries;
	}

	@Override
	public void add(Visualization visualization, Boundaries boundaries) {
		SwingVisualization swingVisualization = (SwingVisualization) visualization;
		viewport.add(swingVisualization.getSwingComponent());
	}

	@Override
	public void hide(Authorization authorization) {
		this.setVisible(false);
	}

	@Override
	public void addVisualizableContent(Authorization authorization, Visualizable visualizable) {
		// TODO Auto-generated method stub
		
	}

}
