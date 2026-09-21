package y7;

import N6.P;
import p062g7.C2163j;

public final class C3162d {

    public final p079i7.e f32034a;

    public final C2163j f32035b;

    public final p079i7.a f32036c;

    public final P f32037d;

    public C3162d(p079i7.e nameResolver, C2163j classProto, p079i7.a aVar, P sourceElement) {
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(classProto, "classProto");
        kotlin.jvm.internal.m.e(sourceElement, "sourceElement");
        this.f32034a = nameResolver;
        this.f32035b = classProto;
        this.f32036c = aVar;
        this.f32037d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3162d)) {
            return false;
        }
        C3162d c3162d = (C3162d) obj;
        return kotlin.jvm.internal.m.a(this.f32034a, c3162d.f32034a) && kotlin.jvm.internal.m.a(this.f32035b, c3162d.f32035b) && kotlin.jvm.internal.m.a(this.f32036c, c3162d.f32036c) && kotlin.jvm.internal.m.a(this.f32037d, c3162d.f32037d);
    }

    public final int hashCode() {
        return this.f32037d.hashCode() + ((this.f32036c.hashCode() + ((this.f32035b.hashCode() + (this.f32034a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f32034a + ", classProto=" + this.f32035b + ", metadataVersion=" + this.f32036c + ", sourceElement=" + this.f32037d + ')';
    }
}
