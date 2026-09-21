package io.ktor.client.plugins;

import S7.j0;
import io.ktor.client.plugins.internal.ByteChannelReplay;
import kotlin.jvm.functions.Function0;

public final class b implements Function0 {

    public final int f23340h;

    public final Object f23341i;

    public b(int i3, Object obj) {
        this.f23340h = i3;
        this.f23341i = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f23340h) {
            case 0:
                return DefaultTransformKt.AnonymousClass2.invokeSuspend$lambda$1$lambda$0((j0) this.f23341i);
            default:
                return ((ByteChannelReplay) this.f23341i).replay();
        }
    }
}
