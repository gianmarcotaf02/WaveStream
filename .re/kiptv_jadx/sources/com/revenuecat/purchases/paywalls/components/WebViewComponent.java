package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.h("web_view")
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,+B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBW\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/WebViewComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "", io.sentry.protocol.Request.JsonKeys.URL, "id", "name", "", "visible", "", "protocolVersion", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILcom/revenuecat/purchases/paywalls/components/properties/Size;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ILcom/revenuecat/purchases/paywalls/components/properties/Size;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/WebViewComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "getId", "getName", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "I", "getProtocolVersion", "()I", "getProtocolVersion$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class WebViewComponent implements com.revenuecat.purchases.paywalls.components.PaywallComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.WebViewComponent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.WebViewComponent.Companion(null);
    private final java.lang.String id;
    private final java.lang.String name;
    private final int protocolVersion;
    private final com.revenuecat.purchases.paywalls.components.properties.Size size;
    private final java.lang.String url;
    private final java.lang.Boolean visible;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/WebViewComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/WebViewComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.WebViewComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ WebViewComponent(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, @p119n8.h("protocol_version") int i9, com.revenuecat.purchases.paywalls.components.properties.Size size, p153r8.k0 k0Var) {
        if (51 != (i3 & 51)) {
            p153r8.AbstractC2686a0.l(i3, 51, com.revenuecat.purchases.paywalls.components.WebViewComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url = str;
        this.id = str2;
        if ((i3 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i3 & 8) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        this.protocolVersion = i9;
        this.size = size;
    }

    @p119n8.h("protocol_version")
    public static /* synthetic */ void getProtocolVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.WebViewComponent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.url);
        output.s(serialDesc, 1, self.id);
        if (output.E(serialDesc) || self.name != null) {
            output.t(serialDesc, 2, p153r8.p0.f26988a, self.name);
        }
        if (output.E(serialDesc) || self.visible != null) {
            output.t(serialDesc, 3, p153r8.C2696g.f26961a, self.visible);
        }
        output.n(4, self.protocolVersion, serialDesc);
        output.h(serialDesc, 5, com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE, self.size);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.WebViewComponent)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.WebViewComponent webViewComponent = (com.revenuecat.purchases.paywalls.components.WebViewComponent) obj;
        return kotlin.jvm.internal.m.a(this.url, webViewComponent.url) && kotlin.jvm.internal.m.a(this.id, webViewComponent.id) && kotlin.jvm.internal.m.a(this.name, webViewComponent.name) && kotlin.jvm.internal.m.a(this.visible, webViewComponent.visible) && this.protocolVersion == webViewComponent.protocolVersion && kotlin.jvm.internal.m.a(this.size, webViewComponent.size);
    }

    public final /* synthetic */ java.lang.String getId() {
        return this.id;
    }

    public final /* synthetic */ java.lang.String getName() {
        return this.name;
    }

    public final /* synthetic */ int getProtocolVersion() {
        return this.protocolVersion;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Size getSize() {
        return this.size;
    }

    public final /* synthetic */ java.lang.String getUrl() {
        return this.url;
    }

    public final /* synthetic */ java.lang.Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iA = B2.a.a(this.url.hashCode() * 31, 31, this.id);
        java.lang.String str = this.name;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.visible;
        return this.size.hashCode() + ((((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + this.protocolVersion) * 31);
    }

    public java.lang.String toString() {
        return "WebViewComponent(url=" + this.url + ", id=" + this.id + ", name=" + this.name + ", visible=" + this.visible + ", protocolVersion=" + this.protocolVersion + ", size=" + this.size + ')';
    }

    public WebViewComponent(java.lang.String url, java.lang.String id, java.lang.String str, java.lang.Boolean bool, int i3, com.revenuecat.purchases.paywalls.components.properties.Size size) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(size, "size");
        this.url = url;
        this.id = id;
        this.name = str;
        this.visible = bool;
        this.protocolVersion = i3;
        this.size = size;
    }

    public /* synthetic */ WebViewComponent(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, int i3, com.revenuecat.purchases.paywalls.components.properties.Size size, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, str2, (i9 & 4) != 0 ? null : str3, (i9 & 8) != 0 ? null : bool, i3, size);
    }
}
