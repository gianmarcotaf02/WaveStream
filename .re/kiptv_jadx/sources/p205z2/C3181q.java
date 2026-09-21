package p205z2;

/* JADX INFO: renamed from: z2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3181q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I.e f32301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I.e f32302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I.e f32303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I.e f32304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I.e f32305e;

    public C3181q() {
        I.e eVar = p205z2.AbstractC3180p.f32296a;
        I.e eVar2 = p205z2.AbstractC3180p.f32297b;
        I.e eVar3 = p205z2.AbstractC3180p.f32298c;
        I.e eVar4 = p205z2.AbstractC3180p.f32299d;
        I.e eVar5 = p205z2.AbstractC3180p.f32300e;
        this.f32301a = eVar;
        this.f32302b = eVar2;
        this.f32303c = eVar3;
        this.f32304d = eVar4;
        this.f32305e = eVar5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p205z2.C3181q)) {
            return false;
        }
        p205z2.C3181q c3181q = (p205z2.C3181q) obj;
        return kotlin.jvm.internal.m.a(this.f32301a, c3181q.f32301a) && kotlin.jvm.internal.m.a(this.f32302b, c3181q.f32302b) && kotlin.jvm.internal.m.a(this.f32303c, c3181q.f32303c) && kotlin.jvm.internal.m.a(this.f32304d, c3181q.f32304d) && kotlin.jvm.internal.m.a(this.f32305e, c3181q.f32305e);
    }

    public final int hashCode() {
        return this.f32305e.hashCode() + ((this.f32304d.hashCode() + ((this.f32303c.hashCode() + ((this.f32302b.hashCode() + (this.f32301a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Shapes(extraSmall=" + this.f32301a + ", small=" + this.f32302b + ", medium=" + this.f32303c + ", large=" + this.f32304d + ", extraLarge=" + this.f32305e + ')';
    }
}
