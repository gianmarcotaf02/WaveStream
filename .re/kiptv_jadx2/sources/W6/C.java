package W6;

public final class C {

    public final String f10612a;

    public final p101l7.e f10613b;

    public final String f10614c;

    public final String f10615d;

    public final String f10616e;

    public C(String classInternalName, p101l7.e eVar, String str, String str2) {
        kotlin.jvm.internal.m.e(classInternalName, "classInternalName");
        this.f10612a = classInternalName;
        this.f10613b = eVar;
        this.f10614c = str;
        this.f10615d = str2;
        String jvmDescriptor = eVar + '(' + str + ')' + str2;
        kotlin.jvm.internal.m.e(jvmDescriptor, "jvmDescriptor");
        this.f10616e = classInternalName + '.' + jvmDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return kotlin.jvm.internal.m.a(this.f10612a, c9.f10612a) && kotlin.jvm.internal.m.a(this.f10613b, c9.f10613b) && kotlin.jvm.internal.m.a(this.f10614c, c9.f10614c) && kotlin.jvm.internal.m.a(this.f10615d, c9.f10615d);
    }

    public final int hashCode() {
        return this.f10615d.hashCode() + B2.a.a((this.f10613b.hashCode() + (this.f10612a.hashCode() * 31)) * 31, 31, this.f10614c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NameAndSignature(classInternalName=");
        sb.append(this.f10612a);
        sb.append(", name=");
        sb.append(this.f10613b);
        sb.append(", parameters=");
        sb.append(this.f10614c);
        sb.append(", returnType=");
        return Y6.f.l(sb, this.f10615d, ')');
    }
}
