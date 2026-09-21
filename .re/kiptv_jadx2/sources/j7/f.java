package j7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;
import p110m7.v;

public final class f extends AbstractC2637j implements v {

    public int f24289i;
    public List j;

    public List f24290k;

    @Override
    public final AbstractC2629b b() {
        j jVarE = e();
        jVarE.isInitialized();
        return jVarE;
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        j jVar = null;
        try {
            try {
                j.f24315o.getClass();
                f(new j(c2633f, c2635h));
                return this;
            } catch (r e6) {
                j jVar2 = (j) e6.f25503h;
                try {
                    throw e6;
                } catch (Throwable th) {
                    th = th;
                    jVar = jVar2;
                    if (jVar != null) {
                        f(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (jVar != null) {
                f(jVar);
            }
            throw th;
        }
    }

    public final Object clone() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.j = list;
        fVar.f24290k = list;
        fVar.f(e());
        return fVar;
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        f((j) oVar);
        return this;
    }

    public final j e() {
        j jVar = new j(this);
        if ((this.f24289i & 1) == 1) {
            this.j = Collections.unmodifiableList(this.j);
            this.f24289i &= -2;
        }
        jVar.f24317i = this.j;
        if ((this.f24289i & 2) == 2) {
            this.f24290k = Collections.unmodifiableList(this.f24290k);
            this.f24289i &= -3;
        }
        jVar.j = this.f24290k;
        return jVar;
    }

    public final void f(j jVar) {
        if (jVar == j.f24314n) {
            return;
        }
        if (!jVar.f24317i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = jVar.f24317i;
                this.f24289i &= -2;
            } else {
                if ((this.f24289i & 1) != 1) {
                    this.j = new ArrayList(this.j);
                    this.f24289i |= 1;
                }
                this.j.addAll(jVar.f24317i);
            }
        }
        if (!jVar.j.isEmpty()) {
            if (this.f24290k.isEmpty()) {
                this.f24290k = jVar.j;
                this.f24289i &= -3;
            } else {
                if ((this.f24289i & 2) != 2) {
                    this.f24290k = new ArrayList(this.f24290k);
                    this.f24289i |= 2;
                }
                this.f24290k.addAll(jVar.j);
            }
        }
        this.f25492h = this.f25492h.e(jVar.f24316h);
    }
}
