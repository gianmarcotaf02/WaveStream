package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements p080i8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f23280a;

    public r(java.lang.String string) {
        kotlin.jvm.internal.m.e(string, "string");
        this.f23280a = string;
        if (string.length() <= 0) {
            throw new java.lang.IllegalArgumentException("Empty string is not allowed");
        }
        if (p055f8.b.a(string.charAt(0))) {
            throw new java.lang.IllegalArgumentException(Y6.f.h("String '", string, "' starts with a digit").toString());
        }
        if (p055f8.b.a(string.charAt(string.length() - 1))) {
            throw new java.lang.IllegalArgumentException(Y6.f.h("String '", string, "' ends with a digit").toString());
        }
    }

    @Override // p080i8.o
    public final java.lang.Object a(p080i8.c cVar, java.lang.String str, int i3) {
        java.lang.String str2 = this.f23280a;
        if (str2.length() + i3 > str.length()) {
            return new p080i8.i(i3, new A8.m(20, this));
        }
        int length = str2.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i3 + i9) != str2.charAt(i9)) {
                return new p080i8.i(i3, new p080i8.q(this, str, i3, i9));
            }
        }
        return java.lang.Integer.valueOf(str2.length() + i3);
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("'"), this.f23280a, '\'');
    }
}
