package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p208z5.X f32482i;

    public /* synthetic */ J(p208z5.X x9, int i3) {
        this.f32481h = i3;
        this.f32482i = x9;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public java.lang.Object a(p100l6.c cVar) {
        p208z5.M m8;
        com.kiptv.core.model.WatchProgress watchProgress;
        p208z5.J j;
        com.kiptv.core.model.WatchProgress watchProgress2;
        V7.n0 n0Var;
        java.lang.Object value;
        if (cVar instanceof p208z5.M) {
            m8 = (p208z5.M) cVar;
            int i3 = m8.f32527k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m8.f32527k = i3 - Integer.MIN_VALUE;
            } else {
                m8 = new p208z5.M(this, cVar);
            }
        } else {
            m8 = new p208z5.M(this, cVar);
        }
        p208z5.M m9 = m8;
        java.lang.Object objL = m9.f32526i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = m9.f32527k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            p208z5.X x9 = this.f32482i;
            java.lang.String strQ = x9.q();
            if (strQ != null) {
                m9.f32525h = this;
                m9.f32527k = 1;
                objL = x9.f32589f.l(null, null, strQ, null, m9);
                if (objL == aVar) {
                    return aVar;
                }
                j = this;
            } else {
                watchProgress = null;
                j = this;
            }
            watchProgress2 = watchProgress;
            n0Var = j.f32482i.f32597p;
            do {
                value = n0Var.getValue();
            } while (!n0Var.g(value, p208z5.C3224q.a((p208z5.C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, false, null, null, null, 32255)));
            return p070h6.A.f22523a;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = m9.f32525h;
        com.google.common.util.concurrent.P.u0(objL);
        watchProgress = (com.kiptv.core.model.WatchProgress) objL;
        watchProgress2 = watchProgress;
        n0Var = j.f32482i.f32597p;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, p208z5.C3224q.a((p208z5.C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, false, null, null, null, 32255)));
        return p070h6.A.f22523a;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        switch (this.f32481h) {
            case 0:
                java.lang.Object objF = p208z5.X.f(this.f32482i, cVar);
                return objF == p109m6.a.f25430h ? objF : p070h6.A.f22523a;
            default:
                return a(cVar);
        }
    }
}
