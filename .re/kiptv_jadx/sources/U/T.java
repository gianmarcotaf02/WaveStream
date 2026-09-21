package U;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class T implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f9939i;

    public /* synthetic */ T(int i3, java.util.ArrayList arrayList) {
        this.f9938h = i3;
        this.f9939i = arrayList;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f9938h) {
            case 0:
                O0.f0 f0Var = (O0.f0) obj;
                java.util.ArrayList arrayList = this.f9939i;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f0Var.g((O0.g0) arrayList.get(i3), 0, 0, 0.0f);
                }
                return p070h6.A.f22523a;
            default:
                com.kiptv.core.model.ContentTypeSettings it = (com.kiptv.core.model.ContentTypeSettings) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return com.kiptv.core.model.ContentTypeSettings.a(it, null, p078i6.o.c1(p078i6.o.A1(it.f19690b, this.f9939i)), null, null, null, null, null, null, null, null, null, null, null, null, 16381);
        }
    }
}
