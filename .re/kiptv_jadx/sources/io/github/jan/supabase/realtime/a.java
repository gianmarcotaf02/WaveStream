package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23303i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f23302h = i3;
        this.f23303i = obj;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23302h) {
            case 0:
                return io.github.jan.supabase.realtime.Realtime.Companion.setup$lambda$1((io.github.jan.supabase.realtime.Realtime.Config) this.f23303i, (io.ktor.client.HttpClientConfig) obj);
            case 1:
                return io.github.jan.supabase.realtime.Realtime.Companion.setup$lambda$1$lambda$0((io.github.jan.supabase.realtime.Realtime.Config) this.f23303i, (io.ktor.client.plugins.websocket.WebSockets.Config) obj);
            default:
                return io.github.jan.supabase.realtime.RealtimeChannelImpl.C23221.invokeSuspend$lambda$0((U7.A) this.f23303i, (io.github.jan.supabase.realtime.PresenceAction) obj);
        }
    }
}
