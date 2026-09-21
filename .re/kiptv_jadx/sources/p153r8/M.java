package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class M implements kotlinx.serialization.descriptors.SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.SerialDescriptor f26918a;

    public M(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        this.f26918a = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.google.android.gms.internal.play_billing.V0 c() {
        return p135p8.j.g;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        java.lang.Integer numZ0 = O7.x.z0(name);
        if (numZ0 != null) {
            return numZ0.intValue();
        }
        throw new java.lang.IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p153r8.M)) {
            return false;
        }
        p153r8.M m8 = (p153r8.M) obj;
        return kotlin.jvm.internal.m.a(this.f26918a, m8.f26918a) && kotlin.jvm.internal.m.a(a(), m8.a());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String g(int i3) {
        return java.lang.String.valueOf(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List h(int i3) {
        if (i3 >= 0) {
            return p078i6.w.f23205h;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Illegal index ", ", ");
        sbT.append(a());
        sbT.append(" expects only non-negative indices");
        throw new java.lang.IllegalArgumentException(sbT.toString().toString());
    }

    public final int hashCode() {
        return a().hashCode() + (this.f26918a.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor i(int i3) {
        if (i3 >= 0) {
            return this.f26918a;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Illegal index ", ", ");
        sbT.append(a());
        sbT.append(" expects only non-negative indices");
        throw new java.lang.IllegalArgumentException(sbT.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        java.lang.StringBuilder sbT = p121o0.p.t(i3, "Illegal index ", ", ");
        sbT.append(a());
        sbT.append(" expects only non-negative indices");
        throw new java.lang.IllegalArgumentException(sbT.toString().toString());
    }

    public final java.lang.String toString() {
        return a() + '(' + this.f26918a + ')';
    }
}
