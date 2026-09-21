package p187w7;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements p187w7.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final N6.InterfaceC0691e f30474h;

    public c(N6.InterfaceC0691e classDescriptor) {
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        this.f30474h = classDescriptor;
    }

    public final boolean equals(java.lang.Object obj) {
        p187w7.c cVar = obj instanceof p187w7.c ? (p187w7.c) obj : null;
        return kotlin.jvm.internal.m.a(this.f30474h, cVar != null ? cVar.f30474h : null);
    }

    @Override // p187w7.d
    public final C7.AbstractC0191x getType() {
        C7.B bJ = this.f30474h.j();
        kotlin.jvm.internal.m.d(bJ, "getDefaultType(...)");
        return bJ;
    }

    public final int hashCode() {
        return this.f30474h.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Class{");
        C7.B bJ = this.f30474h.j();
        kotlin.jvm.internal.m.d(bJ, "getDefaultType(...)");
        sb.append(bJ);
        sb.append('}');
        return sb.toString();
    }
}
