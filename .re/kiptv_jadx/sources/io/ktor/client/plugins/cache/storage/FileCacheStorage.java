package io.ktor.client.plugins.cache.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0012\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u001bJ\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u0015\u0010\u001dJ \u0010\u001f\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b!\u0010\"J.\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0#H\u0096@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lio/ktor/client/plugins/cache/storage/FileCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Ljava/io/File;", "directory", "LS7/w;", "dispatcher", "<init>", "(Ljava/io/File;LS7/w;)V", "Lio/ktor/http/Url;", io.sentry.protocol.Request.JsonKeys.URL, "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "(Lio/ktor/http/Url;)Ljava/lang/String;", "urlHex", "", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "caches", "", "writeCache", "(Ljava/lang/String;Ljava/util/List;Ll6/c;)Ljava/lang/Object;", "", "readCache", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteChannel;", "channel", "cache", "Lh6/A;", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;Ll6/c;)Ljava/lang/Object;", "data", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Ll6/c;)Ljava/lang/Object;", "findAll", "(Lio/ktor/http/Url;Ll6/c;)Ljava/lang/Object;", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Ll6/c;)Ljava/lang/Object;", "Ljava/io/File;", "LS7/w;", "Lio/ktor/util/collections/ConcurrentMap;", "Lc8/a;", "mutexes", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class FileCacheStorage implements io.ktor.client.plugins.cache.storage.CacheStorage {
    private final java.io.File directory;
    private final S7.AbstractC0906w dispatcher;
    private final io.ktor.util.collections.ConcurrentMap<java.lang.String, p028c8.a> mutexes;

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {84}, m = "find")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.FileCacheStorage.this.find(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {com.revenuecat.purchases.utils.EventsFileHelper.MAX_EVENT_PROPERTY_SIZE}, m = "findAll")
    public static final class C23611 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public C23611(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.FileCacheStorage.this.findAll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NO_CONTENT, 122, 125, 127}, m = "readCache")
    public static final class C23621 extends p117n6.c {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23621(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.FileCacheStorage.this.readCache((java.lang.String) null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {161, 162, 162, 163, 164, 167, 168, 171, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC4, 173, 174, 177, 178, 182, 184}, m = "readCache")
    public static final class AnonymousClass3 extends p117n6.c {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$10;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        java.lang.Object L$7;
        java.lang.Object L$8;
        java.lang.Object L$9;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass3(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.FileCacheStorage.this.readCache((io.ktor.utils.io.ByteReadChannel) null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "Lh6/A;", "<anonymous>", "(LS7/A;)V"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", l = {androidx.media3.container.MdtaMetadataEntry.TYPE_INDICATOR_8_BIT_UNSIGNED_INT, 76}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends p117n6.i implements p194x6.m {
        final /* synthetic */ io.ktor.client.plugins.cache.storage.CachedResponseData $data;
        final /* synthetic */ io.ktor.http.Url $url;
        java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, p100l6.c cVar) {
            super(2, cVar);
            this.$url = url;
            this.$data = cachedResponseData;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return io.ktor.client.plugins.cache.storage.FileCacheStorage.this.new AnonymousClass2(this.$url, this.$data, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass2) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        
            if (r3.writeCache(r1, r9, r8) == r0) goto L21;
         */
        @Override // p117n6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            java.lang.String strKey;
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    strKey = (java.lang.String) this.L$0;
                    com.google.common.util.concurrent.P.u0(obj);
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                }
                return p070h6.A.f22523a;
            }
            com.google.common.util.concurrent.P.u0(obj);
            strKey = io.ktor.client.plugins.cache.storage.FileCacheStorage.this.key(this.$url);
            io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage = io.ktor.client.plugins.cache.storage.FileCacheStorage.this;
            this.L$0 = strKey;
            this.label = 1;
            obj = fileCacheStorage.readCache(strKey, this);
            if (obj != aVar) {
            }
            return aVar;
            io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = this.$data;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : (java.lang.Iterable) obj) {
                if (!kotlin.jvm.internal.m.a(((io.ktor.client.plugins.cache.storage.CachedResponseData) obj2).getVaryKeys(), cachedResponseData.getVaryKeys())) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayListZ1 = p078i6.o.z1(this.$data, arrayList);
            io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage2 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this;
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "", "<anonymous>", "(LS7/A;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2", f = "FileCacheStorage.kt", l = {com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.NO_CONTENT, 105}, m = "invokeSuspend")
    public static final class C23632 extends p117n6.i implements p194x6.m {
        final /* synthetic */ java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> $caches;
        final /* synthetic */ java.lang.String $urlHex;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23632(java.lang.String str, java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> list, p100l6.c cVar) {
            super(2, cVar);
            this.$urlHex = str;
            this.$caches = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p028c8.a invokeSuspend$lambda$0() {
            return new p028c8.d();
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            io.ktor.client.plugins.cache.storage.FileCacheStorage.C23632 c23632 = io.ktor.client.plugins.cache.storage.FileCacheStorage.this.new C23632(this.$urlHex, this.$caches, cVar);
            c23632.L$0 = obj;
            return c23632;
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.client.plugins.cache.storage.FileCacheStorage.C23632) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
        /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
            io.ktor.client.plugins.cache.storage.FileCacheStorage fileCacheStorage;
            java.lang.String str;
            S7.A a2;
            p028c8.a aVar;
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> list;
            S7.A a9;
            io.ktor.utils.io.ByteChannel byteChannel;
            java.io.BufferedOutputStream bufferedOutputStream;
            ?? r9;
            java.lang.Object objCopyTo$default;
            p028c8.a aVar2;
            java.lang.Throwable th;
            java.lang.Object l2;
            p109m6.a aVar3 = p109m6.a.f25430h;
            int i3 = this.label;
            kotlin.jvm.internal.AbstractC2541f abstractC2541f = null;
            int i9 = 1;
            try {
                try {
                    try {
                        try {
                            if (i3 == 0) {
                                com.google.common.util.concurrent.P.u0(obj);
                                S7.A a10 = (S7.A) this.L$0;
                                p028c8.a aVar4 = (p028c8.a) io.ktor.client.plugins.cache.storage.FileCacheStorage.this.mutexes.computeIfAbsent(this.$urlHex, new io.ktor.client.plugins.cache.storage.a(1));
                                fileCacheStorage = io.ktor.client.plugins.cache.storage.FileCacheStorage.this;
                                str = this.$urlHex;
                                java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> list2 = this.$caches;
                                this.L$0 = a10;
                                this.L$1 = aVar4;
                                this.L$2 = fileCacheStorage;
                                this.L$3 = str;
                                this.L$4 = list2;
                                this.label = 1;
                                p028c8.d dVar = (p028c8.d) aVar4;
                                if (dVar.e(this) != aVar3) {
                                    a2 = a10;
                                    aVar = dVar;
                                    list = list2;
                                }
                                return aVar3;
                            }
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                r9 = (java.io.Closeable) this.L$1;
                                aVar2 = (p028c8.a) this.L$0;
                                try {
                                    com.google.common.util.concurrent.P.u0(obj);
                                    objCopyTo$default = obj;
                                    r9 = r9;
                                    l2 = new java.lang.Long(((java.lang.Number) objCopyTo$default).longValue());
                                    try {
                                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(r9, null);
                                    } catch (java.lang.Exception e6) {
                                        e = e6;
                                        aVar = aVar2;
                                        io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER().i("Exception during saving a cache to a file: ".concat(com.google.common.util.concurrent.AbstractC1903s.I(e)));
                                        l2 = p070h6.A.f22523a;
                                        aVar2 = aVar;
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        p028c8.a aVar5 = aVar2;
                                        ((p028c8.d) aVar5).g(null);
                                        throw th;
                                    }
                                    ((p028c8.d) aVar2).g(null);
                                    return l2;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    aVar = aVar2;
                                    ?? r10 = r9;
                                    th = th;
                                    try {
                                        throw th;
                                    } catch (java.lang.Throwable th4) {
                                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(r10, th);
                                        throw th4;
                                    }
                                }
                            }
                            list = (java.util.List) this.L$4;
                            str = (java.lang.String) this.L$3;
                            fileCacheStorage = (io.ktor.client.plugins.cache.storage.FileCacheStorage) this.L$2;
                            p028c8.a aVar6 = (p028c8.a) this.L$1;
                            S7.A a11 = (S7.A) this.L$0;
                            com.google.common.util.concurrent.P.u0(obj);
                            a2 = a11;
                            aVar = aVar6;
                            objCopyTo$default = io.ktor.utils.io.jvm.javaio.WritingKt.copyTo$default(byteChannel, r9, 0L, this, 2, null);
                            if (objCopyTo$default != aVar3) {
                                aVar2 = aVar;
                                r9 = r9;
                                l2 = new java.lang.Long(((java.lang.Number) objCopyTo$default).longValue());
                                com.google.android.gms.internal.play_billing.AbstractC1833d1.l(r9, null);
                                ((p028c8.d) aVar2).g(null);
                                return l2;
                            }
                            return aVar3;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            ?? r11 = r9;
                            th = th;
                            throw th;
                        }
                        S7.C.A(a9, null, new io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1(byteChannel, list, fileCacheStorage, null), 3);
                        this.L$0 = aVar;
                        this.L$1 = bufferedOutputStream;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 2;
                        r9 = bufferedOutputStream;
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r9 = bufferedOutputStream;
                    }
                    bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream(new java.io.File(fileCacheStorage.directory, str)), 8192);
                } catch (java.lang.Exception e9) {
                    e = e9;
                    io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER().i("Exception during saving a cache to a file: ".concat(com.google.common.util.concurrent.AbstractC1903s.I(e)));
                    l2 = p070h6.A.f22523a;
                    aVar2 = aVar;
                    ((p028c8.d) aVar2).g(null);
                    return l2;
                }
                a9 = a2;
                byteChannel = new io.ktor.utils.io.ByteChannel(false, i9, abstractC2541f);
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$3, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS, androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 140, 141, 143, 145, 146, 148, 149, 150, 151, 153, 154, 156, 157}, m = "writeCache")
    public static final class C23643 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23643(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.FileCacheStorage.this.writeCache((io.ktor.utils.io.ByteChannel) null, (io.ktor.client.plugins.cache.storage.CachedResponseData) null, this);
        }
    }

    public FileCacheStorage(java.io.File directory, S7.AbstractC0906w dispatcher) {
        kotlin.jvm.internal.m.e(directory, "directory");
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        this.directory = directory;
        this.dispatcher = dispatcher;
        this.mutexes = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);
        directory.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String key(io.ktor.http.Url url) {
        byte[] bArrDigest = java.security.MessageDigest.getInstance("SHA-256").digest(O7.x.p0(url.getUrlString()));
        kotlin.jvm.internal.m.d(bArrDigest, "digest(...)");
        return io.ktor.util.CryptoKt.hex(bArrDigest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x011f A[Catch: all -> 0x0095, TRY_LEAVE, TryCatch #2 {all -> 0x0095, blocks: (B:47:0x011f, B:55:0x014f, B:27:0x0090, B:45:0x010c), top: B:81:0x0090 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0138 -> B:87:0x0140). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object readCache(java.lang.String r21, p100l6.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache(java.lang.String, l6.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p028c8.a readCache$lambda$2() {
        return new p028c8.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object writeCache(java.lang.String str, java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> list, p100l6.c cVar) {
        return S7.C.m(new io.ktor.client.plugins.cache.storage.FileCacheStorage.C23632(str, list, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1 anonymousClass1;
        if (cVar instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1) {
            anonymousClass1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1(cVar);
        }
        java.lang.Object cache = anonymousClass1.result;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(cache);
            java.lang.String strKey = key(url);
            anonymousClass1.L$0 = map;
            anonymousClass1.label = 1;
            cache = readCache(strKey, anonymousClass1);
            if (cache == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (java.util.Map) anonymousClass1.L$0;
            com.google.common.util.concurrent.P.u0(cache);
        }
        for (java.lang.Object obj2 : (java.util.Set) cache) {
            io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj2;
            if (!map.isEmpty()) {
                java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
                        java.lang.String key = next.getKey();
                        if (!kotlin.jvm.internal.m.a(cachedResponseData.getVaryKeys().get(key), next.getValue())) {
                        }
                    }
                }
            }
            if (map.size() == cachedResponseData.getVaryKeys().size()) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object findAll(io.ktor.http.Url url, p100l6.c cVar) throws java.lang.Throwable {
        io.ktor.client.plugins.cache.storage.FileCacheStorage.C23611 c23611;
        if (cVar instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.C23611) {
            c23611 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.C23611) cVar;
            int i3 = c23611.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23611.label = i3 - Integer.MIN_VALUE;
            } else {
                c23611 = new io.ktor.client.plugins.cache.storage.FileCacheStorage.C23611(cVar);
            }
        } else {
            c23611 = new io.ktor.client.plugins.cache.storage.FileCacheStorage.C23611(cVar);
        }
        java.lang.Object cache = c23611.result;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = c23611.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(cache);
            java.lang.String strKey = key(url);
            c23611.label = 1;
            cache = readCache(strKey, c23611);
            if (cache == obj) {
                return obj;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(cache);
        }
        return p078i6.o.R1((java.lang.Iterable) cache);
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, p100l6.c cVar) throws java.lang.Throwable {
        java.lang.Object objK = S7.C.K(this.dispatcher, new io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass2(url, cachedResponseData, null), cVar);
        return objK == p109m6.a.f25430h ? objK : p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00df A[PHI: r13 r14
  0x00df: PHI (r13v12 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
  (r13v9 io.ktor.client.plugins.cache.storage.CachedResponseData)
  (r13v16 io.ktor.client.plugins.cache.storage.CachedResponseData)
 binds: [B:40:0x018c, B:24:0x00d4] A[DONT_GENERATE, DONT_INLINE]
  0x00df: PHI (r14v11 io.ktor.utils.io.ByteChannel) = (r14v8 io.ktor.utils.io.ByteChannel), (r14v14 io.ktor.utils.io.ByteChannel) binds: [B:40:0x018c, B:24:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0145  */
    /* JADX WARN: Code duplicated, block: B:39:0x016e A[PHI: r13 r14
  0x016e: PHI (r13v9 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
  (r13v6 io.ktor.client.plugins.cache.storage.CachedResponseData)
  (r13v11 io.ktor.client.plugins.cache.storage.CachedResponseData)
 binds: [B:37:0x016a, B:26:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x016e: PHI (r14v8 io.ktor.utils.io.ByteChannel) = (r14v5 io.ktor.utils.io.ByteChannel), (r14v10 io.ktor.utils.io.ByteChannel) binds: [B:37:0x016a, B:26:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:55:0x020d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x020d -> B:46:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x02e0 -> B:70:0x027f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object writeCache(io.ktor.utils.io.ByteChannel r13, io.ktor.client.plugins.cache.storage.CachedResponseData r14, p100l6.c r15) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.writeCache(io.ktor.utils.io.ByteChannel, io.ktor.client.plugins.cache.storage.CachedResponseData, l6.c):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileCacheStorage(java.io.File file, S7.AbstractC0906w abstractC0906w, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 2) != 0) {
            Z7.e eVar = S7.M.f9549a;
            abstractC0906w = Z7.d.f13044i;
        }
        this(file, abstractC0906w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0268  */
    /* JADX WARN: Code duplicated, block: B:39:0x0286  */
    /* JADX WARN: Code duplicated, block: B:43:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x032c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x032c -> B:57:0x0333). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0450 -> B:82:0x045f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object readCache(io.ktor.utils.io.ByteReadChannel r28, p100l6.c r29) {
        /*
            Method dump skipped, instruction units count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache(io.ktor.utils.io.ByteReadChannel, l6.c):java.lang.Object");
    }
}
