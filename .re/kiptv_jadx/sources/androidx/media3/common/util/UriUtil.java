package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class UriUtil {
    private static final int FRAGMENT = 3;
    private static final int INDEX_COUNT = 4;
    private static final int PATH = 1;
    private static final int QUERY = 2;
    private static final int SCHEME_COLON = 0;

    private UriUtil() {
    }

    public static java.lang.String getRelativePath(android.net.Uri uri, android.net.Uri uri2) {
        if (uri.isOpaque() || uri2.isOpaque()) {
            return uri2.toString();
        }
        java.lang.String scheme = uri.getScheme();
        java.lang.String scheme2 = uri2.getScheme();
        if (scheme != null ? !(scheme2 == null || !com.google.crypto.tink.shaded.protobuf.AbstractC1909d.P(scheme, scheme2)) : scheme2 == null) {
            if (java.util.Objects.equals(uri.getAuthority(), uri2.getAuthority())) {
                java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
                java.util.List<java.lang.String> pathSegments2 = uri2.getPathSegments();
                int iMin = java.lang.Math.min(pathSegments.size(), pathSegments2.size());
                int i3 = 0;
                for (int i9 = 0; i9 < iMin && pathSegments.get(i9).equals(pathSegments2.get(i9)); i9++) {
                    i3++;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (int i10 = i3; i10 < pathSegments.size(); i10++) {
                    sb.append("../");
                }
                while (i3 < pathSegments2.size()) {
                    sb.append(pathSegments2.get(i3));
                    if (i3 < pathSegments2.size() - 1) {
                        sb.append("/");
                    }
                    i3++;
                }
                return sb.toString();
            }
        }
        return uri2.toString();
    }

    private static int[] getUriIndices(java.lang.String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (android.text.TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i3 = iIndexOf5 + 2;
        if (i3 < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i3) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    public static boolean isAbsolute(java.lang.String str) {
        return (str == null || getUriIndices(str)[0] == -1) ? false : true;
    }

    private static java.lang.String removeDotSegments(java.lang.StringBuilder sb, int i3, int i9) {
        int i10;
        int iLastIndexOf;
        if (i3 >= i9) {
            return sb.toString();
        }
        if (sb.charAt(i3) == '/') {
            i3++;
        }
        int i11 = i3;
        int i12 = i11;
        while (i11 <= i9) {
            if (i11 == i9) {
                i10 = i11;
            } else if (sb.charAt(i11) == '/') {
                i10 = i11 + 1;
            } else {
                i11++;
            }
            int i13 = i12 + 1;
            if (i11 == i13 && sb.charAt(i12) == '.') {
                sb.delete(i12, i10);
                i9 -= i10 - i12;
            } else {
                if (i11 == i12 + 2 && sb.charAt(i12) == '.' && sb.charAt(i13) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i12 - 2) + 1;
                    int i14 = iLastIndexOf > i3 ? iLastIndexOf : i3;
                    sb.delete(i14, i10);
                    i9 -= i10 - i14;
                } else {
                    iLastIndexOf = i11 + 1;
                }
                i12 = iLastIndexOf;
            }
            i11 = i12;
        }
        return sb.toString();
    }

    public static android.net.Uri removeQueryParameter(android.net.Uri uri, java.lang.String str) {
        android.net.Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (java.lang.String str2 : uri.getQueryParameterNames()) {
            if (!str2.equals(str)) {
                java.util.Iterator<java.lang.String> it = uri.getQueryParameters(str2).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str2, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static java.lang.String resolve(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] uriIndices = getUriIndices(str2);
        if (uriIndices[0] != -1) {
            sb.append(str2);
            removeDotSegments(sb, uriIndices[1], uriIndices[2]);
            return sb.toString();
        }
        int[] uriIndices2 = getUriIndices(str);
        if (uriIndices[3] == 0) {
            sb.append((java.lang.CharSequence) str, 0, uriIndices2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (uriIndices[2] == 0) {
            sb.append((java.lang.CharSequence) str, 0, uriIndices2[2]);
            sb.append(str2);
            return sb.toString();
        }
        int i3 = uriIndices[1];
        if (i3 != 0) {
            int i9 = uriIndices2[0] + 1;
            sb.append((java.lang.CharSequence) str, 0, i9);
            sb.append(str2);
            return removeDotSegments(sb, uriIndices[1] + i9, i9 + uriIndices[2]);
        }
        if (str2.charAt(i3) == '/') {
            sb.append((java.lang.CharSequence) str, 0, uriIndices2[1]);
            sb.append(str2);
            int i10 = uriIndices2[1];
            return removeDotSegments(sb, i10, uriIndices[2] + i10);
        }
        int i11 = uriIndices2[0] + 2;
        int i12 = uriIndices2[1];
        if (i11 >= i12 || i12 != uriIndices2[2]) {
            int iLastIndexOf = str.lastIndexOf(47, uriIndices2[2] - 1);
            int i13 = iLastIndexOf == -1 ? uriIndices2[1] : iLastIndexOf + 1;
            sb.append((java.lang.CharSequence) str, 0, i13);
            sb.append(str2);
            return removeDotSegments(sb, uriIndices2[1], i13 + uriIndices[2]);
        }
        sb.append((java.lang.CharSequence) str, 0, i12);
        sb.append('/');
        sb.append(str2);
        int i14 = uriIndices2[1];
        return removeDotSegments(sb, i14, uriIndices[2] + i14 + 1);
    }

    public static android.net.Uri resolveToUri(java.lang.String str, java.lang.String str2) {
        return android.net.Uri.parse(resolve(str, str2));
    }
}
