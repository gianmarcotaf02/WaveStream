package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/http/content/URIFileContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Ljava/net/URI;", "uri", "Lio/ktor/http/ContentType;", "contentType", "", "contentLength", "<init>", "(Ljava/net/URI;Lio/ktor/http/ContentType;Ljava/lang/Long;)V", "Ljava/net/URL;", io.sentry.protocol.Request.JsonKeys.URL, "(Ljava/net/URL;Lio/ktor/http/ContentType;)V", "Lio/ktor/utils/io/ByteReadChannel;", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "Ljava/net/URI;", "getUri", "()Ljava/net/URI;", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class URIFileContent extends io.ktor.http.content.OutgoingContent.ReadChannelContent {
    private final java.lang.Long contentLength;
    private final io.ktor.http.ContentType contentType;
    private final java.net.URI uri;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ URIFileContent(java.net.URI uri, io.ktor.http.ContentType contentType, java.lang.Long l2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 2) != 0) {
            io.ktor.http.ContentType.Companion companion = io.ktor.http.ContentType.INSTANCE;
            java.lang.String path = uri.getPath();
            kotlin.jvm.internal.m.d(path, "getPath(...)");
            contentType = io.ktor.http.FileContentTypeKt.defaultForFilePath(companion, path);
        }
        this(uri, contentType, (i3 & 4) != 0 ? null : l2);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public java.lang.Long getContentLength() {
        return this.contentLength;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public io.ktor.http.ContentType getContentType() {
        return this.contentType;
    }

    public final java.net.URI getUri() {
        return this.uri;
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    /* JADX INFO: renamed from: readFrom */
    public io.ktor.utils.io.ByteReadChannel getChannel() throws java.io.IOException {
        java.io.InputStream inputStreamOpenStream = this.uri.toURL().openStream();
        kotlin.jvm.internal.m.d(inputStreamOpenStream, "openStream(...)");
        return io.ktor.utils.io.jvm.javaio.ReadingKt.toByteReadChannel$default(inputStreamOpenStream, null, io.ktor.util.cio.ByteBufferPoolKt.getKtorDefaultPool(), 1, null);
    }

    public URIFileContent(java.net.URI uri, io.ktor.http.ContentType contentType, java.lang.Long l2) {
        kotlin.jvm.internal.m.e(uri, "uri");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        this.uri = uri;
        this.contentType = contentType;
        this.contentLength = l2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ URIFileContent(java.net.URL url, io.ktor.http.ContentType contentType, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        if ((i3 & 2) != 0) {
            io.ktor.http.ContentType.Companion companion = io.ktor.http.ContentType.INSTANCE;
            java.lang.String path = url.getPath();
            kotlin.jvm.internal.m.d(path, "getPath(...)");
            contentType = io.ktor.http.FileContentTypeKt.defaultForFilePath(companion, path);
        }
        this(url, contentType);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public URIFileContent(java.net.URL url, io.ktor.http.ContentType contentType) throws java.net.URISyntaxException {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        java.net.URI uri = url.toURI();
        kotlin.jvm.internal.m.d(uri, "toURI(...)");
        this(uri, contentType, null, 4, null);
    }
}
