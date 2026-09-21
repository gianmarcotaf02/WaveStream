package io.ktor.client.plugins.cache.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachingCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "delegate", "<init>", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "Lio/ktor/http/Url;", io.sentry.protocol.Request.JsonKeys.URL, "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "Lh6/A;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;Ll6/c;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;Ll6/c;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;Ll6/c;)Ljava/lang/Object;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CachingCacheStorage implements io.ktor.client.plugins.cache.storage.CacheStorage {
    private final io.ktor.client.plugins.cache.storage.CacheStorage delegate;
    private final io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> store;

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {46}, m = "find")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.CachingCacheStorage.this.find(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {56}, m = "findAll")
    public static final class C23591 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23591(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.CachingCacheStorage.this.findAll(null, this);
        }
    }

    /* JADX INFO: renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {40, 41}, m = com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE)
    public static final class C23601 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23601(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.ktor.client.plugins.cache.storage.CachingCacheStorage.this.store(null, null, this);
        }
    }

    public CachingCacheStorage(io.ktor.client.plugins.cache.storage.CacheStorage delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.delegate = delegate;
        this.store = new io.ktor.util.collections.ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[LOOP:1: B:29:0x009b->B:46:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object find(io.ktor.http.Url url, java.util.Map<java.lang.String, java.lang.String> map, p100l6.c cVar) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1 anonymousClass1;
        io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage;
        io.ktor.http.Url url2;
        java.util.Map<java.lang.String, java.lang.String> map2;
        java.util.Map map3;
        io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it;
        java.util.Map.Entry<java.lang.String, java.lang.String> next;
        java.lang.String key;
        if (cVar instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1) {
            anonymousClass1 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1(cVar);
        }
        java.lang.Object obj = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (this.store.containsKey(url)) {
                cachingCacheStorage = this;
            } else {
                io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> concurrentMap = this.store;
                io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.delegate;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = url;
                anonymousClass1.L$2 = map;
                anonymousClass1.L$3 = concurrentMap;
                anonymousClass1.L$4 = url;
                anonymousClass1.label = 1;
                java.lang.Object objFindAll = cacheStorage.findAll(url, anonymousClass1);
                if (objFindAll == aVar) {
                    return aVar;
                }
                url2 = url;
                map2 = map;
                map3 = concurrentMap;
                obj = objFindAll;
                cachingCacheStorage = this;
            }
            for (java.lang.Object obj2 : (java.util.Set) p078i6.C.M0(url, cachingCacheStorage.store)) {
                cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj2;
                if (map.isEmpty()) {
                    it = map.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            key = next.getKey();
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
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        url = (io.ktor.http.Url) anonymousClass1.L$4;
        map3 = (java.util.Map) anonymousClass1.L$3;
        map2 = (java.util.Map) anonymousClass1.L$2;
        url2 = (io.ktor.http.Url) anonymousClass1.L$1;
        cachingCacheStorage = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) anonymousClass1.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        map3.put(url, obj);
        map = map2;
        url = url2;
        while (r6.hasNext()) {
            cachedResponseData = (io.ktor.client.plugins.cache.storage.CachedResponseData) obj2;
            if (map.isEmpty()) {
                it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        key = next.getKey();
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
    public java.lang.Object findAll(io.ktor.http.Url url, p100l6.c cVar) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23591 c23591;
        io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage;
        io.ktor.http.Url url2;
        java.util.Map map;
        if (cVar instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23591) {
            c23591 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23591) cVar;
            int i3 = c23591.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23591.label = i3 - Integer.MIN_VALUE;
            } else {
                c23591 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23591(cVar);
            }
        } else {
            c23591 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23591(cVar);
        }
        java.lang.Object obj = c23591.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23591.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (this.store.containsKey(url)) {
                cachingCacheStorage = this;
            } else {
                io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> concurrentMap = this.store;
                io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.delegate;
                c23591.L$0 = this;
                c23591.L$1 = url;
                c23591.L$2 = concurrentMap;
                c23591.L$3 = url;
                c23591.label = 1;
                java.lang.Object objFindAll = cacheStorage.findAll(url, c23591);
                if (objFindAll == aVar) {
                    return aVar;
                }
                url2 = url;
                map = concurrentMap;
                obj = objFindAll;
                cachingCacheStorage = this;
            }
            return p078i6.C.M0(url, cachingCacheStorage.store);
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        url = (io.ktor.http.Url) c23591.L$3;
        map = (java.util.Map) c23591.L$2;
        url2 = (io.ktor.http.Url) c23591.L$1;
        cachingCacheStorage = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) c23591.L$0;
        com.google.common.util.concurrent.P.u0(obj);
        map.put(url, obj);
        url = url2;
        return p078i6.C.M0(url, cachingCacheStorage.store);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public java.lang.Object store(io.ktor.http.Url url, io.ktor.client.plugins.cache.storage.CachedResponseData cachedResponseData, p100l6.c cVar) {
        io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23601 c23601;
        io.ktor.client.plugins.cache.storage.CachingCacheStorage cachingCacheStorage;
        java.util.Map map;
        if (cVar instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23601) {
            c23601 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23601) cVar;
            int i3 = c23601.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23601.label = i3 - Integer.MIN_VALUE;
            } else {
                c23601 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23601(cVar);
            }
        } else {
            c23601 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage.C23601(cVar);
        }
        java.lang.Object obj = c23601.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23601.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage = this.delegate;
            c23601.L$0 = this;
            c23601.L$1 = url;
            c23601.label = 1;
            if (cacheStorage.store(url, cachedResponseData, c23601) != aVar) {
                cachingCacheStorage = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            url = (io.ktor.http.Url) c23601.L$1;
            cachingCacheStorage = (io.ktor.client.plugins.cache.storage.CachingCacheStorage) c23601.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            url = (io.ktor.http.Url) c23601.L$1;
            map = (java.util.Map) c23601.L$0;
            com.google.common.util.concurrent.P.u0(obj);
        }
        map.put(url, obj);
        return p070h6.A.f22523a;
        io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> concurrentMap = cachingCacheStorage.store;
        io.ktor.client.plugins.cache.storage.CacheStorage cacheStorage2 = cachingCacheStorage.delegate;
        c23601.L$0 = concurrentMap;
        c23601.L$1 = url;
        c23601.label = 2;
        java.lang.Object objFindAll = cacheStorage2.findAll(url, c23601);
        if (objFindAll != aVar) {
            obj = objFindAll;
            map = concurrentMap;
            map.put(url, obj);
            return p070h6.A.f22523a;
        }
        return aVar;
    }
}
