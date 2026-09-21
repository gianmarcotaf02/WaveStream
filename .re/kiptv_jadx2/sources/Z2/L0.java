package Z2;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

public final class L0 implements Attributes {

    public XmlPullParser f12781a;

    @Override
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override
    public final int getLength() {
        return this.f12781a.getAttributeCount();
    }

    @Override
    public final String getLocalName(int i3) {
        return this.f12781a.getAttributeName(i3);
    }

    @Override
    public final String getQName(int i3) {
        XmlPullParser xmlPullParser = this.f12781a;
        String attributeName = xmlPullParser.getAttributeName(i3);
        if (xmlPullParser.getAttributePrefix(i3) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i3) + ':' + attributeName;
    }

    @Override
    public final String getType(int i3) {
        return null;
    }

    @Override
    public final String getURI(int i3) {
        return this.f12781a.getAttributeNamespace(i3);
    }

    @Override
    public final String getValue(int i3) {
        return this.f12781a.getAttributeValue(i3);
    }

    @Override
    public final int getIndex(String str) {
        return -1;
    }

    @Override
    public final String getType(String str, String str2) {
        return null;
    }

    @Override
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override
    public final String getType(String str) {
        return null;
    }

    @Override
    public final String getValue(String str) {
        return null;
    }
}
