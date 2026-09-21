package J4;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f6026a = java.nio.charset.Charset.defaultCharset();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.nio.charset.Charset f6027b;

    static {
        java.nio.charset.Charset charsetForName;
        java.nio.charset.Charset charsetForName2 = null;
        try {
            charsetForName = java.nio.charset.Charset.forName("SJIS");
        } catch (java.nio.charset.UnsupportedCharsetException unused) {
            charsetForName = null;
        }
        f6027b = charsetForName;
        try {
            java.nio.charset.Charset.forName("GB2312");
        } catch (java.nio.charset.UnsupportedCharsetException unused2) {
        }
        try {
            charsetForName2 = java.nio.charset.Charset.forName("EUC_JP");
        } catch (java.nio.charset.UnsupportedCharsetException unused3) {
        }
        java.nio.charset.Charset charset = f6027b;
        if ((charset == null || !charset.equals(f6026a)) && charsetForName2 != null) {
            charsetForName2.equals(f6026a);
        }
    }
}
