package p135p8;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements kotlinx.serialization.descriptors.SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p135p8.g f26260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E6.InterfaceC0331d f26261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f26262c;

    public b(p135p8.g gVar, E6.InterfaceC0331d kClass) {
        kotlin.jvm.internal.m.e(kClass, "kClass");
        this.f26260a = gVar;
        this.f26261b = kClass;
        this.f26262c = gVar.f26271a + '<' + kClass.h() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String a() {
        return this.f26262c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final com.google.android.gms.internal.play_billing.V0 c() {
        return this.f26260a.f26272b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean d() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.f26260a.e(name);
    }

    public final boolean equals(java.lang.Object obj) {
        p135p8.b bVar = obj instanceof p135p8.b ? (p135p8.b) obj : null;
        return bVar != null && this.f26260a.equals(bVar.f26260a) && kotlin.jvm.internal.m.a(bVar.f26261b, this.f26261b);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f26260a.f26273c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String g(int i3) {
        return this.f26260a.f26276f[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List getAnnotations() {
        return this.f26260a.f26274d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List h(int i3) {
        return this.f26260a.f26277h[i3];
    }

    public final int hashCode() {
        return this.f26262c.hashCode() + (this.f26261b.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor i(int i3) {
        return this.f26260a.g[i3];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i3) {
        return this.f26260a.f26278i[i3];
    }

    public final java.lang.String toString() {
        return "ContextDescriptor(kClass: " + this.f26261b + ", original: " + this.f26260a + ')';
    }
}
