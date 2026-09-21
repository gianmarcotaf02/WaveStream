package com.revenuecat.purchases.paywalls.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\"R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/paywalls/events/PaywallEventDataSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent$Data;", "", "PAYWALL_IDENTIFIER_INDEX", "I", "PRESENTED_OFFERING_CONTEXT_INDEX", "PAYWALL_REVISION_INDEX", "SESSION_IDENTIFIER_INDEX", "DISPLAY_MODE_INDEX", "LOCALE_IDENTIFIER_INDEX", "DARK_MODE_INDEX", "EXIT_OFFER_TYPE_INDEX", "EXIT_OFFERING_IDENTIFIER_INDEX", "PACKAGE_IDENTIFIER_INDEX", "PRODUCT_IDENTIFIER_INDEX", "ERROR_CODE_INDEX", "ERROR_MESSAGE_INDEX", "WORKFLOW_ID_INDEX", "STEP_ID_INDEX", "", "nullableStringSerializer", "Lkotlinx/serialization/KSerializer;", "nullableIntSerializer", "Lcom/revenuecat/purchases/paywalls/events/ExitOfferType;", "nullableExitOfferTypeSerializer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PaywallEventDataSerializer implements kotlinx.serialization.KSerializer {
    private static final int DARK_MODE_INDEX = 6;
    private static final int DISPLAY_MODE_INDEX = 4;
    private static final int ERROR_CODE_INDEX = 11;
    private static final int ERROR_MESSAGE_INDEX = 12;
    private static final int EXIT_OFFERING_IDENTIFIER_INDEX = 8;
    private static final int EXIT_OFFER_TYPE_INDEX = 7;
    private static final int LOCALE_IDENTIFIER_INDEX = 5;
    private static final int PACKAGE_IDENTIFIER_INDEX = 9;
    private static final int PAYWALL_IDENTIFIER_INDEX = 0;
    private static final int PAYWALL_REVISION_INDEX = 2;
    private static final int PRESENTED_OFFERING_CONTEXT_INDEX = 1;
    private static final int PRODUCT_IDENTIFIER_INDEX = 10;
    private static final int SESSION_IDENTIFIER_INDEX = 3;
    private static final int STEP_ID_INDEX = 15;
    private static final int WORKFLOW_ID_INDEX = 14;
    public static final com.revenuecat.purchases.paywalls.events.PaywallEventDataSerializer INSTANCE = new com.revenuecat.purchases.paywalls.events.PaywallEventDataSerializer();
    private static final kotlinx.serialization.KSerializer nullableStringSerializer = com.google.android.gms.internal.play_billing.V0.s(p153r8.p0.f26988a);
    private static final kotlinx.serialization.KSerializer nullableIntSerializer = com.google.android.gms.internal.play_billing.V0.s(p153r8.K.f26915a);
    private static final kotlinx.serialization.KSerializer nullableExitOfferTypeSerializer = com.google.android.gms.internal.play_billing.V0.s(com.revenuecat.purchases.paywalls.events.ExitOfferType.INSTANCE.serializer());
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor = com.google.crypto.tink.shaded.protobuf.q0.j("PaywallEvent.Data", new kotlinx.serialization.descriptors.SerialDescriptor[0], com.revenuecat.purchases.paywalls.events.PaywallEventDataSerializer$descriptor$1.INSTANCE);

    private PaywallEventDataSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public com.revenuecat.purchases.paywalls.events.PaywallEvent.Data deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        com.revenuecat.purchases.PresentedOfferingContext presentedOfferingContext;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        if (!(decoder instanceof p162s8.k)) {
            throw new p119n8.j("PaywallEvent.Data only supports JSON deserialization");
        }
        p162s8.k kVar = (p162s8.k) decoder;
        kotlinx.serialization.json.c cVarI = p162s8.l.i(kVar.i());
        if (cVarI.containsKey("presentedOfferingContext")) {
            p162s8.d dVarT = kVar.t();
            com.revenuecat.purchases.PresentedOfferingContextSerializer presentedOfferingContextSerializer = com.revenuecat.purchases.PresentedOfferingContextSerializer.INSTANCE;
            java.lang.Object obj = cVarI.get("presentedOfferingContext");
            kotlin.jvm.internal.m.b(obj);
            presentedOfferingContext = (com.revenuecat.purchases.PresentedOfferingContext) dVarT.a(presentedOfferingContextSerializer, (kotlinx.serialization.json.b) obj);
        } else {
            if (!cVarI.containsKey("offeringIdentifier")) {
                throw new p119n8.j("Missing offering context information");
            }
            java.lang.Object obj2 = cVarI.get("offeringIdentifier");
            kotlin.jvm.internal.m.b(obj2);
            presentedOfferingContext = new com.revenuecat.purchases.PresentedOfferingContext(p162s8.l.j((kotlinx.serialization.json.b) obj2).d());
        }
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVarI.get("paywallIdentifier");
        java.lang.String str = bVar != null ? (java.lang.String) kVar.t().a(p153r8.p0.f26988a, bVar) : null;
        p162s8.d dVarT2 = kVar.t();
        p153r8.K k9 = p153r8.K.f26915a;
        java.lang.Object obj3 = cVarI.get("paywallRevision");
        kotlin.jvm.internal.m.b(obj3);
        int iIntValue = ((java.lang.Number) dVarT2.a(k9, (kotlinx.serialization.json.b) obj3)).intValue();
        p162s8.d dVarT3 = kVar.t();
        com.revenuecat.purchases.utils.serializers.UUIDSerializer uUIDSerializer = com.revenuecat.purchases.utils.serializers.UUIDSerializer.INSTANCE;
        java.lang.Object obj4 = cVarI.get("sessionIdentifier");
        kotlin.jvm.internal.m.b(obj4);
        java.util.UUID uuid = (java.util.UUID) dVarT3.a(uUIDSerializer, (kotlinx.serialization.json.b) obj4);
        p162s8.d dVarT4 = kVar.t();
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        java.lang.Object obj5 = cVarI.get("displayMode");
        kotlin.jvm.internal.m.b(obj5);
        java.lang.String str2 = (java.lang.String) dVarT4.a(p0Var, (kotlinx.serialization.json.b) obj5);
        p162s8.d dVarT5 = kVar.t();
        java.lang.Object obj6 = cVarI.get("localeIdentifier");
        kotlin.jvm.internal.m.b(obj6);
        java.lang.String str3 = (java.lang.String) dVarT5.a(p0Var, (kotlinx.serialization.json.b) obj6);
        p162s8.d dVarT6 = kVar.t();
        p153r8.C2696g c2696g = p153r8.C2696g.f26961a;
        java.lang.Object obj7 = cVarI.get("darkMode");
        kotlin.jvm.internal.m.b(obj7);
        boolean zBooleanValue = ((java.lang.Boolean) dVarT6.a(c2696g, (kotlinx.serialization.json.b) obj7)).booleanValue();
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVarI.get("exitOfferType");
        com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType = bVar2 != null ? (com.revenuecat.purchases.paywalls.events.ExitOfferType) kVar.t().a(com.revenuecat.purchases.paywalls.events.ExitOfferType.INSTANCE.serializer(), bVar2) : null;
        kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI.get("exitOfferingIdentifier");
        java.lang.String str4 = bVar3 != null ? (java.lang.String) kVar.t().a(p0Var, bVar3) : null;
        kotlinx.serialization.json.b bVar4 = (kotlinx.serialization.json.b) cVarI.get("packageIdentifier");
        java.lang.String str5 = bVar4 != null ? (java.lang.String) kVar.t().a(p0Var, bVar4) : null;
        kotlinx.serialization.json.b bVar5 = (kotlinx.serialization.json.b) cVarI.get("productIdentifier");
        java.lang.String str6 = bVar5 != null ? (java.lang.String) kVar.t().a(p0Var, bVar5) : null;
        kotlinx.serialization.json.b bVar6 = (kotlinx.serialization.json.b) cVarI.get("errorCode");
        java.lang.Integer numValueOf = bVar6 != null ? java.lang.Integer.valueOf(((java.lang.Number) kVar.t().a(k9, bVar6)).intValue()) : null;
        kotlinx.serialization.json.b bVar7 = (kotlinx.serialization.json.b) cVarI.get("errorMessage");
        java.lang.String str7 = bVar7 != null ? (java.lang.String) kVar.t().a(p0Var, bVar7) : null;
        kotlinx.serialization.json.b bVar8 = (kotlinx.serialization.json.b) cVarI.get("workflowId");
        java.lang.String str8 = bVar8 != null ? (java.lang.String) kVar.t().a(p0Var, bVar8) : null;
        kotlinx.serialization.json.b bVar9 = (kotlinx.serialization.json.b) cVarI.get("stepId");
        return new com.revenuecat.purchases.paywalls.events.PaywallEvent.Data(str, presentedOfferingContext, iIntValue, uuid, str2, str3, zBooleanValue, exitOfferType, str4, str5, str6, numValueOf, str7, str8, bVar9 != null ? (java.lang.String) kVar.t().a(p0Var, bVar9) : null);
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, com.revenuecat.purchases.paywalls.events.PaywallEvent.Data value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor2 = getDescriptor();
        p143q8.b bVarC = encoder.c(descriptor2);
        java.lang.String paywallIdentifier = value.getPaywallIdentifier();
        if (paywallIdentifier != null) {
            bVarC.s(INSTANCE.getDescriptor(), 0, paywallIdentifier);
        }
        com.revenuecat.purchases.paywalls.events.PaywallEventDataSerializer paywallEventDataSerializer = INSTANCE;
        bVarC.h(paywallEventDataSerializer.getDescriptor(), 1, com.revenuecat.purchases.PresentedOfferingContextSerializer.INSTANCE, value.getPresentedOfferingContext());
        bVarC.n(2, value.getPaywallRevision(), paywallEventDataSerializer.getDescriptor());
        bVarC.h(paywallEventDataSerializer.getDescriptor(), 3, com.revenuecat.purchases.utils.serializers.UUIDSerializer.INSTANCE, value.getSessionIdentifier());
        bVarC.s(paywallEventDataSerializer.getDescriptor(), 4, value.getDisplayMode());
        bVarC.s(paywallEventDataSerializer.getDescriptor(), 5, value.getLocaleIdentifier());
        bVarC.q(paywallEventDataSerializer.getDescriptor(), 6, value.getDarkMode());
        com.revenuecat.purchases.paywalls.events.ExitOfferType exitOfferType = value.getExitOfferType();
        if (exitOfferType != null) {
            bVarC.h(paywallEventDataSerializer.getDescriptor(), 7, com.revenuecat.purchases.paywalls.events.ExitOfferType.INSTANCE.serializer(), exitOfferType);
        }
        java.lang.String exitOfferingIdentifier = value.getExitOfferingIdentifier();
        if (exitOfferingIdentifier != null) {
            bVarC.s(paywallEventDataSerializer.getDescriptor(), 8, exitOfferingIdentifier);
        }
        java.lang.String packageIdentifier = value.getPackageIdentifier();
        if (packageIdentifier != null) {
            bVarC.s(paywallEventDataSerializer.getDescriptor(), 9, packageIdentifier);
        }
        java.lang.String productIdentifier = value.getProductIdentifier();
        if (productIdentifier != null) {
            bVarC.s(paywallEventDataSerializer.getDescriptor(), 10, productIdentifier);
        }
        java.lang.Integer errorCode = value.getErrorCode();
        if (errorCode != null) {
            bVarC.n(11, errorCode.intValue(), paywallEventDataSerializer.getDescriptor());
        }
        java.lang.String errorMessage = value.getErrorMessage();
        if (errorMessage != null) {
            bVarC.s(paywallEventDataSerializer.getDescriptor(), 12, errorMessage);
        }
        java.lang.String workflowId = value.getWorkflowId();
        if (workflowId != null) {
            bVarC.s(paywallEventDataSerializer.getDescriptor(), 14, workflowId);
        }
        java.lang.String stepId = value.getStepId();
        if (stepId != null) {
            bVarC.s(paywallEventDataSerializer.getDescriptor(), 15, stepId);
        }
        bVarC.a(descriptor2);
    }
}
