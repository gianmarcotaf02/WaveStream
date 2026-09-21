package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 +2\u00020\u0001:\u0005,-+./BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0004¢\u0006\u0004\b\r\u0010\u000eBm\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\"\b\u0001\u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0001\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR8\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00040\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010 \u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010\"¨\u00060"}, d2 = {"Lcom/revenuecat/purchases/UiConfig;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", io.sentry.protocol.App.TYPE, "", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "Lcom/revenuecat/purchases/paywalls/components/common/VariableLocalizationKey;", "", "localizations", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "variableConfig", "Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "customVariables", "<init>", "(Lcom/revenuecat/purchases/UiConfig$AppConfig;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/UiConfig$AppConfig;Ljava/util/Map;Lcom/revenuecat/purchases/UiConfig$VariableConfig;Ljava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/UiConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "getApp", "()Lcom/revenuecat/purchases/UiConfig$AppConfig;", "Ljava/util/Map;", "getLocalizations", "()Ljava/util/Map;", "getLocalizations$annotations", "()V", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableConfig", "()Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "getVariableConfig$annotations", "getCustomVariables", "getCustomVariables$annotations", "Companion", "$serializer", "AppConfig", "CustomVariableDefinition", "VariableConfig", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class UiConfig {
    private final com.revenuecat.purchases.UiConfig.AppConfig app;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.UiConfig.CustomVariableDefinition> customVariables;
    private final java.util.Map<com.revenuecat.purchases.paywalls.components.common.LocaleId, java.util.Map<com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey, java.lang.String>> localizations;
    private final com.revenuecat.purchases.UiConfig.VariableConfig variableConfig;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.UiConfig.Companion INSTANCE = new com.revenuecat.purchases.UiConfig.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {null, null, null, new p153r8.F(p153r8.p0.f26988a, com.revenuecat.purchases.CustomVariableDefinitionSerializer.INSTANCE, 1)};

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001d\u001fB/\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\t\u0010\nBG\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig;", "", "", "Lcom/revenuecat/purchases/ColorAlias;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colors", "Lcom/revenuecat/purchases/FontAlias;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "fonts", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/UiConfig$AppConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/Map;", "getColors", "()Ljava/util/Map;", "getFonts", "Companion", "$serializer", "FontsConfig", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class AppConfig {
        private final java.util.Map<com.revenuecat.purchases.ColorAlias, com.revenuecat.purchases.paywalls.components.properties.ColorScheme> colors;
        private final java.util.Map<com.revenuecat.purchases.FontAlias, com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig> fonts;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.UiConfig.AppConfig.Companion INSTANCE = new com.revenuecat.purchases.UiConfig.AppConfig.Companion(null);
        private static final kotlinx.serialization.KSerializer[] $childSerializers = {new p153r8.F(com.revenuecat.purchases.ColorAlias$$serializer.INSTANCE, com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE, 1), new p153r8.F(com.revenuecat.purchases.FontAlias$$serializer.INSTANCE, com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE, 1)};

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.UiConfig$AppConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0017\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM, "<init>", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "getAndroid", "()Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "Companion", "$serializer", "FontInfo", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        @p119n8.i
        public static final class FontsConfig {
            private static final kotlinx.serialization.KSerializer[] $childSerializers;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.Companion INSTANCE = new com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.Companion(null);
            private final com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo android;

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                    this();
                }

                public final kotlinx.serialization.KSerializer serializer() {
                    return com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "Companion", "GoogleFonts", "Name", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
            @p119n8.i
            public interface FontInfo {

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Companion INSTANCE = com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Companion.$$INSTANCE;

                @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                public static final class Companion {
                    static final /* synthetic */ com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Companion $$INSTANCE = new com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Companion();

                    private Companion() {
                    }

                    public final kotlinx.serialization.KSerializer serializer() {
                        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
                        return new p119n8.f("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", c9.b(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.class), new E6.InterfaceC0331d[]{c9.b(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts.class), c9.b(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name.class)}, new kotlinx.serialization.KSerializer[]{com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
                    }
                }

                @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                @p119n8.i
                @p119n8.h("google_fonts")
                public static final class GoogleFonts implements com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo {

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts.Companion INSTANCE = new com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts.Companion(null);
                    private final java.lang.String value;

                    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    public static final class Companion {
                        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                            this();
                        }

                        public final kotlinx.serialization.KSerializer serializer() {
                            return com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @p070h6.c
                    public /* synthetic */ GoogleFonts(int i3, java.lang.String str, p153r8.k0 k0Var) {
                        if (1 == (i3 & 1)) {
                            this.value = str;
                        } else {
                            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                    }

                    public boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts) && kotlin.jvm.internal.m.a(this.value, ((com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts) obj).value);
                    }

                    public final /* synthetic */ java.lang.String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public java.lang.String toString() {
                        return Y6.f.l(new java.lang.StringBuilder("GoogleFonts(value="), this.value, ')');
                    }

                    public GoogleFonts(java.lang.String value) {
                        kotlin.jvm.internal.m.e(value, "value");
                        this.value = value;
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0011\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo;", "", "value", io.sentry.protocol.Request.JsonKeys.URL, "hash", io.sentry.protocol.Device.JsonKeys.FAMILY, "", "weight", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "style", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;)V", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getUrl", "getHash", "getFamily", "Ljava/lang/Integer;", "getWeight", "()Ljava/lang/Integer;", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "getStyle", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                @p119n8.i
                @p119n8.h("name")
                public static final class Name implements com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo {

                    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                    public static final com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name.Companion INSTANCE = new com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name.Companion(null);
                    private final java.lang.String family;
                    private final java.lang.String hash;
                    private final com.revenuecat.purchases.paywalls.components.properties.FontStyle style;
                    private final java.lang.String url;
                    private final java.lang.String value;
                    private final java.lang.Integer weight;

                    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
                    public static final class Companion {
                        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                            this();
                        }

                        public final kotlinx.serialization.KSerializer serializer() {
                            return com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE;
                        }

                        private Companion() {
                        }
                    }

                    @p070h6.c
                    public /* synthetic */ Name(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, com.revenuecat.purchases.paywalls.components.properties.FontStyle fontStyle, p153r8.k0 k0Var) {
                        if (1 != (i3 & 1)) {
                            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE.getDescriptor());
                            throw null;
                        }
                        this.value = str;
                        if ((i3 & 2) == 0) {
                            this.url = null;
                        } else {
                            this.url = str2;
                        }
                        if ((i3 & 4) == 0) {
                            this.hash = null;
                        } else {
                            this.hash = str3;
                        }
                        if ((i3 & 8) == 0) {
                            this.family = null;
                        } else {
                            this.family = str4;
                        }
                        if ((i3 & 16) == 0) {
                            this.weight = null;
                        } else {
                            this.weight = num;
                        }
                        if ((i3 & 32) == 0) {
                            this.style = null;
                        } else {
                            this.style = fontStyle;
                        }
                    }

                    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                        output.s(serialDesc, 0, self.value);
                        if (output.E(serialDesc) || self.url != null) {
                            output.t(serialDesc, 1, p153r8.p0.f26988a, self.url);
                        }
                        if (output.E(serialDesc) || self.hash != null) {
                            output.t(serialDesc, 2, p153r8.p0.f26988a, self.hash);
                        }
                        if (output.E(serialDesc) || self.family != null) {
                            output.t(serialDesc, 3, p153r8.p0.f26988a, self.family);
                        }
                        if (output.E(serialDesc) || self.weight != null) {
                            output.t(serialDesc, 4, p153r8.K.f26915a, self.weight);
                        }
                        if (!output.E(serialDesc) && self.style == null) {
                            return;
                        }
                        output.t(serialDesc, 5, com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer.INSTANCE, self.style);
                    }

                    public boolean equals(java.lang.Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name)) {
                            return false;
                        }
                        com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name name = (com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name) obj;
                        return kotlin.jvm.internal.m.a(this.value, name.value) && kotlin.jvm.internal.m.a(this.url, name.url) && kotlin.jvm.internal.m.a(this.hash, name.hash) && kotlin.jvm.internal.m.a(this.family, name.family) && kotlin.jvm.internal.m.a(this.weight, name.weight) && this.style == name.style;
                    }

                    public final /* synthetic */ java.lang.String getFamily() {
                        return this.family;
                    }

                    public final /* synthetic */ java.lang.String getHash() {
                        return this.hash;
                    }

                    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.FontStyle getStyle() {
                        return this.style;
                    }

                    public final /* synthetic */ java.lang.String getUrl() {
                        return this.url;
                    }

                    public final /* synthetic */ java.lang.String getValue() {
                        return this.value;
                    }

                    public final /* synthetic */ java.lang.Integer getWeight() {
                        return this.weight;
                    }

                    public int hashCode() {
                        int iHashCode = this.value.hashCode() * 31;
                        java.lang.String str = this.url;
                        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                        java.lang.String str2 = this.hash;
                        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        java.lang.String str3 = this.family;
                        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                        java.lang.Integer num = this.weight;
                        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                        com.revenuecat.purchases.paywalls.components.properties.FontStyle fontStyle = this.style;
                        return iHashCode5 + (fontStyle != null ? fontStyle.hashCode() : 0);
                    }

                    public java.lang.String toString() {
                        return "Name(value=" + this.value + ", url=" + this.url + ", hash=" + this.hash + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
                    }

                    public Name(java.lang.String value, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, com.revenuecat.purchases.paywalls.components.properties.FontStyle fontStyle) {
                        kotlin.jvm.internal.m.e(value, "value");
                        this.value = value;
                        this.url = str;
                        this.hash = str2;
                        this.family = str3;
                        this.weight = num;
                        this.style = fontStyle;
                    }

                    public /* synthetic */ Name(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, com.revenuecat.purchases.paywalls.components.properties.FontStyle fontStyle, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                        this(str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : fontStyle);
                    }
                }
            }

            static {
                kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
                $childSerializers = new kotlinx.serialization.KSerializer[]{new p119n8.f("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo", c9.b(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.class), new E6.InterfaceC0331d[]{c9.b(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts.class), c9.b(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo.Name.class)}, new kotlinx.serialization.KSerializer[]{com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer.INSTANCE, com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0])};
            }

            @p070h6.c
            public /* synthetic */ FontsConfig(int i3, com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo fontInfo, p153r8.k0 k0Var) {
                if (1 == (i3 & 1)) {
                    this.android = fontInfo;
                } else {
                    p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.UiConfig$AppConfig$FontsConfig$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig) && kotlin.jvm.internal.m.a(this.android, ((com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig) obj).android);
            }

            public final /* synthetic */ com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo getAndroid() {
                return this.android;
            }

            public int hashCode() {
                return this.android.hashCode();
            }

            public java.lang.String toString() {
                return "FontsConfig(android=" + this.android + ')';
            }

            public FontsConfig(com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig.FontInfo android2) {
                kotlin.jvm.internal.m.e(android2, "android");
                this.android = android2;
            }
        }

        @p070h6.c
        public /* synthetic */ AppConfig(int i3, java.util.Map map, java.util.Map map2, p153r8.k0 k0Var) {
            if (3 != (i3 & 3)) {
                p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.UiConfig$AppConfig$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.colors = map;
            this.fonts = map2;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.UiConfig.AppConfig self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
            output.h(serialDesc, 0, kSerializerArr[0], self.colors);
            output.h(serialDesc, 1, kSerializerArr[1], self.fonts);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.UiConfig.AppConfig)) {
                return false;
            }
            com.revenuecat.purchases.UiConfig.AppConfig appConfig = (com.revenuecat.purchases.UiConfig.AppConfig) obj;
            return kotlin.jvm.internal.m.a(this.colors, appConfig.colors) && kotlin.jvm.internal.m.a(this.fonts, appConfig.fonts);
        }

        public final /* synthetic */ java.util.Map getColors() {
            return this.colors;
        }

        public final /* synthetic */ java.util.Map getFonts() {
            return this.fonts;
        }

        public int hashCode() {
            return this.fonts.hashCode() + (this.colors.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AppConfig(colors=");
            sb.append(this.colors);
            sb.append(", fonts=");
            return p121o0.p.r(sb, this.fonts, ')');
        }

        public AppConfig(java.util.Map<com.revenuecat.purchases.ColorAlias, com.revenuecat.purchases.paywalls.components.properties.ColorScheme> colors, java.util.Map<com.revenuecat.purchases.FontAlias, com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig> fonts) {
            kotlin.jvm.internal.m.e(colors, "colors");
            kotlin.jvm.internal.m.e(fonts, "fonts");
            this.colors = colors;
            this.fonts = fonts;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.UiConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "", "type", "", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)V", "getDefaultValue", "()Ljava/lang/Object;", "getType", "()Ljava/lang/String;", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.CustomVariableDefinitionSerializer.class)
    public static final class CustomVariableDefinition {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.UiConfig.CustomVariableDefinition.Companion INSTANCE = new com.revenuecat.purchases.UiConfig.CustomVariableDefinition.Companion(null);
        private final java.lang.Object defaultValue;
        private final java.lang.String type;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig$CustomVariableDefinition;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.CustomVariableDefinitionSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public CustomVariableDefinition(java.lang.String type, java.lang.Object defaultValue) {
            kotlin.jvm.internal.m.e(type, "type");
            kotlin.jvm.internal.m.e(defaultValue, "defaultValue");
            this.type = type;
            this.defaultValue = defaultValue;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.UiConfig.CustomVariableDefinition)) {
                return false;
            }
            com.revenuecat.purchases.UiConfig.CustomVariableDefinition customVariableDefinition = (com.revenuecat.purchases.UiConfig.CustomVariableDefinition) obj;
            return kotlin.jvm.internal.m.a(this.type, customVariableDefinition.type) && kotlin.jvm.internal.m.a(this.defaultValue, customVariableDefinition.defaultValue);
        }

        public final /* synthetic */ java.lang.Object getDefaultValue() {
            return this.defaultValue;
        }

        public final /* synthetic */ java.lang.String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.defaultValue.hashCode() + (this.type.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CustomVariableDefinition(type=");
            sb.append(this.type);
            sb.append(", defaultValue=");
            return B2.a.n(sb, this.defaultValue, ')');
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R,\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "", "", "", "variableCompatibilityMap", "functionCompatibilityMap", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/UiConfig$VariableConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/util/Map;", "getVariableCompatibilityMap", "()Ljava/util/Map;", "getVariableCompatibilityMap$annotations", "()V", "getFunctionCompatibilityMap", "getFunctionCompatibilityMap$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class VariableConfig {
        private static final kotlinx.serialization.KSerializer[] $childSerializers;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.UiConfig.VariableConfig.Companion INSTANCE = new com.revenuecat.purchases.UiConfig.VariableConfig.Companion(null);
        private final java.util.Map<java.lang.String, java.lang.String> functionCompatibilityMap;
        private final java.util.Map<java.lang.String, java.lang.String> variableCompatibilityMap;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/UiConfig$VariableConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/UiConfig$VariableConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.UiConfig$VariableConfig$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        static {
            p153r8.p0 p0Var = p153r8.p0.f26988a;
            $childSerializers = new kotlinx.serialization.KSerializer[]{new p153r8.F(p0Var, p0Var, 1), new p153r8.F(p0Var, p0Var, 1)};
        }

        @p070h6.c
        public /* synthetic */ VariableConfig(int i3, @p119n8.h("variable_compatibility_map") java.util.Map map, @p119n8.h("function_compatibility_map") java.util.Map map2, p153r8.k0 k0Var) {
            if (3 != (i3 & 3)) {
                p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.UiConfig$VariableConfig$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.variableCompatibilityMap = map;
            this.functionCompatibilityMap = map2;
        }

        @p119n8.h("function_compatibility_map")
        public static /* synthetic */ void getFunctionCompatibilityMap$annotations() {
        }

        @p119n8.h("variable_compatibility_map")
        public static /* synthetic */ void getVariableCompatibilityMap$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.UiConfig.VariableConfig self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
            output.h(serialDesc, 0, kSerializerArr[0], self.variableCompatibilityMap);
            output.h(serialDesc, 1, kSerializerArr[1], self.functionCompatibilityMap);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.revenuecat.purchases.UiConfig.VariableConfig)) {
                return false;
            }
            com.revenuecat.purchases.UiConfig.VariableConfig variableConfig = (com.revenuecat.purchases.UiConfig.VariableConfig) obj;
            return kotlin.jvm.internal.m.a(this.variableCompatibilityMap, variableConfig.variableCompatibilityMap) && kotlin.jvm.internal.m.a(this.functionCompatibilityMap, variableConfig.functionCompatibilityMap);
        }

        public final /* synthetic */ java.util.Map getFunctionCompatibilityMap() {
            return this.functionCompatibilityMap;
        }

        public final /* synthetic */ java.util.Map getVariableCompatibilityMap() {
            return this.variableCompatibilityMap;
        }

        public int hashCode() {
            return this.functionCompatibilityMap.hashCode() + (this.variableCompatibilityMap.hashCode() * 31);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VariableConfig(variableCompatibilityMap=");
            sb.append(this.variableCompatibilityMap);
            sb.append(", functionCompatibilityMap=");
            return p121o0.p.r(sb, this.functionCompatibilityMap, ')');
        }

        public VariableConfig(java.util.Map<java.lang.String, java.lang.String> variableCompatibilityMap, java.util.Map<java.lang.String, java.lang.String> functionCompatibilityMap) {
            kotlin.jvm.internal.m.e(variableCompatibilityMap, "variableCompatibilityMap");
            kotlin.jvm.internal.m.e(functionCompatibilityMap, "functionCompatibilityMap");
            this.variableCompatibilityMap = variableCompatibilityMap;
            this.functionCompatibilityMap = functionCompatibilityMap;
        }
    }

    @p070h6.c
    public /* synthetic */ UiConfig(int i3, com.revenuecat.purchases.UiConfig.AppConfig appConfig, @p119n8.i(with = com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer.class) java.util.Map map, @p119n8.h("variable_config") com.revenuecat.purchases.UiConfig.VariableConfig variableConfig, @p119n8.h("custom_variables") java.util.Map map2, p153r8.k0 k0Var) {
        if (7 != (i3 & 7)) {
            p153r8.AbstractC2686a0.l(i3, 7, com.revenuecat.purchases.UiConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.app = appConfig;
        this.localizations = map;
        this.variableConfig = variableConfig;
        if ((i3 & 8) == 0) {
            this.customVariables = p078i6.x.f23206h;
        } else {
            this.customVariables = map2;
        }
    }

    @p119n8.h("custom_variables")
    public static /* synthetic */ void getCustomVariables$annotations() {
    }

    @p119n8.i(with = com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer.class)
    public static /* synthetic */ void getLocalizations$annotations() {
    }

    @p119n8.h("variable_config")
    public static /* synthetic */ void getVariableConfig$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.UiConfig self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.h(serialDesc, 0, com.revenuecat.purchases.UiConfig$AppConfig$$serializer.INSTANCE, self.app);
        output.h(serialDesc, 1, com.revenuecat.purchases.paywalls.components.common.LocalizedVariableLocalizationKeyMapSerializer.INSTANCE, self.localizations);
        output.h(serialDesc, 2, com.revenuecat.purchases.UiConfig$VariableConfig$$serializer.INSTANCE, self.variableConfig);
        if (!output.E(serialDesc) && kotlin.jvm.internal.m.a(self.customVariables, p078i6.x.f23206h)) {
            return;
        }
        output.h(serialDesc, 3, kSerializerArr[3], self.customVariables);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.UiConfig)) {
            return false;
        }
        com.revenuecat.purchases.UiConfig uiConfig = (com.revenuecat.purchases.UiConfig) obj;
        return kotlin.jvm.internal.m.a(this.app, uiConfig.app) && kotlin.jvm.internal.m.a(this.localizations, uiConfig.localizations) && kotlin.jvm.internal.m.a(this.variableConfig, uiConfig.variableConfig) && kotlin.jvm.internal.m.a(this.customVariables, uiConfig.customVariables);
    }

    public final /* synthetic */ com.revenuecat.purchases.UiConfig.AppConfig getApp() {
        return this.app;
    }

    public final /* synthetic */ java.util.Map getCustomVariables() {
        return this.customVariables;
    }

    public final /* synthetic */ java.util.Map getLocalizations() {
        return this.localizations;
    }

    public final /* synthetic */ com.revenuecat.purchases.UiConfig.VariableConfig getVariableConfig() {
        return this.variableConfig;
    }

    public int hashCode() {
        return this.customVariables.hashCode() + ((this.variableConfig.hashCode() + B2.a.c(this.app.hashCode() * 31, 31, this.localizations)) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UiConfig(app=");
        sb.append(this.app);
        sb.append(", localizations=");
        sb.append(this.localizations);
        sb.append(", variableConfig=");
        sb.append(this.variableConfig);
        sb.append(", customVariables=");
        return p121o0.p.r(sb, this.customVariables, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UiConfig(com.revenuecat.purchases.UiConfig.AppConfig app, java.util.Map<com.revenuecat.purchases.paywalls.components.common.LocaleId, ? extends java.util.Map<com.revenuecat.purchases.paywalls.components.common.VariableLocalizationKey, java.lang.String>> localizations, com.revenuecat.purchases.UiConfig.VariableConfig variableConfig, java.util.Map<java.lang.String, com.revenuecat.purchases.UiConfig.CustomVariableDefinition> customVariables) {
        kotlin.jvm.internal.m.e(app, "app");
        kotlin.jvm.internal.m.e(localizations, "localizations");
        kotlin.jvm.internal.m.e(variableConfig, "variableConfig");
        kotlin.jvm.internal.m.e(customVariables, "customVariables");
        this.app = app;
        this.localizations = localizations;
        this.variableConfig = variableConfig;
        this.customVariables = customVariables;
    }

    public /* synthetic */ UiConfig(com.revenuecat.purchases.UiConfig.AppConfig appConfig, java.util.Map map, com.revenuecat.purchases.UiConfig.VariableConfig variableConfig, java.util.Map map2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(appConfig, map, variableConfig, (i3 & 8) != 0 ? p078i6.x.f23206h : map2);
    }
}
