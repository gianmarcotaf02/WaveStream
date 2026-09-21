package p162s8;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends kotlinx.serialization.json.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f27420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.SerialDescriptor f27421i;
    public final java.lang.String j;

    public r(java.io.Serializable body, boolean z6, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.m.e(body, "body");
        this.f27420h = z6;
        this.f27421i = serialDescriptor;
        this.j = body.toString();
        if (serialDescriptor != null && !serialDescriptor.isInline()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // kotlinx.serialization.json.d
    public final java.lang.String d() {
        return this.j;
    }

    @Override // kotlinx.serialization.json.d
    public final boolean e() {
        return this.f27420h;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p162s8.r.class != obj.getClass()) {
            return false;
        }
        p162s8.r rVar = (p162s8.r) obj;
        return this.f27420h == rVar.f27420h && kotlin.jvm.internal.m.a(this.j, rVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + (java.lang.Boolean.hashCode(this.f27420h) * 31);
    }

    @Override // kotlinx.serialization.json.d
    public final java.lang.String toString() {
        boolean z6 = this.f27420h;
        java.lang.String str = this.j;
        if (!z6) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        t8.M.a(str, sb);
        return sb.toString();
    }
}
