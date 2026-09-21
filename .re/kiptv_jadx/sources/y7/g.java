package y7;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.b f32040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y7.C3162d f32041b;

    public g(p101l7.b classId, y7.C3162d c3162d) {
        kotlin.jvm.internal.m.e(classId, "classId");
        this.f32040a = classId;
        this.f32041b = c3162d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof y7.g) {
            return kotlin.jvm.internal.m.a(this.f32040a, ((y7.g) obj).f32040a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32040a.hashCode();
    }
}
