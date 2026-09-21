package io.ktor.client.plugins;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23341i;

    public /* synthetic */ b(int i3, java.lang.Object obj) {
        this.f23340h = i3;
        this.f23341i = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23340h) {
            case 0:
                return io.ktor.client.plugins.DefaultTransformKt.AnonymousClass2.invokeSuspend$lambda$1$lambda$0((S7.j0) this.f23341i);
            default:
                return ((io.ktor.client.plugins.internal.ByteChannelReplay) this.f23341i).replay();
        }
    }
}
