package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24289i;
    public java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f24290k;

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        j7.j jVarE = e();
        jVarE.isInitialized();
        return jVarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        j7.j jVar = null;
        try {
            try {
                j7.j.f24315o.getClass();
                f(new j7.j(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                j7.j jVar2 = (j7.j) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    jVar = jVar2;
                    if (jVar != null) {
                        f(jVar);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (jVar != null) {
                f(jVar);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        j7.f fVar = new j7.f();
        java.util.List list = java.util.Collections.EMPTY_LIST;
        fVar.j = list;
        fVar.f24290k = list;
        fVar.f(e());
        return fVar;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        f((j7.j) oVar);
        return this;
    }

    public final j7.j e() {
        j7.j jVar = new j7.j(this);
        if ((this.f24289i & 1) == 1) {
            this.j = java.util.Collections.unmodifiableList(this.j);
            this.f24289i &= -2;
        }
        jVar.f24317i = this.j;
        if ((this.f24289i & 2) == 2) {
            this.f24290k = java.util.Collections.unmodifiableList(this.f24290k);
            this.f24289i &= -3;
        }
        jVar.j = this.f24290k;
        return jVar;
    }

    public final void f(j7.j jVar) {
        if (jVar == j7.j.f24314n) {
            return;
        }
        if (!jVar.f24317i.isEmpty()) {
            if (this.j.isEmpty()) {
                this.j = jVar.f24317i;
                this.f24289i &= -2;
            } else {
                if ((this.f24289i & 1) != 1) {
                    this.j = new java.util.ArrayList(this.j);
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
                    this.f24290k = new java.util.ArrayList(this.f24290k);
                    this.f24289i |= 2;
                }
                this.f24290k.addAll(jVar.j);
            }
        }
        this.f25492h = this.f25492h.e(jVar.f24316h);
    }
}
