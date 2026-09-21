package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "Companion", "Dp", "Percentage", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = com.revenuecat.purchases.paywalls.components.properties.CornerRadiusesSerializer.class)
public interface CornerRadiuses {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.properties.CornerRadiusesSerializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nBC\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0007\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u001dR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u001dR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u0012\u0004\b%\u0010\u001f\u001a\u0004\b$\u0010\u001d¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "topLeading", "topTrailing", "bottomLeading", "bottomTrailing", "<init>", "(DDDD)V", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "(D)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IDDDDLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "copy", "(DDDD)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "D", "getTopLeading", "()D", "getTopLeading$annotations", "()V", "getTopTrailing", "getTopTrailing$annotations", "getBottomLeading", "getBottomLeading$annotations", "getBottomTrailing", "getBottomTrailing$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Dp implements com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp.Companion(null);

        /* JADX INFO: renamed from: default, reason: not valid java name */
        private static final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp f2default;
        private static final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp zero;
        private final double bottomLeading;
        private final double bottomTrailing;
        private final double topLeading;
        private final double topTrailing;

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001R\u0013\u0010\u0003\u001a\u00020\u00048F¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u00020\u00048F¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp$Companion;", "", "()V", "default", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "getDefault", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "zero", "getZero", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp getDefault() {
                return com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp.f2default;
            }

            public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp getZero() {
                return com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp.zero;
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses$Dp$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp dp = new com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp(0.0d, 0.0d, 0.0d, 0.0d);
            zero = dp;
            f2default = dp;
        }

        public Dp(double d4, double d6, double d9, double d10) {
            this.topLeading = d4;
            this.topTrailing = d6;
            this.bottomLeading = d9;
            this.bottomTrailing = d10;
        }

        public static /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp copy$default(com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp dp, double d4, double d6, double d9, double d10, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                d4 = dp.topLeading;
            }
            double d11 = d4;
            if ((i3 & 2) != 0) {
                d6 = dp.topTrailing;
            }
            double d12 = d6;
            if ((i3 & 4) != 0) {
                d9 = dp.bottomLeading;
            }
            return dp.copy(d11, d12, d9, (i3 & 8) != 0 ? dp.bottomTrailing : d10);
        }

        @p119n8.h("bottom_leading")
        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        @p119n8.h("bottom_trailing")
        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        @p119n8.h("top_leading")
        public static /* synthetic */ void getTopLeading$annotations() {
        }

        @p119n8.h("top_trailing")
        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.B(serialDesc, 0, self.topLeading);
            output.B(serialDesc, 1, self.topTrailing);
            output.B(serialDesc, 2, self.bottomLeading);
            output.B(serialDesc, 3, self.bottomTrailing);
        }

        public final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp copy(double topLeading, double topTrailing, double bottomLeading, double bottomTrailing) {
            return new com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp(topLeading, topTrailing, bottomLeading, bottomTrailing);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp dp = (com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp) obj;
            return java.lang.Double.compare(this.topLeading, dp.topLeading) == 0 && java.lang.Double.compare(this.topTrailing, dp.topTrailing) == 0 && java.lang.Double.compare(this.bottomLeading, dp.bottomLeading) == 0 && java.lang.Double.compare(this.bottomTrailing, dp.bottomTrailing) == 0;
        }

        public final /* synthetic */ double getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ double getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ double getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ double getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return java.lang.Double.hashCode(this.bottomTrailing) + ((java.lang.Double.hashCode(this.bottomLeading) + ((java.lang.Double.hashCode(this.topTrailing) + (java.lang.Double.hashCode(this.topLeading) * 31)) * 31)) * 31);
        }

        public java.lang.String toString() {
            return "Dp(topLeading=" + this.topLeading + ", topTrailing=" + this.topTrailing + ", bottomLeading=" + this.bottomLeading + ", bottomTrailing=" + this.bottomTrailing + ')';
        }

        @p070h6.c
        public /* synthetic */ Dp(int i3, @p119n8.h("top_leading") double d4, @p119n8.h("top_trailing") double d6, @p119n8.h("bottom_leading") double d9, @p119n8.h("bottom_trailing") double d10, p153r8.k0 k0Var) {
            if (15 != (i3 & 15)) {
                p153r8.AbstractC2686a0.l(i3, 15, com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses$Dp$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.topLeading = d4;
            this.topTrailing = d6;
            this.bottomLeading = d9;
            this.bottomTrailing = d10;
        }

        public Dp(double d4) {
            this(d4, d4, d4, d4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nBC\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001a¨\u0006%"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "", "topLeading", "topTrailing", "bottomLeading", "bottomTrailing", "<init>", "(IIII)V", androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, "(I)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(IIIIILr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getTopLeading", "()I", "getTopLeading$annotations", "()V", "getTopTrailing", "getTopTrailing$annotations", "getBottomLeading", "getBottomLeading$annotations", "getBottomTrailing", "getBottomTrailing$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Percentage implements com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage.Companion(null);
        private final int bottomLeading;
        private final int bottomTrailing;
        private final int topLeading;
        private final int topTrailing;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses$Percentage$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Percentage(int i3, int i9, int i10, int i11) {
            this.topLeading = i3;
            this.topTrailing = i9;
            this.bottomLeading = i10;
            this.bottomTrailing = i11;
        }

        @p119n8.h("bottom_leading")
        public static /* synthetic */ void getBottomLeading$annotations() {
        }

        @p119n8.h("bottom_trailing")
        public static /* synthetic */ void getBottomTrailing$annotations() {
        }

        @p119n8.h("top_leading")
        public static /* synthetic */ void getTopLeading$annotations() {
        }

        @p119n8.h("top_trailing")
        public static /* synthetic */ void getTopTrailing$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.n(0, self.topLeading, serialDesc);
            output.n(1, self.topTrailing, serialDesc);
            output.n(2, self.bottomLeading, serialDesc);
            output.n(3, self.bottomTrailing, serialDesc);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage percentage = (com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage) obj;
            return this.topLeading == percentage.topLeading && this.topTrailing == percentage.topTrailing && this.bottomLeading == percentage.bottomLeading && this.bottomTrailing == percentage.bottomTrailing;
        }

        public final /* synthetic */ int getBottomLeading() {
            return this.bottomLeading;
        }

        public final /* synthetic */ int getBottomTrailing() {
            return this.bottomTrailing;
        }

        public final /* synthetic */ int getTopLeading() {
            return this.topLeading;
        }

        public final /* synthetic */ int getTopTrailing() {
            return this.topTrailing;
        }

        public int hashCode() {
            return (((((this.topLeading * 31) + this.topTrailing) * 31) + this.bottomLeading) * 31) + this.bottomTrailing;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Percentage(topLeading=");
            sb.append(this.topLeading);
            sb.append(", topTrailing=");
            sb.append(this.topTrailing);
            sb.append(", bottomLeading=");
            sb.append(this.bottomLeading);
            sb.append(", bottomTrailing=");
            return Y6.f.j(sb, this.bottomTrailing, ')');
        }

        @p070h6.c
        public /* synthetic */ Percentage(int i3, @p119n8.h("top_leading") int i9, @p119n8.h("top_trailing") int i10, @p119n8.h("bottom_leading") int i11, @p119n8.h("bottom_trailing") int i12, p153r8.k0 k0Var) {
            if (15 != (i3 & 15)) {
                p153r8.AbstractC2686a0.l(i3, 15, com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses$Percentage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.topLeading = i9;
            this.topTrailing = i10;
            this.bottomLeading = i11;
            this.bottomTrailing = i12;
        }

        public Percentage(int i3) {
            this(i3, i3, i3, i3);
        }
    }
}
