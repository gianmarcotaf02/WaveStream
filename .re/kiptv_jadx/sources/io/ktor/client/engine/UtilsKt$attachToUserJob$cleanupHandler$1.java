package io.ktor.client.engine;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class UtilsKt$attachToUserJob$cleanupHandler$1 implements p194x6.j {
    final /* synthetic */ S7.InterfaceC0891h0 $callJob;

    public UtilsKt$attachToUserJob$cleanupHandler$1(S7.InterfaceC0891h0 interfaceC0891h0) {
        this.$callJob = interfaceC0891h0;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((java.lang.Throwable) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(java.lang.Throwable th) {
        if (th == null) {
            return;
        }
        this.$callJob.e(new java.util.concurrent.CancellationException(th.getMessage()));
    }
}
