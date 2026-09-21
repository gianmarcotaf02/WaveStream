package com.revenuecat.purchases.utils.serializers;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p135p8.a;
import p153r8.p0;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lp8/a;", "Lh6/A;", "invoke", "(Lp8/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class SealedDeserializerWithDefault$descriptor$1 extends o implements j {
    final SealedDeserializerWithDefault<T> this$0;

    public SealedDeserializerWithDefault$descriptor$1(SealedDeserializerWithDefault<T> sealedDeserializerWithDefault) {
        super(1);
        this.this$0 = sealedDeserializerWithDefault;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((a) obj);
        return A.f22523a;
    }

    public final void invoke(a buildClassSerialDescriptor) {
        m.e(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        buildClassSerialDescriptor.a(((SealedDeserializerWithDefault) this.this$0).typeDiscriminator, p0.f26989b, (12 & 8) == 0);
    }
}
