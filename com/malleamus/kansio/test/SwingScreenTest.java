package com.malleamus.kansio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.malleamus.kansio.impl.EventImpl;
import com.malleamus.kansio.impl.SwingScreen;
import com.malleamus.kansio.impl.SwingTableVisualization;
import com.malleamus.kansio.impl.SwingWindow;
import com.malleamus.kansio.information.Event;
import com.malleamus.kansio.visualization.Screen;
import com.malleamus.kansio.visualization.TableVisualization;
import com.malleamus.kansio.visualization.Window;

public class SwingScreenTest {

	@Test
	public void test() {
		Screen screen = new SwingScreen();
		Window window = new SwingWindow();
		TableVisualization table = new SwingTableVisualization();
		screen.add(window);
		
		Event event = new EventImpl(); 
		assertTrue(screen != null && window != null);
	}

}
