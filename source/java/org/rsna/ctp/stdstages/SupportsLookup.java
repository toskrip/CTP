/*---------------------------------------------------------------
*  Copyright 2015 by the Radiological Society of North America
*
*  This source software is released under the terms of the
*  RSNA Public License (http://mirc.rsna.org/rsnapubliclicense.pdf)
*----------------------------------------------------------------*/

package org.rsna.ctp.stdstages;

import java.io.File;

/**
 * The interface specifying the requirements for a PipelineStage
 * that contains one or more scripts that can be edited by the
 * ScriptServlet.
 */
public interface SupportsLookup {

	/**
	 * Get the lookup table file.
	 * @return the lookup table file
	 */
	public File getLookupTableFile();

}