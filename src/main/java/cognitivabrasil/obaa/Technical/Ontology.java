/*******************************************************************************
 * Copyright (c) 2013 Cognitiva Brasil - Tecnologias educacionais.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 ******************************************************************************/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cognitivabrasil.obaa.Technical;

import cognitivabrasil.obaa.ObaaRecursibleElement;
import java.util.Objects;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 *
 * <div class="en">
 *
 * </div>
 * <div class="br">
 *
 * Ontologias associadas a este serviço. Geralmente este tipo de ontologia fornece uma especificação formal do contexto do serviço.
 *
 * Adaptado de http://www.portalobaa.org/
 * </div>
 *
 * @author Luiz Rossi <lh.rossi@cognitivabrasil.com.br>
 * @author Marcos Nunes <marcos@cognitivabrasil.com.br>
 * @author Paulo Schreiner <paulo@cognitivabrasil.com.br>
 */

@Root(strict = false)
@Namespace(reference = "http://ltsc.ieee.org/xsd/LOM", prefix = "obaa")
@ObaaRecursibleElement

public class Ontology{
    @Element(required = false, name="name")
    private OntologyName name;
    @Element(required = false, name="language")
    private OntologyLanguage language;
    @Element(required = false, name="location")
    private OntologyLocation location;

   public Ontology(){
       super();
   }

    public OntologyName getName() {
        return name;
    }

    public void setName(OntologyName name) {
        this.name = name;
    }

    public OntologyLanguage getLanguage() {
        return language;
    }

    public void setLanguage(OntologyLanguage language) {
        this.language = language;
    }

    public OntologyLocation getLocation() {
        return location;
    }

    public void setLocation(OntologyLocation location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.language);
        hash = 83 * hash + Objects.hashCode(this.location);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ontology other = (Ontology) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return true;
    }
    
}
