package k7;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends com.google.android.gms.internal.play_billing.V0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f24500f;
    public final java.lang.String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String name, java.lang.String desc) {
        super(9);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(desc, "desc");
        this.f24500f = name;
        this.g = desc;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7.d)) {
            return false;
        }
        k7.d dVar = (k7.d) obj;
        return kotlin.jvm.internal.m.a(this.f24500f, dVar.f24500f) && kotlin.jvm.internal.m.a(this.g, dVar.g);
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final java.lang.String g() {
        return this.f24500f + ':' + this.g;
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final int hashCode() {
        return this.g.hashCode() + (this.f24500f.hashCode() * 31);
    }
}
