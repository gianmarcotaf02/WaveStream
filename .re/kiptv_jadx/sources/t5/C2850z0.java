package t5;

/* JADX INFO: renamed from: t5.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2850z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f28518b;

    public C2850z0(java.lang.String id, java.lang.String title) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(title, "title");
        this.f28517a = id;
        this.f28518b = title;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.C2850z0)) {
            return false;
        }
        t5.C2850z0 c2850z0 = (t5.C2850z0) obj;
        return kotlin.jvm.internal.m.a(this.f28517a, c2850z0.f28517a) && kotlin.jvm.internal.m.a(this.f28518b, c2850z0.f28518b);
    }

    public final int hashCode() {
        return this.f28518b.hashCode() + (this.f28517a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvMenuOption(id=");
        sb.append(this.f28517a);
        sb.append(", title=");
        return Y6.f.m(sb, this.f28518b, ")");
    }
}
