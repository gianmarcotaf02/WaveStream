package io.ktor.client.plugins.logging;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lio/ktor/client/plugins/logging/LoggedContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "originalContent", "Lio/ktor/utils/io/ByteReadChannel;", "channel", "<init>", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/utils/io/ByteReadChannel;)V", "", "T", "Lio/ktor/util/AttributeKey;", SubscriberAttributeKt.JSON_NAME_KEY, "getProperty", "(Lio/ktor/util/AttributeKey;)Ljava/lang/Object;", "value", "Lh6/A;", "setProperty", "(Lio/ktor/util/AttributeKey;Ljava/lang/Object;)V", "readFrom", "()Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/http/content/OutgoingContent;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "", "contentLength", "Ljava/lang/Long;", "getContentLength", "()Ljava/lang/Long;", "Lio/ktor/http/HttpStatusCode;", "status", "Lio/ktor/http/HttpStatusCode;", "getStatus", "()Lio/ktor/http/HttpStatusCode;", "Lio/ktor/http/Headers;", "headers", "Lio/ktor/http/Headers;", "getHeaders", "()Lio/ktor/http/Headers;", "ktor-client-logging"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LoggedContent extends OutgoingContent.ReadChannelContent {
    private final ByteReadChannel channel;
    private final Long contentLength;
    private final ContentType contentType;
    private final Headers headers;
    private final OutgoingContent originalContent;
    private final HttpStatusCode status;

    public LoggedContent(OutgoingContent originalContent, ByteReadChannel channel) {
        m.e(originalContent, "originalContent");
        m.e(channel, "channel");
        this.originalContent = originalContent;
        this.channel = channel;
        this.contentType = originalContent.getContentType();
        this.contentLength = originalContent.getContentLength();
        this.status = originalContent.getStatus();
        this.headers = originalContent.getHeaders();
    }

    @Override
    public Long getContentLength() {
        return this.contentLength;
    }

    @Override
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override
    public Headers getHeaders() {
        return this.headers;
    }

    @Override
    public <T> T getProperty(AttributeKey<T> key) {
        m.e(key, "key");
        return (T) this.originalContent.getProperty(key);
    }

    @Override
    public HttpStatusCode getStatus() {
        return this.status;
    }

    @Override
    public ByteReadChannel getChannel() {
        return this.channel;
    }

    @Override
    public <T> void setProperty(AttributeKey<T> key, T value) {
        m.e(key, "key");
        this.originalContent.setProperty(key, value);
    }
}
