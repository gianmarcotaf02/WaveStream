package p048f1;

import p020c0.C1704s0;

public final class v extends i {

    public final C1704s0 f21676l;

    public v(C1704s0 c1704s0) {
        this.f21676l = c1704s0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            return this.f21676l.equals(((v) obj).f21676l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21676l.hashCode();
    }

    public final String toString() {
        return "LoadedFontFamily(typeface=" + this.f21676l + ')';
    }
}
