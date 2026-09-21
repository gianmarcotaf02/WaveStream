package t8;

/* JADX INFO: loaded from: classes4.dex */
public final class F extends p117n6.h implements p194x6.n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f28566i;
    public /* synthetic */ p070h6.C2180b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Y2.C1038h f28567k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Y2.C1038h c1038h, p100l6.c cVar) {
        super(3, cVar);
        this.f28567k = c1038h;
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        t8.F f9 = new t8.F(this.f28567k, (p100l6.c) obj3);
        f9.j = (p070h6.C2180b) obj;
        return f9.invokeSuspend(p070h6.A.f22523a);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f28566i;
        if (i3 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            p070h6.C2180b c2180b = this.j;
            Y2.C1038h c1038h = this.f28567k;
            t8.AbstractC2851a abstractC2851a = (t8.AbstractC2851a) c1038h.f11470c;
            byte bW = abstractC2851a.w();
            if (bW == 1) {
                return c1038h.l(true);
            }
            if (bW == 0) {
                return c1038h.l(false);
            }
            if (bW != 6) {
                if (bW == 8) {
                    return c1038h.k();
                }
                t8.AbstractC2851a.r(abstractC2851a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f28566i = 1;
            obj = Y2.C1038h.d(c1038h, c2180b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
