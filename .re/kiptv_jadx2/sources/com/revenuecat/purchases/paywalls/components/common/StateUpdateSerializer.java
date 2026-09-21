package com.revenuecat.purchases.paywalls.components.common;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;
import p070h6.j;
import p162s8.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/StateUpdateSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/common/StateUpdate;)V", "", "KEY_SET", "Ljava/lang/String;", "KEY_TO", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StateUpdateSerializer implements KSerializer {
    private static final String KEY_SET = "set";
    private static final String KEY_TO = "to";
    public static final StateUpdateSerializer INSTANCE = new StateUpdateSerializer();
    private static final SerialDescriptor descriptor = c.Companion.serializer().getDescriptor();

    private StateUpdateSerializer() {
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override
    public StateUpdate deserialize(Decoder decoder) {
        String strD;
        m.e(decoder, "decoder");
        k kVar = decoder instanceof k ? (k) decoder : null;
        if (kVar == null) {
            return StateUpdate.Unsupported.INSTANCE;
        }
        b bVarI = kVar.i();
        c cVar = bVarI instanceof c ? (c) bVarI : null;
        if (cVar == null) {
            return StateUpdate.Unsupported.INSTANCE;
        }
        Object obj = cVar.get(KEY_SET);
        d dVar = obj instanceof d ? (d) obj : null;
        if (dVar != null) {
            if (!dVar.e()) {
                dVar = null;
            }
            if (dVar != null && (strD = dVar.d()) != null) {
                Object obj2 = cVar.get(KEY_TO);
                d dVar2 = obj2 instanceof d ? (d) obj2 : null;
                if (dVar2 == null) {
                    return StateUpdate.Unsupported.INSTANCE;
                }
                return new StateUpdate.Set(strD, (dVar2.e() && m.a(dVar2.d(), "$value")) ? StateUpdateValue.PayloadReference.INSTANCE : new StateUpdateValue.Literal(dVar2));
            }
        }
        return StateUpdate.Unsupported.INSTANCE;
    }

    @Override
    public void serialize(Encoder encoder, StateUpdate value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new j("Serialization is not implemented because it is not needed.");
    }
}
