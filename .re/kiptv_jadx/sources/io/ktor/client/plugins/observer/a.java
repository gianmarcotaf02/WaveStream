package io.ktor.client.plugins.observer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.ByteReadChannel f23361i;

    public /* synthetic */ a(io.ktor.utils.io.ByteReadChannel byteReadChannel, int i3) {
        this.f23360h = i3;
        this.f23361i = byteReadChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23360h) {
            case 0:
                return io.ktor.client.plugins.observer.DelegatedCall._init_$lambda$0(this.f23361i);
            default:
                return io.ktor.client.plugins.observer.DelegatedResponse._init_$lambda$0(this.f23361i);
        }
    }
}
