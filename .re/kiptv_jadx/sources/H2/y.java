package H2;

/* JADX INFO: loaded from: classes.dex */
public final class y implements H2.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.ImageDecoder.Source f3920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.AutoCloseable f3921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S2.o f3922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p028c8.j f3923d;

    public y(android.graphics.ImageDecoder.Source source, java.lang.AutoCloseable autoCloseable, S2.o oVar, p028c8.j jVar) {
        this.f3920a = source;
        this.f3921b = autoCloseable;
        this.f3922c = oVar;
        this.f3923d = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // H2.k
    public final java.lang.Object a(p100l6.c cVar) {
        H2.v vVar;
        H2.y yVar;
        p028c8.j jVar;
        if (cVar instanceof H2.v) {
            vVar = (H2.v) cVar;
            int i3 = vVar.f3917l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                vVar.f3917l = i3 - Integer.MIN_VALUE;
            } else {
                vVar = new H2.v(this, (p117n6.c) cVar);
            }
        } else {
            vVar = new H2.v(this, (p117n6.c) cVar);
        }
        java.lang.Object obj = vVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = vVar.f3917l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = vVar.f3915i;
            yVar = vVar.f3914h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        try {
            java.lang.AutoCloseable autoCloseable = yVar.f3921b;
            try {
                kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
                H2.i iVar = new H2.i(new E2.C0274a(android.graphics.ImageDecoder.decodeBitmap(yVar.f3920a, new H2.x(yVar, wVar))), wVar.f24553h);
                com.google.common.util.concurrent.D.h(autoCloseable, null);
                jVar.c();
                return iVar;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    com.google.common.util.concurrent.D.h(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            jVar.c();
            throw th3;
        }
    }
}
