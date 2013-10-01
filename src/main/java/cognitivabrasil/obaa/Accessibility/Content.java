/*******************************************************************************
 * Copyright (c) 2013 Cognitiva Brasil - Tecnologias educacionais.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl.html
 ******************************************************************************/
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
package cognitivabrasil.obaa.Accessibility;

import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import cognitivabrasil.obaa.ObaaRecursibleElement;

/**
 * <div class="en">
 *
 * The features of the content of the equivalent resource that parallel the
 * ACCLIP specification.
 *
 * according to IMS GLOBAL v1.0 http://www.imsglobal.org/ </div>
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
@ObaaRecursibleElement
public class Content {

    @Element(required = false)
    private AlternativesToVisual alternativesToVisual;
    @Element(required = false)
    private AlternativesToText alternativesToText;
    @Element(required = false)
    private AlternativesToAuditory alternativesToAuditory;
    @ElementList(inline=true, required = false)
    private List<LearnerScaffold> learnerScaffold;

    public Content() {
        this.alternativesToVisual = new AlternativesToVisual();
        this.alternativesToText = new AlternativesToText();
        this.alternativesToAuditory = new AlternativesToAuditory();
        this.learnerScaffold = new ArrayList<LearnerScaffold>();
    }

    public AlternativesToAuditory getAlternativesToAuditory() {
        return alternativesToAuditory;
    }

    public void setAlternativesToAuditory(AlternativesToAuditory alternativeToAuditory) {
        this.alternativesToAuditory = alternativeToAuditory;
    }

    public AlternativesToText getAlternativesToText() {
        return alternativesToText;
    }

    public void setAlternativesToText(AlternativesToText alternativeToText) {
        this.alternativesToText = alternativeToText;
    }

    public AlternativesToVisual getAlternativesToVisual() {
        return alternativesToVisual;
    }

    public void setAlternativesToVisual(AlternativesToVisual alternativesToVisual) {
        this.alternativesToVisual = alternativesToVisual;
    }

    public List<LearnerScaffold> getLearnerScaffold() {
        return learnerScaffold;
    }

    public void setLearnerScaffold(List<LearnerScaffold> learnerScaffold) {
        this.learnerScaffold = learnerScaffold;
    }

    public void addLearnerScaffold(String learnerScaffold) {
        LearnerScaffold l = new LearnerScaffold();
        l.setText(learnerScaffold);
        this.learnerScaffold.add(l);
    }
}
