package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0015\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b\u001c\u0010\u0013J\u001e\u0010\u001f\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J*\u0010$\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b$\u0010%J*\u0010&\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u0096@¢\u0006\u0004\b&\u0010%J4\u0010-\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b+\u0010,J,\u00102\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u0010(\u001a\u00020'2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096@¢\u0006\u0004\b0\u00101J,\u00105\u001a\u0002042\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b5\u00106J,\u00107\u001a\u0002042\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b7\u00106J4\u00105\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b5\u0010:J4\u00107\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\b7\u0010:J<\u0010>\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\rH\u0080@¢\u0006\u0004\b<\u0010=J+\u0010B\u001a\u00020\u000f*\u00020?2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u000203H\u0000¢\u0006\u0004\b@\u0010AJ2\u0010G\u001a\b\u0012\u0004\u0012\u00020F0.2\u0006\u0010C\u001a\u00020\u00022\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u000f0\rH\u0096@¢\u0006\u0004\bG\u00106J\u0018\u0010I\u001a\u00020H2\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\bK\u0010JJ<\u0010Q\u001a\u00020\u00112\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0080@¢\u0006\u0004\bO\u0010PJ\u0018\u0010R\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0017H\u0096@¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\bV\u0010UJ+\u0010W\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\bW\u0010XJ+\u0010Y\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\bY\u0010XJ4\u0010Z\u001a\u0002042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00172\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u000f0\rH\u0082@¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\\\u0010UJ\u001f\u0010]\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b]\u0010^J+\u0010`\u001a\u00020\u000f*\u00020?2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020\u000eH\u0002¢\u0006\u0004\b`\u0010aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010b\u001a\u0004\bc\u0010dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010e\u001a\u0004\bf\u0010gR\u001a\u0010i\u001a\u00020h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001a\u0010n\u001a\u00020m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q¨\u0006r"}, d2 = {"Lio/github/jan/supabase/storage/BucketApiImpl;", "Lio/github/jan/supabase/storage/BucketApi;", "", "bucketId", "Lio/github/jan/supabase/storage/StorageImpl;", "storage", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "resumableCache", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/storage/StorageImpl;Lio/github/jan/supabase/storage/resumable/ResumableCache;)V", "path", "Lio/github/jan/supabase/storage/UploadData;", "data", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "Lh6/A;", io.sentry.rrweb.RRWebOptionsEvent.EVENT_TAG, "Lio/github/jan/supabase/storage/FileUploadResponse;", "update", "(Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lx6/j;Ll6/c;)Ljava/lang/Object;", "token", "uploadToSignedUrl", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lx6/j;Ll6/c;)Ljava/lang/Object;", "", "upsert", "Lio/github/jan/supabase/storage/UploadSignedUrl;", "createSignedUploadUrl", "(Ljava/lang/String;ZLl6/c;)Ljava/lang/Object;", "upload", "", "paths", "delete", "(Ljava/util/Collection;Ll6/c;)Ljava/lang/Object;", "from", "to", "destinationBucket", "move", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "copy", "LP7/b;", "expiresIn", "Lio/github/jan/supabase/storage/ImageTransformation;", "transform", "createSignedUrl-dWUq8MI", "(Ljava/lang/String;JLx6/j;Ll6/c;)Ljava/lang/Object;", "createSignedUrl", "", "Lio/github/jan/supabase/storage/SignedUrl;", "createSignedUrls-KLykuaI", "(JLjava/util/Collection;Ll6/c;)Ljava/lang/Object;", "createSignedUrls", "Lio/github/jan/supabase/storage/DownloadOptionBuilder;", "", "downloadAuthenticated", "(Ljava/lang/String;Lx6/j;Ll6/c;)Ljava/lang/Object;", "downloadPublic", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "(Ljava/lang/String;Lio/ktor/utils/io/ByteWriteChannel;Lx6/j;Ll6/c;)Ljava/lang/Object;", io.ktor.client.utils.CacheControl.PUBLIC, "channelDownloadRequest$storage_kt_release", "(Ljava/lang/String;Lio/ktor/utils/io/ByteWriteChannel;ZLx6/j;Ll6/c;)Ljava/lang/Object;", "channelDownloadRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "prepareDownloadRequest$storage_kt_release", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;ZLio/github/jan/supabase/storage/DownloadOptionBuilder;)V", "prepareDownloadRequest", "prefix", "Lio/github/jan/supabase/storage/BucketListFilter;", "filter", "Lio/github/jan/supabase/storage/FileObject;", "list", "Lio/github/jan/supabase/storage/FileObjectV2;", "info", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "exists", "Lio/ktor/http/HttpMethod;", io.sentry.protocol.Request.JsonKeys.METHOD, io.sentry.protocol.Request.JsonKeys.URL, "uploadOrUpdate$storage_kt_release", "(Lio/ktor/http/HttpMethod;Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lx6/j;Ll6/c;)Ljava/lang/Object;", "uploadOrUpdate", "changePublicStatusTo", "(ZLl6/c;)Ljava/lang/Object;", "authenticatedUrl", "(Ljava/lang/String;)Ljava/lang/String;", "publicUrl", "authenticatedRenderUrl", "(Ljava/lang/String;Lx6/j;)Ljava/lang/String;", "publicRenderUrl", "normalDownloadRequest", "(Ljava/lang/String;ZLx6/j;Ll6/c;)Ljava/lang/Object;", "defaultUploadUrl", "uploadToSignedUrlUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "optionBuilder", "defaultUploadRequest", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lio/github/jan/supabase/storage/UploadOptionBuilder;)V", "Ljava/lang/String;", "getBucketId", "()Ljava/lang/String;", "Lio/github/jan/supabase/storage/StorageImpl;", "getStorage", "()Lio/github/jan/supabase/storage/StorageImpl;", "Lio/github/jan/supabase/SupabaseClient;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "Lio/github/jan/supabase/storage/resumable/ResumableClientImpl;", "resumable", "Lio/github/jan/supabase/storage/resumable/ResumableClientImpl;", "getResumable", "()Lio/github/jan/supabase/storage/resumable/ResumableClientImpl;", "storage-kt_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BucketApiImpl implements io.github.jan.supabase.storage.BucketApi {
    private final java.lang.String bucketId;
    private final io.github.jan.supabase.storage.resumable.ResumableClientImpl resumable;
    private final io.github.jan.supabase.storage.StorageImpl storage;
    private final io.github.jan.supabase.SupabaseClient supabaseClient;

    /* JADX INFO: renamed from: io.github.jan.supabase.storage.BucketApiImpl$createSignedUploadUrl$1, reason: invalid class name */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {313, 317}, m = "createSignedUploadUrl")
    public static final class AnonymousClass1 extends p117n6.c {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.storage.BucketApiImpl.this.createSignedUploadUrl(null, false, this);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.storage.BucketApiImpl$exists$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {236}, m = "exists")
    public static final class C23341 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public C23341(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.storage.BucketApiImpl.this.exists(null, this);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.storage.BucketApiImpl$info$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {313, 320}, m = "info")
    public static final class C23351 extends p117n6.c {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        public C23351(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.storage.BucketApiImpl.this.info(null, this);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.storage.BucketApiImpl$list$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {317, 326}, m = "list")
    public static final class C23361 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public C23361(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.storage.BucketApiImpl.this.list(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.github.jan.supabase.storage.BucketApiImpl$normalDownloadRequest$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p117n6.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {160, 313}, m = "normalDownloadRequest")
    public static final class C23371 extends p117n6.c {
        int label;
        /* synthetic */ java.lang.Object result;

        public C23371(p100l6.c cVar) {
            super(cVar);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return io.github.jan.supabase.storage.BucketApiImpl.this.normalDownloadRequest(null, false, null, this);
        }
    }

    public BucketApiImpl(java.lang.String bucketId, io.github.jan.supabase.storage.StorageImpl storage, io.github.jan.supabase.storage.resumable.ResumableCache resumableCache) {
        kotlin.jvm.internal.m.e(bucketId, "bucketId");
        kotlin.jvm.internal.m.e(storage, "storage");
        kotlin.jvm.internal.m.e(resumableCache, "resumableCache");
        this.bucketId = bucketId;
        this.storage = storage;
        this.supabaseClient = storage.getSupabaseClient();
        this.resumable = new io.github.jan.supabase.storage.resumable.ResumableClientImpl(this, resumableCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A changePublicStatusTo$lambda$22(boolean z6, io.github.jan.supabase.storage.BucketBuilder updateBucket) {
        kotlin.jvm.internal.m.e(updateBucket, "$this$updateBucket");
        updateBucket.setPublic(java.lang.Boolean.valueOf(z6));
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A channelDownloadRequest$lambda$16(io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl, java.lang.String str, boolean z6, io.github.jan.supabase.storage.DownloadOptionBuilder downloadOptionBuilder, io.ktor.client.request.HttpRequestBuilder prepareRequest) {
        kotlin.jvm.internal.m.e(prepareRequest, "$this$prepareRequest");
        bucketApiImpl.prepareDownloadRequest$storage_kt_release(prepareRequest, str, z6, downloadOptionBuilder);
        java.util.Iterator<T> it = downloadOptionBuilder.getHttpRequestOverrides$storage_kt_release().iterator();
        while (it.hasNext()) {
            ((p194x6.j) it.next()).invoke(prepareRequest);
        }
        return p070h6.A.f22523a;
    }

    private static final p070h6.A createSignedUrl_dWUq8MI$lambda$8$lambda$7(io.github.jan.supabase.storage.ImageTransformation imageTransformation, p162s8.v putJsonObject) {
        kotlin.jvm.internal.m.e(putJsonObject, "$this$putJsonObject");
        io.github.jan.supabase.storage.UtilsKt.putImageTransformation(putJsonObject, imageTransformation);
        return p070h6.A.f22523a;
    }

    private static final p070h6.A createSignedUrls_KLykuaI$lambda$11$lambda$10(java.util.Collection collection, p162s8.e putJsonArray) {
        kotlin.jvm.internal.m.e(putJsonArray, "$this$putJsonArray");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            kotlinx.serialization.json.d element = p162s8.l.c((java.lang.String) it.next());
            kotlin.jvm.internal.m.e(element, "element");
            putJsonArray.f27391a.add(element);
        }
        return p070h6.A.f22523a;
    }

    private final void defaultUploadRequest(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String str, io.github.jan.supabase.storage.UploadData uploadData, io.github.jan.supabase.storage.UploadOptionBuilder uploadOptionBuilder) {
        httpRequestBuilder.setBody(new io.ktor.http.content.OutgoingContent.ReadChannelContent(uploadOptionBuilder, str, uploadData) { // from class: io.github.jan.supabase.storage.BucketApiImpl.defaultUploadRequest.1
            final /* synthetic */ io.github.jan.supabase.storage.UploadData $data;
            private final long contentLength;
            private final io.ktor.http.ContentType contentType;

            {
                this.$data = uploadData;
                io.ktor.http.ContentType contentType = uploadOptionBuilder.getContentType();
                this.contentType = contentType == null ? io.ktor.http.FileContentTypeKt.defaultForFilePath(io.ktor.http.ContentType.INSTANCE, str) : contentType;
                this.contentLength = uploadData.getSize();
            }

            @Override // io.ktor.http.content.OutgoingContent
            public java.lang.Long getContentLength() {
                return java.lang.Long.valueOf(this.contentLength);
            }

            @Override // io.ktor.http.content.OutgoingContent
            public io.ktor.http.ContentType getContentType() {
                return this.contentType;
            }

            @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
            /* JADX INFO: renamed from: readFrom */
            public io.ktor.utils.io.ByteReadChannel getChannel() {
                return this.$data.getStream();
            }
        });
        httpRequestBuilder.setBodyType(null);
        java.lang.String contentType = io.ktor.http.HttpHeaders.INSTANCE.getContentType();
        io.ktor.http.ContentType contentType2 = uploadOptionBuilder.getContentType();
        if (contentType2 == null) {
            contentType2 = io.ktor.http.FileContentTypeKt.defaultForFilePath(io.ktor.http.ContentType.INSTANCE, str);
        }
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, contentType, contentType2);
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "x-upsert", java.lang.String.valueOf(uploadOptionBuilder.getUpsert()));
        kotlinx.serialization.json.c userMetadata = uploadOptionBuilder.getUserMetadata();
        if (userMetadata != null) {
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "x-metadata", p168t6.c.b(p168t6.c.f28521c, O7.x.p0(userMetadata.toString())));
        }
    }

    private final java.lang.String defaultUploadUrl(java.lang.String path) {
        return "object/" + getBucketId() + '/' + path;
    }

    private static final p070h6.A delete$lambda$2$lambda$1(java.util.Collection collection, p162s8.e putJsonArray) {
        kotlin.jvm.internal.m.e(putJsonArray, "$this$putJsonArray");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            kotlinx.serialization.json.d element = p162s8.l.c((java.lang.String) it.next());
            kotlin.jvm.internal.m.e(element, "element");
            putJsonArray.f27391a.add(element);
        }
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A exists$lambda$18(io.ktor.client.request.HttpRequestBuilder request) {
        kotlin.jvm.internal.m.e(request, "$this$request");
        request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getHead());
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r0 == r7) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object normalDownloadRequest(java.lang.String str, boolean z6, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.storage.BucketApiImpl.C23371 c23371;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl.C23371) {
            c23371 = (io.github.jan.supabase.storage.BucketApiImpl.C23371) cVar;
            int i3 = c23371.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23371.label = i3 - Integer.MIN_VALUE;
            } else {
                c23371 = new io.github.jan.supabase.storage.BucketApiImpl.C23371(cVar);
            }
        } else {
            c23371 = new io.github.jan.supabase.storage.BucketApiImpl.C23371(cVar);
        }
        io.github.jan.supabase.storage.BucketApiImpl.C23371 c23372 = c23371;
        java.lang.Object objRawRequest = c23372.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23372.label;
        E6.v vVarA = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    com.google.common.util.concurrent.P.u0(objRawRequest);
                } else {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(objRawRequest);
                }
                if (objRawRequest != null) {
                    return (byte[]) objRawRequest;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
            }
            com.google.common.util.concurrent.P.u0(objRawRequest);
            io.github.jan.supabase.storage.DownloadOptionBuilder downloadOptionBuilder = new io.github.jan.supabase.storage.DownloadOptionBuilder(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
            jVar.invoke(downloadOptionBuilder);
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
            io.github.jan.supabase.storage.b bVar = new io.github.jan.supabase.storage.b(this, str, z6, downloadOptionBuilder, 1);
            c23372.label = 1;
            objRawRequest = api$storage_kt_release.rawRequest(bVar, c23372);
            if (objRawRequest != aVar) {
            }
            return aVar;
            vVarA = kotlin.jvm.internal.B.a(byte[].class);
        } catch (java.lang.Throwable unused) {
        }
        io.ktor.client.call.HttpClientCall call = ((io.ktor.client.statement.HttpResponse) objRawRequest).getCall();
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(byte[].class);
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA);
        c23372.label = 2;
        objRawRequest = call.bodyNullable(typeInfo, c23372);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A normalDownloadRequest$lambda$14(io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl, java.lang.String str, boolean z6, io.github.jan.supabase.storage.DownloadOptionBuilder downloadOptionBuilder, io.ktor.client.request.HttpRequestBuilder rawRequest) {
        kotlin.jvm.internal.m.e(rawRequest, "$this$rawRequest");
        bucketApiImpl.prepareDownloadRequest$storage_kt_release(rawRequest, str, z6, downloadOptionBuilder);
        java.util.Iterator<T> it = downloadOptionBuilder.getHttpRequestOverrides$storage_kt_release().iterator();
        while (it.hasNext()) {
            ((p194x6.j) it.next()).invoke(rawRequest);
        }
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A uploadOrUpdate$lambda$20(io.ktor.http.HttpMethod httpMethod, io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl, java.lang.String str, io.github.jan.supabase.storage.UploadData uploadData, io.github.jan.supabase.storage.UploadOptionBuilder uploadOptionBuilder, io.ktor.client.request.HttpRequestBuilder request) {
        kotlin.jvm.internal.m.e(request, "$this$request");
        request.setMethod(httpMethod);
        bucketApiImpl.defaultUploadRequest(request, str, uploadData, uploadOptionBuilder);
        java.util.Iterator<T> it = uploadOptionBuilder.getHttpRequestOverrides$storage_kt_release().iterator();
        while (it.hasNext()) {
            ((p194x6.j) it.next()).invoke(request);
        }
        return p070h6.A.f22523a;
    }

    private final java.lang.String uploadToSignedUrlUrl(java.lang.String path, java.lang.String token) {
        return "object/upload/sign/" + getBucketId() + '/' + path + "?token=" + token;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.String authenticatedRenderUrl(java.lang.String path, p194x6.j transform) {
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(transform, "transform");
        io.github.jan.supabase.storage.ImageTransformation imageTransformation = new io.github.jan.supabase.storage.ImageTransformation();
        transform.invoke(imageTransformation);
        java.lang.String strQueryString$storage_kt_release = imageTransformation.queryString$storage_kt_release();
        io.github.jan.supabase.storage.StorageImpl storageImpl = this.storage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("render/image/authenticated/");
        sb.append(getBucketId());
        sb.append('/');
        sb.append(path);
        sb.append(!O7.q.N0(strQueryString$storage_kt_release) ? p121o0.p.C("?", strQueryString$storage_kt_release) : "");
        return storageImpl.resolveUrl(sb.toString());
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.String authenticatedUrl(java.lang.String path) {
        kotlin.jvm.internal.m.e(path, "path");
        return this.storage.resolveUrl("object/authenticated/" + getBucketId() + '/' + path);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object changePublicStatusTo(boolean z6, p100l6.c cVar) {
        java.lang.Object objUpdateBucket = this.storage.updateBucket(getBucketId(), new A5.f(z6, 20), cVar);
        return objUpdateBucket == p109m6.a.f25430h ? objUpdateBucket : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r2.flushAndClose(r6) == r7) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object channelDownloadRequest$storage_kt_release(java.lang.String str, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, boolean z6, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$1 bucketApiImpl$channelDownloadRequest$1;
        java.lang.Object objPrepareRequest;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel2;
        io.ktor.utils.io.ByteWriteChannel byteWriteChannel3;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$1) {
            bucketApiImpl$channelDownloadRequest$1 = (io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$1) cVar;
            int i3 = bucketApiImpl$channelDownloadRequest$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bucketApiImpl$channelDownloadRequest$1.label = i3 - Integer.MIN_VALUE;
            } else {
                bucketApiImpl$channelDownloadRequest$1 = new io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$1(this, cVar);
            }
        } else {
            bucketApiImpl$channelDownloadRequest$1 = new io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$1(this, cVar);
        }
        io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$1 bucketApiImpl$channelDownloadRequest$2 = bucketApiImpl$channelDownloadRequest$1;
        java.lang.Object obj = bucketApiImpl$channelDownloadRequest$2.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = bucketApiImpl$channelDownloadRequest$2.label;
        int i10 = 3;
        p194x6.j jVar2 = null;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            io.github.jan.supabase.storage.DownloadOptionBuilder downloadOptionBuilder = new io.github.jan.supabase.storage.DownloadOptionBuilder(jVar2, objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
            jVar.invoke(downloadOptionBuilder);
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
            io.github.jan.supabase.storage.b bVar = new io.github.jan.supabase.storage.b(this, str, z6, downloadOptionBuilder, 0);
            bucketApiImpl$channelDownloadRequest$2.L$0 = byteWriteChannel;
            bucketApiImpl$channelDownloadRequest$2.label = 1;
            objPrepareRequest = api$storage_kt_release.prepareRequest(bVar, bucketApiImpl$channelDownloadRequest$2);
            if (objPrepareRequest != aVar) {
                byteWriteChannel2 = byteWriteChannel;
            }
            return aVar;
        }
        if (i9 == 1) {
            io.ktor.utils.io.ByteWriteChannel byteWriteChannel4 = (io.ktor.utils.io.ByteWriteChannel) bucketApiImpl$channelDownloadRequest$2.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            objPrepareRequest = obj;
            byteWriteChannel2 = byteWriteChannel4;
        } else if (i9 == 2) {
            byteWriteChannel3 = (io.ktor.utils.io.ByteWriteChannel) bucketApiImpl$channelDownloadRequest$2.L$0;
            com.google.common.util.concurrent.P.u0(obj);
            bucketApiImpl$channelDownloadRequest$2.L$0 = null;
            bucketApiImpl$channelDownloadRequest$2.label = 3;
        } else {
            if (i9 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
        io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$3 bucketApiImpl$channelDownloadRequest$3 = new io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$3(byteWriteChannel2, null);
        bucketApiImpl$channelDownloadRequest$2.L$0 = byteWriteChannel2;
        bucketApiImpl$channelDownloadRequest$2.label = 2;
        if (((io.ktor.client.statement.HttpStatement) objPrepareRequest).execute(bucketApiImpl$channelDownloadRequest$3, bucketApiImpl$channelDownloadRequest$2) != aVar) {
            byteWriteChannel3 = byteWriteChannel2;
            bucketApiImpl$channelDownloadRequest$2.L$0 = null;
            bucketApiImpl$channelDownloadRequest$2.label = 3;
        }
        return aVar;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object copy(java.lang.String str, java.lang.String str2, java.lang.String str3, p100l6.c cVar) {
        io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
        p162s8.v vVar = new p162s8.v();
        com.google.common.util.concurrent.P.m0("bucketId", getBucketId(), vVar);
        com.google.common.util.concurrent.P.m0("sourceKey", str, vVar);
        com.google.common.util.concurrent.P.m0("destinationKey", str2, vVar);
        if (str3 != null) {
            com.google.common.util.concurrent.P.m0("destinationBucket", str3, vVar);
        }
        final kotlinx.serialization.json.c cVarA = vVar.a();
        final io.ktor.http.ContentType json = io.ktor.http.ContentType.Application.INSTANCE.getJson();
        java.lang.Object objRequest = api$storage_kt_release.request("object/copy", new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$copy$$inlined$postJson$default$1
            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                kotlin.jvm.internal.m.e(request, "$this$request");
                request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                io.ktor.http.HttpMessagePropertiesKt.contentType(request, json);
                java.lang.Object obj = cVarA;
                E6.v vVarA = null;
                if (obj == null) {
                    request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                    E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused) {
                    }
                    Y6.f.s(interfaceC0331dB, vVarA, request);
                    return;
                }
                if (obj instanceof io.ktor.http.content.OutgoingContent) {
                    request.setBody(obj);
                    request.setBodyType(null);
                } else {
                    request.setBody(obj);
                    E6.InterfaceC0331d interfaceC0331dB2 = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused2) {
                    }
                    Y6.f.s(interfaceC0331dB2, vVarA, request);
                }
            }
        }, cVar);
        return objRequest == p109m6.a.f25430h ? objRequest : p070h6.A.f22523a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r10 == r1) goto L26;
     */
    @Override // io.github.jan.supabase.storage.BucketApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object createSignedUploadUrl(java.lang.String str, final boolean z6, p100l6.c cVar) {
        io.github.jan.supabase.storage.BucketApiImpl.AnonymousClass1 anonymousClass1;
        io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl;
        E6.v vVarA;
        java.lang.String strD;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl.AnonymousClass1) {
            anonymousClass1 = (io.github.jan.supabase.storage.BucketApiImpl.AnonymousClass1) cVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new io.github.jan.supabase.storage.BucketApiImpl.AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new io.github.jan.supabase.storage.BucketApiImpl.AnonymousClass1(cVar);
        }
        java.lang.Object objRequest = anonymousClass1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = anonymousClass1.label;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objRequest);
                io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
                java.lang.String str2 = "object/upload/sign/" + getBucketId() + '/' + str;
                p194x6.j jVar = new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$createSignedUploadUrl$$inlined$post$1
                    @Override // p194x6.j
                    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                        invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                        return p070h6.A.f22523a;
                    }

                    public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                        kotlin.jvm.internal.m.e(request, "$this$request");
                        request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                        io.ktor.client.request.UtilsKt.header(request, "x-upsert", java.lang.String.valueOf(z6));
                    }
                };
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = str;
                anonymousClass1.label = 1;
                objRequest = api$storage_kt_release.request(str2, jVar, anonymousClass1);
                if (objRequest != aVar) {
                    bucketApiImpl = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                str = (java.lang.String) anonymousClass1.L$1;
                bucketApiImpl = (io.github.jan.supabase.storage.BucketApiImpl) anonymousClass1.L$0;
                com.google.common.util.concurrent.P.u0(objRequest);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) anonymousClass1.L$1;
                bucketApiImpl = (io.github.jan.supabase.storage.BucketApiImpl) anonymousClass1.L$0;
                com.google.common.util.concurrent.P.u0(objRequest);
            }
            if (objRequest == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            }
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) ((kotlinx.serialization.json.c) objRequest).get(io.sentry.protocol.Request.JsonKeys.URL);
            if (bVar == null || (strD = p162s8.l.j(bVar).d()) == null) {
                throw new java.lang.IllegalStateException("Expected a url in create upload signed url response");
            }
            java.lang.String strSubstring = strD.substring(1);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            io.ktor.http.Url Url = io.ktor.http.URLUtilsKt.Url(bucketApiImpl.storage.resolveUrl(strSubstring));
            java.lang.String urlString = Url.getUrlString();
            java.lang.String str3 = Url.getParameters().get("token");
            if (str3 != null) {
                return new io.github.jan.supabase.storage.UploadSignedUrl(urlString, str, str3);
            }
            throw new java.lang.IllegalStateException("Expected a token in create upload signed url response");
            vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
        } catch (java.lang.Throwable unused) {
            vVarA = null;
        }
        io.ktor.client.call.HttpClientCall call = ((io.ktor.client.statement.HttpResponse) objRequest).getCall();
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA);
        anonymousClass1.L$0 = bucketApiImpl;
        anonymousClass1.L$1 = str;
        anonymousClass1.label = 2;
        objRequest = call.bodyNullable(typeInfo, anonymousClass1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ce, code lost:
    
        if (r11 == r1) goto L26;
     */
    @Override // io.github.jan.supabase.storage.BucketApi
    /* JADX INFO: renamed from: createSignedUrl-dWUq8MI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo321createSignedUrldWUq8MI(java.lang.String str, long j, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.storage.BucketApiImpl$createSignedUrl$1 bucketApiImpl$createSignedUrl$1;
        io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl;
        E6.v vVarA;
        java.lang.String strD;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl$createSignedUrl$1) {
            bucketApiImpl$createSignedUrl$1 = (io.github.jan.supabase.storage.BucketApiImpl$createSignedUrl$1) cVar;
            int i3 = bucketApiImpl$createSignedUrl$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bucketApiImpl$createSignedUrl$1.label = i3 - Integer.MIN_VALUE;
            } else {
                bucketApiImpl$createSignedUrl$1 = new io.github.jan.supabase.storage.BucketApiImpl$createSignedUrl$1(this, cVar);
            }
        } else {
            bucketApiImpl$createSignedUrl$1 = new io.github.jan.supabase.storage.BucketApiImpl$createSignedUrl$1(this, cVar);
        }
        java.lang.Object objRequest = bucketApiImpl$createSignedUrl$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = bucketApiImpl$createSignedUrl$1.label;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    bucketApiImpl = (io.github.jan.supabase.storage.BucketApiImpl) bucketApiImpl$createSignedUrl$1.L$0;
                    com.google.common.util.concurrent.P.u0(objRequest);
                } else {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bucketApiImpl = (io.github.jan.supabase.storage.BucketApiImpl) bucketApiImpl$createSignedUrl$1.L$0;
                    com.google.common.util.concurrent.P.u0(objRequest);
                }
                if (objRequest == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
                }
                io.github.jan.supabase.storage.StorageImpl storageImpl = bucketApiImpl.storage;
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) ((kotlinx.serialization.json.c) objRequest).get("signedURL");
                if (bVar == null || (strD = p162s8.l.j(bVar).d()) == null) {
                    throw new java.lang.IllegalStateException("Expected signed url in response");
                }
                java.lang.String strSubstring = strD.substring(1);
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                return storageImpl.resolveUrl(strSubstring);
            }
            com.google.common.util.concurrent.P.u0(objRequest);
            io.github.jan.supabase.storage.ImageTransformation imageTransformation = new io.github.jan.supabase.storage.ImageTransformation();
            jVar.invoke(imageTransformation);
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
            java.lang.String str2 = "object/sign/" + getBucketId() + '/' + str;
            p162s8.v vVar = new p162s8.v();
            P7.a aVar2 = P7.b.f8168i;
            com.google.common.util.concurrent.P.o0(vVar, "expiresIn", new java.lang.Long(P7.b.i(j, P7.d.SECONDS)));
            p162s8.v vVar2 = new p162s8.v();
            createSignedUrl_dWUq8MI$lambda$8$lambda$7(imageTransformation, vVar2);
            vVar.b("transform", vVar2.a());
            final kotlinx.serialization.json.c cVarA = vVar.a();
            final io.ktor.http.ContentType json = io.ktor.http.ContentType.Application.INSTANCE.getJson();
            p194x6.j jVar2 = new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$createSignedUrl-dWUq8MI$$inlined$postJson$default$1
                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                    return p070h6.A.f22523a;
                }

                public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                    kotlin.jvm.internal.m.e(request, "$this$request");
                    request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(request, json);
                    java.lang.Object obj = cVarA;
                    E6.v vVarA2 = null;
                    if (obj == null) {
                        request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                        try {
                            vVarA2 = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                        } catch (java.lang.Throwable unused) {
                        }
                        Y6.f.s(interfaceC0331dB, vVarA2, request);
                        return;
                    }
                    if (obj instanceof io.ktor.http.content.OutgoingContent) {
                        request.setBody(obj);
                        request.setBodyType(null);
                    } else {
                        request.setBody(obj);
                        E6.InterfaceC0331d interfaceC0331dB2 = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                        try {
                            vVarA2 = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                        } catch (java.lang.Throwable unused2) {
                        }
                        Y6.f.s(interfaceC0331dB2, vVarA2, request);
                    }
                }
            };
            bucketApiImpl$createSignedUrl$1.L$0 = this;
            bucketApiImpl$createSignedUrl$1.label = 1;
            objRequest = api$storage_kt_release.request(str2, jVar2, bucketApiImpl$createSignedUrl$1);
            if (objRequest != aVar) {
                bucketApiImpl = this;
            }
            return aVar;
            vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
        } catch (java.lang.Throwable unused) {
            vVarA = null;
        }
        io.ktor.client.call.HttpClientCall call = ((io.ktor.client.statement.HttpResponse) objRequest).getCall();
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA);
        bucketApiImpl$createSignedUrl$1.L$0 = bucketApiImpl;
        bucketApiImpl$createSignedUrl$1.label = 2;
        objRequest = call.bodyNullable(typeInfo, bucketApiImpl$createSignedUrl$1);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    /* JADX INFO: renamed from: createSignedUrls-KLykuaI */
    public java.lang.Object mo323createSignedUrlsKLykuaI(long j, java.lang.String[] strArr, p100l6.c cVar) {
        return io.github.jan.supabase.storage.BucketApi.DefaultImpls.m325createSignedUrlsKLykuaI(this, j, strArr, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object delete(java.lang.String[] strArr, p100l6.c cVar) {
        return io.github.jan.supabase.storage.BucketApi.DefaultImpls.delete(this, strArr, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object downloadAuthenticated(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return normalDownloadRequest(str, false, jVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object downloadPublic(java.lang.String str, p194x6.j jVar, p100l6.c cVar) {
        return normalDownloadRequest(str, true, jVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object exists(java.lang.String str, p100l6.c cVar) throws io.github.jan.supabase.exceptions.RestException {
        io.github.jan.supabase.storage.BucketApiImpl.C23341 c23341;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl.C23341) {
            c23341 = (io.github.jan.supabase.storage.BucketApiImpl.C23341) cVar;
            int i3 = c23341.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23341.label = i3 - Integer.MIN_VALUE;
            } else {
                c23341 = new io.github.jan.supabase.storage.BucketApiImpl.C23341(cVar);
            }
        } else {
            c23341 = new io.github.jan.supabase.storage.BucketApiImpl.C23341(cVar);
        }
        java.lang.Object obj = c23341.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23341.label;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
                java.lang.String str2 = "object/" + getBucketId() + '/' + str;
                io.github.jan.supabase.storage.a aVar2 = new io.github.jan.supabase.storage.a(16);
                c23341.label = 1;
                if (api$storage_kt_release.request(str2, aVar2, c23341) == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return java.lang.Boolean.TRUE;
        } catch (io.github.jan.supabase.exceptions.RestException e6) {
            io.ktor.http.HttpStatusCode.Companion companion = io.ktor.http.HttpStatusCode.INSTANCE;
            if (p078i6.p.B0(new java.lang.Integer(companion.getNotFound().getValue()), new java.lang.Integer(companion.getBadRequest().getValue())).contains(new java.lang.Integer(e6.getStatusCode()))) {
                return java.lang.Boolean.FALSE;
            }
            throw e6;
        }
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.String getBucketId() {
        return this.bucketId;
    }

    public final io.github.jan.supabase.storage.StorageImpl getStorage() {
        return this.storage;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public io.github.jan.supabase.SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object info(java.lang.String str, p100l6.c cVar) throws io.github.jan.supabase.exceptions.SupabaseEncodingException {
        io.github.jan.supabase.storage.BucketApiImpl.C23351 c23351;
        io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl;
        io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl2;
        java.lang.String str2;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl.C23351) {
            c23351 = (io.github.jan.supabase.storage.BucketApiImpl.C23351) cVar;
            int i3 = c23351.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23351.label = i3 - Integer.MIN_VALUE;
            } else {
                c23351 = new io.github.jan.supabase.storage.BucketApiImpl.C23351(cVar);
            }
        } else {
            c23351 = new io.github.jan.supabase.storage.BucketApiImpl.C23351(cVar);
        }
        java.lang.Object objRequest = c23351.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23351.label;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objRequest);
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
            java.lang.String str3 = "object/info/" + getBucketId() + '/' + str;
            p194x6.j jVar = new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$info$$inlined$get$default$1
                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                    return p070h6.A.f22523a;
                }

                public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                    kotlin.jvm.internal.m.e(request, "$this$request");
                    request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
                }
            };
            c23351.L$0 = this;
            c23351.label = 1;
            objRequest = api$storage_kt_release.request(str3, jVar, c23351);
            if (objRequest != aVar) {
                bucketApiImpl = this;
            }
            return aVar;
        }
        if (i9 == 1) {
            bucketApiImpl = (io.github.jan.supabase.storage.BucketApiImpl) c23351.L$0;
            com.google.common.util.concurrent.P.u0(objRequest);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bucketApiImpl2 = (io.github.jan.supabase.storage.BucketApiImpl) c23351.L$0;
            com.google.common.util.concurrent.P.u0(objRequest);
        }
        str2 = (java.lang.String) objRequest;
        try {
            p162s8.d supabaseJson = io.github.jan.supabase.UtilsKt.getSupabaseJson();
            supabaseJson.getClass();
            io.github.jan.supabase.storage.FileObjectV2 fileObjectV2 = (io.github.jan.supabase.storage.FileObjectV2) supabaseJson.b(str2, io.github.jan.supabase.storage.FileObjectV2.INSTANCE.serializer());
            return fileObjectV2.copy((8191 & 1) != 0 ? fileObjectV2.name : null, (8191 & 2) != 0 ? fileObjectV2.id : null, (8191 & 4) != 0 ? fileObjectV2.version : null, (8191 & 8) != 0 ? fileObjectV2.bucketId : null, (8191 & 16) != 0 ? fileObjectV2.updatedAt : null, (8191 & 32) != 0 ? fileObjectV2.createdAt : null, (8191 & 64) != 0 ? fileObjectV2.lastAccessedAt : null, (8191 & 128) != 0 ? fileObjectV2.metadata : null, (8191 & 256) != 0 ? fileObjectV2.size : 0L, (8191 & 512) != 0 ? fileObjectV2.rawContentType : null, (8191 & 1024) != 0 ? fileObjectV2.etag : null, (8191 & 2048) != 0 ? fileObjectV2.lastModified : null, (8191 & 4096) != 0 ? fileObjectV2.cacheControl : null, (8191 & 8192) != 0 ? fileObjectV2.serializer : bucketApiImpl2.storage.getSerializer());
        } catch (p119n8.b unused) {
            throw new io.github.jan.supabase.exceptions.SupabaseEncodingException("Couldn't decode payload as " + kotlin.jvm.internal.B.f24540a.b(io.github.jan.supabase.storage.FileObjectV2.class).h() + ". Input: " + O7.x.w0(str2, "\n", ""));
        }
        c23351.L$0 = bucketApiImpl;
        c23351.label = 2;
        objRequest = io.ktor.client.statement.HttpResponseKt.bodyAsText$default((io.ktor.client.statement.HttpResponse) objRequest, null, c23351, 1, null);
        if (objRequest != aVar) {
            bucketApiImpl2 = bucketApiImpl;
            str2 = (java.lang.String) objRequest;
            p162s8.d supabaseJson2 = io.github.jan.supabase.UtilsKt.getSupabaseJson();
            supabaseJson2.getClass();
            io.github.jan.supabase.storage.FileObjectV2 fileObjectV3 = (io.github.jan.supabase.storage.FileObjectV2) supabaseJson2.b(str2, io.github.jan.supabase.storage.FileObjectV2.INSTANCE.serializer());
            return fileObjectV3.copy((8191 & 1) != 0 ? fileObjectV3.name : null, (8191 & 2) != 0 ? fileObjectV3.id : null, (8191 & 4) != 0 ? fileObjectV3.version : null, (8191 & 8) != 0 ? fileObjectV3.bucketId : null, (8191 & 16) != 0 ? fileObjectV3.updatedAt : null, (8191 & 32) != 0 ? fileObjectV3.createdAt : null, (8191 & 64) != 0 ? fileObjectV3.lastAccessedAt : null, (8191 & 128) != 0 ? fileObjectV3.metadata : null, (8191 & 256) != 0 ? fileObjectV3.size : 0L, (8191 & 512) != 0 ? fileObjectV3.rawContentType : null, (8191 & 1024) != 0 ? fileObjectV3.etag : null, (8191 & 2048) != 0 ? fileObjectV3.lastModified : null, (8191 & 4096) != 0 ? fileObjectV3.cacheControl : null, (8191 & 8192) != 0 ? fileObjectV3.serializer : bucketApiImpl2.storage.getSerializer());
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (r10 == r1) goto L21;
     */
    @Override // io.github.jan.supabase.storage.BucketApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object list(java.lang.String str, p194x6.j jVar, p100l6.c cVar) throws io.github.jan.supabase.exceptions.SupabaseEncodingException {
        io.github.jan.supabase.storage.BucketApiImpl.C23361 c23361;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl.C23361) {
            c23361 = (io.github.jan.supabase.storage.BucketApiImpl.C23361) cVar;
            int i3 = c23361.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c23361.label = i3 - Integer.MIN_VALUE;
            } else {
                c23361 = new io.github.jan.supabase.storage.BucketApiImpl.C23361(cVar);
            }
        } else {
            c23361 = new io.github.jan.supabase.storage.BucketApiImpl.C23361(cVar);
        }
        java.lang.Object objRequest = c23361.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c23361.label;
        if (i9 != 0) {
            if (i9 == 1) {
                com.google.common.util.concurrent.P.u0(objRequest);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(objRequest);
            }
            java.lang.String str2 = (java.lang.String) objRequest;
            try {
                p162s8.d supabaseJson = io.github.jan.supabase.UtilsKt.getSupabaseJson();
                supabaseJson.getClass();
                return supabaseJson.b(str2, new p153r8.C2691d(io.github.jan.supabase.storage.FileObject.INSTANCE.serializer(), 0));
            } catch (p119n8.b unused) {
                throw new io.github.jan.supabase.exceptions.SupabaseEncodingException("Couldn't decode payload as " + kotlin.jvm.internal.B.f24540a.b(java.util.List.class).h() + ". Input: " + O7.x.w0(str2, "\n", ""));
            }
        }
        com.google.common.util.concurrent.P.u0(objRequest);
        io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
        java.lang.String str3 = "object/list/" + getBucketId();
        p162s8.v vVar = new p162s8.v();
        com.google.common.util.concurrent.P.m0("prefix", str, vVar);
        io.github.jan.supabase.storage.BucketListFilter bucketListFilter = new io.github.jan.supabase.storage.BucketListFilter();
        jVar.invoke(bucketListFilter);
        io.github.jan.supabase.UtilsKt.putJsonObject(vVar, bucketListFilter.build());
        final kotlinx.serialization.json.c cVarA = vVar.a();
        final io.ktor.http.ContentType json = io.ktor.http.ContentType.Application.INSTANCE.getJson();
        p194x6.j jVar2 = new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$list$$inlined$postJson$default$1
            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                kotlin.jvm.internal.m.e(request, "$this$request");
                request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                io.ktor.http.HttpMessagePropertiesKt.contentType(request, json);
                java.lang.Object obj = cVarA;
                E6.v vVarA = null;
                if (obj == null) {
                    request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                    E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused2) {
                    }
                    Y6.f.s(interfaceC0331dB, vVarA, request);
                    return;
                }
                if (obj instanceof io.ktor.http.content.OutgoingContent) {
                    request.setBody(obj);
                    request.setBodyType(null);
                } else {
                    request.setBody(obj);
                    E6.InterfaceC0331d interfaceC0331dB2 = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused3) {
                    }
                    Y6.f.s(interfaceC0331dB2, vVarA, request);
                }
            }
        };
        c23361.label = 1;
        objRequest = api$storage_kt_release.request(str3, jVar2, c23361);
        if (objRequest != aVar) {
        }
        return aVar;
        c23361.label = 2;
        objRequest = io.ktor.client.statement.HttpResponseKt.bodyAsText$default((io.ktor.client.statement.HttpResponse) objRequest, null, c23361, 1, null);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object move(java.lang.String str, java.lang.String str2, java.lang.String str3, p100l6.c cVar) {
        io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
        p162s8.v vVar = new p162s8.v();
        com.google.common.util.concurrent.P.m0("bucketId", getBucketId(), vVar);
        com.google.common.util.concurrent.P.m0("sourceKey", str, vVar);
        com.google.common.util.concurrent.P.m0("destinationKey", str2, vVar);
        if (str3 != null) {
            com.google.common.util.concurrent.P.m0("destinationBucket", str3, vVar);
        }
        final kotlinx.serialization.json.c cVarA = vVar.a();
        final io.ktor.http.ContentType json = io.ktor.http.ContentType.Application.INSTANCE.getJson();
        java.lang.Object objRequest = api$storage_kt_release.request("object/move", new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$move$$inlined$postJson$default$1
            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                kotlin.jvm.internal.m.e(request, "$this$request");
                request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                io.ktor.http.HttpMessagePropertiesKt.contentType(request, json);
                java.lang.Object obj = cVarA;
                E6.v vVarA = null;
                if (obj == null) {
                    request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                    E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused) {
                    }
                    Y6.f.s(interfaceC0331dB, vVarA, request);
                    return;
                }
                if (obj instanceof io.ktor.http.content.OutgoingContent) {
                    request.setBody(obj);
                    request.setBodyType(null);
                } else {
                    request.setBody(obj);
                    E6.InterfaceC0331d interfaceC0331dB2 = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused2) {
                    }
                    Y6.f.s(interfaceC0331dB2, vVarA, request);
                }
            }
        }, cVar);
        return objRequest == p109m6.a.f25430h ? objRequest : p070h6.A.f22523a;
    }

    public final void prepareDownloadRequest$storage_kt_release(io.ktor.client.request.HttpRequestBuilder httpRequestBuilder, java.lang.String path, boolean z6, io.github.jan.supabase.storage.DownloadOptionBuilder options) {
        java.lang.String strAuthenticatedUrl;
        kotlin.jvm.internal.m.e(httpRequestBuilder, "<this>");
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(options, "options");
        io.github.jan.supabase.storage.ImageTransformation imageTransformation = new io.github.jan.supabase.storage.ImageTransformation();
        options.getTransform().invoke(imageTransformation);
        java.lang.String strQueryString$storage_kt_release = imageTransformation.queryString$storage_kt_release();
        if (z6) {
            strAuthenticatedUrl = O7.q.N0(strQueryString$storage_kt_release) ? publicUrl(path) : publicRenderUrl(path, options.getTransform());
        } else {
            if (z6) {
                throw new I3.b();
            }
            strAuthenticatedUrl = O7.q.N0(strQueryString$storage_kt_release) ? authenticatedUrl(path) : authenticatedRenderUrl(path, options.getTransform());
        }
        httpRequestBuilder.setMethod(io.ktor.http.HttpMethod.INSTANCE.getGet());
        io.ktor.client.request.HttpRequestKt.url(httpRequestBuilder, strAuthenticatedUrl);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.String publicRenderUrl(java.lang.String path, p194x6.j transform) {
        kotlin.jvm.internal.m.e(path, "path");
        kotlin.jvm.internal.m.e(transform, "transform");
        io.github.jan.supabase.storage.ImageTransformation imageTransformation = new io.github.jan.supabase.storage.ImageTransformation();
        transform.invoke(imageTransformation);
        java.lang.String strQueryString$storage_kt_release = imageTransformation.queryString$storage_kt_release();
        io.github.jan.supabase.storage.StorageImpl storageImpl = this.storage;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("render/image/public/");
        sb.append(getBucketId());
        sb.append('/');
        sb.append(path);
        sb.append(!O7.q.N0(strQueryString$storage_kt_release) ? p121o0.p.C("?", strQueryString$storage_kt_release) : "");
        return storageImpl.resolveUrl(sb.toString());
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.String publicUrl(java.lang.String path) {
        kotlin.jvm.internal.m.e(path, "path");
        return this.storage.resolveUrl("object/public/" + getBucketId() + '/' + path);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object update(java.lang.String str, byte[] bArr, p194x6.j jVar, p100l6.c cVar) {
        return io.github.jan.supabase.storage.BucketApi.DefaultImpls.update(this, str, bArr, jVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object upload(java.lang.String str, byte[] bArr, p194x6.j jVar, p100l6.c cVar) {
        return io.github.jan.supabase.storage.BucketApi.DefaultImpls.upload(this, str, bArr, jVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r0 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object uploadOrUpdate$storage_kt_release(io.ktor.http.HttpMethod httpMethod, java.lang.String str, io.github.jan.supabase.storage.UploadData uploadData, p194x6.j jVar, p100l6.c cVar) {
        io.github.jan.supabase.storage.BucketApiImpl$uploadOrUpdate$1 bucketApiImpl$uploadOrUpdate$1;
        java.lang.String str2;
        E6.v vVarA;
        java.lang.String strD;
        java.lang.String strD2;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl$uploadOrUpdate$1) {
            bucketApiImpl$uploadOrUpdate$1 = (io.github.jan.supabase.storage.BucketApiImpl$uploadOrUpdate$1) cVar;
            int i3 = bucketApiImpl$uploadOrUpdate$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bucketApiImpl$uploadOrUpdate$1.label = i3 - Integer.MIN_VALUE;
            } else {
                bucketApiImpl$uploadOrUpdate$1 = new io.github.jan.supabase.storage.BucketApiImpl$uploadOrUpdate$1(this, cVar);
            }
        } else {
            bucketApiImpl$uploadOrUpdate$1 = new io.github.jan.supabase.storage.BucketApiImpl$uploadOrUpdate$1(this, cVar);
        }
        io.github.jan.supabase.storage.BucketApiImpl$uploadOrUpdate$1 bucketApiImpl$uploadOrUpdate$2 = bucketApiImpl$uploadOrUpdate$1;
        java.lang.Object objRequest = bucketApiImpl$uploadOrUpdate$2.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = bucketApiImpl$uploadOrUpdate$2.label;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objRequest);
                java.lang.String strK1 = O7.q.k1('/', str, str);
                java.lang.String strN1 = O7.q.n1(strK1, "?", strK1);
                io.github.jan.supabase.storage.UploadOptionBuilder uploadOptionBuilder = new io.github.jan.supabase.storage.UploadOptionBuilder(this.storage.getSerializer(), false, null, null, null, 30, null);
                jVar.invoke(uploadOptionBuilder);
                io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
                G5.a aVar2 = new G5.a(httpMethod, this, strN1, uploadData, uploadOptionBuilder, 5);
                bucketApiImpl$uploadOrUpdate$2.L$0 = strN1;
                bucketApiImpl$uploadOrUpdate$2.label = 1;
                objRequest = api$storage_kt_release.request(str, aVar2, bucketApiImpl$uploadOrUpdate$2);
                if (objRequest != aVar) {
                    str2 = strN1;
                }
                return aVar;
            }
            if (i9 == 1) {
                str2 = (java.lang.String) bucketApiImpl$uploadOrUpdate$2.L$0;
                com.google.common.util.concurrent.P.u0(objRequest);
            } else {
                if (i9 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (java.lang.String) bucketApiImpl$uploadOrUpdate$2.L$0;
                com.google.common.util.concurrent.P.u0(objRequest);
            }
            if (objRequest == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            }
            kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) objRequest;
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar2.get("Key");
            if (bVar == null || (strD = p162s8.l.j(bVar).d()) == null) {
                throw new java.lang.IllegalStateException("Expected a key in a upload response");
            }
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVar2.get("Id");
            if (bVar2 == null || (strD2 = p162s8.l.j(bVar2).d()) == null) {
                throw new java.lang.IllegalStateException("Expected an id in a upload response");
            }
            return new io.github.jan.supabase.storage.FileUploadResponse(strD2, str2, strD);
            vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
        } catch (java.lang.Throwable unused) {
            vVarA = null;
        }
        io.ktor.client.call.HttpClientCall call = ((io.ktor.client.statement.HttpResponse) objRequest).getCall();
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarA);
        bucketApiImpl$uploadOrUpdate$2.L$0 = str2;
        bucketApiImpl$uploadOrUpdate$2.label = 2;
        objRequest = call.bodyNullable(typeInfo, bucketApiImpl$uploadOrUpdate$2);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object uploadToSignedUrl(java.lang.String str, java.lang.String str2, byte[] bArr, p194x6.j jVar, p100l6.c cVar) {
        return io.github.jan.supabase.storage.BucketApi.DefaultImpls.uploadToSignedUrl(this, str, str2, bArr, jVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00cd, code lost:
    
        if (r15 == r1) goto L26;
     */
    @Override // io.github.jan.supabase.storage.BucketApi
    /* JADX INFO: renamed from: createSignedUrls-KLykuaI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo322createSignedUrlsKLykuaI(long j, java.util.Collection<java.lang.String> collection, p100l6.c cVar) {
        io.github.jan.supabase.storage.BucketApiImpl$createSignedUrls$1 bucketApiImpl$createSignedUrls$1;
        io.github.jan.supabase.storage.BucketApiImpl bucketApiImpl;
        E6.v vVarB;
        if (cVar instanceof io.github.jan.supabase.storage.BucketApiImpl$createSignedUrls$1) {
            bucketApiImpl$createSignedUrls$1 = (io.github.jan.supabase.storage.BucketApiImpl$createSignedUrls$1) cVar;
            int i3 = bucketApiImpl$createSignedUrls$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bucketApiImpl$createSignedUrls$1.label = i3 - Integer.MIN_VALUE;
            } else {
                bucketApiImpl$createSignedUrls$1 = new io.github.jan.supabase.storage.BucketApiImpl$createSignedUrls$1(this, cVar);
            }
        } else {
            bucketApiImpl$createSignedUrls$1 = new io.github.jan.supabase.storage.BucketApiImpl$createSignedUrls$1(this, cVar);
        }
        java.lang.Object objRequest = bucketApiImpl$createSignedUrls$1.result;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = bucketApiImpl$createSignedUrls$1.label;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    bucketApiImpl = (io.github.jan.supabase.storage.BucketApiImpl) bucketApiImpl$createSignedUrls$1.L$0;
                    com.google.common.util.concurrent.P.u0(objRequest);
                } else {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bucketApiImpl = (io.github.jan.supabase.storage.BucketApiImpl) bucketApiImpl$createSignedUrls$1.L$0;
                    com.google.common.util.concurrent.P.u0(objRequest);
                }
                if (objRequest == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.collections.List<io.github.jan.supabase.storage.SignedUrl>");
                }
                java.util.List<io.github.jan.supabase.storage.SignedUrl> list = (java.util.List) objRequest;
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
                for (io.github.jan.supabase.storage.SignedUrl signedUrl : list) {
                    io.github.jan.supabase.storage.StorageImpl storageImpl = bucketApiImpl.storage;
                    java.lang.String strSubstring = signedUrl.getSignedURL().substring(1);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    arrayList.add(io.github.jan.supabase.storage.SignedUrl.copy$default(signedUrl, null, storageImpl.resolveUrl(strSubstring), null, 5, null));
                }
                return arrayList;
            }
            com.google.common.util.concurrent.P.u0(objRequest);
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
            java.lang.String str = "object/sign/" + getBucketId();
            p162s8.v vVar = new p162s8.v();
            p162s8.e eVar = new p162s8.e();
            createSignedUrls_KLykuaI$lambda$11$lambda$10(collection, eVar);
            vVar.b("paths", new kotlinx.serialization.json.a(eVar.f27391a));
            P7.a aVar2 = P7.b.f8168i;
            com.google.common.util.concurrent.P.o0(vVar, "expiresIn", new java.lang.Long(P7.b.i(j, P7.d.SECONDS)));
            final kotlinx.serialization.json.c cVarA = vVar.a();
            final io.ktor.http.ContentType json = io.ktor.http.ContentType.Application.INSTANCE.getJson();
            p194x6.j jVar = new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$createSignedUrls-KLykuaI$$inlined$postJson$default$1
                @Override // p194x6.j
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                    return p070h6.A.f22523a;
                }

                public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                    kotlin.jvm.internal.m.e(request, "$this$request");
                    request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getPost());
                    io.ktor.http.HttpMessagePropertiesKt.contentType(request, json);
                    java.lang.Object obj = cVarA;
                    E6.v vVarA = null;
                    if (obj == null) {
                        request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                        try {
                            vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                        } catch (java.lang.Throwable unused) {
                        }
                        Y6.f.s(interfaceC0331dB, vVarA, request);
                        return;
                    }
                    if (obj instanceof io.ktor.http.content.OutgoingContent) {
                        request.setBody(obj);
                        request.setBodyType(null);
                    } else {
                        request.setBody(obj);
                        E6.InterfaceC0331d interfaceC0331dB2 = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                        try {
                            vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                        } catch (java.lang.Throwable unused2) {
                        }
                        Y6.f.s(interfaceC0331dB2, vVarA, request);
                    }
                }
            };
            bucketApiImpl$createSignedUrls$1.L$0 = this;
            bucketApiImpl$createSignedUrls$1.label = 1;
            objRequest = api$storage_kt_release.request(str, jVar, bucketApiImpl$createSignedUrls$1);
            if (objRequest != aVar) {
                bucketApiImpl = this;
            }
            return aVar;
            E6.y yVar = E6.y.f3222c;
            vVarB = kotlin.jvm.internal.B.b(java.util.List.class, R8.i.v(kotlin.jvm.internal.B.a(io.github.jan.supabase.storage.SignedUrl.class)));
        } catch (java.lang.Throwable unused) {
            vVarB = null;
        }
        io.ktor.client.call.HttpClientCall call = ((io.ktor.client.statement.HttpResponse) objRequest).getCall();
        E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(java.util.List.class);
        io.ktor.util.reflect.TypeInfo typeInfo = new io.ktor.util.reflect.TypeInfo(interfaceC0331dB, vVarB);
        bucketApiImpl$createSignedUrls$1.L$0 = bucketApiImpl;
        bucketApiImpl$createSignedUrls$1.label = 2;
        objRequest = call.bodyNullable(typeInfo, bucketApiImpl$createSignedUrls$1);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object delete(java.util.Collection<java.lang.String> collection, p100l6.c cVar) {
        io.github.jan.supabase.auth.AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
        java.lang.String str = "object/" + getBucketId();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        p162s8.e eVar = new p162s8.e();
        delete$lambda$2$lambda$1(collection, eVar);
        final kotlinx.serialization.json.c cVar2 = new kotlinx.serialization.json.c(linkedHashMap);
        final io.ktor.http.ContentType json = io.ktor.http.ContentType.Application.INSTANCE.getJson();
        java.lang.Object objRequest = api$storage_kt_release.request(str, new p194x6.j() { // from class: io.github.jan.supabase.storage.BucketApiImpl$delete$$inlined$deleteJson$default$1
            @Override // p194x6.j
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                invoke((io.ktor.client.request.HttpRequestBuilder) obj);
                return p070h6.A.f22523a;
            }

            public final void invoke(io.ktor.client.request.HttpRequestBuilder request) {
                kotlin.jvm.internal.m.e(request, "$this$request");
                request.setMethod(io.ktor.http.HttpMethod.INSTANCE.getDelete());
                io.ktor.http.HttpMessagePropertiesKt.contentType(request, json);
                java.lang.Object obj = cVar2;
                E6.v vVarA = null;
                if (obj == null) {
                    request.setBody(io.ktor.http.content.NullBody.INSTANCE);
                    E6.InterfaceC0331d interfaceC0331dB = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused) {
                    }
                    Y6.f.s(interfaceC0331dB, vVarA, request);
                    return;
                }
                if (obj instanceof io.ktor.http.content.OutgoingContent) {
                    request.setBody(obj);
                    request.setBodyType(null);
                } else {
                    request.setBody(obj);
                    E6.InterfaceC0331d interfaceC0331dB2 = kotlin.jvm.internal.B.f24540a.b(kotlinx.serialization.json.c.class);
                    try {
                        vVarA = kotlin.jvm.internal.B.a(kotlinx.serialization.json.c.class);
                    } catch (java.lang.Throwable unused2) {
                    }
                    Y6.f.s(interfaceC0331dB2, vVarA, request);
                }
            }
        }, cVar);
        return objRequest == p109m6.a.f25430h ? objRequest : p070h6.A.f22523a;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object downloadAuthenticated(java.lang.String str, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p194x6.j jVar, p100l6.c cVar) {
        java.lang.Object objChannelDownloadRequest$storage_kt_release = channelDownloadRequest$storage_kt_release(str, byteWriteChannel, false, jVar, cVar);
        return objChannelDownloadRequest$storage_kt_release == p109m6.a.f25430h ? objChannelDownloadRequest$storage_kt_release : p070h6.A.f22523a;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object downloadPublic(java.lang.String str, io.ktor.utils.io.ByteWriteChannel byteWriteChannel, p194x6.j jVar, p100l6.c cVar) {
        java.lang.Object objChannelDownloadRequest$storage_kt_release = channelDownloadRequest$storage_kt_release(str, byteWriteChannel, true, jVar, cVar);
        return objChannelDownloadRequest$storage_kt_release == p109m6.a.f25430h ? objChannelDownloadRequest$storage_kt_release : p070h6.A.f22523a;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public io.github.jan.supabase.storage.resumable.ResumableClientImpl getResumable() {
        return this.resumable;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object update(java.lang.String str, io.github.jan.supabase.storage.UploadData uploadData, p194x6.j jVar, p100l6.c cVar) {
        return uploadOrUpdate$storage_kt_release(io.ktor.http.HttpMethod.INSTANCE.getPut(), defaultUploadUrl(str), uploadData, jVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object upload(java.lang.String str, io.github.jan.supabase.storage.UploadData uploadData, p194x6.j jVar, p100l6.c cVar) {
        return uploadOrUpdate$storage_kt_release(io.ktor.http.HttpMethod.INSTANCE.getPost(), defaultUploadUrl(str), uploadData, jVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public java.lang.Object uploadToSignedUrl(java.lang.String str, java.lang.String str2, io.github.jan.supabase.storage.UploadData uploadData, p194x6.j jVar, p100l6.c cVar) {
        return uploadOrUpdate$storage_kt_release(io.ktor.http.HttpMethod.INSTANCE.getPut(), uploadToSignedUrlUrl(str, str2), uploadData, jVar, cVar);
    }
}
