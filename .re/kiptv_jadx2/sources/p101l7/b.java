package p101l7;

import B2.a;
import O7.q;
import O7.x;
import com.google.common.util.concurrent.D;
import kotlin.jvm.internal.m;

public final class b {

    public final c f24825a;

    public final c f24826b;

    public final boolean f24827c;

    public b(c packageFqName, c relativeClassName, boolean z6) {
        m.e(packageFqName, "packageFqName");
        m.e(relativeClassName, "relativeClassName");
        this.f24825a = packageFqName;
        this.f24826b = relativeClassName;
        this.f24827c = z6;
        relativeClassName.f24829a.c();
    }

    public static final String c(c cVar) {
        String str = cVar.f24829a.f24832a;
        return q.C0(str, '/') ? a.i('`', "`", str) : str;
    }

    public final c a() {
        c cVar = this.f24825a;
        boolean zC = cVar.f24829a.c();
        c cVar2 = this.f24826b;
        if (zC) {
            return cVar2;
        }
        return new c(cVar.f24829a.f24832a + '.' + cVar2.f24829a.f24832a);
    }

    public final String b() {
        c cVar = this.f24825a;
        boolean zC = cVar.f24829a.c();
        c cVar2 = this.f24826b;
        if (zC) {
            return c(cVar2);
        }
        return x.v0(cVar.f24829a.f24832a, '.', '/') + "/" + c(cVar2);
    }

    public final b d(e name) {
        m.e(name, "name");
        return new b(this.f24825a, this.f24826b.a(name), this.f24827c);
    }

    public final b e() {
        c cVarB = this.f24826b.b();
        if (cVarB.f24829a.c()) {
            return null;
        }
        return new b(this.f24825a, cVarB, this.f24827c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f24825a, bVar.f24825a) && m.a(this.f24826b, bVar.f24826b) && this.f24827c == bVar.f24827c;
    }

    public final e f() {
        return this.f24826b.f24829a.f();
    }

    public final boolean g() {
        return !this.f24826b.b().f24829a.c();
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24827c) + ((this.f24826b.hashCode() + (this.f24825a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        if (!this.f24825a.f24829a.c()) {
            return b();
        }
        return "/" + b();
    }

    public b(c packageFqName, e topLevelName) {
        this(packageFqName, D.M(topLevelName), false);
        m.e(packageFqName, "packageFqName");
        m.e(topLevelName, "topLevelName");
        c cVar = c.f24828c;
    }
}
