package y7;

public final class g {

    public final p101l7.b f32040a;

    public final C3162d f32041b;

    public g(p101l7.b classId, C3162d c3162d) {
        kotlin.jvm.internal.m.e(classId, "classId");
        this.f32040a = classId;
        this.f32041b = c3162d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return kotlin.jvm.internal.m.a(this.f32040a, ((g) obj).f32040a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32040a.hashCode();
    }
}
