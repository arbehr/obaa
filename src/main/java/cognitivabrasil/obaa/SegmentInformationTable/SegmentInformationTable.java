/** *****************************************************************************
 * Copyright (c) 2013 Cognitiva Brasil - Tecnologias educacionais.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 ***************************************************************************** */
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
package cognitivabrasil.obaa.SegmentInformationTable;

import cognitivabrasil.obaa.ObaaRecursibleElement;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

/**
 * <div class="en">
 *
 * according to TV Anytime http://www.tv-anytime.org/ </div>
 *
 * <div class="br">
 *
 * Grupo que conterá o conjunto de informações de segmentação dos objetos de aprendizagem e de grupos de segmentos dos
 * objetos de aprendizagem.
 *
 *
 * Adaptado de http://www.portalobaa.org </div>
 *
 * @author Luiz Rossi <lh.rossi@cognitivabrasil.com.br>
 * @author Marcos Nunes <marcos@cognitivabrasil.com.br>
 * @author Paulo Schreiner <paulo@cognitivabrasil.com.br>
 */
@ObaaRecursibleElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SegmentInformationTable {

    @ElementList(inline = true, required = false)
    private List<SegmentList> segmentList;
    @Element(required = false)
    private SegmentGroupList segmentGroupList;

    public SegmentInformationTable() {
        this.segmentList = new ArrayList<>();
        this.segmentGroupList = new SegmentGroupList();
    }

    public void setSegmentList(List<SegmentList> segmentList) {
        this.segmentList = segmentList;
    }

    public void addSegmentList(SegmentList segmentList) {
        this.segmentList.add(segmentList);
    }

    public List<SegmentList> getSegmentList() {
        return segmentList;
    }

    public void setSegmentGroupList(SegmentGroupList segmentGroupList) {
        this.segmentGroupList = segmentGroupList;
    }

    public SegmentGroupList getSegmentGroupList() {
        return segmentGroupList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.segmentList);
        hash = 41 * hash + Objects.hashCode(this.segmentGroupList);
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
        final SegmentInformationTable other = (SegmentInformationTable) obj;
        if (!Objects.equals(this.segmentList, other.segmentList)) {
            return false;
        }
        return Objects.equals(this.segmentGroupList, other.segmentGroupList);
    }

}
