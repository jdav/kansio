package com.malleamus.kansio.impl;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.malleamus.kansio.Authorization;
import com.malleamus.kansio.visualization.Boundaries;
import com.malleamus.kansio.visualization.TableRowVisualization;
import com.malleamus.kansio.visualization.TableVisualization;
import com.malleamus.kansio.visualization.Visualizable;

public class SwingTableVisualization extends JTable implements TableVisualization {
	
	public SwingTableVisualization() {
		super(new DefaultTableModel(new String[] { "ID", "Name", "Description" }, 20));
	}

	@Override
	public void setBoundaries(Boundaries boundaries) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show(Authorization authorization, Visualizable visualizable) {
		this.setVisible(true);
	}
	
	@Override
	public void addRow(TableRowVisualization row) {
		DefaultTableModel model = (DefaultTableModel) this.getModel();
		model.addRow(row.getCellContents());
	}

	@Override
	public void hide(Authorization authorization) {
		this.setVisible(false);	
	}

	@Override
	public void addVisualizableContent(Authorization authorization, Visualizable visualizable) {

	}

}
