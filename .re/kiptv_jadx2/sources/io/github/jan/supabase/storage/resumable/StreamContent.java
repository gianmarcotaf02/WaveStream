package io.github.jan.supabase.storage.resumable;

import androidx.media3.container.NalUnitUtil;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import p070h6.A;
import p100l6.c;
import p109m6.a;
import p194x6.m;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\r\u0010\u000eR0\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/storage/resumable/StreamContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "", "size", "Lkotlin/Function2;", "Lio/ktor/utils/io/ByteWriteChannel;", "Ll6/c;", "Lh6/A;", "", "copyTo", "<init>", "(JLx6/m;)V", "channel", "writeTo", "(Lio/ktor/utils/io/ByteWriteChannel;Ll6/c;)Ljava/lang/Object;", "Lx6/m;", "contentLength", "J", "getContentLength", "()Ljava/lang/Long;", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@SupabaseInternal
public final class StreamContent extends OutgoingContent.WriteChannelContent {
    private final long contentLength;
    private final ContentType contentType;
    private final m copyTo;

    public StreamContent(long j, m copyTo) {
        kotlin.jvm.internal.m.e(copyTo, "copyTo");
        this.copyTo = copyTo;
        this.contentLength = j;
        this.contentType = ContentType.INSTANCE.parse("application/offset+octet-stream");
    }

    @Override
    public Long getContentLength() {
        return Long.valueOf(this.contentLength);
    }

    @Override
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override
    public Object writeTo(ByteWriteChannel byteWriteChannel, c cVar) {
        Object objInvoke = this.copyTo.invoke(byteWriteChannel, cVar);
        return objInvoke == a.f25430h ? objInvoke : A.f22523a;
    }
}
