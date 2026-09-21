package p208z5;

import V7.InterfaceC0982h;
import V7.n0;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.WatchProgress;
import p070h6.A;
import p100l6.c;
import p109m6.a;

public final class J implements InterfaceC0982h {

    public final int f32481h;

    public final X f32482i;

    public J(X x9, int i3) {
        this.f32481h = i3;
        this.f32482i = x9;
    }

    public Object a(c cVar) {
        M m8;
        WatchProgress watchProgress;
        J j;
        WatchProgress watchProgress2;
        n0 n0Var;
        Object value;
        if (cVar instanceof M) {
            m8 = (M) cVar;
            int i3 = m8.f32527k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m8.f32527k = i3 - Integer.MIN_VALUE;
            } else {
                m8 = new M(this, cVar);
            }
        } else {
            m8 = new M(this, cVar);
        }
        M m9 = m8;
        Object objL = m9.f32526i;
        a aVar = a.f25430h;
        int i9 = m9.f32527k;
        if (i9 == 0) {
            P.u0(objL);
            X x9 = this.f32482i;
            String strQ = x9.q();
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
            } while (!n0Var.g(value, C3224q.a((C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, false, null, null, null, 32255)));
            return A.f22523a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = m9.f32525h;
        P.u0(objL);
        watchProgress = (WatchProgress) objL;
        watchProgress2 = watchProgress;
        n0Var = j.f32482i.f32597p;
        do {
            value = n0Var.getValue();
        } while (!n0Var.g(value, C3224q.a((C3224q) value, 0, null, null, null, null, null, null, null, watchProgress2, false, null, null, null, 32255)));
        return A.f22523a;
    }

    @Override
    public final Object emit(Object obj, c cVar) {
        switch (this.f32481h) {
            case 0:
                Object objF = X.f(this.f32482i, cVar);
                return objF == a.f25430h ? objF : A.f22523a;
            default:
                return a(cVar);
        }
    }
}
