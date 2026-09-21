package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/UploadData;", "", "stream", "Lio/ktor/utils/io/ByteReadChannel;", "size", "", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;J)V", "getStream", "()Lio/ktor/utils/io/ByteReadChannel;", "getSize", "()J", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class UploadData {
    private final long size;
    private final io.ktor.utils.io.ByteReadChannel stream;

    public UploadData(io.ktor.utils.io.ByteReadChannel stream, long j) {
        kotlin.jvm.internal.m.e(stream, "stream");
        this.stream = stream;
        this.size = j;
    }

    public static /* synthetic */ io.github.jan.supabase.storage.UploadData copy$default(io.github.jan.supabase.storage.UploadData uploadData, io.ktor.utils.io.ByteReadChannel byteReadChannel, long j, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            byteReadChannel = uploadData.stream;
        }
        if ((i3 & 2) != 0) {
            j = uploadData.size;
        }
        return uploadData.copy(byteReadChannel, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final io.ktor.utils.io.ByteReadChannel getStream() {
        return this.stream;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final io.github.jan.supabase.storage.UploadData copy(io.ktor.utils.io.ByteReadChannel stream, long size) {
        kotlin.jvm.internal.m.e(stream, "stream");
        return new io.github.jan.supabase.storage.UploadData(stream, size);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.github.jan.supabase.storage.UploadData)) {
            return false;
        }
        io.github.jan.supabase.storage.UploadData uploadData = (io.github.jan.supabase.storage.UploadData) other;
        return kotlin.jvm.internal.m.a(this.stream, uploadData.stream) && this.size == uploadData.size;
    }

    public final long getSize() {
        return this.size;
    }

    public final io.ktor.utils.io.ByteReadChannel getStream() {
        return this.stream;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.size) + (this.stream.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "UploadData(stream=" + this.stream + ", size=" + this.size + ')';
    }
}
