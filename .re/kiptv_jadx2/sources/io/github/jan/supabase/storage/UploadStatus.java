package io.github.jan.supabase.storage;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lio/github/jan/supabase/storage/UploadStatus;", "", "Progress", "Success", "Lio/github/jan/supabase/storage/UploadStatus$Progress;", "Lio/github/jan/supabase/storage/UploadStatus$Success;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface UploadStatus {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/storage/UploadStatus$Progress;", "Lio/github/jan/supabase/storage/UploadStatus;", "totalBytesSend", "", "contentLength", "<init>", "(JJ)V", "getTotalBytesSend", "()J", "getContentLength", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Progress implements UploadStatus {
        private final long contentLength;
        private final long totalBytesSend;

        public Progress(long j, long j9) {
            this.totalBytesSend = j;
            this.contentLength = j9;
        }

        public static Progress copy$default(Progress progress, long j, long j9, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                j = progress.totalBytesSend;
            }
            if ((i3 & 2) != 0) {
                j9 = progress.contentLength;
            }
            return progress.copy(j, j9);
        }

        public final long getTotalBytesSend() {
            return this.totalBytesSend;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final Progress copy(long totalBytesSend, long contentLength) {
            return new Progress(totalBytesSend, contentLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return this.totalBytesSend == progress.totalBytesSend && this.contentLength == progress.contentLength;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final long getTotalBytesSend() {
            return this.totalBytesSend;
        }

        public int hashCode() {
            return Long.hashCode(this.contentLength) + (Long.hashCode(this.totalBytesSend) * 31);
        }

        public String toString() {
            return "Progress(totalBytesSend=" + this.totalBytesSend + ", contentLength=" + this.contentLength + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/storage/UploadStatus$Success;", "Lio/github/jan/supabase/storage/UploadStatus;", Response.TYPE, "Lio/github/jan/supabase/storage/FileUploadResponse;", "constructor-impl", "(Lio/github/jan/supabase/storage/FileUploadResponse;)Lio/github/jan/supabase/storage/FileUploadResponse;", "getResponse", "()Lio/github/jan/supabase/storage/FileUploadResponse;", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Success implements UploadStatus {
        private final FileUploadResponse response;

        private Success(FileUploadResponse fileUploadResponse) {
            this.response = fileUploadResponse;
        }

        public static final Success m360boximpl(FileUploadResponse fileUploadResponse) {
            return new Success(fileUploadResponse);
        }

        public static FileUploadResponse m361constructorimpl(FileUploadResponse response) {
            m.e(response, "response");
            return response;
        }

        public static boolean m362equalsimpl(FileUploadResponse fileUploadResponse, Object obj) {
            return (obj instanceof Success) && m.a(fileUploadResponse, ((Success) obj).m366unboximpl());
        }

        public static final boolean m363equalsimpl0(FileUploadResponse fileUploadResponse, FileUploadResponse fileUploadResponse2) {
            return m.a(fileUploadResponse, fileUploadResponse2);
        }

        public static int m364hashCodeimpl(FileUploadResponse fileUploadResponse) {
            return fileUploadResponse.hashCode();
        }

        public static String m365toStringimpl(FileUploadResponse fileUploadResponse) {
            return "Success(response=" + fileUploadResponse + ')';
        }

        public boolean equals(Object other) {
            return m362equalsimpl(this.response, other);
        }

        public final FileUploadResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            return m364hashCodeimpl(this.response);
        }

        public String toString() {
            return m365toStringimpl(this.response);
        }

        public final FileUploadResponse m366unboximpl() {
            return this.response;
        }
    }
}
