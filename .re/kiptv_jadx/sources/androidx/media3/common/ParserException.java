package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class ParserException extends java.io.IOException {
    public final boolean contentIsMalformed;
    public final int dataType;

    public ParserException(java.lang.String str, java.lang.Throwable th, boolean z6, int i3) {
        super(str, th);
        this.contentIsMalformed = z6;
        this.dataType = i3;
    }

    public static androidx.media3.common.ParserException createForMalformedContainer(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, true, 1);
    }

    public static androidx.media3.common.ParserException createForMalformedDataOfUnknownType(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, true, 0);
    }

    public static androidx.media3.common.ParserException createForMalformedManifest(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, true, 4);
    }

    public static androidx.media3.common.ParserException createForMalformedSteeringManifest(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, true, 8);
    }

    public static androidx.media3.common.ParserException createForManifestWithUnsupportedFeature(java.lang.String str, java.lang.Throwable th) {
        return new androidx.media3.common.ParserException(str, th, false, 4);
    }

    public static androidx.media3.common.ParserException createForUnsupportedContainerFeature(java.lang.String str) {
        return new androidx.media3.common.ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String message = super.getMessage();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(message != null ? message.concat(io.ktor.sse.ServerSentEventKt.SPACE) : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.contentIsMalformed);
        sb.append(", dataType=");
        return Y6.f.k(sb, this.dataType, "}");
    }
}
