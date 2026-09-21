package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements p080i8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R0.C0811a f23283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f23284b;

    public t(R0.C0811a c0811a, java.lang.String whatThisExpects) {
        kotlin.jvm.internal.m.e(whatThisExpects, "whatThisExpects");
        this.f23283a = c0811a;
        this.f23284b = whatThisExpects;
    }

    @Override // p080i8.o
    public final java.lang.Object a(p080i8.c cVar, java.lang.String str, int i3) {
        if (i3 >= str.length()) {
            return java.lang.Integer.valueOf(i3);
        }
        char cCharAt = str.charAt(i3);
        R0.C0811a c0811a = this.f23283a;
        if (cCharAt == '-') {
            c0811a.invoke(cVar, java.lang.Boolean.TRUE);
            return java.lang.Integer.valueOf(i3 + 1);
        }
        if (cCharAt != '+') {
            return new p080i8.i(i3, new p080i8.s(this, cCharAt));
        }
        c0811a.invoke(cVar, java.lang.Boolean.FALSE);
        return java.lang.Integer.valueOf(i3 + 1);
    }

    public final java.lang.String toString() {
        return this.f23284b;
    }
}
