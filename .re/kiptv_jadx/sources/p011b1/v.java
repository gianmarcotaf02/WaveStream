package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17857b;

    public v() {
        this.f17856a = false;
        this.f17857b = 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.v)) {
            return false;
        }
        p011b1.v vVar = (p011b1.v) obj;
        if (this.f17856a != vVar.f17856a) {
            return false;
        }
        return this.f17857b == vVar.f17857b;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f17857b) + (java.lang.Boolean.hashCode(this.f17856a) * 31);
    }

    public final java.lang.String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f17856a + ", emojiSupportMatch=" + ((java.lang.Object) p011b1.C1653j.a(this.f17857b)) + ')';
    }

    public v(int i3, boolean z6) {
        this.f17856a = z6;
        this.f17857b = i3;
    }
}
