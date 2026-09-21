package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements kotlinx.serialization.descriptors.SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f26963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p135p8.f f26964b;

    public g0(java.lang.String str, p135p8.f kind) {
        kotlin.jvm.internal.m.e(kind, "kind");
        this.f26963a = str;
        this.f26964b = kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        return this.f26963a;
    }

    public final void b() {
        throw new java.lang.IllegalStateException(Y6.f.m(new java.lang.StringBuilder("Primitive descriptor "), this.f26963a, " does not have elements"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.google.android.gms.internal.play_billing.V0 c() {
        return this.f26964b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        b();
        throw null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p153r8.g0)) {
            return false;
        }
        p153r8.g0 g0Var = (p153r8.g0) obj;
        if (kotlin.jvm.internal.m.a(this.f26963a, g0Var.f26963a)) {
            if (kotlin.jvm.internal.m.a(this.f26964b, g0Var.f26964b)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String g(int i3) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List h(int i3) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.f26964b.hashCode() * 31) + this.f26963a.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor i(int i3) {
        b();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        b();
        throw null;
    }

    public final java.lang.String toString() {
        return Y6.f.l(new java.lang.StringBuilder("PrimitiveDescriptor("), this.f26963a, ')');
    }
}
