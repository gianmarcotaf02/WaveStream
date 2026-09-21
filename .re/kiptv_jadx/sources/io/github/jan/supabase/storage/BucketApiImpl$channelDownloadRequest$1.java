package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p117n6.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {190, 193, 196}, m = "channelDownloadRequest$storage_kt_release")
public final class BucketApiImpl$channelDownloadRequest$1 extends p117n6.c {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ io.github.jan.supabase.storage.BucketApiImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BucketApiImpl$channelDownloadRequest$1(io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl, p100l6.c cVar) {
        super(cVar);
        this.this$0 = bucketApiImpl;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.channelDownloadRequest$storage_kt_release(null, null, false, null, this);
    }
}
