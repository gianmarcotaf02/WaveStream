package J;

public final class W {

    public static final W f5715c = new W(0, 127);

    public final int f5716a;

    public final int f5717b;

    public W(int i3, int i9) {
        i3 = (i9 & 4) != 0 ? 0 : i3;
        int i10 = (i9 & 8) != 0 ? -1 : 7;
        this.f5716a = i3;
        this.f5717b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w6 = (W) obj;
        w6.getClass();
        return this.f5716a == w6.f5716a && this.f5717b == w6.f5717b;
    }

    public final int hashCode() {
        return p121o0.p.d(this.f5717b, p121o0.p.d(this.f5716a, Integer.hashCode(-1) * 961, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) "Unspecified") + ", autoCorrectEnabled=null, keyboardType=" + ((Object) g1.l.a(this.f5716a)) + ", imeAction=" + ((Object) g1.j.a(this.f5717b)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
