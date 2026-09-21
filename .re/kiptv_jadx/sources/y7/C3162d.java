package y7;

/* JADX INFO: renamed from: y7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3162d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p079i7.e f32034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p062g7.C2163j f32035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p079i7.a f32036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N6.P f32037d;

    public C3162d(p079i7.e nameResolver, p062g7.C2163j classProto, p079i7.a aVar, N6.P sourceElement) {
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(classProto, "classProto");
        kotlin.jvm.internal.m.e(sourceElement, "sourceElement");
        this.f32034a = nameResolver;
        this.f32035b = classProto;
        this.f32036c = aVar;
        this.f32037d = sourceElement;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7.C3162d)) {
            return false;
        }
        y7.C3162d c3162d = (y7.C3162d) obj;
        return kotlin.jvm.internal.m.a(this.f32034a, c3162d.f32034a) && kotlin.jvm.internal.m.a(this.f32035b, c3162d.f32035b) && kotlin.jvm.internal.m.a(this.f32036c, c3162d.f32036c) && kotlin.jvm.internal.m.a(this.f32037d, c3162d.f32037d);
    }

    public final int hashCode() {
        return this.f32037d.hashCode() + ((this.f32036c.hashCode() + ((this.f32035b.hashCode() + (this.f32034a.hashCode() * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "ClassData(nameResolver=" + this.f32034a + ", classProto=" + this.f32035b + ", metadataVersion=" + this.f32036c + ", sourceElement=" + this.f32037d + ')';
    }
}
