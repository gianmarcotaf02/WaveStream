package androidx.media3.exoplayer.dash.manifest;

/* JADX INFO: loaded from: classes.dex */
public final class UrlTemplate {
    private static final java.lang.String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final java.lang.String DEFAULT_FORMAT_TAG = "%01d";
    private static final java.lang.String ESCAPED_DOLLAR = "$$";
    private static final java.lang.String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final java.lang.String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final java.lang.String TIME = "Time";
    private static final int TIME_ID = 4;
    private final java.util.List<java.lang.String> identifierFormatTags;
    private final java.util.List<java.lang.Integer> identifiers;
    private final java.util.List<java.lang.String> urlPieces;

    private UrlTemplate(java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.String> list3) {
        this.urlPieces = list;
        this.identifiers = list2;
        this.identifierFormatTags = list3;
    }

    public static androidx.media3.exoplayer.dash.manifest.UrlTemplate compile(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        parseTemplate(str, arrayList, arrayList2, arrayList3);
        return new androidx.media3.exoplayer.dash.manifest.UrlTemplate(arrayList, arrayList2, arrayList3);
    }

    private static void parseTemplate(java.lang.String str, java.util.List<java.lang.String> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.String> list3) {
        java.lang.String strSubstring;
        list.add("");
        int length = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length));
                length = str.length();
            } else if (iIndexOf != length) {
                list.set(list2.size(), list.get(list2.size()) + str.substring(length, iIndexOf));
                length = iIndexOf;
            } else if (str.startsWith(ESCAPED_DOLLAR, length)) {
                list.set(list2.size(), list.get(list2.size()) + "$");
                length += 2;
            } else {
                list3.add("");
                int i3 = length + 1;
                int iIndexOf2 = str.indexOf("$", i3);
                java.lang.String strSubstring2 = str.substring(i3, iIndexOf2);
                if (strSubstring2.equals(REPRESENTATION)) {
                    list2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = DEFAULT_FORMAT_TAG;
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            list2.add(2);
                            break;
                        case "Time":
                            list2.add(4);
                            break;
                        case "Bandwidth":
                            list2.add(3);
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException("Invalid template: ".concat(str));
                    }
                    list3.set(list2.size() - 1, strSubstring);
                }
                list.add("");
                length = iIndexOf2 + 1;
            }
        }
    }

    public java.lang.String buildUri(java.lang.String str, long j, int i3, long j9) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i9 = 0; i9 < this.identifiers.size(); i9++) {
            sb.append(this.urlPieces.get(i9));
            if (this.identifiers.get(i9).intValue() == 1) {
                sb.append(str);
            } else if (this.identifiers.get(i9).intValue() == 2) {
                sb.append(java.lang.String.format(java.util.Locale.US, this.identifierFormatTags.get(i9), java.lang.Long.valueOf(j)));
            } else if (this.identifiers.get(i9).intValue() == 3) {
                sb.append(java.lang.String.format(java.util.Locale.US, this.identifierFormatTags.get(i9), java.lang.Integer.valueOf(i3)));
            } else if (this.identifiers.get(i9).intValue() == 4) {
                sb.append(java.lang.String.format(java.util.Locale.US, this.identifierFormatTags.get(i9), java.lang.Long.valueOf(j9)));
            }
        }
        sb.append(this.urlPieces.get(this.identifiers.size()));
        return sb.toString();
    }
}
