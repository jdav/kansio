package com.malleamus.kansio.impl;

import java.util.Vector;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.visualization.Boundaries;
import com.malleamus.kansio.visualization.TableRowVisualization;
import com.malleamus.kansio.visualization.TableVisualization;
import com.malleamus.kansio.visualization.Visualizable;

public class SwingTableRowVisualization implements TableRowVisualization {
	
	private TableVisualization table;
	
	@Override
	public void setTable(TableVisualization table) {
		// TODO Auto-generated method stub

	};

	@Override
	public void hide(Authorization authorization) {     
		table.hide(authorization);
	}
	
	@Override
	public void addVisualizableContent(Authorization authorization, Visualizable visualizable) {     
		table.addRow(this);
	}

	@Override
	public void show(Authorization authorization) {     
		table.show(authorization);
	}

	@Override
	public Vector getCellContents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setBoundaries(Authorization authorization, Boundaries boundaries) {
		// TODO Auto-generated method stub
		
	}

}
