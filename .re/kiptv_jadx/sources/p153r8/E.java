package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements kotlinx.serialization.descriptors.SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f26901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.SerialDescriptor f26902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.SerialDescriptor f26903c;

    public E(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor2) {
        this.f26901a = str;
        this.f26902b = serialDescriptor;
        this.f26903c = serialDescriptor2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        return this.f26901a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.google.android.gms.internal.play_billing.V0 c() {
        return p135p8.j.f26284h;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        java.lang.Integer numZ0 = O7.x.z0(name);
        if (numZ0 != null) {
            return numZ0.intValue();
        }
        throw new java.lang.IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p153r8.E)) {
            return false;
        }
        p153r8.E e6 = (p153r8.E) obj;
        return kotlin.jvm.internal.m.a(this.f26901a, e6.f26901a) && kotlin.jvm.internal.m.a(this.f26902b, e6.f26902b) && kotlin.jvm.internal.m.a(this.f26903c, e6.f26903c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return 2;
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
        throw new java.lang.IllegalArgumentException(Y6.f.m(p121o0.p.t(i3, "Illegal index ", ", "), this.f26901a, " expects only non-negative indices").toString());
    }

    public final int hashCode() {
        return this.f26903c.hashCode() + ((this.f26902b.hashCode() + (this.f26901a.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor i(int i3) {
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(Y6.f.m(p121o0.p.t(i3, "Illegal index ", ", "), this.f26901a, " expects only non-negative indices").toString());
        }
        int i9 = i3 % 2;
        if (i9 == 0) {
            return this.f26902b;
        }
        if (i9 == 1) {
            return this.f26903c;
        }
        throw new java.lang.IllegalStateException("Unreached");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        if (i3 >= 0) {
            return false;
        }
        throw new java.lang.IllegalArgumentException(Y6.f.m(p121o0.p.t(i3, "Illegal index ", ", "), this.f26901a, " expects only non-negative indices").toString());
    }

    public final java.lang.String toString() {
        return this.f26901a + '(' + this.f26902b + ", " + this.f26903c + ')';
    }
}
