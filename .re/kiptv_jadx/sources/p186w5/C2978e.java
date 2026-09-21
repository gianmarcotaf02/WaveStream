package p186w5;

/* JADX INFO: renamed from: w5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2978e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p186w5.EnumC2986i f30218b;

    public C2978e(java.lang.String sectionId, p186w5.EnumC2986i enumC2986i) {
        kotlin.jvm.internal.m.e(sectionId, "sectionId");
        this.f30217a = sectionId;
        this.f30218b = enumC2986i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.C2978e)) {
            return false;
        }
        p186w5.C2978e c2978e = (p186w5.C2978e) obj;
        return kotlin.jvm.internal.m.a(this.f30217a, c2978e.f30217a) && this.f30218b == c2978e.f30218b;
    }

    public final int hashCode() {
        return this.f30218b.hashCode() + (this.f30217a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "FocusTarget(sectionId=" + this.f30217a + ", button=" + this.f30218b + ")";
    }
}
