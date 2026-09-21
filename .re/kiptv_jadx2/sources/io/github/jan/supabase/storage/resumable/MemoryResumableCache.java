package io.github.jan.supabase.storage.resumable;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import io.github.jan.supabase.collections.AtomicMutableMap;
import io.sentry.SentryEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.A;
import p070h6.k;
import p078i6.q;
import p100l6.c;
import p162s8.d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0019\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0017j\u0002`\u00180\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u0015R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/storage/resumable/MemoryResumableCache;", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "", "", "map", "<init>", "(Ljava/util/Map;)V", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", SentryEvent.JsonKeys.FINGERPRINT, "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "entry", "Lh6/A;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Ll6/c;)Ljava/lang/Object;", "set", "get-iiNwMIM", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "get", "remove-iiNwMIM", "remove", "clear", "(Ll6/c;)Ljava/lang/Object;", "", "Lh6/k;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "entries", "Ljava/util/Map;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MemoryResumableCache implements ResumableCache {
    private final Map<String, String> map;

    public MemoryResumableCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override
    public Object clear(c cVar) {
        this.map.clear();
        return A.f22523a;
    }

    @Override
    public Object entries(c cVar) {
        Map<String, String> map = this.map;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String strM379invoke3xapfgk = Fingerprint.INSTANCE.m379invoke3xapfgk(it.next().getKey());
            Fingerprint fingerprintM369boximpl = strM379invoke3xapfgk != null ? Fingerprint.m369boximpl(strM379invoke3xapfgk) : null;
            if (fingerprintM369boximpl != null) {
                arrayList.add(fingerprintM369boximpl);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.I0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String strM378unboximpl = ((Fingerprint) it2.next()).m378unboximpl();
            Fingerprint fingerprintM369boximpl2 = Fingerprint.m369boximpl(strM378unboximpl);
            p162s8.c cVar2 = d.f27387d;
            cVar2.getClass();
            arrayList2.add(new k(fingerprintM369boximpl2, cVar2.b(strM378unboximpl, ResumableCacheEntry.INSTANCE.serializer())));
        }
        return arrayList2;
    }

    @Override
    public Object mo381getiiNwMIM(String str, c cVar) {
        String str2 = this.map.get(str);
        if (str2 == null) {
            return null;
        }
        p162s8.c cVar2 = d.f27387d;
        cVar2.getClass();
        return (ResumableCacheEntry) cVar2.b(str2, V0.s(ResumableCacheEntry.INSTANCE.serializer()));
    }

    @Override
    public Object mo382removeiiNwMIM(String str, c cVar) {
        this.map.remove(str);
        return A.f22523a;
    }

    @Override
    public Object mo383setzb63x2Q(String str, ResumableCacheEntry resumableCacheEntry, c cVar) {
        Map<String, String> map = this.map;
        p162s8.c cVar2 = d.f27387d;
        cVar2.getClass();
        map.put(str, cVar2.d(ResumableCacheEntry.INSTANCE.serializer(), resumableCacheEntry));
        return A.f22523a;
    }

    public MemoryResumableCache(Map<String, String> map) {
        m.e(map, "map");
        this.map = map;
    }

    public MemoryResumableCache(Map map, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? new AtomicMutableMap(new k[0]) : map);
    }
}
