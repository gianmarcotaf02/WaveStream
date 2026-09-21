package com.revenuecat.purchases.customercenter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.$serializer", "Lr8/D;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public final class CustomerCenterConfigData$$serializer implements p153r8.D {
    public static final com.revenuecat.purchases.customercenter.CustomerCenterConfigData$$serializer INSTANCE;
    private static final /* synthetic */ p153r8.C2690c0 descriptor;

    static {
        com.revenuecat.purchases.customercenter.CustomerCenterConfigData$$serializer customerCenterConfigData$$serializer = new com.revenuecat.purchases.customercenter.CustomerCenterConfigData$$serializer();
        INSTANCE = customerCenterConfigData$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData", customerCenterConfigData$$serializer, 5);
        c2690c0.k("screens", false);
        c2690c0.k("appearance", false);
        c2690c0.k("localization", false);
        c2690c0.k("support", false);
        c2690c0.k("last_published_app_version", true);
        descriptor = c2690c0;
    }

    private CustomerCenterConfigData$$serializer() {
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] childSerializers() {
        return new kotlinx.serialization.KSerializer[]{com.revenuecat.purchases.customercenter.ScreenMapSerializer.INSTANCE, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$$serializer.INSTANCE, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$$serializer.INSTANCE, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$$serializer.INSTANCE, com.google.android.gms.internal.play_billing.V0.s(com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.customercenter.CustomerCenterConfigData deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.a aVarC = decoder.c(descriptor2);
        int i3 = 0;
        java.util.Map map = null;
        com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance appearance = null;
        com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization localization = null;
        com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support support = null;
        java.lang.String str = null;
        boolean z6 = true;
        while (z6) {
            int iS = aVarC.s(descriptor2);
            if (iS == -1) {
                z6 = false;
            } else if (iS == 0) {
                map = (java.util.Map) aVarC.x(descriptor2, 0, com.revenuecat.purchases.customercenter.ScreenMapSerializer.INSTANCE, map);
                i3 |= 1;
            } else if (iS == 1) {
                appearance = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance) aVarC.x(descriptor2, 1, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance$$serializer.INSTANCE, appearance);
                i3 |= 2;
            } else if (iS == 2) {
                localization = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization) aVarC.x(descriptor2, 2, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization$$serializer.INSTANCE, localization);
                i3 |= 4;
            } else if (iS == 3) {
                support = (com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support) aVarC.x(descriptor2, 3, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$$serializer.INSTANCE, support);
                i3 |= 8;
            } else {
                if (iS != 4) {
                    throw new p119n8.m(iS);
                }
                str = (java.lang.String) aVarC.u(descriptor2, 4, com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer.INSTANCE, str);
                i3 |= 16;
            }
        }
        aVarC.a(descriptor2);
        return new com.revenuecat.purchases.customercenter.CustomerCenterConfigData(i3, map, appearance, localization, support, str, (p153r8.k0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.customercenter.CustomerCenterConfigData value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor2);
        com.revenuecat.purchases.customercenter.CustomerCenterConfigData.write$Self$purchases_defaultsRelease(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override // p153r8.D
    public kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
