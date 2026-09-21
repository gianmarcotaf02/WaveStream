package io.ktor.http.content;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lio/ktor/http/content/PartData$FileItem;", "Lkotlin/Function0;", "Ljava/io/InputStream;", "getStreamProvider", "(Lio/ktor/http/content/PartData$FileItem;)Lkotlin/jvm/functions/Function0;", "getStreamProvider$annotations", "(Lio/ktor/http/content/PartData$FileItem;)V", "streamProvider", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MultipartJvmKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.io.InputStream _get_streamProvider_$lambda$0(io.ktor.http.content.PartData.FileItem fileItem) {
        return io.ktor.utils.io.jvm.javaio.BlockingKt.toInputStream$default((io.ktor.utils.io.ByteReadChannel) fileItem.getProvider().invoke(), null, 1, null);
    }

    public static final kotlin.jvm.functions.Function0 getStreamProvider(io.ktor.http.content.PartData.FileItem fileItem) {
        kotlin.jvm.internal.m.e(fileItem, "<this>");
        return new io.ktor.http.content.c(2, fileItem);
    }

    @p070h6.c
    public static /* synthetic */ void getStreamProvider$annotations(io.ktor.http.content.PartData.FileItem fileItem) {
    }
}
