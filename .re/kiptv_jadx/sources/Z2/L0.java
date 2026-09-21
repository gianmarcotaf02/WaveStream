package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements org.xml.sax.Attributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public org.xmlpull.v1.XmlPullParser f12781a;

    @Override // org.xml.sax.Attributes
    public final int getIndex(java.lang.String str, java.lang.String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.f12781a.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getLocalName(int i3) {
        return this.f12781a.getAttributeName(i3);
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getQName(int i3) {
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f12781a;
        java.lang.String attributeName = xmlPullParser.getAttributeName(i3);
        if (xmlPullParser.getAttributePrefix(i3) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i3) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getType(int i3) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getURI(int i3) {
        return this.f12781a.getAttributeNamespace(i3);
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getValue(int i3) {
        return this.f12781a.getAttributeValue(i3);
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(java.lang.String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getType(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getValue(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getType(java.lang.String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final java.lang.String getValue(java.lang.String str) {
        return null;
    }
}
