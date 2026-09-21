package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O7.a f8023a = new O7.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.nio.charset.Charset f8024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.nio.charset.Charset f8025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile java.nio.charset.Charset f8026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile java.nio.charset.Charset f8027e;

    static {
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName("UTF-8");
        kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
        f8024b = charsetForName;
        kotlin.jvm.internal.m.d(java.nio.charset.Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.m.d(java.nio.charset.Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.m.d(java.nio.charset.Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.m.d(java.nio.charset.Charset.forName("US-ASCII"), "forName(...)");
        java.nio.charset.Charset charsetForName2 = java.nio.charset.Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.m.d(charsetForName2, "forName(...)");
        f8025c = charsetForName2;
    }
}
