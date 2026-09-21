package H2;

import E2.C0274a;
import android.graphics.ImageDecoder;
import com.google.common.util.concurrent.D;
import com.google.common.util.concurrent.P;

public final class y implements k {

    public final ImageDecoder.Source f3920a;

    public final AutoCloseable f3921b;

    public final S2.o f3922c;

    public final p028c8.j f3923d;

    public y(ImageDecoder.Source source, AutoCloseable autoCloseable, S2.o oVar, p028c8.j jVar) {
        this.f3920a = source;
        this.f3921b = autoCloseable;
        this.f3922c = oVar;
        this.f3923d = jVar;
    }

    @Override
    public final Object a(p100l6.c cVar) {
        v vVar;
        y yVar;
        p028c8.j jVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i3 = vVar.f3917l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.f3917l = i3 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, (p117n6.c) cVar);
            }
        } else {
            vVar = new v(this, (p117n6.c) cVar);
        }
        Object obj = vVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = vVar.f3917l;
        if (i9 == 0) {
            P.u0(obj);
            vVar.f3914h = this;
            p028c8.j jVar2 = this.f3923d;
            vVar.f3915i = jVar2;
            vVar.f3917l = 1;
            if (jVar2.a(vVar) == aVar) {
                return aVar;
            }
            yVar = this;
            jVar = jVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = vVar.f3915i;
            yVar = vVar.f3914h;
            P.u0(obj);
        }
        try {
            AutoCloseable autoCloseable = yVar.f3921b;
            try {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                i iVar = new i(new C0274a(ImageDecoder.decodeBitmap(yVar.f3920a, new x(yVar, wVar))), wVar.f24553h);
                D.h(autoCloseable, null);
                jVar.c();
                return iVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    D.h(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            jVar.c();
            throw th3;
        }
    }
}
