package p068h4;

/* JADX INFO: loaded from: classes.dex */
public final class m implements p068h4.l, java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f22498h;

    public m(java.util.List list) {
        this.f22498h = list;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        int i3 = 0;
        while (true) {
            java.util.List list = this.f22498h;
            if (i3 >= list.size()) {
                return true;
            }
            if (!((p068h4.l) list.get(i3)).apply(obj)) {
                return false;
            }
            i3++;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p068h4.m) {
            return this.f22498h.equals(((p068h4.m) obj).f22498h);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22498h.hashCode() + 306654252;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.and(");
        boolean z6 = true;
        for (java.lang.Object obj : this.f22498h) {
            if (!z6) {
                sb.append(',');
            }
            sb.append(obj);
            z6 = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
