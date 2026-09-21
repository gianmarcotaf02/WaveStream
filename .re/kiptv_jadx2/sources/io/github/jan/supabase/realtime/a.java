package io.github.jan.supabase.realtime;

import U7.A;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.websocket.WebSockets;
import p194x6.j;

public final class a implements j {

    public final int f23302h;

    public final Object f23303i;

    public a(int i3, Object obj) {
        this.f23302h = i3;
        this.f23303i = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23302h) {
            case 0:
                return Realtime.Companion.setup$lambda$1((Realtime.Config) this.f23303i, (HttpClientConfig) obj);
            case 1:
                return Realtime.Companion.setup$lambda$1$lambda$0((Realtime.Config) this.f23303i, (WebSockets.Config) obj);
            default:
                return RealtimeChannelImpl.C23221.invokeSuspend$lambda$0((A) this.f23303i, (PresenceAction) obj);
        }
    }
}
