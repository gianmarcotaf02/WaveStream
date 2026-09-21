package p160s6;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.io.File f27359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f27360b;

    public c(java.io.File file, java.util.List list) {
        this.f27359a = file;
        this.f27360b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p160s6.c)) {
            return false;
        }
        p160s6.c cVar = (p160s6.c) obj;
        return this.f27359a.equals(cVar.f27359a) && this.f27360b.equals(cVar.f27360b);
    }

    public final int hashCode() {
        return this.f27360b.hashCode() + (this.f27359a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FilePathComponents(root=");
        sb.append(this.f27359a);
        sb.append(", segments=");
        return B2.a.n(sb, this.f27360b, ')');
    }
}
