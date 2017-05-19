package com.malleamus.kansio.visualization;

import java.util.Vector;

import com.malleamus.kansio.Authorization;

public interface TableRowVisualization extends Visualization {

	public void setTable(TableVisualization table);

	public Vector getCellContents();

}
