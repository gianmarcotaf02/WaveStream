package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends p153r8.C2690c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f26910l;

    public G(java.lang.String str, p153r8.D d4) {
        super(str, d4, 1);
        this.f26910l = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h6.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [h6.h, java.lang.Object] */
    @Override // p153r8.C2690c0
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p153r8.G) {
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) obj;
            if (this.f26945a.equals(serialDescriptor.a())) {
                p153r8.G g = (p153r8.G) obj;
                if (g.f26910l && java.util.Arrays.equals((kotlinx.serialization.descriptors.SerialDescriptor[]) this.j.getValue(), (kotlinx.serialization.descriptors.SerialDescriptor[]) g.j.getValue())) {
                    int iF = serialDescriptor.f();
                    int i3 = this.f26947c;
                    if (i3 == iF) {
                        for (int i9 = 0; i9 < i3; i9++) {
                            if (kotlin.jvm.internal.m.a(i(i9).a(), serialDescriptor.i(i9).a()) && kotlin.jvm.internal.m.a(i(i9).c(), serialDescriptor.i(i9).c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p153r8.C2690c0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return this.f26910l;
    }
}
