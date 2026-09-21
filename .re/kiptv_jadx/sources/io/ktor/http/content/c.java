package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23391i;

    public /* synthetic */ c(int i3, java.lang.Object obj) {
        this.f23390h = i3;
        this.f23391i = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23390h) {
            case 0:
                return io.ktor.http.content.CompressedReadChannelResponse.headers_delegate$lambda$2((io.ktor.http.content.CompressedReadChannelResponse) this.f23391i);
            case 1:
                return io.ktor.http.content.CompressedWriteChannelResponse.headers_delegate$lambda$2((io.ktor.http.content.CompressedWriteChannelResponse) this.f23391i);
            default:
                return io.ktor.http.content.MultipartJvmKt._get_streamProvider_$lambda$0((io.ktor.http.content.PartData.FileItem) this.f23391i);
        }
    }
}
