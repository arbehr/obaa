/**
 * *****************************************************************************
 * Copyright (c) 2013 Cognitiva Brasil - Tecnologias educacionais. All rights
 * reserved. This program and the accompanying materials are made available
 * under the terms of the GNU Lesser Public License v3 which accompanies this
 * distribution, and is available at http://www.gnu.org/licenses/lgpl.html
 * ****************************************************************************
 */
/*
 * OBAA - Agent Based Leanring Objetcs
 *
 * This file is part of Obaa.
 * Obaa is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Obaa is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Obaa. If not, see <http://www.gnu.org/licenses/>.
 */
package cognitivabrasil.obaa.Rights;

import cognitivabrasil.obaa.ObaaRecursibleElement;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Objects;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * <div class="en">
 *
 * according to IEEE LOM http://ltsc.ieee.org/ </div>
 *
 * <div class="br">
 *
 *
 * Adaptado de http://www.portalobaa.org </div>
 *
 * @author Luiz Rossi <lh.rossi@cognitivabrasil.com.br>
 * @author Marcos Nunes <marcos@cognitivabrasil.com.br>
 * @author Paulo Schreiner <paulo@cognitivabrasil.com.br>
 */
@Root(strict = false)
@Namespace(reference = "http://ltsc.ieee.org/xsd/LOM", prefix = "obaa")
@ObaaRecursibleElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rights {

    private static final String NAMESPACE = "http://ltsc.ieee.org/xsd/LOM";
    @Namespace(reference = NAMESPACE)
    @Element(required = false)
    private BooleanYesNo cost;
    @Namespace(reference = NAMESPACE)
    @Element(required = false, name = "copyrightAndOtherRestrictions")
    private BooleanYesNo copyright;

    @Namespace(reference = NAMESPACE)
    @Element(required = false)
    private String description;

    public Rights() {
    }

    /**
     * @return the cost
     */
    public BooleanYesNo getCost() {
        return this.cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(boolean cost) {
        if (this.cost == null) {
            this.cost = new BooleanYesNo();
        }

        this.cost.setBoolean(cost);
    }

    /**
     * @return the copyright
     */
    public BooleanYesNo getCopyright() {
        return this.copyright;
    }

    /**
     * @param copyright the copyright to set
     */
    public void setCopyright(boolean copyright) {
        if (this.copyright == null) {
            this.copyright = new BooleanYesNo();
        }
        this.copyright.setBoolean(copyright);
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.cost);
        hash = 17 * hash + Objects.hashCode(this.copyright);
        hash = 17 * hash + Objects.hashCode(this.description);
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
        final Rights other = (Rights) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        return Objects.equals(this.copyright, other.copyright);
    }

}
