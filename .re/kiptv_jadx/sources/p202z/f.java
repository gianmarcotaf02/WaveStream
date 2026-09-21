package p202z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f32113i;
    public final /* synthetic */ p020c0.X j;

    public /* synthetic */ f(java.util.ArrayList arrayList, p020c0.X x9, int i3) {
        this.f32112h = i3;
        this.f32113i = arrayList;
        this.j = x9;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        switch (this.f32112h) {
            case 0:
                p202z.j jVar = (p202z.j) obj;
                boolean z6 = jVar instanceof p202z.d;
                java.util.ArrayList arrayList = this.f32113i;
                if (z6) {
                    arrayList.add(jVar);
                } else if (jVar instanceof p202z.e) {
                    arrayList.remove(((p202z.e) jVar).f32111a);
                }
                this.j.setValue(java.lang.Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                p202z.j jVar2 = (p202z.j) obj;
                boolean z9 = jVar2 instanceof p202z.m;
                java.util.ArrayList arrayList2 = this.f32113i;
                if (z9) {
                    arrayList2.add(jVar2);
                } else if (jVar2 instanceof p202z.n) {
                    arrayList2.remove(((p202z.n) jVar2).f32120a);
                } else if (jVar2 instanceof p202z.l) {
                    arrayList2.remove(((p202z.l) jVar2).f32118a);
                }
                this.j.setValue(java.lang.Boolean.valueOf(!arrayList2.isEmpty()));
                break;
        }
        return p070h6.A.f22523a;
    }
}
