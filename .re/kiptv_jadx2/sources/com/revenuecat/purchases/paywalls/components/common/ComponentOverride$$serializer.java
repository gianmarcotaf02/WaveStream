package com.revenuecat.purchases.paywalls.components.common;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.PartialComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.c;
import p143q8.a;
import p143q8.b;
import p153r8.C2690c0;
import p153r8.D;
import p153r8.k0;

@Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/ComponentOverride.$serializer", "T", "Lr8/D;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "(Lkotlinx/serialization/KSerializer;)V", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;)V", "typeParametersSerializers", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@c
public final class ComponentOverride$$serializer<T> implements D {
    private final C2690c0 descriptor;
    private final KSerializer typeSerial0;

    private ComponentOverride$$serializer() {
        C2690c0 c2690c0 = new C2690c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", this, 2);
        c2690c0.k("conditions", false);
        c2690c0.k(DiagnosticsEntry.PROPERTIES_KEY, false);
        this.descriptor = c2690c0;
    }

    private final KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override
    public KSerializer[] childSerializers() {
        return new KSerializer[]{ComponentOverride.$childSerializers[0], this.typeSerial0};
    }

    @Override
    public ComponentOverride<T> deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        a aVarC = decoder.c(descriptor);
        KSerializer[] kSerializerArr = ComponentOverride.$childSerializers;
        k0 k0Var = null;
        boolean z6 = true;
        int i3 = 0;
        List list = null;
        PartialComponent partialComponent = null;
        while (z6) {
            int iS = aVarC.s(descriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                list = (List) aVarC.x(descriptor, 0, kSerializerArr[0], list);
                i3 |= 1;
            } else {
                if (iS != 1) {
                    throw new p119n8.m(iS);
                }
                partialComponent = (PartialComponent) aVarC.x(descriptor, 1, this.typeSerial0, partialComponent);
                i3 |= 2;
            }
        }
        aVarC.a(descriptor);
        return new ComponentOverride<>(i3, list, partialComponent, k0Var);
    }

    @Override
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(Encoder encoder, ComponentOverride<T> value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        SerialDescriptor descriptor = getDescriptor();
        b bVarC = encoder.c(descriptor);
        ComponentOverride.write$Self$purchases_defaultsRelease(value, bVarC, descriptor, this.typeSerial0);
        bVarC.a(descriptor);
    }

    @Override
    public KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    @c
    public ComponentOverride$$serializer(KSerializer typeSerial0) {
        this();
        m.e(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
