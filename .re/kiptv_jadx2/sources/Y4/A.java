package Y4;

public final class A {
    public static String a(String str, String str2, String imageBaseUrl) {
        kotlin.jvm.internal.m.e(imageBaseUrl, "imageBaseUrl");
        if (str == null) {
            return null;
        }
        if (O7.x.x0(str, "http", false)) {
            return str;
        }
        return imageBaseUrl + "/" + str2 + str;
    }

    public static String b(String str, String str2, String imageBaseUrl) {
        kotlin.jvm.internal.m.e(imageBaseUrl, "imageBaseUrl");
        if (str == null) {
            return null;
        }
        if (O7.x.x0(str, "http", false)) {
            return str;
        }
        return imageBaseUrl + "/" + str2 + str;
    }

    public static String c(String str, String str2, String imageBaseUrl) {
        kotlin.jvm.internal.m.e(imageBaseUrl, "imageBaseUrl");
        if (str == null) {
            return null;
        }
        return imageBaseUrl + "/" + str2 + str;
    }
}
