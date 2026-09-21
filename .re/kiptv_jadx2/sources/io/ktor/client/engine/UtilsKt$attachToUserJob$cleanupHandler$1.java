package io.ktor.client.engine;

import S7.InterfaceC0891h0;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p070h6.A;
import p194x6.j;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class UtilsKt$attachToUserJob$cleanupHandler$1 implements j {
    final InterfaceC0891h0 $callJob;

    public UtilsKt$attachToUserJob$cleanupHandler$1(InterfaceC0891h0 interfaceC0891h0) {
        this.$callJob = interfaceC0891h0;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((Throwable) obj);
        return A.f22523a;
    }

    public final void invoke(Throwable th) {
        if (th == null) {
            return;
        }
        this.$callJob.e(new CancellationException(th.getMessage()));
    }
}
