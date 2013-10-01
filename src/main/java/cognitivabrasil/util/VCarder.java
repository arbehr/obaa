package cognitivabrasil.util;

import net.sourceforge.cardme.engine.VCardEngine;
import net.sourceforge.cardme.io.BinaryFoldingScheme;
import net.sourceforge.cardme.io.CompatibilityMode;
import net.sourceforge.cardme.io.FoldingScheme;
import net.sourceforge.cardme.io.VCardWriter;
import net.sourceforge.cardme.util.VCardUtils;
import net.sourceforge.cardme.vcard.VCard;
import net.sourceforge.cardme.vcard.VCardImpl;
import net.sourceforge.cardme.vcard.VCardVersion;
import net.sourceforge.cardme.vcard.features.FormattedNameFeature;
import net.sourceforge.cardme.vcard.types.FormattedNameType;
import net.sourceforge.cardme.vcard.types.NameType;

/**
 *
 * @author cei
 */
public class VCarder {

    private VCardEngine vcardEngine;
    private VCard vcard;
    private VCardWriter writer;

    public VCarder() {
        vcardEngine = new VCardEngine();
        vcard = new VCardImpl();
        writer = new VCardWriter();
    }

    public void setCompatibilityMode(CompatibilityMode compatMode) {
        vcardEngine.setCompatibilityMode(compatMode);
    }

    public void setName(String familyName, String givenName, String fullName) {
        
        setCompatibilityMode(CompatibilityMode.RFC2426);   
        
        writer.setOutputVersion(VCardVersion.V3_0);
        writer.setCompatibilityMode(CompatibilityMode.RFC2426);
        writer.setFoldingScheme(FoldingScheme.MIME_DIR);
        writer.setBinaryfoldingScheme(BinaryFoldingScheme.MIME_DIR);
        writer.setEOL(VCardUtils.LF);        
         
        NameType name = new NameType(fullName);        
        vcard.setName(name);
        
        FormattedNameFeature nomeFormatado = new FormattedNameType(fullName);
        vcard.setFormattedName(nomeFormatado);
        writer.setVCard(vcard);
        
    }
    
    public String getVCard(){        
        return (writer.buildVCardString());
    }
    
}
