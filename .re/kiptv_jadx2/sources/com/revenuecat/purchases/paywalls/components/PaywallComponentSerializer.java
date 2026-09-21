package com.revenuecat.purchases.paywalls.components;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import com.google.crypto.tink.shaded.protobuf.q0;
import io.sentry.protocol.SentryStackFrame;
import kotlin.Metadata;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import p119n8.j;
import p121o0.p;
import p162s8.d;
import p162s8.k;
import p162s8.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponentSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PaywallComponentSerializer implements KSerializer {
    private final SerialDescriptor descriptor = q0.j("PaywallComponent", new SerialDescriptor[0], PaywallComponentSerializer$descriptor$1.INSTANCE);

    @Override
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override
    public void serialize(Encoder encoder, PaywallComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
    }

    @Override
    public PaywallComponent deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        k kVar = decoder instanceof k ? (k) decoder : null;
        if (kVar == null) {
            throw new j(M0.p(B.f24540a, decoder.getClass(), new StringBuilder("Can only deserialize PaywallComponent from JSON, got: ")));
        }
        c cVarI = l.i(kVar.i());
        b bVar = (b) cVarI.get("type");
        String strD = bVar != null ? l.j(bVar).d() : null;
        if (strD != null) {
            switch (strD.hashCode()) {
                case -2076650431:
                    if (strD.equals("timeline")) {
                        d dVarT = kVar.t();
                        dVarT.getClass();
                        return (PaywallComponent) dVarT.a(TimelineComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1896978765:
                    if (strD.equals("tab_control")) {
                        d dVarT2 = kVar.t();
                        dVarT2.getClass();
                        return (PaywallComponent) dVarT2.a(TabControlComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1822017359:
                    if (strD.equals("sticky_footer")) {
                        d dVarT3 = kVar.t();
                        dVarT3.getClass();
                        return (PaywallComponent) dVarT3.a(StickyFooterComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1391809488:
                    if (strD.equals("purchase_button")) {
                        d dVarT4 = kVar.t();
                        dVarT4.getClass();
                        return (PaywallComponent) dVarT4.a(PurchaseButtonComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1377687758:
                    if (strD.equals("button")) {
                        d dVarT5 = kVar.t();
                        dVarT5.getClass();
                        return (PaywallComponent) dVarT5.a(ButtonComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -1221270899:
                    if (strD.equals("header")) {
                        d dVarT6 = kVar.t();
                        dVarT6.getClass();
                        return (PaywallComponent) dVarT6.a(HeaderComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -807062458:
                    if (strD.equals(SentryStackFrame.JsonKeys.PACKAGE)) {
                        d dVarT7 = kVar.t();
                        dVarT7.getClass();
                        return (PaywallComponent) dVarT7.a(PackageComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case -364374390:
                    if (strD.equals("fallback_header")) {
                        return FallbackHeaderComponent.INSTANCE;
                    }
                    break;
                case 2908512:
                    if (strD.equals("carousel")) {
                        d dVarT8 = kVar.t();
                        dVarT8.getClass();
                        return (PaywallComponent) dVarT8.a(CarouselComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 3226745:
                    if (strD.equals("icon")) {
                        d dVarT9 = kVar.t();
                        dVarT9.getClass();
                        return (PaywallComponent) dVarT9.a(IconComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 3552126:
                    if (strD.equals("tabs")) {
                        d dVarT10 = kVar.t();
                        dVarT10.getClass();
                        return (PaywallComponent) dVarT10.a(TabsComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 3556653:
                    if (strD.equals("text")) {
                        d dVarT11 = kVar.t();
                        dVarT11.getClass();
                        return (PaywallComponent) dVarT11.a(TextComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 100313435:
                    if (strD.equals("image")) {
                        d dVarT12 = kVar.t();
                        dVarT12.getClass();
                        return (PaywallComponent) dVarT12.a(ImageComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 109757064:
                    if (strD.equals("stack")) {
                        d dVarT13 = kVar.t();
                        dVarT13.getClass();
                        return (PaywallComponent) dVarT13.a(StackComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 112202875:
                    if (strD.equals("video")) {
                        d dVarT14 = kVar.t();
                        dVarT14.getClass();
                        return (PaywallComponent) dVarT14.a(VideoComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 318201406:
                    if (strD.equals("tab_control_button")) {
                        d dVarT15 = kVar.t();
                        dVarT15.getClass();
                        return (PaywallComponent) dVarT15.a(TabControlButtonComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 827585120:
                    if (strD.equals("tab_control_toggle")) {
                        d dVarT16 = kVar.t();
                        dVarT16.getClass();
                        return (PaywallComponent) dVarT16.a(TabControlToggleComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
                case 1352226353:
                    if (strD.equals("countdown")) {
                        d dVarT17 = kVar.t();
                        dVarT17.getClass();
                        return (PaywallComponent) dVarT17.a(CountdownComponent.INSTANCE.serializer(), cVarI);
                    }
                    break;
            }
        }
        b bVar2 = (b) cVarI.get("fallback");
        if (bVar2 != null) {
            c cVar = bVar2 instanceof c ? (c) bVar2 : null;
            if (cVar != null) {
                d dVarT18 = kVar.t();
                dVarT18.getClass();
                PaywallComponent paywallComponent = (PaywallComponent) dVarT18.a(PaywallComponent.INSTANCE.serializer(), cVar);
                if (paywallComponent != null) {
                    return paywallComponent;
                }
            }
        }
        throw new j(p.C("No fallback provided for unknown type: ", strD));
    }
}
