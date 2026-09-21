package p101l7;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p101l7.e f24831e = p101l7.e.g("<root>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f24832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient p101l7.c f24833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient p101l7.d f24834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient p101l7.e f24835d;

    static {
        kotlin.jvm.internal.m.d(java.util.regex.Pattern.compile("\\."), "compile(...)");
    }

    public d(java.lang.String fqName, p101l7.c safe) {
        kotlin.jvm.internal.m.e(fqName, "fqName");
        kotlin.jvm.internal.m.e(safe, "safe");
        this.f24832a = fqName;
        this.f24833b = safe;
    }

    public static final java.util.List e(p101l7.d dVar) {
        if (dVar.c()) {
            return new java.util.ArrayList();
        }
        p101l7.d dVar2 = dVar.f24834c;
        if (dVar2 == null) {
            if (dVar.c()) {
                throw new java.lang.IllegalStateException("root");
            }
            dVar.b();
            dVar2 = dVar.f24834c;
            kotlin.jvm.internal.m.b(dVar2);
        }
        java.util.List listE = e(dVar2);
        listE.add(dVar.f());
        return listE;
    }

    public final p101l7.d a(p101l7.e name) {
        java.lang.String strB;
        kotlin.jvm.internal.m.e(name, "name");
        if (c()) {
            strB = name.b();
        } else {
            strB = this.f24832a + '.' + name.b();
        }
        kotlin.jvm.internal.m.b(strB);
        return new p101l7.d(strB, this, name);
    }

    public final void b() {
        java.lang.String str = this.f24832a;
        int length = str.length() - 1;
        boolean z6 = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z6) {
                break;
            }
            if (cCharAt == '`') {
                z6 = !z6;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length < 0) {
            this.f24835d = p101l7.e.d(str);
            this.f24834c = p101l7.c.f24828c.f24829a;
            return;
        }
        java.lang.String strSubstring = str.substring(length + 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        this.f24835d = p101l7.e.d(strSubstring);
        java.lang.String strSubstring2 = str.substring(0, length);
        kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
        this.f24834c = new p101l7.d(strSubstring2);
    }

    public final boolean c() {
        return this.f24832a.length() == 0;
    }

    public final boolean d() {
        return this.f24833b != null || O7.q.K0(this.f24832a, '<', 0, 6) < 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p101l7.d) {
            return kotlin.jvm.internal.m.a(this.f24832a, ((p101l7.d) obj).f24832a);
        }
        return false;
    }

    public final p101l7.e f() {
        p101l7.e eVar = this.f24835d;
        if (eVar != null) {
            return eVar;
        }
        if (c()) {
            throw new java.lang.IllegalStateException("root");
        }
        b();
        p101l7.e eVar2 = this.f24835d;
        kotlin.jvm.internal.m.b(eVar2);
        return eVar2;
    }

    public final p101l7.c g() {
        p101l7.c cVar = this.f24833b;
        if (cVar != null) {
            return cVar;
        }
        p101l7.c cVar2 = new p101l7.c(this);
        this.f24833b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.f24832a.hashCode();
    }

    public final java.lang.String toString() {
        if (!c()) {
            return this.f24832a;
        }
        java.lang.String strB = f24831e.b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        return strB;
    }

    public d(java.lang.String str) {
        this.f24832a = str;
    }

    public d(java.lang.String str, p101l7.d dVar, p101l7.e eVar) {
        this.f24832a = str;
        this.f24834c = dVar;
        this.f24835d = eVar;
    }
}
