package io.github.jan.supabase.storage;

import p194x6.j;

public final class e implements j {

    public final int f23321h;

    public final j f23322i;
    public final j j;

    public e(j jVar, j jVar2, int i3) {
        this.f23321h = i3;
        this.f23322i = jVar;
        this.j = jVar2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23321h) {
            case 0:
                return FlowExtensionKt.AnonymousClass2.invokeSuspend$lambda$0(this.f23322i, this.j, (DownloadOptionBuilder) obj);
            case 1:
                return FlowExtensionKt.AnonymousClass4.invokeSuspend$lambda$0(this.f23322i, this.j, (DownloadOptionBuilder) obj);
            case 2:
                return FlowExtensionKt.C23382.invokeSuspend$lambda$0(this.f23322i, this.j, (DownloadOptionBuilder) obj);
            case 3:
                return FlowExtensionKt.C23394.invokeSuspend$lambda$0(this.f23322i, this.j, (DownloadOptionBuilder) obj);
            case 4:
                return FlowExtensionKt.C23402.invokeSuspend$lambda$0(this.f23322i, this.j, (UploadOptionBuilder) obj);
            case 5:
                return FlowExtensionKt.AnonymousClass3.invokeSuspend$lambda$0(this.f23322i, this.j, (UploadOptionBuilder) obj);
            default:
                return FlowExtensionKt.C23422.invokeSuspend$lambda$0(this.f23322i, this.j, (UploadOptionBuilder) obj);
        }
    }
}
