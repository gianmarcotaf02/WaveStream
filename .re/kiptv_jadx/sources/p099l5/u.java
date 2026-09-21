package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p099l5.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String details) {
        super("Video stalled: ".concat(details));
        kotlin.jvm.internal.m.e(details, "details");
        this.f24795i = details;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p099l5.u) && kotlin.jvm.internal.m.a(this.f24795i, ((p099l5.u) obj).f24795i);
    }

    public final int hashCode() {
        return this.f24795i.hashCode();
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("VideoStalled(details="), this.f24795i, ")");
    }
}
