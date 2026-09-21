package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "url_lid", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", io.sentry.protocol.Request.JsonKeys.METHOD, "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUrl_lid-z7Tp-4o", "()Ljava/lang/String;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getMethod", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
final class UrlSurrogate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.UrlSurrogate.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.UrlSurrogate.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod method;
    private final java.lang.String url_lid;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/UrlSurrogate;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.UrlSurrogate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ UrlSurrogate(int i3, java.lang.String str, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, p153r8.k0 k0Var, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(i3, str, urlMethod, k0Var);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.UrlSurrogate self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE, com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m257boximpl(self.url_lid));
        output.h(serialDesc, 1, com.revenuecat.purchases.paywalls.components.UrlMethodDeserializer.INSTANCE, self.method);
    }

    public final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: getUrl_lid-z7Tp-4o, reason: not valid java name and from getter */
    public final java.lang.String getUrl_lid() {
        return this.url_lid;
    }

    public /* synthetic */ UrlSurrogate(java.lang.String str, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, urlMethod);
    }

    private UrlSurrogate(int i3, java.lang.String str, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.UrlSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url_lid = str;
        this.method = urlMethod;
    }

    private UrlSurrogate(java.lang.String url_lid, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod method) {
        kotlin.jvm.internal.m.e(url_lid, "url_lid");
        kotlin.jvm.internal.m.e(method, "method");
        this.url_lid = url_lid;
        this.method = method;
    }
}
