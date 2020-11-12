/**
 * *****************************************************************************
 * Copyright (c) 2013 Cognitiva Brasil - Tecnologias educacionais. All rights
 * reserved. This program and the accompanying materials are made available
 * under the terms of the GNU Lesser Public License v3 which accompanies this
 * distribution, and is available at http://www.gnu.org/licenses/lgpl.html
 *****************************************************************************
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
package cognitivabrasil.obaa.Educational;

import cognitivabrasil.obaa.ObaaRecursibleElement;
import cognitivabrasil.obaa.Technical.Duration;
import static cognitivabrasil.util.HelperFunctions.toStringList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

/**
 * <div class="en">
 *
 * This category describes the key educational or pedagogic characteristics of this learning object.
 *
 *
 * NOTE:--This is the pedagogical information essential to those involved in achieving a quality learning experience.
 * The audience for this metadata includes teachers, managers, authors, and learners.
 *
 * according to IEEE LOM http://ltsc.ieee.org/ </div>
 *
 * <div class="br">
 *
 * Descrição das características educacionais do objeto de aprendizagem.
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
public class Educational {

    private static final String NAMESPACE = "http://ltsc.ieee.org/xsd/LOM";

    @Element(required = false)
    private InteractivityType interactivityType;
    /**
     * <div class="en">
     *
     * The degree of interactivity characterizing this learning object. Interactivity in this context refers to the
     * degree to which the learner can influence the aspect or behavior of the learning object.
     *
     * NOTE 1:--Inherently, this scale is meaningful within the context of a community of practice.
     *
     * NOTE 2:--Learning objects with 5.1:Educational.InteractivityType="active" may have a high interactivity level
     * (e.g., a simulation environment endowed with many controls) or a low interactivity level (e.g., a written set of
     * instructions that solicit an activity). Learning objects with 5.1:Educational.InteractivityType="expositive" may
     * have a low interactivity level (e.g., a piece of linear, narrative text produced with a standard word processor)
     * or a medium to high interactivity level (e.g., a sophisticated hyperdocument, with many internal links and
     * views).
     *
     *
     * Value Space: very low, low, medium, high, very high
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
    @Namespace(reference = NAMESPACE)
    @Element(required = false)
    private InteractivityLevel interactivityLevel;
    /**
     * <div class="en">
     *
     * The degree of conciseness of a learning object. The semantic density of a learning object may be estimated in
     * terms of its size, span, or --in the case of self-timed resources such as audio or video-- duration. The semantic
     * density of a learning object is independent of its difficulty. It is best illustrated with examples of expositive
     * material, although it can be used with active resources as well.
     *
     * NOTE 1:--Inherently, this scale is meaningful within the context of a community of practice.
     *
     * Value Space: very low, low, medium, high, very high
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
    @Namespace(reference = NAMESPACE)
    @Element(required = false)
    private SemanticDensity semanticDensity;
    /**
     * <div class="en">
     *
     * How hard it is to work with or through this learning object for the typical intended target audience.
     *
     * NOTE:--The " typical target audience" can be characterized by data elements 5.6:Educational.Context and
     * 5.7:Educational.TypicalAgeRange.
     *
     * Value Space: very easy, easy, medium, difficult, very difficult
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
    @Namespace(reference = NAMESPACE)
    @Element(required = false)
    private Difficulty difficulty;
    /**
     * <div class="en">
     *
     * Approximate or typical time it takes to work with or through this learning object for the typical intended target
     * audience.
     *
     * NOTE:--The " typical target audience" can be characterized by data elements 5.6:Educational.Context and
     * 5.7:Educational.TypicalAgeRange.
     *
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
     *
     * não foi feita a verificação de consistência was not made any consistence verification
     */
    @Namespace(reference = NAMESPACE)
    @Element(required = false)
    private Duration typicalLearningTime;
    /**
     * <div class="en">
     *
     * Age of the typical intended user. This data element shall refer to developmental age, if that would be different
     * from chronological age.
     *
     * NOTE 1:--The age of the learner is important for finding learning objects, especially for school age learners and
     * their teachers. When applicable, the string should be formatted as minimum age-maximum age or minimum age-.
     * (NOTE:--This is a compromise between adding three component elements (minimum age, maximum age, and descriptions)
     * and having just a free text field.)
     *
     * NOTE 2:--Alternative schemes for what this data element tries to cover (such as various reading age or reading
     * level schemes, IQ's or developmental age measures) should be represented through the 9:Classification category.
     *
     * Examples: "7-9", "0-5", "15", "18-", ("suitable for children over 7"), ("en","adults only")
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
    @ElementList(inline = true, required = false)
    private List<IntendedEndUserRole> intendedEndUserRoles;
    @ElementList(inline = true, required = false)
    private List<LearningResourceType> learningResourceTypes;
    @ElementList(inline = true, required = false)
    private List<TypicalAgeRange> typicalAgeRanges;
    @ElementList(inline = true, required = false)
    private List<Description> descriptions;
    @ElementList(inline = true, required = false)
    private List<Language> languages;
    @ElementList(inline = true, required = false)
    private List<Context> contexts;
    @Element(required = false)
    private LearningContentType learningContentType;
    @Element(required = false)
    private Interaction interaction;
    @ElementList(inline = true, required = false)
    private List<DidaticStrategy> didaticStrategy;
    @ElementList(inline = true, required = false)
    private List<KnowledgeArea> knowledgeAreas;

    public Educational() {
        this.intendedEndUserRoles = new ArrayList<>();
        this.learningResourceTypes = new ArrayList<>();
        this.typicalAgeRanges = new ArrayList<>();
        this.descriptions = new ArrayList<>();
        this.languages = new ArrayList<>();
        this.contexts = new ArrayList<>();
        this.didaticStrategy = new ArrayList<>();
        this.knowledgeAreas = new ArrayList<>();
        //TipicalLearningTime should not be initialized to avoid create a blank element in the XML
    }

    public List<DidaticStrategy> getDidaticStrategy() {
        return didaticStrategy;
    }

    public void addDidaticStrategy(String didaticStrategy) {
        DidaticStrategy ds = new DidaticStrategy();
        ds.setText(didaticStrategy);
        this.didaticStrategy.add(ds);
    }

    public Interaction getInteraction() {
        return interaction;
    }

    public void setInteraction(Interaction interaction) {
        this.interaction = interaction;
    }

    public void addContext(String context) {
        Context c = new Context();
        c.setText(context);
        this.contexts.add(c);
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> description) {
        this.descriptions = description;
    }

    public void addDescription(String description) {
        Description d = new Description(description);
        this.descriptions.add(d);
    }

    @JsonIgnore
    public Map<String, String> getIntendedEndUserRoleValues() {
        IntendedEndUserRole i = new IntendedEndUserRole();
        return (i.getMapOfTerms());
    }

    @JsonIgnore
    public List<String> getIntendedEndUserRoleAsStrings() {
        return toStringList(intendedEndUserRoles);
    }

    public void setIntendedEndUserRoles(List<IntendedEndUserRole> intendedEndUserRole) {
        this.intendedEndUserRoles = intendedEndUserRole;
    }

    public void addIntendedEndUserRole(String intendedEndUserRole) {
        IntendedEndUserRole i = new IntendedEndUserRole();
        i.setText(intendedEndUserRole);
        this.intendedEndUserRoles.add(i);
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> language) {
        this.languages = language;
    }

    public void addLanguage(String language) {
        this.languages.add(new Language(language));
    }

    public String getLearningContentType() {
        if (learningContentType == null) {
            return null;
        } else {
            return learningContentType.getTranslated();
        }
    }

    public void setLearningContentType(LearningContentType learningContentType) {
        this.learningContentType = learningContentType;
    }

    public void setLearningContentType(String learningContentType) {
        this.learningContentType = new LearningContentType();
        this.learningContentType.setText(learningContentType);
    }

    public List<LearningResourceType> getLearningResourceTypes() {
        return learningResourceTypes;
    }

    public void addLearningResourceType(String learningResourceType) {
        LearningResourceType l = new LearningResourceType();
        l.setText(learningResourceType);
        this.learningResourceTypes.add(l);
    }

    public List<IntendedEndUserRole> getIntendedEndUserRoles() {
        return intendedEndUserRoles;
    }

    @JsonIgnore
    public Map<String, String> getContextValues() {
        Context c = new Context();
        return (c.getMapOfTerms());
    }

    public void setContexts(List<Context> contexts) {
        this.contexts = contexts;
    }

    public List<Context> getContexts() {
        return contexts;
    }

    /**
     * @return the interactivityType
     */
    public String getInteractivityType() {
        if (interactivityType == null) {
            return null;
        }
        return interactivityType.getTranslated();
    }

    /**
     * @param interactivityType the interactivityType to set
     */
    public void setInteractivityType(String interactivityType) {
        this.interactivityType = new InteractivityType();
        this.interactivityType.setText(interactivityType);
    }

    /**
     * @return the interactivityLevel
     */
    public InteractivityLevel getInteractivityLevel() {
        return interactivityLevel;
    }

    /**
     * @param interactivityLevel the interactivityLevel to set
     */
    public void setInteractivityLevel(String interactivityLevel) {
        this.interactivityLevel = new InteractivityLevel();
        this.interactivityLevel.setText(interactivityLevel);
    }

    /**
     * @return the semanticDensity
     */
    public SemanticDensity getSemanticDensity() {
        return semanticDensity;
    }

    /**
     * @param semanticDensity the semanticDensity to set
     */
    public void setSemanticDensity(String semanticDensity) {
        this.semanticDensity = new SemanticDensity();
        this.semanticDensity.setText(semanticDensity);
    }

    /**
     * @return the difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(String difficulty) {
        this.difficulty = new Difficulty();
        this.difficulty.setText(difficulty);
    }

    /**
     * @param difficulty the difficulty to set
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = (difficulty);
    }

    /**
     * @return the typicalLearningTime
     */
    public Duration getTypicalLearningTime() {
        return typicalLearningTime;
    }

    /**
     * @param typicalLearningTime the typicalLearningTime to set
     */
    public void setTypicalLearningTime(Duration typicalLearningTime) {
        this.typicalLearningTime = typicalLearningTime;
    }

    /**
     * @return the typicalAgeRange
     */
    public List<TypicalAgeRange> getTypicalAgeRanges() {
        return typicalAgeRanges;
    }

    /**
     * @param typicalAgeRange the typicalAgeRange to set
     */
    public void setTypicalAgeRanges(List<TypicalAgeRange> typicalAgeRange) {
        this.typicalAgeRanges = typicalAgeRange;
    }

    /**
     * Add a typicalAgeRange in the list.
     *
     * @param typicalAgeRange
     */
    public void addTypicalAgeRange(String typicalAgeRange) {
        typicalAgeRanges.add(new TypicalAgeRange(typicalAgeRange));
    }

    /**
     * @return the learningResourceType
     */
    @JsonIgnore
    public List<String> getLearningResourceTypesString() {
        return toStringList(learningResourceTypes);
    }

    /**
     * @param learningResourceType the learningResourceType to set
     */
    public void setLearningResourceTypes(List<LearningResourceType> learningResourceType) {
        this.learningResourceTypes = learningResourceType;
    }

    public List<KnowledgeArea> getKnowledgeAreas() {
        return knowledgeAreas;
    }

    public void setKnowledgeAreas(List<KnowledgeArea> knowledgeArea) {
        this.knowledgeAreas = knowledgeArea;
    }

    public void addKnowledgeArea(String knowledgeArea) {
        KnowledgeArea ka = new KnowledgeArea(knowledgeArea);
        this.knowledgeAreas.add(ka);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.interactivityType);
        hash = 89 * hash + Objects.hashCode(this.interactivityLevel);
        hash = 89 * hash + Objects.hashCode(this.semanticDensity);
        hash = 89 * hash + Objects.hashCode(this.difficulty);
        hash = 89 * hash + Objects.hashCode(this.typicalLearningTime);
        hash = 89 * hash + Objects.hashCode(this.intendedEndUserRoles);
        hash = 89 * hash + Objects.hashCode(this.learningResourceTypes);
        hash = 89 * hash + Objects.hashCode(this.typicalAgeRanges);
        hash = 89 * hash + Objects.hashCode(this.descriptions);
        hash = 89 * hash + Objects.hashCode(this.languages);
        hash = 89 * hash + Objects.hashCode(this.contexts);
        hash = 89 * hash + Objects.hashCode(this.learningContentType);
        hash = 89 * hash + Objects.hashCode(this.interaction);
        hash = 89 * hash + Objects.hashCode(this.didaticStrategy);
        hash = 89 * hash + Objects.hashCode(this.knowledgeAreas);
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
        final Educational other = (Educational) obj;
        if (!Objects.equals(this.interactivityType, other.interactivityType)) {
            return false;
        }
        if (!Objects.equals(this.interactivityLevel, other.interactivityLevel)) {
            return false;
        }
        if (!Objects.equals(this.semanticDensity, other.semanticDensity)) {
            return false;
        }
        if (!Objects.equals(this.difficulty, other.difficulty)) {
            return false;
        }
        if (!Objects.equals(this.typicalLearningTime, other.typicalLearningTime)) {
            return false;
        }
        if (!Objects.equals(this.intendedEndUserRoles, other.intendedEndUserRoles)) {
            return false;
        }
        if (!Objects.equals(this.learningResourceTypes, other.learningResourceTypes)) {
            return false;
        }
        if (!Objects.equals(this.typicalAgeRanges, other.typicalAgeRanges)) {
            return false;
        }
        if (!Objects.equals(this.descriptions, other.descriptions)) {
            return false;
        }
        if (!Objects.equals(this.languages, other.languages)) {
            return false;
        }
        if (!Objects.equals(this.contexts, other.contexts)) {
            return false;
        }
        if (!Objects.equals(this.learningContentType, other.learningContentType)) {
            return false;
        }
        if (!Objects.equals(this.interaction, other.interaction)) {
            return false;
        }
        if (!Objects.equals(this.knowledgeAreas, other.knowledgeAreas)) {
            return false;
        }
        return Objects.equals(this.didaticStrategy, other.didaticStrategy);
    }

}
