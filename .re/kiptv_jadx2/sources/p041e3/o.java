package p041e3;

import D1.RunnableC0239y;
import D3.j;
import V1.b;
import android.content.Context;
import android.support.v4.media.session.q;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import k3.i;
import k3.k;
import p023c3.a;
import p083j3.c;

public final class o {

    public static volatile j f21408e;

    public final b f21409a;

    public final b f21410b;

    public final c f21411c;

    public final i f21412d;

    public o(b bVar, b bVar2, c cVar, i iVar, k kVar) {
        this.f21409a = bVar;
        this.f21410b = bVar2;
        this.f21411c = cVar;
        this.f21412d = iVar;
        kVar.getClass();
        kVar.f24473a.execute(new RunnableC0239y(25, kVar));
    }

    public static o a() {
        j jVar = f21408e;
        if (jVar != null) {
            return (o) jVar.f21402m.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21408e == null) {
            synchronized (o.class) {
                try {
                    if (f21408e == null) {
                        j jVar = new j();
                        context.getClass();
                        jVar.f2115a = context;
                        f21408e = jVar.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q c(a aVar) {
        byte[] bytes;
        Set setUnmodifiableSet = aVar != null ? Collections.unmodifiableSet(a.f18494d) : Collections.singleton(new p013b3.b("proto"));
        q qVarA = i.a();
        aVar.getClass();
        qVarA.f15617i = "cct";
        String str = aVar.f18496a;
        String str2 = aVar.f18497b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = B2.a.m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        qVarA.j = bytes;
        return new q(setUnmodifiableSet, qVarA.j(), this, 24);
    }
}
