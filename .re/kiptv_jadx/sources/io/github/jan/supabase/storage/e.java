package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f23322i;
    public final /* synthetic */ p194x6.j j;

    public /* synthetic */ e(p194x6.j jVar, p194x6.j jVar2, int i3) {
        this.f23321h = i3;
        this.f23322i = jVar;
        this.j = jVar2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23321h) {
            case 0:
                return io.github.jan.supabase.storage.FlowExtensionKt.AnonymousClass2.invokeSuspend$lambda$0(this.f23322i, this.j, (io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 1:
                return io.github.jan.supabase.storage.FlowExtensionKt.AnonymousClass4.invokeSuspend$lambda$0(this.f23322i, this.j, (io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 2:
                return io.github.jan.supabase.storage.FlowExtensionKt.C23382.invokeSuspend$lambda$0(this.f23322i, this.j, (io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 3:
                return io.github.jan.supabase.storage.FlowExtensionKt.C23394.invokeSuspend$lambda$0(this.f23322i, this.j, (io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 4:
                return io.github.jan.supabase.storage.FlowExtensionKt.C23402.invokeSuspend$lambda$0(this.f23322i, this.j, (io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 5:
                return io.github.jan.supabase.storage.FlowExtensionKt.AnonymousClass3.invokeSuspend$lambda$0(this.f23322i, this.j, (io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            default:
                return io.github.jan.supabase.storage.FlowExtensionKt.C23422.invokeSuspend$lambda$0(this.f23322i, this.j, (io.github.jan.supabase.storage.UploadOptionBuilder) obj);
        }
    }
}
