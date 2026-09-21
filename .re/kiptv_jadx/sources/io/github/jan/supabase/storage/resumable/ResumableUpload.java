package io.github.jan.supabase.storage.resumable;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u0010¨\u0006\u0011"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableUpload;", "", "Lh6/A;", "pause", "(Ll6/c;)Ljava/lang/Object;", "cancel", "startOrResumeUploading", "LV7/l0;", "Lio/github/jan/supabase/storage/resumable/ResumableUploadState;", "getStateFlow", "()LV7/l0;", "stateFlow", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "getFingerprint-h-pxtCA", "()Ljava/lang/String;", io.sentry.SentryEvent.JsonKeys.FINGERPRINT, "Lio/github/jan/supabase/storage/resumable/ResumableUploadImpl;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface ResumableUpload {
    java.lang.Object cancel(p100l6.c cVar);

    /* JADX INFO: renamed from: getFingerprint-h-pxtCA, reason: not valid java name */
    java.lang.String mo384getFingerprinthpxtCA();

    V7.l0 getStateFlow();

    java.lang.Object pause(p100l6.c cVar);

    java.lang.Object startOrResumeUploading(p100l6.c cVar);
}
