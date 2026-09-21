package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends org.xml.sax.ext.DefaultHandler2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z2.M0 f12687a;

    public I0(Z2.M0 m8) {
        this.f12687a = m8;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i3, int i9) {
        this.f12687a.G(new java.lang.String(cArr, i3, i9));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        this.f12687a.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f12687a.c(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(java.lang.String str, java.lang.String str2) {
        Z2.M m8 = new Z2.M(str2);
        this.f12687a.getClass();
        Z2.M0.y(m8);
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.f12687a.E();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) throws Z2.D0 {
        this.f12687a.F(str, str2, str3, attributes);
    }
}
