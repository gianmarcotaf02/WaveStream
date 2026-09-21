package p118n7;

import O7.x;
import kotlin.jvm.internal.m;

public final class q extends s {
    public q() {
        super("HTML", 1);
    }

    @Override
    public final String a(String string) {
        m.e(string, "string");
        return x.w0(x.w0(string, "<", "&lt;"), ">", "&gt;");
    }
}
