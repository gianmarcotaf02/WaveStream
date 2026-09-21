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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/models/RecurrenceMode;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/models/RecurrenceMode;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RecurrenceModeSerializer implements KSerializer {
    public static final RecurrenceModeSerializer INSTANCE = new RecurrenceModeSerializer();
    private static final SerialDescriptor descriptor = q0.j("RecurrenceMode", new SerialDescriptor[0], RecurrenceModeSerializer$descriptor$1.INSTANCE);

    private RecurrenceModeSerializer() {
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public RecurrenceMode deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        a aVarC = decoder.c(descriptor2);
        String strQ = "";
        while (true) {
            RecurrenceModeSerializer recurrenceModeSerializer = INSTANCE;
            int iS = aVarC.s(recurrenceModeSerializer.getDescriptor());
            if (iS == -1) {
                RecurrenceMode recurrenceModeValueOf = RecurrenceMode.valueOf(strQ);
                aVarC.a(descriptor2);
                return recurrenceModeValueOf;
            }
            if (iS != 0) {
                throw new IllegalStateException(("Unexpected index: " + iS).toString());
            }
            strQ = aVarC.q(recurrenceModeSerializer.getDescriptor(), 0);
        }
    }

    @Override
    public void serialize(Encoder encoder, RecurrenceMode value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        bVarC.s(INSTANCE.getDescriptor(), 0, value.name());
        bVarC.a(descriptor2);
    }
}
