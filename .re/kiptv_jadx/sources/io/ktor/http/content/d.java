package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23392h;

    public /* synthetic */ d(int i3) {
        this.f23392h = i3;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        switch (this.f23392h) {
            case 0:
                return java.lang.Boolean.valueOf(io.ktor.http.content.CompressedReadChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0(str, str2));
            default:
                return java.lang.Boolean.valueOf(io.ktor.http.content.CompressedWriteChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0(str, str2));
        }
    }
}
