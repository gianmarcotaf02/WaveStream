package io.github.jan.supabase.storage.resumable;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.storage.UploadStatus;
import io.sentry.SentryEvent;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import v5.L;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÂ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014R\u0017\u0010'\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u000fR\u0017\u0010)\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u000fR\u0017\u0010+\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b+\u0010\u0014R\u0017\u0010-\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableUploadState;", "", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", SentryEvent.JsonKeys.FINGERPRINT, "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "cacheEntry", "Lio/github/jan/supabase/storage/UploadStatus;", "status", "", "paused", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lio/github/jan/supabase/storage/UploadStatus;ZLkotlin/jvm/internal/f;)V", "component2", "()Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "component1-h-pxtCA", "()Ljava/lang/String;", "component1", "component3", "()Lio/github/jan/supabase/storage/UploadStatus;", "component4", "()Z", "copy-8R7v4q0", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lio/github/jan/supabase/storage/UploadStatus;Z)Lio/github/jan/supabase/storage/resumable/ResumableUploadState;", "copy", "", "toString", "", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFingerprint-h-pxtCA", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "Lio/github/jan/supabase/storage/UploadStatus;", "getStatus", "Z", "getPaused", "path", "getPath", "bucketId", "getBucketId", "isDone", "", "progress", "F", "getProgress", "()F", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ResumableUploadState {
    private final String bucketId;
    private final ResumableCacheEntry cacheEntry;
    private final String fingerprint;
    private final boolean isDone;
    private final String path;
    private final boolean paused;
    private final float progress;
    private final UploadStatus status;

    public ResumableUploadState(String str, ResumableCacheEntry resumableCacheEntry, UploadStatus uploadStatus, boolean z6, AbstractC2541f abstractC2541f) {
        this(str, resumableCacheEntry, uploadStatus, z6);
    }

    private final ResumableCacheEntry getCacheEntry() {
        return this.cacheEntry;
    }

    public static ResumableUploadState m385copy8R7v4q0$default(ResumableUploadState resumableUploadState, String str, ResumableCacheEntry resumableCacheEntry, UploadStatus uploadStatus, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = resumableUploadState.fingerprint;
        }
        if ((i3 & 2) != 0) {
            resumableCacheEntry = resumableUploadState.cacheEntry;
        }
        if ((i3 & 4) != 0) {
            uploadStatus = resumableUploadState.status;
        }
        if ((i3 & 8) != 0) {
            z6 = resumableUploadState.paused;
        }
        return resumableUploadState.m387copy8R7v4q0(str, resumableCacheEntry, uploadStatus, z6);
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final UploadStatus getStatus() {
        return this.status;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final ResumableUploadState m387copy8R7v4q0(String fingerprint, ResumableCacheEntry cacheEntry, UploadStatus status, boolean paused) {
        m.e(fingerprint, "fingerprint");
        m.e(cacheEntry, "cacheEntry");
        m.e(status, "status");
        return new ResumableUploadState(fingerprint, cacheEntry, status, paused, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumableUploadState)) {
            return false;
        }
        ResumableUploadState resumableUploadState = (ResumableUploadState) other;
        return Fingerprint.m372equalsimpl0(this.fingerprint, resumableUploadState.fingerprint) && m.a(this.cacheEntry, resumableUploadState.cacheEntry) && m.a(this.status, resumableUploadState.status) && this.paused == resumableUploadState.paused;
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final String m388getFingerprinthpxtCA() {
        return this.fingerprint;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final UploadStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Boolean.hashCode(this.paused) + ((this.status.hashCode() + ((this.cacheEntry.hashCode() + (Fingerprint.m376hashCodeimpl(this.fingerprint) * 31)) * 31)) * 31);
    }

    public final boolean getIsDone() {
        return this.isDone;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResumableUploadState(fingerprint=");
        sb.append((Object) Fingerprint.m377toStringimpl(this.fingerprint));
        sb.append(", cacheEntry=");
        sb.append(this.cacheEntry);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", paused=");
        return L.a(sb, this.paused, ')');
    }

    private ResumableUploadState(String fingerprint, ResumableCacheEntry cacheEntry, UploadStatus status, boolean z6) {
        m.e(fingerprint, "fingerprint");
        m.e(cacheEntry, "cacheEntry");
        m.e(status, "status");
        this.fingerprint = fingerprint;
        this.cacheEntry = cacheEntry;
        this.status = status;
        this.paused = z6;
        this.path = cacheEntry.getPath();
        this.bucketId = cacheEntry.getBucketId();
        this.isDone = status instanceof UploadStatus.Success;
        this.progress = status instanceof UploadStatus.Progress ? ((UploadStatus.Progress) status).getTotalBytesSend() / ((UploadStatus.Progress) status).getContentLength() : 1.0f;
    }
}
