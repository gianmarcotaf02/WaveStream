package p208z5;

/* JADX INFO: renamed from: z5.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3232u0 implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p208z5.C3232u0 f32847i = new p208z5.C3232u0(0);
    public static final p208z5.C3232u0 j = new p208z5.C3232u0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f32848h;

    public /* synthetic */ C3232u0(int i3) {
        this.f32848h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f32848h) {
            case 0:
                com.kiptv.core.model.XtreamVODStream it = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return java.lang.Integer.valueOf(it.f20725d);
            default:
                com.kiptv.core.model.XtreamVODStream it2 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return it2.f20723b;
        }
    }
}
