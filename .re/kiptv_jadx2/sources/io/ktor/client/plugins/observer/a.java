package io.ktor.client.plugins.observer;

import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.functions.Function0;

public final class a implements Function0 {

    public final int f23360h;

    public final ByteReadChannel f23361i;

    public a(ByteReadChannel byteReadChannel, int i3) {
        this.f23360h = i3;
        this.f23361i = byteReadChannel;
    }

    @Override
    public final Object invoke() {
        switch (this.f23360h) {
            case 0:
                return DelegatedCall._init_$lambda$0(this.f23361i);
            default:
                return DelegatedResponse._init_$lambda$0(this.f23361i);
        }
    }
}
