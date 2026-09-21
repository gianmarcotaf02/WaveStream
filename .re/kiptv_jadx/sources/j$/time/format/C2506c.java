package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2506c implements j$.time.format.InterfaceC2508e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f23690a;

    public C2506c(char c9) {
        this.f23690a = c9;
    }

    @Override // j$.time.format.InterfaceC2508e
    public final boolean p(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        sb.append(this.f23690a);
        return true;
    }

    @Override // j$.time.format.InterfaceC2508e
    public final int r(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3) {
        if (i3 == charSequence.length()) {
            return ~i3;
        }
        char cCharAt = charSequence.charAt(i3);
        char c9 = this.f23690a;
        return (cCharAt == c9 || (!vVar.f23738b && (java.lang.Character.toUpperCase(cCharAt) == java.lang.Character.toUpperCase(c9) || java.lang.Character.toLowerCase(cCharAt) == java.lang.Character.toLowerCase(c9)))) ? i3 + 1 : ~i3;
    }

    public final java.lang.String toString() {
        char c9 = this.f23690a;
        if (c9 == '\'') {
            return "''";
        }
        return "'" + c9 + "'";
    }
}
