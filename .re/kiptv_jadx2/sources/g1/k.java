package g1;

public final class k {
    public static final k g = new k(false, 0, true, 1, 1, p074i1.b.j);

    public final boolean f21824a;

    public final int f21825b;

    public final boolean f21826c;

    public final int f21827d;

    public final int f21828e;

    public final p074i1.b f21829f;

    public k(boolean z6, int i3, boolean z9, int i9, int i10, p074i1.b bVar) {
        this.f21824a = z6;
        this.f21825b = i3;
        this.f21826c = z9;
        this.f21827d = i9;
        this.f21828e = i10;
        this.f21829f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f21824a == kVar.f21824a && this.f21825b == kVar.f21825b && this.f21826c == kVar.f21826c && this.f21827d == kVar.f21827d && this.f21828e == kVar.f21828e && kotlin.jvm.internal.m.a(this.f21829f, kVar.f21829f);
    }

    public final int hashCode() {
        return this.f21829f.f22747h.hashCode() + p121o0.p.d(this.f21828e, p121o0.p.d(this.f21827d, p121o0.p.f(p121o0.p.d(this.f21825b, Boolean.hashCode(this.f21824a) * 31, 31), 31, this.f21826c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f21824a);
        sb.append(", capitalization=");
        int i3 = this.f21825b;
        if (i3 == -1) {
            str = "Unspecified";
        } else if (i3 == 0) {
            str = "None";
        } else if (i3 == 1) {
            str = "Characters";
        } else if (i3 == 2) {
            str = "Words";
        } else {
            str = i3 == 3 ? "Sentences" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.f21826c);
        sb.append(", keyboardType=");
        sb.append((Object) l.a(this.f21827d));
        sb.append(", imeAction=");
        sb.append((Object) j.a(this.f21828e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f21829f);
        sb.append(')');
        return sb.toString();
    }
}
