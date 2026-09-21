package io.ktor.http.content;

import kotlin.jvm.functions.Function0;

public final class c implements Function0 {

    public final int f23390h;

    public final Object f23391i;

    public c(int i3, Object obj) {
        this.f23390h = i3;
        this.f23391i = obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f23390h) {
            case 0:
                return CompressedReadChannelResponse.headers_delegate$lambda$2((CompressedReadChannelResponse) this.f23391i);
            case 1:
                return CompressedWriteChannelResponse.headers_delegate$lambda$2((CompressedWriteChannelResponse) this.f23391i);
            default:
                return MultipartJvmKt._get_streamProvider_$lambda$0((PartData.FileItem) this.f23391i);
        }
    }
}
