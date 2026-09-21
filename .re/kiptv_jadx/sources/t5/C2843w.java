package t5;

/* JADX INFO: renamed from: t5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2843w implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f28427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f28428i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f28429k;

    public /* synthetic */ C2843w(p194x6.j jVar, java.lang.Object obj, p194x6.j jVar2, int i3) {
        this.f28427h = i3;
        this.f28428i = jVar;
        this.j = obj;
        this.f28429k = jVar2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f28427h) {
            case 0:
                p020c0.I DisposableEffect = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                p194x6.j jVar = this.f28428i;
                java.lang.Object obj2 = this.j;
                jVar.invoke(obj2);
                return new t5.C2841v(this.f28429k, 0, obj2);
            default:
                p020c0.I DisposableEffect2 = (p020c0.I) obj;
                kotlin.jvm.internal.m.e(DisposableEffect2, "$this$DisposableEffect");
                p194x6.j jVar2 = this.f28428i;
                java.lang.Object obj3 = this.j;
                jVar2.invoke(obj3);
                return new t5.C2841v(this.f28429k, 1, obj3);
        }
    }
}
