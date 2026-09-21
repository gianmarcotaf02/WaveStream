package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@p119n8.h("purchase_button")
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 &2\u00020\u0001:\u0005'(&)*B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "action", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", io.sentry.protocol.Request.JsonKeys.METHOD, "", "name", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "getAction", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "getMethod", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion", "$serializer", "Action", "CustomUrl", "Method", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PurchaseButtonComponent implements com.revenuecat.purchases.paywalls.components.PaywallComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action action;
    private final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method method;
    private final java.lang.String name;
    private final com.revenuecat.purchases.paywalls.components.StackComponent stack;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "", "(Ljava/lang/String;I)V", "toMethod", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "IN_APP_CHECKOUT", "WEB_CHECKOUT", "WEB_PRODUCT_SELECTION", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.paywalls.components.ActionDeserializer.class)
    public enum Action {
        IN_APP_CHECKOUT,
        WEB_CHECKOUT,
        WEB_PRODUCT_SELECTION;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Action;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.ActionDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action.values().length];
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action.IN_APP_CHECKOUT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action.WEB_CHECKOUT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action.WEB_PRODUCT_SELECTION.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method toMethod() {
            int i3 = com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action.WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i3 == 1) {
                return com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout.INSTANCE;
            }
            int i9 = 3;
            java.lang.Boolean bool = null;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            java.lang.Object[] objArr4 = 0;
            java.lang.Object[] objArr5 = 0;
            if (i3 == 2) {
                return new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout((java.lang.Boolean) (objArr3 == true ? 1 : 0), (com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod) (objArr2 == true ? 1 : 0), i9, (kotlin.jvm.internal.AbstractC2541f) (objArr == true ? 1 : 0));
            }
            if (i3 == 3) {
                return new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection(bool, (com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod) (objArr5 == true ? 1 : 0), i9, (kotlin.jvm.internal.AbstractC2541f) (objArr4 == true ? 1 : 0));
            }
            throw new I3.b();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0018\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J)\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R&\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "urlLid", "", "packageParam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-z7Tp-4o", "()Ljava/lang/String;", "component1", "component2", "copy-26kQY28", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "copy", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlLid-z7Tp-4o", "getUrlLid-z7Tp-4o$annotations", "()V", "getPackageParam", "getPackageParam$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class CustomUrl {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl.Companion(null);
        private final java.lang.String packageParam;
        private final java.lang.String urlLid;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @p070h6.c
        public /* synthetic */ CustomUrl(int i3, @p119n8.h("url_lid") java.lang.String str, @p119n8.h("package_param") java.lang.String str2, p153r8.k0 k0Var, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(i3, str, str2, k0Var);
        }

        /* JADX INFO: renamed from: copy-26kQY28$default, reason: not valid java name */
        public static /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl m209copy26kQY28$default(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = customUrl.urlLid;
            }
            if ((i3 & 2) != 0) {
                str2 = customUrl.packageParam;
            }
            return customUrl.m212copy26kQY28(str, str2);
        }

        @p119n8.h("package_param")
        public static /* synthetic */ void getPackageParam$annotations() {
        }

        @p119n8.h("url_lid")
        /* JADX INFO: renamed from: getUrlLid-z7Tp-4o$annotations, reason: not valid java name */
        public static /* synthetic */ void m210getUrlLidz7Tp4o$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE, com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m257boximpl(self.urlLid));
            if (!output.E(serialDesc) && self.packageParam == null) {
                return;
            }
            output.t(serialDesc, 1, p153r8.p0.f26988a, self.packageParam);
        }

        /* JADX INFO: renamed from: component1-z7Tp-4o, reason: not valid java name and from getter */
        public final java.lang.String getUrlLid() {
            return this.urlLid;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getPackageParam() {
            return this.packageParam;
        }

        /* JADX INFO: renamed from: copy-26kQY28, reason: not valid java name */
        public final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl m212copy26kQY28(java.lang.String urlLid, java.lang.String packageParam) {
            kotlin.jvm.internal.m.e(urlLid, "urlLid");
            return new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl(urlLid, packageParam, null);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl = (com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl) other;
            return com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m260equalsimpl0(this.urlLid, customUrl.urlLid) && kotlin.jvm.internal.m.a(this.packageParam, customUrl.packageParam);
        }

        public final java.lang.String getPackageParam() {
            return this.packageParam;
        }

        /* JADX INFO: renamed from: getUrlLid-z7Tp-4o, reason: not valid java name */
        public final java.lang.String m213getUrlLidz7Tp4o() {
            return this.urlLid;
        }

        public int hashCode() {
            int iM261hashCodeimpl = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m261hashCodeimpl(this.urlLid) * 31;
            java.lang.String str = this.packageParam;
            return iM261hashCodeimpl + (str == null ? 0 : str.hashCode());
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomUrl(urlLid=");
            sb.append((java.lang.Object) com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m262toStringimpl(this.urlLid));
            sb.append(", packageParam=");
            return Y6.f.l(sb, this.packageParam, ')');
        }

        public /* synthetic */ CustomUrl(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, str2);
        }

        private CustomUrl(int i3, java.lang.String str, java.lang.String str2, p153r8.k0 k0Var) {
            if (1 != (i3 & 1)) {
                p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.urlLid = str;
            if ((i3 & 2) == 0) {
                this.packageParam = null;
            } else {
                this.packageParam = str2;
            }
        }

        private CustomUrl(java.lang.String urlLid, java.lang.String str) {
            kotlin.jvm.internal.m.e(urlLid, "urlLid");
            this.urlLid = urlLid;
            this.packageParam = str;
        }

        public /* synthetic */ CustomUrl(java.lang.String str, java.lang.String str2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(str, (i3 & 2) != 0 ? null : str2, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "Companion", "CustomWebCheckout", "InAppCheckout", "Unknown", "WebCheckout", "WebProductSelection", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$InAppCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer.class)
    public interface Method {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Companion.$$INSTANCE;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            static final /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer.INSTANCE;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00100\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001d¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "customUrl", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$CustomUrl;", "getCustomUrl", "getCustomUrl$annotations", "()V", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class CustomWebCheckout implements com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout.Companion(null);
            private final java.lang.Boolean autoDismiss;
            private final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl;
            private final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod openMethod;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$CustomWebCheckout;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @p070h6.c
            public /* synthetic */ CustomWebCheckout(int i3, @p119n8.h("custom_url") com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl, @p119n8.h("auto_dismiss") java.lang.Boolean bool, @p119n8.h("open_method") com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, p153r8.k0 k0Var) {
                if (1 != (i3 & 1)) {
                    p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$CustomWebCheckout$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.customUrl = customUrl;
                if ((i3 & 2) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i3 & 4) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout copy$default(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout customWebCheckout, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    customUrl = customWebCheckout.customUrl;
                }
                if ((i3 & 2) != 0) {
                    bool = customWebCheckout.autoDismiss;
                }
                if ((i3 & 4) != 0) {
                    urlMethod = customWebCheckout.openMethod;
                }
                return customWebCheckout.copy(customUrl, bool, urlMethod);
            }

            @p119n8.h("auto_dismiss")
            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            @p119n8.h("custom_url")
            public static /* synthetic */ void getCustomUrl$annotations() {
            }

            @p119n8.h("open_method")
            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, self.customUrl);
                if (output.E(serialDesc) || self.autoDismiss != null) {
                    output.t(serialDesc, 1, p153r8.C2696g.f26961a, self.autoDismiss);
                }
                if (!output.E(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.components.UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final java.lang.Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout copy(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl, java.lang.Boolean autoDismiss, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod openMethod) {
                kotlin.jvm.internal.m.e(customUrl, "customUrl");
                return new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout(customUrl, autoDismiss, openMethod);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout customWebCheckout = (com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout) other;
                return kotlin.jvm.internal.m.a(this.customUrl, customWebCheckout.customUrl) && kotlin.jvm.internal.m.a(this.autoDismiss, customWebCheckout.autoDismiss) && this.openMethod == customWebCheckout.openMethod;
            }

            public final /* synthetic */ java.lang.Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl getCustomUrl() {
                return this.customUrl;
            }

            public final /* synthetic */ com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                int iHashCode = this.customUrl.hashCode() * 31;
                java.lang.Boolean bool = this.autoDismiss;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode2 + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "CustomWebCheckout(customUrl=" + this.customUrl + ", autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            public CustomWebCheckout(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod) {
                kotlin.jvm.internal.m.e(customUrl, "customUrl");
                this.customUrl = customUrl;
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ CustomWebCheckout(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.CustomUrl customUrl, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this(customUrl, (i3 & 2) != 0 ? null : bool, (i3 & 4) != 0 ? null : urlMethod);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$InAppCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class InAppCheckout implements com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method {
            public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$InAppCheckout$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout", com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.InAppCheckout.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private InAppCheckout() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$Unknown;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class Unknown implements com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method {
            public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown();
            private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown.AnonymousClass1.INSTANCE);

            /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$Unknown$1, reason: invalid class name */
            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
                public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown.AnonymousClass1();

                public AnonymousClass1() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final kotlinx.serialization.KSerializer invoke() {
                    return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown", com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.Unknown.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            }

            private Unknown() {
            }

            private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return get$cachedSerializer();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class WebCheckout implements com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout.Companion(null);
            private final java.lang.Boolean autoDismiss;
            private final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod openMethod;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebCheckout;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$WebCheckout$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public WebCheckout() {
                this((java.lang.Boolean) null, (com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout copy$default(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout webCheckout, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    bool = webCheckout.autoDismiss;
                }
                if ((i3 & 2) != 0) {
                    urlMethod = webCheckout.openMethod;
                }
                return webCheckout.copy(bool, urlMethod);
            }

            @p119n8.h("auto_dismiss")
            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            @p119n8.h("open_method")
            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.autoDismiss != null) {
                    output.t(serialDesc, 0, p153r8.C2696g.f26961a, self.autoDismiss);
                }
                if (!output.E(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.t(serialDesc, 1, com.revenuecat.purchases.paywalls.components.UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout copy(java.lang.Boolean autoDismiss, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod openMethod) {
                return new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout(autoDismiss, openMethod);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout webCheckout = (com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout) other;
                return kotlin.jvm.internal.m.a(this.autoDismiss, webCheckout.autoDismiss) && this.openMethod == webCheckout.openMethod;
            }

            public final /* synthetic */ java.lang.Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                java.lang.Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "WebCheckout(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @p070h6.c
            public /* synthetic */ WebCheckout(int i3, @p119n8.h("auto_dismiss") java.lang.Boolean bool, @p119n8.h("open_method") com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, p153r8.k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i3 & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebCheckout(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ WebCheckout(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : bool, (i3 & 2) != 0 ? null : urlMethod);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u0019¨\u0006."}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method;", "", "autoDismiss", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "openMethod", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "copy", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;)Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getAutoDismiss", "getAutoDismiss$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$UrlMethod;", "getOpenMethod", "getOpenMethod$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final /* data */ class WebProductSelection implements com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection.Companion(null);
            private final java.lang.Boolean autoDismiss;
            private final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod openMethod;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PurchaseButtonComponent$Method$WebProductSelection;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$Method$WebProductSelection$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public WebProductSelection() {
                this((java.lang.Boolean) null, (com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection copy$default(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection webProductSelection, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    bool = webProductSelection.autoDismiss;
                }
                if ((i3 & 2) != 0) {
                    urlMethod = webProductSelection.openMethod;
                }
                return webProductSelection.copy(bool, urlMethod);
            }

            @p119n8.h("auto_dismiss")
            public static /* synthetic */ void getAutoDismiss$annotations() {
            }

            @p119n8.h("open_method")
            public static /* synthetic */ void getOpenMethod$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (output.E(serialDesc) || self.autoDismiss != null) {
                    output.t(serialDesc, 0, p153r8.C2696g.f26961a, self.autoDismiss);
                }
                if (!output.E(serialDesc) && self.openMethod == null) {
                    return;
                }
                output.t(serialDesc, 1, com.revenuecat.purchases.paywalls.components.UrlMethodDeserializer.INSTANCE, self.openMethod);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final java.lang.Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public final com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection copy(java.lang.Boolean autoDismiss, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod openMethod) {
                return new com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection(autoDismiss, openMethod);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection)) {
                    return false;
                }
                com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection webProductSelection = (com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebProductSelection) other;
                return kotlin.jvm.internal.m.a(this.autoDismiss, webProductSelection.autoDismiss) && this.openMethod == webProductSelection.openMethod;
            }

            public final /* synthetic */ java.lang.Boolean getAutoDismiss() {
                return this.autoDismiss;
            }

            public final /* synthetic */ com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod getOpenMethod() {
                return this.openMethod;
            }

            public int hashCode() {
                java.lang.Boolean bool = this.autoDismiss;
                int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod = this.openMethod;
                return iHashCode + (urlMethod != null ? urlMethod.hashCode() : 0);
            }

            public java.lang.String toString() {
                return "WebProductSelection(autoDismiss=" + this.autoDismiss + ", openMethod=" + this.openMethod + ')';
            }

            @p070h6.c
            public /* synthetic */ WebProductSelection(int i3, @p119n8.h("auto_dismiss") java.lang.Boolean bool, @p119n8.h("open_method") com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, p153r8.k0 k0Var) {
                if ((i3 & 1) == 0) {
                    this.autoDismiss = null;
                } else {
                    this.autoDismiss = bool;
                }
                if ((i3 & 2) == 0) {
                    this.openMethod = null;
                } else {
                    this.openMethod = urlMethod;
                }
            }

            public WebProductSelection(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod) {
                this.autoDismiss = bool;
                this.openMethod = urlMethod;
            }

            public /* synthetic */ WebProductSelection(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.ButtonComponent.UrlMethod urlMethod, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this((i3 & 1) != 0 ? null : bool, (i3 & 2) != 0 ? null : urlMethod);
            }
        }
    }

    @p070h6.c
    public /* synthetic */ PurchaseButtonComponent(int i3, com.revenuecat.purchases.paywalls.components.StackComponent stackComponent, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action action, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method method, java.lang.String str, p153r8.k0 k0Var) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stack = stackComponent;
        if ((i3 & 2) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i3 & 4) == 0) {
            this.method = null;
        } else {
            this.method = method;
        }
        if ((i3 & 8) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.StackComponent$$serializer.INSTANCE, self.stack);
        if (output.E(serialDesc) || self.action != null) {
            output.t(serialDesc, 1, com.revenuecat.purchases.paywalls.components.ActionDeserializer.INSTANCE, self.action);
        }
        if (output.E(serialDesc) || self.method != null) {
            output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.components.PurchaseButtonMethodDeserializer.INSTANCE, self.method);
        }
        if (!output.E(serialDesc) && self.name == null) {
            return;
        }
        output.t(serialDesc, 3, p153r8.p0.f26988a, self.name);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent purchaseButtonComponent = (com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent) obj;
        return kotlin.jvm.internal.m.a(this.stack, purchaseButtonComponent.stack) && this.action == purchaseButtonComponent.action && kotlin.jvm.internal.m.a(this.method, purchaseButtonComponent.method) && kotlin.jvm.internal.m.a(this.name, purchaseButtonComponent.name);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action getAction() {
        return this.action;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method getMethod() {
        return this.method;
    }

    public final /* synthetic */ java.lang.String getName() {
        return this.name;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.StackComponent getStack() {
        return this.stack;
    }

    public int hashCode() {
        int iHashCode = this.stack.hashCode() * 31;
        com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action action = this.action;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method method = this.method;
        int iHashCode3 = (iHashCode2 + (method == null ? 0 : method.hashCode())) * 31;
        java.lang.String str = this.name;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PurchaseButtonComponent(stack=");
        sb.append(this.stack);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", name=");
        return Y6.f.l(sb, this.name, ')');
    }

    public PurchaseButtonComponent(com.revenuecat.purchases.paywalls.components.StackComponent stack, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action action, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method method, java.lang.String str) {
        kotlin.jvm.internal.m.e(stack, "stack");
        this.stack = stack;
        this.action = action;
        this.method = method;
        this.name = str;
    }

    public /* synthetic */ PurchaseButtonComponent(com.revenuecat.purchases.paywalls.components.StackComponent stackComponent, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Action action, com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method method, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(stackComponent, (i3 & 2) != 0 ? null : action, (i3 & 4) != 0 ? null : method, (i3 & 8) != 0 ? null : str);
    }
}
