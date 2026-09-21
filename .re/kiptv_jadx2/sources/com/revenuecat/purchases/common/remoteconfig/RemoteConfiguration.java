package com.revenuecat.purchases.common.remoteconfig;

import B2.a;
import O7.x;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.revenuecat.purchases.common.JsonProvider;
import io.ktor.http.LinkHeader;
import io.sentry.protocol.Request;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;
import p078i6.w;
import p119n8.h;
import p119n8.i;
import p121o0.p;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;
import p153r8.F;
import p153r8.k0;
import p153r8.p0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u0000 B2\u00020\u0001:\u0003CBDBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0010\b\u0001\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0082\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010#\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J(\u00101\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,HÁ\u0001¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b9\u0010\u0016R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b;\u00108\u001a\u0004\b:\u0010\u0018R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00104\u0012\u0004\b=\u00108\u001a\u0004\b<\u0010\u0018R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00102\u0012\u0004\bA\u00108\u001a\u0004\b@\u0010\u0016¨\u0006E"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", "", "", "domain", "", "subdomains", "appUuid", "manifest", "activeTopics", "prefetchBlobs", "", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "topics", "stateHash", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lr8/k0;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Map;", "component8", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDomain", "Ljava/util/List;", "getSubdomains", "getAppUuid", "getAppUuid$annotations", "()V", "getManifest", "getActiveTopics", "getActiveTopics$annotations", "getPrefetchBlobs", "getPrefetchBlobs$annotations", "Ljava/util/Map;", "getTopics", "getStateHash", "getStateHash$annotations", "Companion", "$serializer", "ConfigItem", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class RemoteConfiguration {
    private static final KSerializer[] $childSerializers;

    public static final Companion INSTANCE = new Companion(null);
    private final List<String> activeTopics;
    private final String appUuid;
    private final String domain;
    private final String manifest;
    private final List<String> prefetchBlobs;
    private final String stateHash;
    private final List<String> subdomains;
    private final Map<String, ConfigTopic> topics;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$Companion;", "", "()V", "parse", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration;", "buffer", "Ljava/nio/ByteBuffer;", "bytes", "", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final RemoteConfiguration parse(byte[] bytes) {
            m.e(bytes, "bytes");
            return (RemoteConfiguration) JsonProvider.INSTANCE.getDefaultJson().b(x.n0(bytes), serializer());
        }

        public final KSerializer serializer() {
            return RemoteConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }

        public final RemoteConfiguration parse(ByteBuffer buffer) {
            m.e(buffer, "buffer");
            ByteBuffer byteBufferDuplicate = buffer.duplicate();
            byte[] bArr = new byte[byteBufferDuplicate.remaining()];
            byteBufferDuplicate.get(bArr);
            return parse(bArr);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "", "", "blobRef", "", LinkHeader.Rel.Prefetch, "Lkotlinx/serialization/json/c;", TtmlNode.TAG_METADATA, "<init>", "(Ljava/lang/String;ZLkotlinx/serialization/json/c;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lkotlinx/serialization/json/c;", "copy", "(Ljava/lang/String;ZLkotlinx/serialization/json/c;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "toString", "", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBlobRef", "Z", "getPrefetch", "Lkotlinx/serialization/json/c;", "getMetadata", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i(with = ConfigItemSerializer.class)
    public static final class ConfigItem {

        public static final Companion INSTANCE = new Companion(null);
        private final String blobRef;
        private final c metadata;
        private final boolean prefetch;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return ConfigItemSerializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public ConfigItem() {
            this(null, false, null, 7, null);
        }

        public static ConfigItem copy$default(ConfigItem configItem, String str, boolean z6, c cVar, int i3, Object obj) {
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

        public final String getBlobRef() {
            return this.blobRef;
        }

        public final boolean getPrefetch() {
            return this.prefetch;
        }

        public final c getMetadata() {
            return this.metadata;
        }

        public final ConfigItem copy(String blobRef, boolean prefetch, c metadata) {
            m.e(metadata, "metadata");
            return new ConfigItem(blobRef, prefetch, metadata);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfigItem)) {
                return false;
            }
            ConfigItem configItem = (ConfigItem) other;
            return m.a(this.blobRef, configItem.blobRef) && this.prefetch == configItem.prefetch && m.a(this.metadata, configItem.metadata);
        }

        public final String getBlobRef() {
            return this.blobRef;
        }

        public final c getMetadata() {
            return this.metadata;
        }

        public final boolean getPrefetch() {
            return this.prefetch;
        }

        public int hashCode() {
            String str = this.blobRef;
            return this.metadata.f24558h.hashCode() + p.f((str == null ? 0 : str.hashCode()) * 31, 31, this.prefetch);
        }

        public String toString() {
            return "ConfigItem(blobRef=" + this.blobRef + ", prefetch=" + this.prefetch + ", metadata=" + this.metadata + ')';
        }

        public ConfigItem(String str, boolean z6, c metadata) {
            m.e(metadata, "metadata");
            this.blobRef = str;
            this.prefetch = z6;
            this.metadata = metadata;
        }

        public ConfigItem(String str, boolean z6, c cVar, int i3, AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? false : z6, (i3 & 4) != 0 ? new c(p078i6.x.f23206h) : cVar);
        }
    }

    static {
        p0 p0Var = p0.f26988a;
        $childSerializers = new KSerializer[]{null, new C2691d(p0Var, 0), null, null, new C2691d(p0Var, 0), new C2691d(p0Var, 0), new F(p0Var, ConfigTopicSerializer.INSTANCE, 1), null};
    }

    @p070h6.c
    public RemoteConfiguration(int i3, String str, List list, @h("app_uuid") String str2, String str3, @h("active_topics") List list2, @h("prefetch_blobs") List list3, Map map, @h("state_hash") String str4, k0 k0Var) {
        if (9 != (i3 & 9)) {
            AbstractC2686a0.l(i3, 9, RemoteConfiguration$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.domain = str;
        int i9 = i3 & 2;
        w wVar = w.f23205h;
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

    public static RemoteConfiguration copy$default(RemoteConfiguration remoteConfiguration, String str, List list, String str2, String str3, List list2, List list3, Map map, String str4, int i3, Object obj) {
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
        Map map2 = map;
        String str5 = str4;
        List list4 = list2;
        List list5 = list3;
        return remoteConfiguration.copy(str, list, str2, str3, list4, list5, map2, str5);
    }

    @h("active_topics")
    public static void getActiveTopics$annotations() {
    }

    @h("app_uuid")
    public static void getAppUuid$annotations() {
    }

    @h("prefetch_blobs")
    public static void getPrefetchBlobs$annotations() {
    }

    @h("state_hash")
    public static void getStateHash$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(RemoteConfiguration self, b output, SerialDescriptor serialDesc) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.domain);
        boolean zE = output.E(serialDesc);
        w wVar = w.f23205h;
        if (zE || !m.a(self.subdomains, wVar)) {
            output.h(serialDesc, 1, kSerializerArr[1], self.subdomains);
        }
        if (output.E(serialDesc) || self.appUuid != null) {
            output.t(serialDesc, 2, p0.f26988a, self.appUuid);
        }
        output.s(serialDesc, 3, self.manifest);
        if (output.E(serialDesc) || !m.a(self.activeTopics, wVar)) {
            output.h(serialDesc, 4, kSerializerArr[4], self.activeTopics);
        }
        if (output.E(serialDesc) || !m.a(self.prefetchBlobs, wVar)) {
            output.h(serialDesc, 5, kSerializerArr[5], self.prefetchBlobs);
        }
        if (output.E(serialDesc) || !m.a(self.topics, p078i6.x.f23206h)) {
            output.h(serialDesc, 6, kSerializerArr[6], self.topics);
        }
        if (!output.E(serialDesc) && self.stateHash == null) {
            return;
        }
        output.t(serialDesc, 7, p0.f26988a, self.stateHash);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final List<String> component2() {
        return this.subdomains;
    }

    public final String getAppUuid() {
        return this.appUuid;
    }

    public final String getManifest() {
        return this.manifest;
    }

    public final List<String> component5() {
        return this.activeTopics;
    }

    public final List<String> component6() {
        return this.prefetchBlobs;
    }

    public final Map<String, ConfigTopic> component7() {
        return this.topics;
    }

    public final String getStateHash() {
        return this.stateHash;
    }

    public final RemoteConfiguration copy(String domain, List<String> subdomains, String appUuid, String manifest, List<String> activeTopics, List<String> prefetchBlobs, Map<String, ConfigTopic> topics, String stateHash) {
        m.e(domain, "domain");
        m.e(subdomains, "subdomains");
        m.e(manifest, "manifest");
        m.e(activeTopics, "activeTopics");
        m.e(prefetchBlobs, "prefetchBlobs");
        m.e(topics, "topics");
        return new RemoteConfiguration(domain, subdomains, appUuid, manifest, activeTopics, prefetchBlobs, topics, stateHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteConfiguration)) {
            return false;
        }
        RemoteConfiguration remoteConfiguration = (RemoteConfiguration) other;
        return m.a(this.domain, remoteConfiguration.domain) && m.a(this.subdomains, remoteConfiguration.subdomains) && m.a(this.appUuid, remoteConfiguration.appUuid) && m.a(this.manifest, remoteConfiguration.manifest) && m.a(this.activeTopics, remoteConfiguration.activeTopics) && m.a(this.prefetchBlobs, remoteConfiguration.prefetchBlobs) && m.a(this.topics, remoteConfiguration.topics) && m.a(this.stateHash, remoteConfiguration.stateHash);
    }

    public final List<String> getActiveTopics() {
        return this.activeTopics;
    }

    public final String getAppUuid() {
        return this.appUuid;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getManifest() {
        return this.manifest;
    }

    public final List<String> getPrefetchBlobs() {
        return this.prefetchBlobs;
    }

    public final String getStateHash() {
        return this.stateHash;
    }

    public final List<String> getSubdomains() {
        return this.subdomains;
    }

    public final Map<String, ConfigTopic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        int iB = a.b(this.domain.hashCode() * 31, 31, this.subdomains);
        String str = this.appUuid;
        int iC = a.c(a.b(a.b(a.a((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.manifest), 31, this.activeTopics), 31, this.prefetchBlobs), 31, this.topics);
        String str2 = this.stateHash;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfiguration(domain=");
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
        return f.l(sb, this.stateHash, ')');
    }

    public RemoteConfiguration(String domain, List<String> subdomains, String str, String manifest, List<String> activeTopics, List<String> prefetchBlobs, Map<String, ConfigTopic> topics, String str2) {
        m.e(domain, "domain");
        m.e(subdomains, "subdomains");
        m.e(manifest, "manifest");
        m.e(activeTopics, "activeTopics");
        m.e(prefetchBlobs, "prefetchBlobs");
        m.e(topics, "topics");
        this.domain = domain;
        this.subdomains = subdomains;
        this.appUuid = str;
        this.manifest = manifest;
        this.activeTopics = activeTopics;
        this.prefetchBlobs = prefetchBlobs;
        this.topics = topics;
        this.stateHash = str2;
    }

    public RemoteConfiguration(String str, List list, String str2, String str3, List list2, List list3, Map map, String str4, int i3, AbstractC2541f abstractC2541f) {
        int i9 = i3 & 2;
        w wVar = w.f23205h;
        this(str, i9 != 0 ? wVar : list, (i3 & 4) != 0 ? null : str2, str3, (i3 & 16) != 0 ? wVar : list2, (i3 & 32) != 0 ? wVar : list3, (i3 & 64) != 0 ? p078i6.x.f23206h : map, (i3 & 128) != 0 ? null : str4);
    }
}
