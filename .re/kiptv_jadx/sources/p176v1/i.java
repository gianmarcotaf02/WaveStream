package p176v1;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.res.Resources f29134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.res.Resources.Theme f29135b;

    public i(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        this.f29134a = resources;
        this.f29135b = theme;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p176v1.i.class == obj.getClass()) {
            p176v1.i iVar = (p176v1.i) obj;
            if (this.f29134a.equals(iVar.f29134a) && java.util.Objects.equals(this.f29135b, iVar.f29135b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f29134a, this.f29135b);
    }
}
