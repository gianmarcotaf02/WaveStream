package t5;

/* JADX INFO: renamed from: t5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2841v implements p020c0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f28417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f28418c;

    public /* synthetic */ C2841v(p194x6.j jVar, int i3, java.lang.Object obj) {
        this.f28416a = i3;
        this.f28417b = jVar;
        this.f28418c = obj;
    }

    @Override // p020c0.H
    public final void dispose() {
        switch (this.f28416a) {
            case 0:
                p194x6.j jVar = this.f28417b;
                if (jVar != null) {
                    jVar.invoke(this.f28418c);
                }
                break;
            default:
                p194x6.j jVar2 = this.f28417b;
                if (jVar2 != null) {
                    jVar2.invoke(this.f28418c);
                }
                break;
        }
    }
}
