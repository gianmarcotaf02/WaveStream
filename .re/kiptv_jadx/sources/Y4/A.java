package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class A {
    public static java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String imageBaseUrl) {
        kotlin.jvm.internal.m.e(imageBaseUrl, "imageBaseUrl");
        if (str == null) {
            return null;
        }
        if (O7.x.x0(str, "http", false)) {
            return str;
        }
        return imageBaseUrl + "/" + str2 + str;
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2, java.lang.String imageBaseUrl) {
        kotlin.jvm.internal.m.e(imageBaseUrl, "imageBaseUrl");
        if (str == null) {
            return null;
        }
        if (O7.x.x0(str, "http", false)) {
            return str;
        }
        return imageBaseUrl + "/" + str2 + str;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2, java.lang.String imageBaseUrl) {
        kotlin.jvm.internal.m.e(imageBaseUrl, "imageBaseUrl");
        if (str == null) {
            return null;
        }
        return imageBaseUrl + "/" + str2 + str;
    }
}
