package p044e7;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements p194x6.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p044e7.a f21439i = new p044e7.a(0);
    public static final p044e7.a j = new p044e7.a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21440h;

    public /* synthetic */ a(int i3) {
        this.f21440h = i3;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        p044e7.c loadConstantFromProperty = (p044e7.c) obj;
        p044e7.o it = (p044e7.o) obj2;
        switch (this.f21440h) {
            case 0:
                kotlin.jvm.internal.m.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.m.e(it, "it");
                return loadConstantFromProperty.f21446c.get(it);
            default:
                kotlin.jvm.internal.m.e(loadConstantFromProperty, "$this$loadConstantFromProperty");
                kotlin.jvm.internal.m.e(it, "it");
                return loadConstantFromProperty.f21445b.get(it);
        }
    }
}
