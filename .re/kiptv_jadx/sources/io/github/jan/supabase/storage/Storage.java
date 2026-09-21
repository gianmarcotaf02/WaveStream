package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001b\u001aJ.\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0014\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0015\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0018\u0082\u0001\u0001\u001c¨\u0006\u001d"}, d2 = {"Lio/github/jan/supabase/storage/Storage;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/storage/Storage$Config;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "", "id", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/BucketBuilder;", "Lh6/A;", "builder", "createBucket", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "updateBucket", "", "Lio/github/jan/supabase/storage/Bucket;", "retrieveBuckets", "(Ll6/c;)Ljava/lang/Object;", "bucketId", "retrieveBucketById", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "emptyBucket", "deleteBucket", "Lio/github/jan/supabase/storage/BucketApi;", "get", "(Ljava/lang/String;)Lio/github/jan/supabase/storage/BucketApi;", "from", "Companion", "Config", "Lio/github/jan/supabase/storage/StorageImpl;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface Storage extends io.github.jan.supabase.plugins.MainPlugin<io.github.jan.supabase.storage.Storage.Config>, io.github.jan.supabase.plugins.CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.github.jan.supabase.storage.Storage.Companion INSTANCE = io.github.jan.supabase.storage.Storage.Companion.$$INSTANCE;
    public static final long DEFAULT_CHUNK_SIZE = 6291456;

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lio/github/jan/supabase/storage/Storage$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/storage/Storage$Config;", "Lio/github/jan/supabase/storage/Storage;", "<init>", "()V", "Lkotlin/Function1;", "Lh6/A;", io.sentry.Session.JsonKeys.INIT, "createConfig", "(Lx6/j;)Lio/github/jan/supabase/storage/Storage$Config;", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "config", "create", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/storage/Storage$Config;)Lio/github/jan/supabase/storage/Storage;", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lio/github/jan/supabase/logging/SupabaseLogger;", io.sentry.SentryEvent.JsonKeys.LOGGER, "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "", "API_VERSION", "I", "", "DEFAULT_CHUNK_SIZE", "J", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion implements io.github.jan.supabase.plugins.SupabasePluginProvider<io.github.jan.supabase.storage.Storage.Config, io.github.jan.supabase.storage.Storage> {
        public static final int API_VERSION = 1;
        public static final long DEFAULT_CHUNK_SIZE = 6291456;
        static final /* synthetic */ io.github.jan.supabase.storage.Storage.Companion $$INSTANCE = new io.github.jan.supabase.storage.Storage.Companion();
        private static final java.lang.String key = "storage";
        private static final io.github.jan.supabase.logging.SupabaseLogger logger = io.github.jan.supabase.SupabaseClient.Companion.createLogger$default(io.github.jan.supabase.SupabaseClient.INSTANCE, "Supabase-Storage", null, 2, null);

        private Companion() {
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public java.lang.String getKey() {
            return key;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.logging.SupabaseLogger getLogger() {
            return logger;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public void setLogLevel(io.github.jan.supabase.logging.LogLevel logLevel) {
            io.github.jan.supabase.plugins.SupabasePluginProvider.DefaultImpls.setLogLevel(this, logLevel);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public void setup(io.github.jan.supabase.SupabaseClientBuilder supabaseClientBuilder, io.github.jan.supabase.storage.Storage.Config config) {
            io.github.jan.supabase.plugins.SupabasePluginProvider.DefaultImpls.setup(this, supabaseClientBuilder, config);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.storage.Storage create(io.github.jan.supabase.SupabaseClient supabaseClient, io.github.jan.supabase.storage.Storage.Config config) {
            kotlin.jvm.internal.m.e(supabaseClient, "supabaseClient");
            kotlin.jvm.internal.m.e(config, "config");
            return new io.github.jan.supabase.storage.StorageImpl(supabaseClient, config);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public io.github.jan.supabase.storage.Storage.Config createConfig(p194x6.j init) {
            kotlin.jvm.internal.m.e(init, "init");
            io.github.jan.supabase.storage.Storage.Config config = new io.github.jan.supabase.storage.Storage.Config(0L, null, null, 7, null);
            init.invoke(config);
            return config;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00013B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0006\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010(R(\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lio/github/jan/supabase/storage/Storage$Config;", "Lio/github/jan/supabase/plugins/MainConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationConfig;", "LP7/b;", "transferTimeout", "Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "resumable", "Lio/github/jan/supabase/SupabaseSerializer;", "serializer", "<init>", "(JLio/github/jan/supabase/storage/Storage$Config$Resumable;Lio/github/jan/supabase/SupabaseSerializer;Lkotlin/jvm/internal/f;)V", "Lkotlin/Function1;", "Lh6/A;", "builder", "(Lx6/j;)V", "component1-UwyO8pc", "()J", "component1", "component2$storage_kt_release", "()Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "component2", "component3", "()Lio/github/jan/supabase/SupabaseSerializer;", "copy-KLykuaI", "(JLio/github/jan/supabase/storage/Storage$Config$Resumable;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/storage/Storage$Config;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getTransferTimeout-UwyO8pc", "setTransferTimeout-LRDsOJo", "(J)V", "Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "getResumable", "setResumable", "(Lio/github/jan/supabase/storage/Storage$Config$Resumable;)V", "getResumable$annotations", "()V", "Lio/github/jan/supabase/SupabaseSerializer;", "getSerializer", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "Resumable", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final /* data */ class Config extends io.github.jan.supabase.plugins.MainConfig implements io.github.jan.supabase.plugins.CustomSerializationConfig {
        private io.github.jan.supabase.storage.Storage.Config.Resumable resumable;
        private io.github.jan.supabase.SupabaseSerializer serializer;
        private long transferTimeout;

        @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\r\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010(R*\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020)8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010$¨\u0006."}, d2 = {"Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "cache", "LP7/b;", "retryTimeout", "", "onlyUpdateStateAfterChunk", "<init>", "(Lio/github/jan/supabase/storage/resumable/ResumableCache;JZLkotlin/jvm/internal/f;)V", "component1", "()Lio/github/jan/supabase/storage/resumable/ResumableCache;", "component2-UwyO8pc", "()J", "component2", "component3", "()Z", "copy-8Mi8wO0", "(Lio/github/jan/supabase/storage/resumable/ResumableCache;JZ)Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "getCache", "setCache", "(Lio/github/jan/supabase/storage/resumable/ResumableCache;)V", "J", "getRetryTimeout-UwyO8pc", "setRetryTimeout-LRDsOJo", "(J)V", "Z", "getOnlyUpdateStateAfterChunk", "setOnlyUpdateStateAfterChunk", "(Z)V", "", "value", "defaultChunkSize", "getDefaultChunkSize", "setDefaultChunkSize", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final /* data */ class Resumable {
            private io.github.jan.supabase.storage.resumable.ResumableCache cache;
            private long defaultChunkSize;
            private boolean onlyUpdateStateAfterChunk;
            private long retryTimeout;

            public /* synthetic */ Resumable(io.github.jan.supabase.storage.resumable.ResumableCache resumableCache, long j, boolean z6, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this(resumableCache, j, z6);
            }

            /* JADX INFO: renamed from: copy-8Mi8wO0$default, reason: not valid java name */
            public static /* synthetic */ io.github.jan.supabase.storage.Storage.Config.Resumable m355copy8Mi8wO0$default(io.github.jan.supabase.storage.Storage.Config.Resumable resumable, io.github.jan.supabase.storage.resumable.ResumableCache resumableCache, long j, boolean z6, int i3, java.lang.Object obj) {
                if ((i3 & 1) != 0) {
                    resumableCache = resumable.cache;
                }
                if ((i3 & 2) != 0) {
                    j = resumable.retryTimeout;
                }
                if ((i3 & 4) != 0) {
                    z6 = resumable.onlyUpdateStateAfterChunk;
                }
                return resumable.m357copy8Mi8wO0(resumableCache, j, z6);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final io.github.jan.supabase.storage.resumable.ResumableCache getCache() {
                return this.cache;
            }

            /* JADX INFO: renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
            public final long getRetryTimeout() {
                return this.retryTimeout;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getOnlyUpdateStateAfterChunk() {
                return this.onlyUpdateStateAfterChunk;
            }

            /* JADX INFO: renamed from: copy-8Mi8wO0, reason: not valid java name */
            public final io.github.jan.supabase.storage.Storage.Config.Resumable m357copy8Mi8wO0(io.github.jan.supabase.storage.resumable.ResumableCache cache, long retryTimeout, boolean onlyUpdateStateAfterChunk) {
                return new io.github.jan.supabase.storage.Storage.Config.Resumable(cache, retryTimeout, onlyUpdateStateAfterChunk, null);
            }

            public boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (other instanceof io.github.jan.supabase.storage.Storage.Config.Resumable) {
                    io.github.jan.supabase.storage.Storage.Config.Resumable resumable = (io.github.jan.supabase.storage.Storage.Config.Resumable) other;
                    if (kotlin.jvm.internal.m.a(this.cache, resumable.cache)) {
                        long j = this.retryTimeout;
                        long j9 = resumable.retryTimeout;
                        P7.a aVar = P7.b.f8168i;
                        if (j == j9 && this.onlyUpdateStateAfterChunk == resumable.onlyUpdateStateAfterChunk) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public final io.github.jan.supabase.storage.resumable.ResumableCache getCache() {
                return this.cache;
            }

            public final long getDefaultChunkSize() {
                return this.defaultChunkSize;
            }

            public final boolean getOnlyUpdateStateAfterChunk() {
                return this.onlyUpdateStateAfterChunk;
            }

            /* JADX INFO: renamed from: getRetryTimeout-UwyO8pc, reason: not valid java name */
            public final long m358getRetryTimeoutUwyO8pc() {
                return this.retryTimeout;
            }

            public int hashCode() {
                io.github.jan.supabase.storage.resumable.ResumableCache resumableCache = this.cache;
                int iHashCode = resumableCache == null ? 0 : resumableCache.hashCode();
                long j = this.retryTimeout;
                P7.a aVar = P7.b.f8168i;
                return java.lang.Boolean.hashCode(this.onlyUpdateStateAfterChunk) + p121o0.p.e(iHashCode * 31, 31, j);
            }

            public final void setCache(io.github.jan.supabase.storage.resumable.ResumableCache resumableCache) {
                this.cache = resumableCache;
            }

            public final void setDefaultChunkSize(long j) {
                if (j != 6291456) {
                    io.github.jan.supabase.logging.SupabaseLogger logger = io.github.jan.supabase.storage.Storage.INSTANCE.getLogger();
                    io.github.jan.supabase.logging.LogLevel logLevel = io.github.jan.supabase.logging.LogLevel.WARNING;
                    io.github.jan.supabase.logging.LogLevel level = logger.getLevel();
                    if (level == null) {
                        level = io.github.jan.supabase.SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                    }
                    if (logLevel.compareTo(level) >= 0) {
                        logger.log(logLevel, (java.lang.Throwable) null, "Supabase currently only supports a chunk size of 6MB");
                    }
                }
                this.defaultChunkSize = j;
            }

            public final void setOnlyUpdateStateAfterChunk(boolean z6) {
                this.onlyUpdateStateAfterChunk = z6;
            }

            /* JADX INFO: renamed from: setRetryTimeout-LRDsOJo, reason: not valid java name */
            public final void m359setRetryTimeoutLRDsOJo(long j) {
                this.retryTimeout = j;
            }

            public java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Resumable(cache=");
                sb.append(this.cache);
                sb.append(", retryTimeout=");
                sb.append((java.lang.Object) P7.b.j(this.retryTimeout));
                sb.append(", onlyUpdateStateAfterChunk=");
                return v5.L.a(sb, this.onlyUpdateStateAfterChunk, ')');
            }

            private Resumable(io.github.jan.supabase.storage.resumable.ResumableCache resumableCache, long j, boolean z6) {
                this.cache = resumableCache;
                this.retryTimeout = j;
                this.onlyUpdateStateAfterChunk = z6;
                this.defaultChunkSize = 6291456L;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Resumable(io.github.jan.supabase.storage.resumable.ResumableCache resumableCache, long j, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                io.github.jan.supabase.storage.resumable.ResumableCache resumableCache2 = (i3 & 1) != 0 ? null : resumableCache;
                if ((i3 & 2) != 0) {
                    P7.a aVar = P7.b.f8168i;
                    j = E8.l.N(5, P7.d.SECONDS);
                }
                this(resumableCache2, j, (i3 & 4) != 0 ? false : z6, null);
            }
        }

        public /* synthetic */ Config(long j, io.github.jan.supabase.storage.Storage.Config.Resumable resumable, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this(j, resumable, supabaseSerializer);
        }

        /* JADX INFO: renamed from: copy-KLykuaI$default, reason: not valid java name */
        public static /* synthetic */ io.github.jan.supabase.storage.Storage.Config m350copyKLykuaI$default(io.github.jan.supabase.storage.Storage.Config config, long j, io.github.jan.supabase.storage.Storage.Config.Resumable resumable, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                j = config.transferTimeout;
            }
            if ((i3 & 2) != 0) {
                resumable = config.resumable;
            }
            if ((i3 & 4) != 0) {
                supabaseSerializer = config.serializer;
            }
            return config.m352copyKLykuaI(j, resumable, supabaseSerializer);
        }

        public static /* synthetic */ void getResumable$annotations() {
        }

        /* JADX INFO: renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
        public final long getTransferTimeout() {
            return this.transferTimeout;
        }

        /* JADX INFO: renamed from: component2$storage_kt_release, reason: from getter */
        public final io.github.jan.supabase.storage.Storage.Config.Resumable getResumable() {
            return this.resumable;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        /* JADX INFO: renamed from: copy-KLykuaI, reason: not valid java name */
        public final io.github.jan.supabase.storage.Storage.Config m352copyKLykuaI(long transferTimeout, io.github.jan.supabase.storage.Storage.Config.Resumable resumable, io.github.jan.supabase.SupabaseSerializer serializer) {
            kotlin.jvm.internal.m.e(resumable, "resumable");
            return new io.github.jan.supabase.storage.Storage.Config(transferTimeout, resumable, serializer, null);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof io.github.jan.supabase.storage.Storage.Config) {
                io.github.jan.supabase.storage.Storage.Config config = (io.github.jan.supabase.storage.Storage.Config) other;
                long j = this.transferTimeout;
                long j9 = config.transferTimeout;
                P7.a aVar = P7.b.f8168i;
                if (j == j9 && kotlin.jvm.internal.m.a(this.resumable, config.resumable) && kotlin.jvm.internal.m.a(this.serializer, config.serializer)) {
                    return true;
                }
            }
            return false;
        }

        public final io.github.jan.supabase.storage.Storage.Config.Resumable getResumable() {
            return this.resumable;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public io.github.jan.supabase.SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        /* JADX INFO: renamed from: getTransferTimeout-UwyO8pc, reason: not valid java name */
        public final long m353getTransferTimeoutUwyO8pc() {
            return this.transferTimeout;
        }

        public int hashCode() {
            long j = this.transferTimeout;
            P7.a aVar = P7.b.f8168i;
            int iHashCode = (this.resumable.hashCode() + (java.lang.Long.hashCode(j) * 31)) * 31;
            io.github.jan.supabase.SupabaseSerializer supabaseSerializer = this.serializer;
            return iHashCode + (supabaseSerializer == null ? 0 : supabaseSerializer.hashCode());
        }

        public final void resumable(p194x6.j builder) {
            kotlin.jvm.internal.m.e(builder, "builder");
            io.github.jan.supabase.storage.Storage.Config.Resumable resumable = new io.github.jan.supabase.storage.Storage.Config.Resumable(null, 0L, false, 7, null);
            builder.invoke(resumable);
            setResumable(resumable);
        }

        public final void setResumable(io.github.jan.supabase.storage.Storage.Config.Resumable resumable) {
            kotlin.jvm.internal.m.e(resumable, "<set-?>");
            this.resumable = resumable;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public void setSerializer(io.github.jan.supabase.SupabaseSerializer supabaseSerializer) {
            this.serializer = supabaseSerializer;
        }

        /* JADX INFO: renamed from: setTransferTimeout-LRDsOJo, reason: not valid java name */
        public final void m354setTransferTimeoutLRDsOJo(long j) {
            this.transferTimeout = j;
        }

        public java.lang.String toString() {
            return "Config(transferTimeout=" + ((java.lang.Object) P7.b.j(this.transferTimeout)) + ", resumable=" + this.resumable + ", serializer=" + this.serializer + ')';
        }

        public /* synthetic */ Config(long j, io.github.jan.supabase.storage.Storage.Config.Resumable resumable, io.github.jan.supabase.SupabaseSerializer supabaseSerializer, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            io.github.jan.supabase.storage.Storage.Config.Resumable resumable2;
            if ((i3 & 1) != 0) {
                P7.a aVar = P7.b.f8168i;
                j = E8.l.N(120, P7.d.SECONDS);
            }
            long j9 = j;
            if ((i3 & 2) != 0) {
                resumable2 = new io.github.jan.supabase.storage.Storage.Config.Resumable(null, 0L, false, 7, null);
            } else {
                resumable2 = resumable;
            }
            this(j9, resumable2, (i3 & 4) != 0 ? null : supabaseSerializer, null);
        }

        private Config(long j, io.github.jan.supabase.storage.Storage.Config.Resumable resumable, io.github.jan.supabase.SupabaseSerializer supabaseSerializer) {
            kotlin.jvm.internal.m.e(resumable, "resumable");
            this.transferTimeout = j;
            this.resumable = resumable;
            this.serializer = supabaseSerializer;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        public static java.lang.Object close(io.github.jan.supabase.storage.Storage storage, p100l6.c cVar) {
            java.lang.Object objClose = io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.close(storage, cVar);
            return objClose == p109m6.a.f25430h ? objClose : p070h6.A.f22523a;
        }

        public static /* synthetic */ java.lang.Object createBucket$default(io.github.jan.supabase.storage.Storage storage, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBucket");
            }
            if ((i3 & 2) != 0) {
                jVar = new io.github.jan.supabase.storage.f(21);
            }
            return storage.createBucket(str, jVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p070h6.A createBucket$lambda$0(io.github.jan.supabase.storage.BucketBuilder bucketBuilder) {
            kotlin.jvm.internal.m.e(bucketBuilder, "<this>");
            return p070h6.A.f22523a;
        }

        public static io.github.jan.supabase.storage.BucketApi from(io.github.jan.supabase.storage.Storage storage, java.lang.String bucketId) {
            kotlin.jvm.internal.m.e(bucketId, "bucketId");
            return storage.get(bucketId);
        }

        public static void init(io.github.jan.supabase.storage.Storage storage) {
            io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.init(storage);
        }

        public static java.lang.String resolveUrl(io.github.jan.supabase.storage.Storage storage, java.lang.String path) {
            kotlin.jvm.internal.m.e(path, "path");
            return io.github.jan.supabase.plugins.MainPlugin.DefaultImpls.resolveUrl(storage, path);
        }

        public static /* synthetic */ java.lang.Object updateBucket$default(io.github.jan.supabase.storage.Storage storage, java.lang.String str, p194x6.j jVar, p100l6.c cVar, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBucket");
            }
            if ((i3 & 2) != 0) {
                jVar = new io.github.jan.supabase.storage.f(22);
            }
            return storage.updateBucket(str, jVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static p070h6.A updateBucket$lambda$1(io.github.jan.supabase.storage.BucketBuilder bucketBuilder) {
            kotlin.jvm.internal.m.e(bucketBuilder, "<this>");
            return p070h6.A.f22523a;
        }
    }

    java.lang.Object createBucket(java.lang.String str, p194x6.j jVar, p100l6.c cVar);

    java.lang.Object deleteBucket(java.lang.String str, p100l6.c cVar);

    java.lang.Object emptyBucket(java.lang.String str, p100l6.c cVar);

    io.github.jan.supabase.storage.BucketApi from(java.lang.String bucketId);

    io.github.jan.supabase.storage.BucketApi get(java.lang.String bucketId);

    java.lang.Object retrieveBucketById(java.lang.String str, p100l6.c cVar);

    java.lang.Object retrieveBuckets(p100l6.c cVar);

    java.lang.Object updateBucket(java.lang.String str, p194x6.j jVar, p100l6.c cVar);
}
