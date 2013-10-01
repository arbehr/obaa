/**
 * *****************************************************************************
 * Copyright (c) 2013 Cognitiva Brasil - Tecnologias educacionais. All rights
 * reserved. This program and the accompanying materials are made available
 * under the terms of the GNU Lesser Public License v3 which accompanies this
 * distribution, and is available at http://www.gnu.org/licenses/lgpl.html
 *****************************************************************************
 */
package cognitivabrasil.util;

import java.util.ArrayList;
import java.util.List;
import metadata.TextElement;
import org.apache.log4j.Logger;

/**
 * Classe com m&eacute;todos que efetuam opera&ccedil;otilde;es diversas. Como
 * testes e remo&ccedil;&otilde;es de acentua&ccedil;&atilde;o
 *
 * @author Luiz Rossi <lh.rossi@cognitivabrasil.com.br>
 * @author Marcos Nunes <marcos@cognitivabrasil.com.br>
 * @author Paulo Schreiner <paulo@cognitivabrasil.com.br>
 */
public class HelperFunctions {

    static Logger log = Logger.getLogger(HelperFunctions.class);

    public static List<String> toStringList(List<? extends TextElement> elements) {
        List<String> s = new ArrayList<String>();
        for (TextElement e : elements) {

            // only add element to list if it is not null
            if (e != null && e.getText() != null) {
                s.add(e.getText());
            }
        }
        return s;
    }

    @SuppressWarnings("unchecked")
    public static List<? extends TextElement> fromStringList(
            List<String> titles, Class<? extends TextElement> c) {

        @SuppressWarnings("rawtypes")
        List l = new ArrayList();

        for (String text : titles) {
            TextElement element;
            try {
                element = c.newInstance();
                element.setText(text);
                l.add(element);
            } catch (InstantiationException e) {
                log.error(e);
            } catch (IllegalAccessException e) {                
                log.error(e);
            }

        }

        return l;

    }
}
