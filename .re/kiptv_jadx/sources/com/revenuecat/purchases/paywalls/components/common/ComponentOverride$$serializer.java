package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0017\b\u0017\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068BXÂ\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/ComponentOverride.$serializer", "T", "Lr8/D;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "(Lkotlinx/serialization/KSerializer;)V", "", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;)V", "typeParametersSerializers", "getTypeSerial0", "()Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public final class ComponentOverride$$serializer<T> implements p153r8.D {
    private final /* synthetic */ p153r8.C2690c0 descriptor;
    private final /* synthetic */ kotlinx.serialization.KSerializer typeSerial0;

    private ComponentOverride$$serializer() {
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.revenuecat.purchases.paywalls.components.common.ComponentOverride", this, 2);
        c2690c0.k("conditions", false);
        c2690c0.k(com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.PROPERTIES_KEY, false);
        this.descriptor = c2690c0;
    }

    private final kotlinx.serialization.KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.revenuecat.purchases.paywalls.components.common.ComponentOverride.$childSerializers[0], this.typeSerial0};
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.paywalls.components.common.ComponentOverride<T> deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        p143q8.a aVarC = decoder.c(descriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = com.revenuecat.purchases.paywalls.components.common.ComponentOverride.$childSerializers;
        p153r8.k0 k0Var = null;
        boolean z6 = true;
        int i3 = 0;
        java.util.List list = null;
        com.revenuecat.purchases.paywalls.components.PartialComponent partialComponent = null;
        while (z6) {
            int iS = aVarC.s(descriptor);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                list = (java.util.List) aVarC.x(descriptor, 0, kSerializerArr[0], list);
                i3 |= 1;
            } else {
                if (iS != 1) {
                    throw new p119n8.m(iS);
                }
                partialComponent = (com.revenuecat.purchases.paywalls.components.PartialComponent) aVarC.x(descriptor, 1, this.typeSerial0, partialComponent);
                i3 |= 2;
            }
        }
        aVarC.a(descriptor);
        return new com.revenuecat.purchases.paywalls.components.common.ComponentOverride<>(i3, list, partialComponent, k0Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.paywalls.components.common.ComponentOverride<T> value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor);
        com.revenuecat.purchases.paywalls.components.common.ComponentOverride.write$Self$purchases_defaultsRelease(value, bVarC, descriptor, this.typeSerial0);
        bVarC.a(descriptor);
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return new kotlinx.serialization.KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @p070h6.c
    public /* synthetic */ ComponentOverride$$serializer(kotlinx.serialization.KSerializer typeSerial0) {
        this();
        kotlin.jvm.internal.m.e(typeSerial0, "typeSerial0");
        this.typeSerial0 = typeSerial0;
    }
}
