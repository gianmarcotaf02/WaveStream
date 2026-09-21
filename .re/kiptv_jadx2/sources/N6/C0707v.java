package N6;

public final class C0707v extends V {

    public final p101l7.e f7422a;

    public final F7.e f7423b;

    public C0707v(p101l7.e eVar, F7.e underlyingType) {
        kotlin.jvm.internal.m.e(underlyingType, "underlyingType");
        this.f7422a = eVar;
        this.f7423b = underlyingType;
    }

    @Override
    public final boolean a(p101l7.e eVar) {
        return this.f7422a.equals(eVar);
    }

    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f7422a + ", underlyingType=" + this.f7423b + ')';
    }
}
