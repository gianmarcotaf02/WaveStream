package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 implements kotlinx.serialization.descriptors.SerialDescriptor, p153r8.InterfaceC2701l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.SerialDescriptor f26973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f26974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Set f26975c;

    public j0(kotlinx.serialization.descriptors.SerialDescriptor original) {
        kotlin.jvm.internal.m.e(original, "original");
        this.f26973a = original;
        this.f26974b = original.a() + '?';
        this.f26975c = p153r8.AbstractC2686a0.b(original);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        return this.f26974b;
    }

    @Override // p153r8.InterfaceC2701l
    public final java.util.Set b() {
        return this.f26975c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.google.android.gms.internal.play_billing.V0 c() {
        return this.f26973a.c();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean d() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.f26973a.e(name);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p153r8.j0) {
            return kotlin.jvm.internal.m.a(this.f26973a, ((p153r8.j0) obj).f26973a);
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f26973a.f();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String g(int i3) {
        return this.f26973a.g(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List getAnnotations() {
        return this.f26973a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List h(int i3) {
        return this.f26973a.h(i3);
    }

    public final int hashCode() {
        return this.f26973a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor i(int i3) {
        return this.f26973a.i(i3);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f26973a.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f26973a.j(i3);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f26973a);
        sb.append('?');
        return sb.toString();
    }
}
