package p118n7;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends p118n7.s {
    public q() {
        super("HTML", 1);
    }

    @Override // p118n7.s
    public final java.lang.String a(java.lang.String string) {
        kotlin.jvm.internal.m.e(string, "string");
        return O7.x.w0(O7.x.w0(string, "<", "&lt;"), ">", "&gt;");
    }
}
