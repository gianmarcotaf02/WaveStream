package io.github.jan.supabase.realtime;

import kotlin.jvm.functions.Function0;

public final class c implements Function0 {

    public final int f23306h;

    public final long f23307i;
    public final RealtimeChannel j;

    public c(RealtimeChannel realtimeChannel, long j, int i3) {
        this.f23306h = i3;
        this.j = realtimeChannel;
        this.f23307i = j;
    }

    @Override
    public final Object invoke() {
        switch (this.f23306h) {
            case 0:
                return RealtimeChannelImpl.C23201.invokeSuspend$lambda$3(this.j, this.f23307i);
            default:
                return RealtimeChannelImpl.C23221.invokeSuspend$lambda$1((RealtimeChannelImpl) this.j, this.f23307i);
        }
    }
}
