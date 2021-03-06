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

import cognitivabrasil.obaa.Educational.Description;
import cognitivabrasil.obaa.General.Keyword;
import cognitivabrasil.obaa.General.Title;
import cognitivabrasil.obaa.ObaaRecursibleElement;
import cognitivabrasil.util.HelperFunctions;
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
 * Agrupamento das informações de um segmento (SegmentInformationType do TV-Anytime)
 *
 * Adaptado de http://www.portalobaa.org </div>
 *
 * @author Luiz Rossi <lh.rossi@cognitivabrasil.com.br>
 * @author Marcos Nunes <marcos@cognitivabrasil.com.br>
 * @author Paulo Schreiner <paulo@cognitivabrasil.com.br>
 */
@ObaaRecursibleElement
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SegmentInformation {

    @Element(required = false)
    private SegmentIdentifier identifier;

    @Element(required = false)
    private Title title;

    @Element(required = false)
    private Description description;

    @ElementList(inline = true, required = false)
    private List<Keyword> keywords;

    @Element(required = false)
    private SegmentMediaType segmentMediaType;

    //TODO: implement the mediaTimeType MPEG-7
    @Element(required = false)
    private Start start;

    @Element(required = false)
    private End end;

    public SegmentInformation() {
        this.keywords = new ArrayList<>();
        this.identifier = new SegmentIdentifier();
        this.title = new Title();
        this.description = new Description();
        this.segmentMediaType = new SegmentMediaType();
        this.start = new Start();
        this.end = new End();
    }

    public String getDescription() {
        return description.getText();
    }

    public void setDescription(String newDescription) {
        this.description.setText(newDescription);
    }

    public void setEnd(String end) {
        this.end.setText(end);
    }

    public String getEnd() {
        return end.getText();
    }

    public void setIdentifier(String newIdentifier) {
        this.identifier.setText(newIdentifier);
    }

    public String getIdentifier() {
        return this.identifier.getText();
    }

    public void addKeyword(String newKeyword) {
        this.keywords.add(new Keyword(newKeyword));
    }

    public List<String> getKeywords() {
        return HelperFunctions.toStringList(keywords);
    }

    public void setSegmentMediaType(SegmentMediaType segmentMediaType) {
        this.segmentMediaType = segmentMediaType;
    }

    public void setStart(String start) {
        this.start.setText(start);
    }

    public String getStart() {
        return (start.getText());
    }

    public void setTitle(String newTitle) {
        this.title.setText(newTitle);
    }

    public String getTitle() {
        return title.getText();
    }

    public String getSegmentMediaType() {
        return segmentMediaType.getText();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.identifier);
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.keywords);
        hash = 67 * hash + Objects.hashCode(this.segmentMediaType);
        hash = 67 * hash + Objects.hashCode(this.start);
        hash = 67 * hash + Objects.hashCode(this.end);
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
        final SegmentInformation other = (SegmentInformation) obj;
        if (!Objects.equals(this.identifier, other.identifier)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.keywords, other.keywords)) {
            return false;
        }
        if (!Objects.equals(this.segmentMediaType, other.segmentMediaType)) {
            return false;
        }
        if (!Objects.equals(this.start, other.start)) {
            return false;
        }
        return Objects.equals(this.end, other.end);
    }

}
