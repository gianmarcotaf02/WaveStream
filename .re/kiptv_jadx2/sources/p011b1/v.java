package p011b1;

public final class v {

    public final boolean f17856a;

    public final int f17857b;

    public v() {
        this.f17856a = false;
        this.f17857b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f17856a != vVar.f17856a) {
            return false;
        }
        return this.f17857b == vVar.f17857b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17857b) + (Boolean.hashCode(this.f17856a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f17856a + ", emojiSupportMatch=" + ((Object) C1653j.a(this.f17857b)) + ')';
    }

    public v(int i3, boolean z6) {
        this.f17856a = z6;
        this.f17857b = i3;
    }
}
