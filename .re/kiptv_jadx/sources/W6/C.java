package W6;

/* JADX INFO: loaded from: classes4.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f10612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p101l7.e f10613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f10614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f10615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f10616e;

    public C(java.lang.String classInternalName, p101l7.e eVar, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(classInternalName, "classInternalName");
        this.f10612a = classInternalName;
        this.f10613b = eVar;
        this.f10614c = str;
        this.f10615d = str2;
        java.lang.String jvmDescriptor = eVar + '(' + str + ')' + str2;
        kotlin.jvm.internal.m.e(jvmDescriptor, "jvmDescriptor");
        this.f10616e = classInternalName + '.' + jvmDescriptor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W6.C)) {
            return false;
        }
        W6.C c9 = (W6.C) obj;
        return kotlin.jvm.internal.m.a(this.f10612a, c9.f10612a) && kotlin.jvm.internal.m.a(this.f10613b, c9.f10613b) && kotlin.jvm.internal.m.a(this.f10614c, c9.f10614c) && kotlin.jvm.internal.m.a(this.f10615d, c9.f10615d);
    }

    public final int hashCode() {
        return this.f10615d.hashCode() + B2.a.a((this.f10613b.hashCode() + (this.f10612a.hashCode() * 31)) * 31, 31, this.f10614c);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f10612a);
        sb.append(", name=");
        sb.append(this.f10613b);
        sb.append(", parameters=");
        sb.append(this.f10614c);
        sb.append(", returnType=");
        return Y6.f.l(sb, this.f10615d, ')');
    }
}
