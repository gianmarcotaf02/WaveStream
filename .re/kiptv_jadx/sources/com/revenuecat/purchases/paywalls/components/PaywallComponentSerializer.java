package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PaywallComponentSerializer implements kotlinx.serialization.KSerializer {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.j("PaywallComponent", new kotlinx.serialization.descriptors.SerialDescriptor[0], com.revenuecat.purchases.paywalls.components.PaywallComponentSerializer$descriptor$1.INSTANCE);

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.paywalls.components.PaywallComponent value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.paywalls.components.PaywallComponent deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar = decoder instanceof p162s8.k ? (p162s8.k) decoder : null;
        if (kVar == null) {
            throw new p119n8.j(com.google.android.gms.internal.play_billing.M0.p(kotlin.jvm.internal.B.f24540a, decoder.getClass(), new java.lang.StringBuilder("Can only deserialize PaywallComponent from JSON, got: ")));
        }
        kotlinx.serialization.json.c cVarI = p162s8.l.i(kVar.i());
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVarI.get("type");
        java.lang.String strD = bVar != null ? p162s8.l.j(bVar).d() : null;
        if (strD != null) {
            switch (strD.hashCode()) {
                case -2076650431:
                    if (strD.equals("timeline")) {
                        p162s8.d dVarT = kVar.t();
                        dVarT.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT.a(com.revenuecat.purchases.paywalls.components.TimelineComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1896978765:
                    if (strD.equals("tab_control")) {
                        p162s8.d dVarT2 = kVar.t();
                        dVarT2.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT2.a(com.revenuecat.purchases.paywalls.components.TabControlComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1822017359:
                    if (strD.equals("sticky_footer")) {
                        p162s8.d dVarT3 = kVar.t();
                        dVarT3.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT3.a(com.revenuecat.purchases.paywalls.components.StickyFooterComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1391809488:
                    if (strD.equals("purchase_button")) {
                        p162s8.d dVarT4 = kVar.t();
                        dVarT4.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT4.a(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1377687758:
                    if (strD.equals("button")) {
                        p162s8.d dVarT5 = kVar.t();
                        dVarT5.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT5.a(com.revenuecat.purchases.paywalls.components.ButtonComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1221270899:
                    if (strD.equals("header")) {
                        p162s8.d dVarT6 = kVar.t();
                        dVarT6.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT6.a(com.revenuecat.purchases.paywalls.components.HeaderComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -807062458:
                    if (strD.equals(io.sentry.protocol.SentryStackFrame.JsonKeys.PACKAGE)) {
                        p162s8.d dVarT7 = kVar.t();
                        dVarT7.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT7.a(com.revenuecat.purchases.paywalls.components.PackageComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -364374390:
                    if (strD.equals("fallback_header")) {
                        return com.revenuecat.purchases.paywalls.components.FallbackHeaderComponent.INSTANCE;
                    }
                    break;
                case 2908512:
                    if (strD.equals("carousel")) {
                        p162s8.d dVarT8 = kVar.t();
                        dVarT8.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT8.a(com.revenuecat.purchases.paywalls.components.CarouselComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 3226745:
                    if (strD.equals("icon")) {
                        p162s8.d dVarT9 = kVar.t();
                        dVarT9.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT9.a(com.revenuecat.purchases.paywalls.components.IconComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 3552126:
                    if (strD.equals("tabs")) {
                        p162s8.d dVarT10 = kVar.t();
                        dVarT10.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT10.a(com.revenuecat.purchases.paywalls.components.TabsComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 3556653:
                    if (strD.equals("text")) {
                        p162s8.d dVarT11 = kVar.t();
                        dVarT11.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT11.a(com.revenuecat.purchases.paywalls.components.TextComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 100313435:
                    if (strD.equals("image")) {
                        p162s8.d dVarT12 = kVar.t();
                        dVarT12.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT12.a(com.revenuecat.purchases.paywalls.components.ImageComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 109757064:
                    if (strD.equals("stack")) {
                        p162s8.d dVarT13 = kVar.t();
                        dVarT13.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT13.a(com.revenuecat.purchases.paywalls.components.StackComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 112202875:
                    if (strD.equals("video")) {
                        p162s8.d dVarT14 = kVar.t();
                        dVarT14.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT14.a(com.revenuecat.purchases.paywalls.components.VideoComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 318201406:
                    if (strD.equals("tab_control_button")) {
                        p162s8.d dVarT15 = kVar.t();
                        dVarT15.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT15.a(com.revenuecat.purchases.paywalls.components.TabControlButtonComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 827585120:
                    if (strD.equals("tab_control_toggle")) {
                        p162s8.d dVarT16 = kVar.t();
                        dVarT16.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT16.a(com.revenuecat.purchases.paywalls.components.TabControlToggleComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 1352226353:
                    if (strD.equals("countdown")) {
                        p162s8.d dVarT17 = kVar.t();
                        dVarT17.getClass();
                        return (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT17.a(com.revenuecat.purchases.paywalls.components.CountdownComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
            }
        }
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVarI.get("fallback");
        if (bVar2 != null) {
            kotlinx.serialization.json.c cVar = bVar2 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar2 : null;
            if (cVar != null) {
                p162s8.d dVarT18 = kVar.t();
                dVarT18.getClass();
                com.revenuecat.purchases.paywalls.components.PaywallComponent paywallComponent = (com.revenuecat.purchases.paywalls.components.PaywallComponent) dVarT18.a(com.revenuecat.purchases.paywalls.components.PaywallComponent.INSTANCE.serializer(), cVar);
                if (paywallComponent != null) {
                    return paywallComponent;
                }
            }
        }
        throw new p119n8.j(p121o0.p.C("No fallback provided for unknown type: ", strD));
    }
}
