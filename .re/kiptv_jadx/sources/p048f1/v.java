package p048f1;

/* JADX INFO: loaded from: classes.dex */
public final class v extends p048f1.i {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p020c0.C1704s0 f21676l;

    public v(p020c0.C1704s0 c1704s0) {
        this.f21676l = c1704s0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p048f1.v) {
            return this.f21676l.equals(((p048f1.v) obj).f21676l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21676l.hashCode();
    }

    public final java.lang.String toString() {
        return "LoadedFontFamily(typeface=" + this.f21676l + ')';
    }
}
