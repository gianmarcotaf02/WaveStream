package N6;

/* JADX INFO: renamed from: N6.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0707v extends N6.V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101l7.e f7422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F7.e f7423b;

    public C0707v(p101l7.e eVar, F7.e underlyingType) {
        kotlin.jvm.internal.m.e(underlyingType, "underlyingType");
        this.f7422a = eVar;
        this.f7423b = underlyingType;
    }

    @Override // N6.V
    public final boolean a(p101l7.e eVar) {
        return this.f7422a.equals(eVar);
    }

    public final java.lang.String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f7422a + ", underlyingType=" + this.f7423b + ')';
    }
}
