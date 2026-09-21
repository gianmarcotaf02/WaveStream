package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "", "Companion", "Image", "Text", "Video", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = com.revenuecat.purchases.paywalls.components.common.LocalizationDataSerializer.class)
public interface LocalizationData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.LocalizationData.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.common.LocalizationData.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.LocalizationData.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.common.LocalizationData.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.common.LocalizationDataSerializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "constructor-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)I", "toString", "", "toString-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Ljava/lang/String;", "$serializer", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Image implements com.revenuecat.purchases.paywalls.components.common.LocalizationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image.Companion(null);
        private final com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls value;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Image;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.common.LocalizationData$Image$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Image(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls) {
            this.value = themeImageUrls;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image m230boximpl(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls) {
            return new com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image(themeImageUrls);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls m231constructorimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls value) {
            kotlin.jvm.internal.m.e(value, "value");
            return value;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m232equalsimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls, java.lang.Object obj) {
            return (obj instanceof com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image) && kotlin.jvm.internal.m.a(themeImageUrls, ((com.revenuecat.purchases.paywalls.components.common.LocalizationData.Image) obj).m236unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m233equalsimpl0(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls2) {
            return kotlin.jvm.internal.m.a(themeImageUrls, themeImageUrls2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m234hashCodeimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls) {
            return themeImageUrls.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m235toStringimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls) {
            return "Image(value=" + themeImageUrls + ')';
        }

        public boolean equals(java.lang.Object obj) {
            return m232equalsimpl(this.value, obj);
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return m234hashCodeimpl(this.value);
        }

        public java.lang.String toString() {
            return m235toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls m236unboximpl() {
            return this.value;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "$serializer", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Text implements com.revenuecat.purchases.paywalls.components.common.LocalizationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.common.LocalizationData.Text.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.LocalizationData.Text.Companion(null);
        private final java.lang.String value;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Text;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.common.LocalizationData$Text$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Text(java.lang.String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.LocalizationData.Text m239boximpl(java.lang.String str) {
            return new com.revenuecat.purchases.paywalls.components.common.LocalizationData.Text(str);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static java.lang.String m240constructorimpl(java.lang.String value) {
            kotlin.jvm.internal.m.e(value, "value");
            return value;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m241equalsimpl(java.lang.String str, java.lang.Object obj) {
            return (obj instanceof com.revenuecat.purchases.paywalls.components.common.LocalizationData.Text) && kotlin.jvm.internal.m.a(str, ((com.revenuecat.purchases.paywalls.components.common.LocalizationData.Text) obj).m245unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m242equalsimpl0(java.lang.String str, java.lang.String str2) {
            return kotlin.jvm.internal.m.a(str, str2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m243hashCodeimpl(java.lang.String str) {
            return str.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m244toStringimpl(java.lang.String str) {
            return B2.a.i(')', "Text(value=", str);
        }

        public boolean equals(java.lang.Object obj) {
            return m241equalsimpl(this.value, obj);
        }

        public final /* synthetic */ java.lang.String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m243hashCodeimpl(this.value);
        }

        public java.lang.String toString() {
            return m244toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ java.lang.String m245unboximpl() {
            return this.value;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "constructor-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "getValue", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)I", "toString", "", "toString-impl", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Ljava/lang/String;", "$serializer", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Video implements com.revenuecat.purchases.paywalls.components.common.LocalizationData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.common.LocalizationData.Video.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.LocalizationData.Video.Companion(null);
        private final com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls value;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData$Video;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.common.LocalizationData$Video$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Video(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls) {
            this.value = themeVideoUrls;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.LocalizationData.Video m248boximpl(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls) {
            return new com.revenuecat.purchases.paywalls.components.common.LocalizationData.Video(themeVideoUrls);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls m249constructorimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls value) {
            kotlin.jvm.internal.m.e(value, "value");
            return value;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m250equalsimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls, java.lang.Object obj) {
            return (obj instanceof com.revenuecat.purchases.paywalls.components.common.LocalizationData.Video) && kotlin.jvm.internal.m.a(themeVideoUrls, ((com.revenuecat.purchases.paywalls.components.common.LocalizationData.Video) obj).m254unboximpl());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m251equalsimpl0(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls, com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls2) {
            return kotlin.jvm.internal.m.a(themeVideoUrls, themeVideoUrls2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m252hashCodeimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls) {
            return themeVideoUrls.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m253toStringimpl(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls) {
            return "Video(value=" + themeVideoUrls + ')';
        }

        public boolean equals(java.lang.Object obj) {
            return m250equalsimpl(this.value, obj);
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls getValue() {
            return this.value;
        }

        public int hashCode() {
            return m252hashCodeimpl(this.value);
        }

        public java.lang.String toString() {
            return m253toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls m254unboximpl() {
            return this.value;
        }
    }
}
