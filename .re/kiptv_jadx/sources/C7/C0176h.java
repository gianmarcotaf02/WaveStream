package C7;

/* JADX INFO: renamed from: C7.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0176h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O6.h f1588a;

    public C0176h(O6.h annotations) {
        kotlin.jvm.internal.m.e(annotations, "annotations");
        this.f1588a = annotations;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof C7.C0176h) {
            return kotlin.jvm.internal.m.a(((C7.C0176h) obj).f1588a, this.f1588a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1588a.hashCode();
    }
}
