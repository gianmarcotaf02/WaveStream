package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus;", "", "Progress", "Success", "ByteData", "Lio/github/jan/supabase/storage/DownloadStatus$ByteData;", "Lio/github/jan/supabase/storage/DownloadStatus$Progress;", "Lio/github/jan/supabase/storage/DownloadStatus$Success;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface DownloadStatus {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus$ByteData;", "Lio/github/jan/supabase/storage/DownloadStatus;", "data", "", "constructor-impl", "([B)[B", "getData", "()[B", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ByteData implements DownloadStatus {
        private final byte[] data;

        private ByteData(byte[] bArr) {
            this.data = bArr;
        }

        public static final ByteData m336boximpl(byte[] bArr) {
            return new ByteData(bArr);
        }

        public static byte[] m337constructorimpl(byte[] data) {
            m.e(data, "data");
            return data;
        }

        public static boolean m338equalsimpl(byte[] bArr, Object obj) {
            return (obj instanceof ByteData) && m.a(bArr, ((ByteData) obj).m342unboximpl());
        }

        public static final boolean m339equalsimpl0(byte[] bArr, byte[] bArr2) {
            return m.a(bArr, bArr2);
        }

        public static int m340hashCodeimpl(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        public static String m341toStringimpl(byte[] bArr) {
            return "ByteData(data=" + Arrays.toString(bArr) + ')';
        }

        public boolean equals(Object other) {
            return m338equalsimpl(this.data, other);
        }

        public final byte[] getData() {
            return this.data;
        }

        public int hashCode() {
            return m340hashCodeimpl(this.data);
        }

        public String toString() {
            return m341toStringimpl(this.data);
        }

        public final byte[] m342unboximpl() {
            return this.data;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus$Progress;", "Lio/github/jan/supabase/storage/DownloadStatus;", "totalBytesReceived", "", "contentLength", "<init>", "(JJ)V", "getTotalBytesReceived", "()J", "getContentLength", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Progress implements DownloadStatus {
        private final long contentLength;
        private final long totalBytesReceived;

        public Progress(long j, long j9) {
            this.totalBytesReceived = j;
            this.contentLength = j9;
        }

        public static Progress copy$default(Progress progress, long j, long j9, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = progress.totalBytesReceived;
            }
            if ((i3 & 2) != 0) {
                j9 = progress.contentLength;
            }
            return progress.copy(j, j9);
        }

        public final long getTotalBytesReceived() {
            return this.totalBytesReceived;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final Progress copy(long totalBytesReceived, long contentLength) {
            return new Progress(totalBytesReceived, contentLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return this.totalBytesReceived == progress.totalBytesReceived && this.contentLength == progress.contentLength;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final long getTotalBytesReceived() {
            return this.totalBytesReceived;
        }

        public int hashCode() {
            return Long.hashCode(this.contentLength) + (Long.hashCode(this.totalBytesReceived) * 31);
        }

        public String toString() {
            return "Progress(totalBytesReceived=" + this.totalBytesReceived + ", contentLength=" + this.contentLength + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus$Success;", "Lio/github/jan/supabase/storage/DownloadStatus;", "<init>", "()V", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Success implements DownloadStatus {
        public static final Success INSTANCE = new Success();

        private Success() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -2013805838;
        }

        public String toString() {
            return "Success";
        }
    }
}
