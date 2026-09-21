package p114n2;

import O7.q;
import p194x6.j;

public final class C {

    public final A f25587a;

    public boolean f25588b;

    public boolean f25589c;

    public int f25590d;

    public String f25591e;

    public boolean f25592f;
    public boolean g;

    public C() {
        A a2 = new A();
        a2.f25574a = -1;
        a2.f25578e = -1;
        a2.f25579f = -1;
        this.f25587a = a2;
        this.f25590d = -1;
    }

    public final void a(String str, j jVar) {
        if (q.N0(str)) {
            throw new IllegalArgumentException("Cannot pop up to an empty route");
        }
        this.f25591e = str;
        this.f25590d = -1;
        this.f25592f = false;
        M m8 = new M();
        jVar.invoke(m8);
        this.f25592f = m8.f25611a;
        this.g = m8.f25612b;
    }
}
