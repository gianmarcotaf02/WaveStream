package io.ktor.http.content;

import p194x6.m;

public final class d implements m {

    public final int f23392h;

    public d(int i3) {
        this.f23392h = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        switch (this.f23392h) {
            case 0:
                return Boolean.valueOf(CompressedReadChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0(str, str2));
            default:
                return Boolean.valueOf(CompressedWriteChannelResponse.headers_delegate$lambda$2$lambda$1$lambda$0(str, str2));
        }
    }
}
