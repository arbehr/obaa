/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cognitivabrasil.obaa;

import cognitivabrasil.obaa.Educational.Educational;
import cognitivabrasil.obaa.General.General;
import cognitivabrasil.obaa.General.Identifier;
import cognitivabrasil.obaa.General.Structure;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Marcos Freitas Nunes <marcos@cognitivabrasil.com.br>
 */
public class JsonTest {

    @Test
    public void testJson() {
        OBAA obaa = new OBAA();
        General general = new General();
        general.addTitle("title text");
        general.addDescription("This is a description");
        Identifier id = new Identifier("URI", "www.cognitivabrasil.com.br");
        general.addIdentifier(id);
        general.setStructure(new Structure());
        obaa.setGeneral(general);
//        obaa.setEducational(new Educational());
        
        JsonGenerator jsonG = new JsonGenerator();
        String json = jsonG.getJson(obaa);
        
        String correctJson = "[{\"text\":\"general\",\"children\":[{\"text\":\"titles\",\"children\":[{\"text\":\"title text\"}]},{\"text\":\"descriptions\",\"children\":[{\"text\":\"This is a description\"}]},{\"text\":\"identifiers\",\"children\":[{\"text\":\"catalog\",\"children\":[{\"text\":\"URI\"}]},{\"text\":\"entry\",\"children\":[{\"text\":\"www.cognitivabrasil.com.br\"}]}]}]}]";
        System.out.println(json);
        assertThat(json, equalTo(correctJson));
    }

}
