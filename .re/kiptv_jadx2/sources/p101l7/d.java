package p101l7;

import O7.q;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;

public final class d {

    public static final e f24831e = e.g("<root>");

    public final String f24832a;

    public transient c f24833b;

    public transient d f24834c;

    public transient e f24835d;

    static {
        m.d(Pattern.compile("\\."), "compile(...)");
    }

    public d(String fqName, c safe) {
        m.e(fqName, "fqName");
        m.e(safe, "safe");
        this.f24832a = fqName;
        this.f24833b = safe;
    }

    public static final List e(d dVar) {
        if (dVar.c()) {
            return new ArrayList();
        }
        d dVar2 = dVar.f24834c;
        if (dVar2 == null) {
            if (dVar.c()) {
                throw new IllegalStateException("root");
            }
            dVar.b();
            dVar2 = dVar.f24834c;
            m.b(dVar2);
        }
        List listE = e(dVar2);
        listE.add(dVar.f());
        return listE;
    }

    public final d a(e name) {
        String strB;
        m.e(name, "name");
        if (c()) {
            strB = name.b();
        } else {
            strB = this.f24832a + '.' + name.b();
        }
        m.b(strB);
        return new d(strB, this, name);
    }

    public final void b() {
        String str = this.f24832a;
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
            this.f24835d = e.d(str);
            this.f24834c = c.f24828c.f24829a;
            return;
        }
        String strSubstring = str.substring(length + 1);
        m.d(strSubstring, "substring(...)");
        this.f24835d = e.d(strSubstring);
        String strSubstring2 = str.substring(0, length);
        m.d(strSubstring2, "substring(...)");
        this.f24834c = new d(strSubstring2);
    }

    public final boolean c() {
        return this.f24832a.length() == 0;
    }

    public final boolean d() {
        return this.f24833b != null || q.K0(this.f24832a, '<', 0, 6) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return m.a(this.f24832a, ((d) obj).f24832a);
        }
        return false;
    }

    public final e f() {
        e eVar = this.f24835d;
        if (eVar != null) {
            return eVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        b();
        e eVar2 = this.f24835d;
        m.b(eVar2);
        return eVar2;
    }

    public final c g() {
        c cVar = this.f24833b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f24833b = cVar2;
        return cVar2;
    }

    public final int hashCode() {
        return this.f24832a.hashCode();
    }

    public final String toString() {
        if (!c()) {
            return this.f24832a;
        }
        String strB = f24831e.b();
        m.d(strB, "asString(...)");
        return strB;
    }

    public d(String str) {
        this.f24832a = str;
    }

    public d(String str, d dVar, e eVar) {
        this.f24832a = str;
        this.f24834c = dVar;
        this.f24835d = eVar;
    }
}
