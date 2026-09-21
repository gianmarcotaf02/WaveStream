package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 42\u00020\u0001:\u000254BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBe\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JZ\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b1\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;", "", "", "domain", "manifest", "", "activeTopics", "prefetchBlobs", "", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "topics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDomain", "getManifest", "Ljava/util/List;", "getActiveTopics", "getPrefetchBlobs", "Ljava/util/Map;", "getTopics", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PersistedRemoteConfigurationState {
    private static final kotlinx.serialization.KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState.Companion INSTANCE = new com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState.Companion(null);
    private final java.util.List<java.lang.String> activeTopics;
    private final java.lang.String domain;
    private final java.lang.String manifest;
    private final java.util.List<java.lang.String> prefetchBlobs;
    private final java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> topics;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/remoteconfig/PersistedRemoteConfigurationState;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        $childSerializers = new kotlinx.serialization.KSerializer[]{null, null, new p153r8.C2691d(p0Var, 0), new p153r8.C2691d(p0Var, 0), new p153r8.F(p0Var, com.revenuecat.purchases.common.remoteconfig.ConfigTopicSerializer.INSTANCE, 1)};
    }

    @p070h6.c
    public /* synthetic */ PersistedRemoteConfigurationState(int i3, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, java.util.Map map, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.domain = str;
        this.manifest = str2;
        int i9 = i3 & 4;
        p078i6.w wVar = p078i6.w.f23205h;
        if (i9 == 0) {
            this.activeTopics = wVar;
        } else {
            this.activeTopics = list;
        }
        if ((i3 & 8) == 0) {
            this.prefetchBlobs = wVar;
        } else {
            this.prefetchBlobs = list2;
        }
        if ((i3 & 16) == 0) {
            this.topics = p078i6.x.f23206h;
        } else {
            this.topics = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState copy$default(com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persistedRemoteConfigurationState, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, java.util.Map map, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = persistedRemoteConfigurationState.domain;
        }
        if ((i3 & 2) != 0) {
            str2 = persistedRemoteConfigurationState.manifest;
        }
        if ((i3 & 4) != 0) {
            list = persistedRemoteConfigurationState.activeTopics;
        }
        if ((i3 & 8) != 0) {
            list2 = persistedRemoteConfigurationState.prefetchBlobs;
        }
        if ((i3 & 16) != 0) {
            map = persistedRemoteConfigurationState.topics;
        }
        java.util.Map map2 = map;
        java.util.List list3 = list;
        return persistedRemoteConfigurationState.copy(str, str2, list3, list2, map2);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.domain);
        output.s(serialDesc, 1, self.manifest);
        boolean zE = output.E(serialDesc);
        p078i6.w wVar = p078i6.w.f23205h;
        if (zE || !kotlin.jvm.internal.m.a(self.activeTopics, wVar)) {
            output.h(serialDesc, 2, kSerializerArr[2], self.activeTopics);
        }
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.prefetchBlobs, wVar)) {
            output.h(serialDesc, 3, kSerializerArr[3], self.prefetchBlobs);
        }
        if (!output.E(serialDesc) && kotlin.jvm.internal.m.a(self.topics, p078i6.x.f23206h)) {
            return;
        }
        output.h(serialDesc, 4, kSerializerArr[4], self.topics);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getManifest() {
        return this.manifest;
    }

    public final java.util.List<java.lang.String> component3() {
        return this.activeTopics;
    }

    public final java.util.List<java.lang.String> component4() {
        return this.prefetchBlobs;
    }

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> component5() {
        return this.topics;
    }

    public final com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState copy(java.lang.String domain, java.lang.String manifest, java.util.List<java.lang.String> activeTopics, java.util.List<java.lang.String> prefetchBlobs, java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> topics) {
        kotlin.jvm.internal.m.e(domain, "domain");
        kotlin.jvm.internal.m.e(manifest, "manifest");
        kotlin.jvm.internal.m.e(activeTopics, "activeTopics");
        kotlin.jvm.internal.m.e(prefetchBlobs, "prefetchBlobs");
        kotlin.jvm.internal.m.e(topics, "topics");
        return new com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState(domain, manifest, activeTopics, prefetchBlobs, topics);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState)) {
            return false;
        }
        com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState persistedRemoteConfigurationState = (com.revenuecat.purchases.common.remoteconfig.PersistedRemoteConfigurationState) other;
        return kotlin.jvm.internal.m.a(this.domain, persistedRemoteConfigurationState.domain) && kotlin.jvm.internal.m.a(this.manifest, persistedRemoteConfigurationState.manifest) && kotlin.jvm.internal.m.a(this.activeTopics, persistedRemoteConfigurationState.activeTopics) && kotlin.jvm.internal.m.a(this.prefetchBlobs, persistedRemoteConfigurationState.prefetchBlobs) && kotlin.jvm.internal.m.a(this.topics, persistedRemoteConfigurationState.topics);
    }

    public final java.util.List<java.lang.String> getActiveTopics() {
        return this.activeTopics;
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

    public final java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        return this.topics.hashCode() + B2.a.b(B2.a.b(B2.a.a(this.domain.hashCode() * 31, 31, this.manifest), 31, this.activeTopics), 31, this.prefetchBlobs);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersistedRemoteConfigurationState(domain=");
        sb.append(this.domain);
        sb.append(", manifest=");
        sb.append(this.manifest);
        sb.append(", activeTopics=");
        sb.append(this.activeTopics);
        sb.append(", prefetchBlobs=");
        sb.append(this.prefetchBlobs);
        sb.append(", topics=");
        return p121o0.p.r(sb, this.topics, ')');
    }

    public PersistedRemoteConfigurationState(java.lang.String domain, java.lang.String manifest, java.util.List<java.lang.String> activeTopics, java.util.List<java.lang.String> prefetchBlobs, java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> topics) {
        kotlin.jvm.internal.m.e(domain, "domain");
        kotlin.jvm.internal.m.e(manifest, "manifest");
        kotlin.jvm.internal.m.e(activeTopics, "activeTopics");
        kotlin.jvm.internal.m.e(prefetchBlobs, "prefetchBlobs");
        kotlin.jvm.internal.m.e(topics, "topics");
        this.domain = domain;
        this.manifest = manifest;
        this.activeTopics = activeTopics;
        this.prefetchBlobs = prefetchBlobs;
        this.topics = topics;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PersistedRemoteConfigurationState(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, java.util.Map map, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        int i9 = i3 & 4;
        p078i6.w wVar = p078i6.w.f23205h;
        this(str, str2, i9 != 0 ? wVar : list, (i3 & 8) != 0 ? wVar : list2, (i3 & 16) != 0 ? p078i6.x.f23206h : map);
    }
}
