package p186w5;

/* JADX INFO: renamed from: w5.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2985h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.A f30236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f30237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p186w5.InterfaceC2983g0 f30238d;

    public C2985h0(java.lang.String id, com.kiptv.core.model.A kind, java.lang.String str, p186w5.InterfaceC2983g0 interfaceC2983g0) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(kind, "kind");
        this.f30235a = id;
        this.f30236b = kind;
        this.f30237c = str;
        this.f30238d = interfaceC2983g0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.C2985h0)) {
            return false;
        }
        p186w5.C2985h0 c2985h0 = (p186w5.C2985h0) obj;
        return kotlin.jvm.internal.m.a(this.f30235a, c2985h0.f30235a) && this.f30236b == c2985h0.f30236b && kotlin.jvm.internal.m.a(this.f30237c, c2985h0.f30237c) && kotlin.jvm.internal.m.a(this.f30238d, c2985h0.f30238d);
    }

    public final int hashCode() {
        return this.f30238d.hashCode() + B2.a.a((this.f30236b.hashCode() + (this.f30235a.hashCode() * 31)) * 31, 31, this.f30237c);
    }

    public final java.lang.String toString() {
        return "TvHomeRow(id=" + this.f30235a + ", kind=" + this.f30236b + ", title=" + this.f30237c + ", content=" + this.f30238d + ")";
    }
}
