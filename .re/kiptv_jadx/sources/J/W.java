package J;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J.W f5715c = new J.W(0, 127);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5717b;

    public W(int i3, int i9) {
        i3 = (i9 & 4) != 0 ? 0 : i3;
        int i10 = (i9 & 8) != 0 ? -1 : 7;
        this.f5716a = i3;
        this.f5717b = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J.W)) {
            return false;
        }
        J.W w6 = (J.W) obj;
        w6.getClass();
        return this.f5716a == w6.f5716a && this.f5717b == w6.f5717b;
    }

    public final int hashCode() {
        return p121o0.p.d(this.f5717b, p121o0.p.d(this.f5716a, java.lang.Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final java.lang.String toString() {
        return "KeyboardOptions(capitalization=" + ((java.lang.Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((java.lang.Object) g1.l.a(this.f5716a)) + ", imeAction=" + ((java.lang.Object) g1.j.a(this.f5717b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
