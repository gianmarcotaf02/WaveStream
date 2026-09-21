package J5;

public final class C0616n2 {

    public final String f6517a;

    public final String f6518b;

    public final String f6519c;

    public C0616n2(String fontSize, String color, String background) {
        kotlin.jvm.internal.m.e(fontSize, "fontSize");
        kotlin.jvm.internal.m.e(color, "color");
        kotlin.jvm.internal.m.e(background, "background");
        this.f6517a = fontSize;
        this.f6518b = color;
        this.f6519c = background;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0616n2)) {
            return false;
        }
        C0616n2 c0616n2 = (C0616n2) obj;
        return kotlin.jvm.internal.m.a(this.f6517a, c0616n2.f6517a) && kotlin.jvm.internal.m.a(this.f6518b, c0616n2.f6518b) && kotlin.jvm.internal.m.a(this.f6519c, c0616n2.f6519c);
    }

    public final int hashCode() {
        return this.f6519c.hashCode() + B2.a.a(this.f6517a.hashCode() * 31, 31, this.f6518b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvSubtitleStyleUiState(fontSize=");
        sb.append(this.f6517a);
        sb.append(", color=");
        sb.append(this.f6518b);
        sb.append(", background=");
        return Y6.f.m(sb, this.f6519c, ")");
    }
}
