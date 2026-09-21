package O7;

import java.nio.charset.Charset;

public final class a {

    public static final a f8023a = new a();

    public static final Charset f8024b;

    public static final Charset f8025c;

    public static volatile Charset f8026d;

    public static volatile Charset f8027e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        kotlin.jvm.internal.m.d(charsetForName, "forName(...)");
        f8024b = charsetForName;
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.m.d(Charset.forName("US-ASCII"), "forName(...)");
        Charset charsetForName2 = Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.m.d(charsetForName2, "forName(...)");
        f8025c = charsetForName2;
    }
}
