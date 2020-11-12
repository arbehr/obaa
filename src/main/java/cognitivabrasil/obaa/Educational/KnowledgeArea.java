package cognitivabrasil.obaa.Educational;

import metadata.TextElement;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

@Root(strict = false)
@Namespace(reference = "http://ltsc.ieee.org/xsd/LOM", prefix = "obaa")
public class KnowledgeArea extends TextElement {

    public KnowledgeArea() {
    }

    public KnowledgeArea(String text) {
        super(text);
    }

}