package U4;

import D5.C0261o;
import S7.C;
import S7.M;
import android.content.Context;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;
import com.kiptv.core.local.cache.CacheMetadata;
import java.io.File;
import p070h6.A;

public final class g {
    public static final b Companion = new b();

    public final Context f10138a;

    public final p162s8.d f10139b;

    public final p070h6.p f10140c;

    public g(Context context, p162s8.d json) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(json, "json");
        this.f10138a = context;
        this.f10139b = json;
        this.f10140c = D.B(new C0261o(26, this));
    }

    public final Long a(String playlistId) {
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        File file = new File(c(playlistId), "cache_metadata.json");
        if (!file.exists()) {
            return null;
        }
        try {
            p162s8.d dVar = this.f10139b;
            String strR = p160s6.k.R(file);
            dVar.getClass();
            return Long.valueOf(((CacheMetadata) dVar.b(strR, CacheMetadata.INSTANCE.serializer())).f19595a);
        } catch (Exception unused) {
            return null;
        }
    }

    public final Object b(String str, p117n6.c cVar) throws Throwable {
        c cVar2;
        g gVar;
        a aVar;
        T4.g gVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i3 = cVar2.f10128l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.f10128l = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = cVar2.f10128l;
        if (i9 == 0) {
            P.u0(objB);
            T4.g gVar3 = (T4.g) this.f10140c.getValue();
            cVar2.f10125h = this;
            cVar2.f10126i = str;
            cVar2.f10128l = 1;
            objB = gVar3.b(str, cVar2);
            if (objB != aVar2) {
                gVar = this;
            }
            return aVar2;
        }
        if (i9 == 1) {
            str = cVar2.f10126i;
            gVar = (g) cVar2.f10125h;
            P.u0(objB);
        } else {
            if (i9 != 2) {
                if (i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) cVar2.f10125h;
                P.u0(objB);
                return aVar3;
            }
            str = cVar2.f10126i;
            gVar = (g) cVar2.f10125h;
            P.u0(objB);
        }
        aVar = (a) objB;
        if (aVar == null) {
            return null;
        }
        gVar2 = (T4.g) gVar.f10140c.getValue();
        cVar2.f10125h = aVar;
        cVar2.f10126i = null;
        cVar2.f10128l = 3;
        if (gVar2.c(str, aVar, cVar2) != aVar2) {
            return aVar2;
        }
        return aVar;
        a aVar4 = (a) objB;
        if (aVar4 != null) {
            return aVar4;
        }
        cVar2.f10125h = gVar;
        cVar2.f10126i = str;
        cVar2.f10128l = 2;
        gVar.getClass();
        Z7.e eVar = M.f9549a;
        objB = C.K(Z7.d.f13044i, new d(gVar, str, null), cVar2);
        if (objB != aVar2) {
            aVar = (a) objB;
            if (aVar == null) {
                return null;
            }
            gVar2 = (T4.g) gVar.f10140c.getValue();
            cVar2.f10125h = aVar;
            cVar2.f10126i = null;
            cVar2.f10128l = 3;
            if (gVar2.c(str, aVar, cVar2) != aVar2) {
                return aVar;
            }
        }
        return aVar2;
    }

    public final File c(String str) {
        return new File(new File(this.f10138a.getCacheDir(), "XtreamCache"), str);
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, a aVar, p117n6.c cVar) {
        e eVar;
        g gVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i3 = eVar.f10135m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eVar.f10135m = i3 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.f10133k;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = eVar.f10135m;
        if (i9 != 0) {
            if (i9 == 1) {
                aVar = eVar.j;
                str = eVar.f10132i;
                gVar = eVar.f10131h;
                P.u0(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P.u0(obj);
            }
            return A.f22523a;
        }
        P.u0(obj);
        T4.g gVar2 = (T4.g) this.f10140c.getValue();
        eVar.f10131h = this;
        eVar.f10132i = str;
        eVar.j = aVar;
        eVar.f10135m = 1;
        if (gVar2.c(str, aVar, eVar) != aVar2) {
            gVar = this;
        }
        return aVar2;
        eVar.f10131h = null;
        eVar.f10132i = null;
        eVar.j = null;
        eVar.f10135m = 2;
        gVar.getClass();
        Z7.e eVar2 = M.f9549a;
    }
}
