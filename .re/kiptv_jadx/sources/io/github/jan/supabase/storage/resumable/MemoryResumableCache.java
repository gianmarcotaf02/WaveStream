package io.github.jan.supabase.storage.resumable;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0017j\u0002`\u00180\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u0015R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/storage/resumable/MemoryResumableCache;", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "", "", "map", "<init>", "(Ljava/util/Map;)V", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", io.sentry.SentryEvent.JsonKeys.FINGERPRINT, "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "entry", "Lh6/A;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Ll6/c;)Ljava/lang/Object;", "set", "get-iiNwMIM", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "get", "remove-iiNwMIM", "remove", "clear", "(Ll6/c;)Ljava/lang/Object;", "", "Lh6/k;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "entries", "Ljava/util/Map;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MemoryResumableCache implements io.github.jan.supabase.storage.resumable.ResumableCache {
    private final java.util.Map<java.lang.String, java.lang.String> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MemoryResumableCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    public java.lang.Object clear(p100l6.c cVar) {
        this.map.clear();
        return p070h6.A.f22523a;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    public java.lang.Object entries(p100l6.c cVar) {
        java.util.Map<java.lang.String, java.lang.String> map = this.map;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.String strM379invoke3xapfgk = io.github.jan.supabase.storage.resumable.Fingerprint.INSTANCE.m379invoke3xapfgk(it.next().getKey());
            io.github.jan.supabase.storage.resumable.Fingerprint fingerprintM369boximpl = strM379invoke3xapfgk != null ? io.github.jan.supabase.storage.resumable.Fingerprint.m369boximpl(strM379invoke3xapfgk) : null;
            if (fingerprintM369boximpl != null) {
                arrayList.add(fingerprintM369boximpl);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            java.lang.String strM378unboximpl = ((io.github.jan.supabase.storage.resumable.Fingerprint) it2.next()).m378unboximpl();
            io.github.jan.supabase.storage.resumable.Fingerprint fingerprintM369boximpl2 = io.github.jan.supabase.storage.resumable.Fingerprint.m369boximpl(strM378unboximpl);
            p162s8.c cVar2 = p162s8.d.f27387d;
            cVar2.getClass();
            arrayList2.add(new p070h6.k(fingerprintM369boximpl2, cVar2.b(strM378unboximpl, io.github.jan.supabase.storage.resumable.ResumableCacheEntry.INSTANCE.serializer())));
        }
        return arrayList2;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* JADX INFO: renamed from: get-iiNwMIM, reason: not valid java name */
    public java.lang.Object mo381getiiNwMIM(java.lang.String str, p100l6.c cVar) {
        java.lang.String str2 = this.map.get(str);
        if (str2 == null) {
            return null;
        }
        p162s8.c cVar2 = p162s8.d.f27387d;
        cVar2.getClass();
        return (io.github.jan.supabase.storage.resumable.ResumableCacheEntry) cVar2.b(str2, com.google.android.gms.internal.play_billing.V0.s(io.github.jan.supabase.storage.resumable.ResumableCacheEntry.INSTANCE.serializer()));
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* JADX INFO: renamed from: remove-iiNwMIM, reason: not valid java name */
    public java.lang.Object mo382removeiiNwMIM(java.lang.String str, p100l6.c cVar) {
        this.map.remove(str);
        return p070h6.A.f22523a;
    }

    @Override // io.github.jan.supabase.storage.resumable.ResumableCache
    /* JADX INFO: renamed from: set-zb63x2Q, reason: not valid java name */
    public java.lang.Object mo383setzb63x2Q(java.lang.String str, io.github.jan.supabase.storage.resumable.ResumableCacheEntry resumableCacheEntry, p100l6.c cVar) {
        java.util.Map<java.lang.String, java.lang.String> map = this.map;
        p162s8.c cVar2 = p162s8.d.f27387d;
        cVar2.getClass();
        map.put(str, cVar2.d(io.github.jan.supabase.storage.resumable.ResumableCacheEntry.INSTANCE.serializer(), resumableCacheEntry));
        return p070h6.A.f22523a;
    }

    public MemoryResumableCache(java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.m.e(map, "map");
        this.map = map;
    }

    public /* synthetic */ MemoryResumableCache(java.util.Map map, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new io.github.jan.supabase.collections.AtomicMutableMap(new p070h6.k[0]) : map);
    }
}
