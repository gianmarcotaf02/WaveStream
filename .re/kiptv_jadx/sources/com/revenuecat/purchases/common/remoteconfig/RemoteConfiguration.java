package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u0000 B2\u00020\u0001:\u0003CBDBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0082\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J(\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,HÁ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b9\u0010\u0016R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u0018R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b=\u00108\u001a\u0004\b<\u0010\u0018R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u0016¨\u0006E"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", "", "", "domain", "", "subdomains", "appUuid", "manifest", "activeTopics", "prefetchBlobs", "", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "topics", "stateHash", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDomain", "Ljava/util/List;", "getSubdomains", "getAppUuid", "getAppUuid$annotations", "()V", "getManifest", "getActiveTopics", "getActiveTopics$annotations", "getPrefetchBlobs", "getPrefetchBlobs$annotations", "Ljava/util/Map;", "getTopics", "getStateHash", "getStateHash$annotations", "Companion", "$serializer", "ConfigItem", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class RemoteConfiguration {
    private static final kotlinx.serialization.KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.Companion INSTANCE = new com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.Companion(null);
    private final java.util.List<java.lang.String> activeTopics;
    private final java.lang.String appUuid;
    private final java.lang.String domain;
    private final java.lang.String manifest;
    private final java.util.List<java.lang.String> prefetchBlobs;
    private final java.lang.String stateHash;
    private final java.util.List<java.lang.String> subdomains;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> topics;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$Companion;", "", "()V", "parse", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", "buffer", "Ljava/nio/ByteBuffer;", "bytes", "", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration parse(byte[] bytes) {
            kotlin.jvm.internal.m.e(bytes, "bytes");
            return (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration) com.revenuecat.purchases.common.JsonProvider.INSTANCE.getDefaultJson().b(O7.x.n0(bytes), serializer());
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }

        public final com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration parse(java.nio.ByteBuffer buffer) {
            kotlin.jvm.internal.m.e(buffer, "buffer");
            java.nio.ByteBuffer byteBufferDuplicate = buffer.duplicate();
            byte[] bArr = new byte[byteBufferDuplicate.remaining()];
            byteBufferDuplicate.get(bArr);
            return parse(bArr);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "", "", "blobRef", "", io.ktor.http.LinkHeader.Rel.Prefetch, "Lkotlinx/serialization/json/c;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_METADATA, "<init>", "(Ljava/lang/String;ZLkotlinx/serialization/json/c;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lkotlinx/serialization/json/c;", "copy", "(Ljava/lang/String;ZLkotlinx/serialization/json/c;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "toString", "", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBlobRef", "Z", "getPrefetch", "Lkotlinx/serialization/json/c;", "getMetadata", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.common.remoteconfig.ConfigItemSerializer.class)
    public static final /* data */ class ConfigItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem.Companion INSTANCE = new com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem.Companion(null);
        private final java.lang.String blobRef;
        private final kotlinx.serialization.json.c metadata;
        private final boolean prefetch;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.common.remoteconfig.ConfigItemSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ConfigItem() {
            this(null, false, null, 7, null);
        }

        public static /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem copy$default(com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem configItem, java.lang.String str, boolean z6, kotlinx.serialization.json.c cVar, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = configItem.blobRef;
            }
            if ((i3 & 2) != 0) {
                z6 = configItem.prefetch;
            }
            if ((i3 & 4) != 0) {
                cVar = configItem.metadata;
            }
            return configItem.copy(str, z6, cVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getBlobRef() {
            return this.blobRef;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getPrefetch() {
            return this.prefetch;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final kotlinx.serialization.json.c getMetadata() {
            return this.metadata;
        }

        public final com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem copy(java.lang.String blobRef, boolean prefetch, kotlinx.serialization.json.c metadata) {
            kotlin.jvm.internal.m.e(metadata, "metadata");
            return new com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem(blobRef, prefetch, metadata);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem)) {
                return false;
            }
            com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem configItem = (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) other;
            return kotlin.jvm.internal.m.a(this.blobRef, configItem.blobRef) && this.prefetch == configItem.prefetch && kotlin.jvm.internal.m.a(this.metadata, configItem.metadata);
        }

        public final java.lang.String getBlobRef() {
            return this.blobRef;
        }

        public final kotlinx.serialization.json.c getMetadata() {
            return this.metadata;
        }

        public final boolean getPrefetch() {
            return this.prefetch;
        }

        public int hashCode() {
            java.lang.String str = this.blobRef;
            return this.metadata.f24558h.hashCode() + p121o0.p.f((str == null ? 0 : str.hashCode()) * 31, 31, this.prefetch);
        }

        public java.lang.String toString() {
            return "ConfigItem(blobRef=" + this.blobRef + ", prefetch=" + this.prefetch + ", metadata=" + this.metadata + ')';
        }

        public ConfigItem(java.lang.String str, boolean z6, kotlinx.serialization.json.c metadata) {
            kotlin.jvm.internal.m.e(metadata, "metadata");
            this.blobRef = str;
            this.prefetch = z6;
            this.metadata = metadata;
        }

        public /* synthetic */ ConfigItem(java.lang.String str, boolean z6, kotlinx.serialization.json.c cVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? false : z6, (i3 & 4) != 0 ? new kotlinx.serialization.json.c(p078i6.x.f23206h) : cVar);
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        $childSerializers = new kotlinx.serialization.KSerializer[]{null, new p153r8.C2691d(p0Var, 0), null, null, new p153r8.C2691d(p0Var, 0), new p153r8.C2691d(p0Var, 0), new p153r8.F(p0Var, com.revenuecat.purchases.common.remoteconfig.ConfigTopicSerializer.INSTANCE, 1), null};
    }

    @p070h6.c
    public /* synthetic */ RemoteConfiguration(int i3, java.lang.String str, java.util.List list, @p119n8.h("app_uuid") java.lang.String str2, java.lang.String str3, @p119n8.h("active_topics") java.util.List list2, @p119n8.h("prefetch_blobs") java.util.List list3, java.util.Map map, @p119n8.h("state_hash") java.lang.String str4, p153r8.k0 k0Var) {
        if (9 != (i3 & 9)) {
            p153r8.AbstractC2686a0.l(i3, 9, com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.domain = str;
        int i9 = i3 & 2;
        p078i6.w wVar = p078i6.w.f23205h;
        if (i9 == 0) {
            this.subdomains = wVar;
        } else {
            this.subdomains = list;
        }
        if ((i3 & 4) == 0) {
            this.appUuid = null;
        } else {
            this.appUuid = str2;
        }
        this.manifest = str3;
        if ((i3 & 16) == 0) {
            this.activeTopics = wVar;
        } else {
            this.activeTopics = list2;
        }
        if ((i3 & 32) == 0) {
            this.prefetchBlobs = wVar;
        } else {
            this.prefetchBlobs = list3;
        }
        if ((i3 & 64) == 0) {
            this.topics = p078i6.x.f23206h;
        } else {
            this.topics = map;
        }
        if ((i3 & 128) == 0) {
            this.stateHash = null;
        } else {
            this.stateHash = str4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration copy$default(com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration remoteConfiguration, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, java.util.List list2, java.util.List list3, java.util.Map map, java.lang.String str4, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = remoteConfiguration.domain;
        }
        if ((i3 & 2) != 0) {
            list = remoteConfiguration.subdomains;
        }
        if ((i3 & 4) != 0) {
            str2 = remoteConfiguration.appUuid;
        }
        if ((i3 & 8) != 0) {
            str3 = remoteConfiguration.manifest;
        }
        if ((i3 & 16) != 0) {
            list2 = remoteConfiguration.activeTopics;
        }
        if ((i3 & 32) != 0) {
            list3 = remoteConfiguration.prefetchBlobs;
        }
        if ((i3 & 64) != 0) {
            map = remoteConfiguration.topics;
        }
        if ((i3 & 128) != 0) {
            str4 = remoteConfiguration.stateHash;
        }
        java.util.Map map2 = map;
        java.lang.String str5 = str4;
        java.util.List list4 = list2;
        java.util.List list5 = list3;
        return remoteConfiguration.copy(str, list, str2, str3, list4, list5, map2, str5);
    }

    @p119n8.h("active_topics")
    public static /* synthetic */ void getActiveTopics$annotations() {
    }

    @p119n8.h("app_uuid")
    public static /* synthetic */ void getAppUuid$annotations() {
    }

    @p119n8.h("prefetch_blobs")
    public static /* synthetic */ void getPrefetchBlobs$annotations() {
    }

    @p119n8.h("state_hash")
    public static /* synthetic */ void getStateHash$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.domain);
        boolean zE = output.E(serialDesc);
        p078i6.w wVar = p078i6.w.f23205h;
        if (zE || !kotlin.jvm.internal.m.a(self.subdomains, wVar)) {
            output.h(serialDesc, 1, kSerializerArr[1], self.subdomains);
        }
        if (output.E(serialDesc) || self.appUuid != null) {
            output.t(serialDesc, 2, p153r8.p0.f26988a, self.appUuid);
        }
        output.s(serialDesc, 3, self.manifest);
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.activeTopics, wVar)) {
            output.h(serialDesc, 4, kSerializerArr[4], self.activeTopics);
        }
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.prefetchBlobs, wVar)) {
            output.h(serialDesc, 5, kSerializerArr[5], self.prefetchBlobs);
        }
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.topics, p078i6.x.f23206h)) {
            output.h(serialDesc, 6, kSerializerArr[6], self.topics);
        }
        if (!output.E(serialDesc) && self.stateHash == null) {
            return;
        }
        output.t(serialDesc, 7, p153r8.p0.f26988a, self.stateHash);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.subdomains;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getAppUuid() {
        return this.appUuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final java.lang.String getManifest() {
        return this.manifest;
    }

    public final java.util.List<java.lang.String> component5() {
        return this.activeTopics;
    }

    public final java.util.List<java.lang.String> component6() {
        return this.prefetchBlobs;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> component7() {
        return this.topics;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final java.lang.String getStateHash() {
        return this.stateHash;
    }

    public final com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration copy(java.lang.String domain, java.util.List<java.lang.String> subdomains, java.lang.String appUuid, java.lang.String manifest, java.util.List<java.lang.String> activeTopics, java.util.List<java.lang.String> prefetchBlobs, java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> topics, java.lang.String stateHash) {
        kotlin.jvm.internal.m.e(domain, "domain");
        kotlin.jvm.internal.m.e(subdomains, "subdomains");
        kotlin.jvm.internal.m.e(manifest, "manifest");
        kotlin.jvm.internal.m.e(activeTopics, "activeTopics");
        kotlin.jvm.internal.m.e(prefetchBlobs, "prefetchBlobs");
        kotlin.jvm.internal.m.e(topics, "topics");
        return new com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration(domain, subdomains, appUuid, manifest, activeTopics, prefetchBlobs, topics, stateHash);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration)) {
            return false;
        }
        com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration remoteConfiguration = (com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration) other;
        return kotlin.jvm.internal.m.a(this.domain, remoteConfiguration.domain) && kotlin.jvm.internal.m.a(this.subdomains, remoteConfiguration.subdomains) && kotlin.jvm.internal.m.a(this.appUuid, remoteConfiguration.appUuid) && kotlin.jvm.internal.m.a(this.manifest, remoteConfiguration.manifest) && kotlin.jvm.internal.m.a(this.activeTopics, remoteConfiguration.activeTopics) && kotlin.jvm.internal.m.a(this.prefetchBlobs, remoteConfiguration.prefetchBlobs) && kotlin.jvm.internal.m.a(this.topics, remoteConfiguration.topics) && kotlin.jvm.internal.m.a(this.stateHash, remoteConfiguration.stateHash);
    }

    public final java.util.List<java.lang.String> getActiveTopics() {
        return this.activeTopics;
    }

    public final java.lang.String getAppUuid() {
        return this.appUuid;
    }

    public final java.lang.String getDomain() {
        return this.domain;
    }

    public final java.lang.String getManifest() {
        return this.manifest;
    }

    public final java.util.List<java.lang.String> getPrefetchBlobs() {
        return this.prefetchBlobs;
    }

    public final java.lang.String getStateHash() {
        return this.stateHash;
    }

    public final java.util.List<java.lang.String> getSubdomains() {
        return this.subdomains;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        int iB = B2.a.b(this.domain.hashCode() * 31, 31, this.subdomains);
        java.lang.String str = this.appUuid;
        int iC = B2.a.c(B2.a.b(B2.a.b(B2.a.a((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.manifest), 31, this.activeTopics), 31, this.prefetchBlobs), 31, this.topics);
        java.lang.String str2 = this.stateHash;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoteConfiguration(domain=");
        sb.append(this.domain);
        sb.append(", subdomains=");
        sb.append(this.subdomains);
        sb.append(", appUuid=");
        sb.append(this.appUuid);
        sb.append(", manifest=");
        sb.append(this.manifest);
        sb.append(", activeTopics=");
        sb.append(this.activeTopics);
        sb.append(", prefetchBlobs=");
        sb.append(this.prefetchBlobs);
        sb.append(", topics=");
        sb.append(this.topics);
        sb.append(", stateHash=");
        return Y6.f.l(sb, this.stateHash, ')');
    }

    public RemoteConfiguration(java.lang.String domain, java.util.List<java.lang.String> subdomains, java.lang.String str, java.lang.String manifest, java.util.List<java.lang.String> activeTopics, java.util.List<java.lang.String> prefetchBlobs, java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> topics, java.lang.String str2) {
        kotlin.jvm.internal.m.e(domain, "domain");
        kotlin.jvm.internal.m.e(subdomains, "subdomains");
        kotlin.jvm.internal.m.e(manifest, "manifest");
        kotlin.jvm.internal.m.e(activeTopics, "activeTopics");
        kotlin.jvm.internal.m.e(prefetchBlobs, "prefetchBlobs");
        kotlin.jvm.internal.m.e(topics, "topics");
        this.domain = domain;
        this.subdomains = subdomains;
        this.appUuid = str;
        this.manifest = manifest;
        this.activeTopics = activeTopics;
        this.prefetchBlobs = prefetchBlobs;
        this.topics = topics;
        this.stateHash = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RemoteConfiguration(java.lang.String str, java.util.List list, java.lang.String str2, java.lang.String str3, java.util.List list2, java.util.List list3, java.util.Map map, java.lang.String str4, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        int i9 = i3 & 2;
        p078i6.w wVar = p078i6.w.f23205h;
        this(str, i9 != 0 ? wVar : list, (i3 & 4) != 0 ? null : str2, str3, (i3 & 16) != 0 ? wVar : list2, (i3 & 32) != 0 ? wVar : list3, (i3 & 64) != 0 ? p078i6.x.f23206h : map, (i3 & 128) != 0 ? null : str4);
    }
}
