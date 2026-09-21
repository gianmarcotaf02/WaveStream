package io.github.jan.supabase.storage.resumable;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0014\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0012j\u0002`\u00130\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCache;", "", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", io.sentry.SentryEvent.JsonKeys.FINGERPRINT, "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "entry", "Lh6/A;", "set-zb63x2Q", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Ll6/c;)Ljava/lang/Object;", "set", "get-iiNwMIM", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "get", "remove-iiNwMIM", "remove", "clear", "(Ll6/c;)Ljava/lang/Object;", "", "Lh6/k;", "Lio/github/jan/supabase/storage/resumable/CachePair;", "entries", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ResumableCache {
    java.lang.Object clear(p100l6.c cVar);

    java.lang.Object entries(p100l6.c cVar);

    /* JADX INFO: renamed from: get-iiNwMIM */
    java.lang.Object mo381getiiNwMIM(java.lang.String str, p100l6.c cVar);

    /* JADX INFO: renamed from: remove-iiNwMIM */
    java.lang.Object mo382removeiiNwMIM(java.lang.String str, p100l6.c cVar);

    /* JADX INFO: renamed from: set-zb63x2Q */
    java.lang.Object mo383setzb63x2Q(java.lang.String str, io.github.jan.supabase.storage.resumable.ResumableCacheEntry resumableCacheEntry, p100l6.c cVar);
}
