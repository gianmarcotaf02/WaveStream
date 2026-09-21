package com.revenuecat.purchases.models;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p143q8.a;
import p143q8.b;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/models/PriceSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/models/Price;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/models/Price;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/models/Price;", "", "FORMATTED_INDEX", "I", "AMOUNT_MICROS_INDEX", "CURRENCY_CODE_INDEX", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PriceSerializer implements KSerializer {
    private static final int AMOUNT_MICROS_INDEX = 1;
    private static final int CURRENCY_CODE_INDEX = 2;
    private static final int FORMATTED_INDEX = 0;
    public static final PriceSerializer INSTANCE = new PriceSerializer();
    private static final SerialDescriptor descriptor = q0.j("Price", new SerialDescriptor[0], PriceSerializer$descriptor$1.INSTANCE);

    private PriceSerializer() {
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public Price deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        a aVarC = decoder.c(descriptor2);
        String strQ = "";
        long jH = 0;
        String strQ2 = "";
        while (true) {
            PriceSerializer priceSerializer = INSTANCE;
            int iS = aVarC.s(priceSerializer.getDescriptor());
            if (iS == -1) {
                Price price = new Price(strQ, jH, strQ2);
                aVarC.a(descriptor2);
                return price;
            }
            if (iS == 0) {
                strQ = aVarC.q(priceSerializer.getDescriptor(), 0);
            } else if (iS == 1) {
                jH = aVarC.h(priceSerializer.getDescriptor(), 1);
            } else {
                if (iS != 2) {
                    throw new IllegalStateException(("Unexpected index: " + iS).toString());
                }
                strQ2 = aVarC.q(priceSerializer.getDescriptor(), 2);
            }
        }
    }

    @Override
    public void serialize(Encoder encoder, Price value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PriceSerializer priceSerializer = INSTANCE;
        bVarC.s(priceSerializer.getDescriptor(), 0, value.getFormatted());
        bVarC.D(priceSerializer.getDescriptor(), 1, value.getAmountMicros());
        bVarC.s(priceSerializer.getDescriptor(), 2, value.getCurrencyCode());
        bVarC.a(descriptor2);
    }
}
