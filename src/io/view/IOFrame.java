package io.view;

import io.controller.IOController;

import javax.swing.JFrame;

/**
 * Frame for the IO project
 * 
 * @author ssan1802
 * @version 1.0 13/12/13 Created setup method and constructor.
 */
public class IOFrame extends JFrame

/**
 * IOPanel for the frame.
 */
{
	private IOPanel basePanel;

	/**
	 * Constructor for the IOFrame.
	 * 
	 * @param baseController
	 *            IOController passed in for MVC relationship.
	 * 
	 */
	public IOFrame(IOController baseController)
	{
		basePanel = new IOPanel(baseController);

		setupFrame();

	}

	/**
	 * Sets up the frame size and loads the content panel.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("IO Project");
		this.setSize(400, 400);
		this.setVisible(true);

	}
}
