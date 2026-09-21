package io.github.jan.supabase.realtime;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f23307i;
    public final /* synthetic */ io.github.jan.supabase.realtime.RealtimeChannel j;

    public /* synthetic */ c(io.github.jan.supabase.realtime.RealtimeChannel realtimeChannel, long j, int i3) {
        this.f23306h = i3;
        this.j = realtimeChannel;
        this.f23307i = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23306h) {
            case 0:
                return io.github.jan.supabase.realtime.RealtimeChannelImpl.C23201.invokeSuspend$lambda$3(this.j, this.f23307i);
            default:
                return io.github.jan.supabase.realtime.RealtimeChannelImpl.C23221.invokeSuspend$lambda$1((io.github.jan.supabase.realtime.RealtimeChannelImpl) this.j, this.f23307i);
        }
    }
}
