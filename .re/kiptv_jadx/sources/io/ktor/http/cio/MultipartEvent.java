package io.ktor.http.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent;", "", "<init>", "()V", "Lh6/A;", "release", "Preamble", "MultipartPart", "Epilogue", "Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent$Preamble;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class MultipartEvent {

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Epilogue;", "Lio/ktor/http/cio/MultipartEvent;", "Lk8/n;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "<init>", "(Lk8/n;)V", "Lh6/A;", "release", "()V", "Lk8/n;", "getBody", "()Lk8/n;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Epilogue extends io.ktor.http.cio.MultipartEvent {
        private final p094k8.n body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Epilogue(p094k8.n body) {
            super(null);
            kotlin.jvm.internal.m.e(body, "body");
            this.body = body;
        }

        public final p094k8.n getBody() {
            return this.body;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() throws java.lang.Exception {
            this.body.close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "Lio/ktor/http/cio/MultipartEvent;", "LS7/F;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "Lio/ktor/utils/io/ByteReadChannel;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "<init>", "(LS7/F;Lio/ktor/utils/io/ByteReadChannel;)V", "Lh6/A;", "release", "()V", "LS7/F;", "getHeaders", "()LS7/F;", "Lio/ktor/utils/io/ByteReadChannel;", "getBody", "()Lio/ktor/utils/io/ByteReadChannel;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class MultipartPart extends io.ktor.http.cio.MultipartEvent {
        private final io.ktor.utils.io.ByteReadChannel body;
        private final S7.F headers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipartPart(S7.F headers, io.ktor.utils.io.ByteReadChannel body) {
            super(null);
            kotlin.jvm.internal.m.e(headers, "headers");
            kotlin.jvm.internal.m.e(body, "body");
            this.headers = headers;
            this.body = body;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final p070h6.A release$lambda$0(io.ktor.http.cio.MultipartEvent.MultipartPart multipartPart, java.lang.Throwable th) {
            if (th != null) {
                ((io.ktor.http.cio.HttpHeadersMap) multipartPart.headers.i()).release();
            }
            return p070h6.A.f22523a;
        }

        public final io.ktor.utils.io.ByteReadChannel getBody() {
            return this.body;
        }

        public final S7.F getHeaders() {
            return this.headers;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() {
            ((S7.p0) this.headers).j(new p078i6.C2255f(10, this));
            io.ktor.http.cio.MultipartJvmAndPosixKt.discardBlocking(this.body);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/http/cio/MultipartEvent$Preamble;", "Lio/ktor/http/cio/MultipartEvent;", "Lk8/n;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "<init>", "(Lk8/n;)V", "Lh6/A;", "release", "()V", "Lk8/n;", "getBody", "()Lk8/n;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Preamble extends io.ktor.http.cio.MultipartEvent {
        private final p094k8.n body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Preamble(p094k8.n body) {
            super(null);
            kotlin.jvm.internal.m.e(body, "body");
            this.body = body;
        }

        public final p094k8.n getBody() {
            return this.body;
        }

        @Override // io.ktor.http.cio.MultipartEvent
        public void release() throws java.lang.Exception {
            this.body.close();
        }
    }

    public /* synthetic */ MultipartEvent(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    public abstract void release();

    private MultipartEvent() {
    }
}
