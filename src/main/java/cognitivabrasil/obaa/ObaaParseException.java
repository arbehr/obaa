/*******************************************************************************
 * Copyright (c) 2013 Cognitiva Brasil - Tecnologias educacionais.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 ******************************************************************************/
package cognitivabrasil.obaa;

/**
 * Basic class to represente Obaa Parse Exceptions
 * 
 * @author Luiz Rossi <lh.rossi@cognitivabrasil.com.br>
 * @author Marcos Nunes <marcos@cognitivabrasil.com.br>
 * @author Paulo Schreiner <paulo@cognitivabrasil.com.br>
 *
 */
public class ObaaParseException extends ObaaException {
	private static final long serialVersionUID = 5875969347693199801L;

	
	public ObaaParseException(String s, Exception e) {
		super(s, e);
	}
	
	public ObaaParseException(String s) {
		super(s);
	}


}
