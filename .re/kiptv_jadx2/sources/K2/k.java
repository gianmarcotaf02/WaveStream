package K2;

import S2.m;
import android.content.Context;
import com.google.common.util.concurrent.P;
import java.util.List;

public final class k {

    public final S2.h f6833a;

    public final List f6834b;

    public final int f6835c;

    public final S2.h f6836d;

    public final T2.h f6837e;

    public final E2.g f6838f;
    public final boolean g;

    public k(S2.h hVar, List list, int i3, S2.h hVar2, T2.h hVar3, E2.g gVar, boolean z6) {
        this.f6833a = hVar;
        this.f6834b = list;
        this.f6835c = i3;
        this.f6836d = hVar2;
        this.f6837e = hVar3;
        this.f6838f = gVar;
        this.g = z6;
    }

    public final Object a(p117n6.c cVar) throws Throwable {
        j jVar;
        h hVar;
        k kVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i3 = jVar.f6832l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f6832l = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj = jVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = jVar.f6832l;
        if (i9 == 0) {
            P.u0(obj);
            List list = this.f6834b;
            int i10 = this.f6835c;
            h hVar2 = (h) list.get(i10);
            k kVar2 = new k(this.f6833a, this.f6834b, i10 + 1, this.f6836d, this.f6837e, this.f6838f, this.g);
            jVar.f6829h = this;
            jVar.f6830i = hVar2;
            jVar.f6832l = 1;
            Object objD = hVar2.d(kVar2, jVar);
            if (objD == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj = objD;
            kVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = jVar.f6830i;
            kVar = jVar.f6829h;
            P.u0(obj);
        }
        S2.k kVar3 = (S2.k) obj;
        S2.h request = kVar3.getRequest();
        kVar.getClass();
        Context context = request.f9253a;
        S2.h hVar3 = kVar.f6833a;
        if (context != hVar3.f9253a) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's context.").toString());
        }
        if (request.f9254b == m.f9283a) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot set the request's data to null.").toString());
        }
        if (request.f9255c != hVar3.f9255c) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's target.").toString());
        }
        if (request.f9265o == hVar3.f9265o) {
            return kVar3;
        }
        throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }
}
