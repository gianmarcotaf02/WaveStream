package C7;

/* JADX INFO: renamed from: C7.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0188u implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p194x6.j f1606i;

    public /* synthetic */ C0188u(int i3, p194x6.j jVar) {
        this.f1605h = i3;
        this.f1606i = jVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        long j;
        switch (this.f1605h) {
            case 0:
                C7.AbstractC0191x abstractC0191x = (C7.AbstractC0191x) obj;
                kotlin.jvm.internal.m.b(abstractC0191x);
                return this.f1606i.invoke(abstractC0191x).toString();
            case 1:
                com.kiptv.core.model.XtreamSeries it = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return (java.lang.String) this.f1606i.invoke(it);
            case 2:
                return this.f1606i.invoke(java.lang.Long.valueOf(((java.lang.Number) obj).longValue() / 1000000));
            case 3:
                p121o0.j jVar = (p121o0.j) obj;
                synchronized (p121o0.k.f25993c) {
                    j = p121o0.k.f25995e;
                    p121o0.k.f25995e = ((long) 1) + j;
                }
                return new p121o0.e(j, jVar, this.f1606i);
            default:
                com.kiptv.core.model.XtreamVODStream it2 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return (java.lang.String) this.f1606i.invoke(it2);
        }
    }
}
