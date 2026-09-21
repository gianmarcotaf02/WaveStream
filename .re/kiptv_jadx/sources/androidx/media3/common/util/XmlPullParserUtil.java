package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class XmlPullParserUtil {
    private XmlPullParserUtil() {
    }

    public static java.lang.String getAttributeValue(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if (xmlPullParser.getAttributeName(i3).equals(str)) {
                return xmlPullParser.getAttributeValue(i3);
            }
        }
        return null;
    }

    public static java.lang.String getAttributeValueIgnorePrefix(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i3 = 0; i3 < attributeCount; i3++) {
            if (stripPrefix(xmlPullParser.getAttributeName(i3)).equals(str)) {
                return xmlPullParser.getAttributeValue(i3);
            }
        }
        return null;
    }

    public static boolean isEndTag(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return isEndTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTag(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return isStartTag(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean isStartTagIgnorePrefix(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return isStartTag(xmlPullParser) && stripPrefix(xmlPullParser.getName()).equals(str);
    }

    private static java.lang.String stripPrefix(java.lang.String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    public static boolean isEndTag(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean isStartTag(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }
}
