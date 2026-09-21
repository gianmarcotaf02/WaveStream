package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23312h;

    public /* synthetic */ a(int i3) {
        this.f23312h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23312h) {
            case 0:
                return io.github.jan.supabase.storage.AndroidUtilsKt.upload$lambda$0((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 1:
                return io.github.jan.supabase.storage.AndroidUtilsKt.updateAsFlow$lambda$5((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 2:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.upload$lambda$2((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 3:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.upload$lambda$0((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 4:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.uploadToSignedUrl$lambda$3((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 5:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.update$lambda$6((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 6:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.publicRenderUrl$lambda$16((io.github.jan.supabase.storage.ImageTransformation) obj);
            case 7:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.downloadAuthenticated$lambda$11((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 8:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.list$lambda$14((io.github.jan.supabase.storage.BucketListFilter) obj);
            case 9:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.update$lambda$8((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 10:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.createSignedUrl_dWUq8MI$lambda$9((io.github.jan.supabase.storage.ImageTransformation) obj);
            case 11:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.downloadPublic$lambda$12((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 12:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.downloadPublic$lambda$13((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 13:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.downloadAuthenticated$lambda$10((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 14:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.authenticatedRenderUrl$lambda$15((io.github.jan.supabase.storage.ImageTransformation) obj);
            case 15:
                return io.github.jan.supabase.storage.BucketApi.DefaultImpls.uploadToSignedUrl$lambda$5((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 16:
                return io.github.jan.supabase.storage.BucketApiImpl.exists$lambda$18((io.ktor.client.request.HttpRequestBuilder) obj);
            case 17:
                return io.github.jan.supabase.storage.DownloadOptionBuilder._init_$lambda$0((io.github.jan.supabase.storage.ImageTransformation) obj);
            case 18:
                return io.github.jan.supabase.storage.FlowExtensionKt.updateAsFlow$lambda$7((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 19:
                return io.github.jan.supabase.storage.FlowExtensionKt.uploadAsFlow$lambda$6((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 20:
                return io.github.jan.supabase.storage.FlowExtensionKt.downloadAuthenticatedAsFlow$lambda$10((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 21:
                return io.github.jan.supabase.storage.FlowExtensionKt.uploadToSignedUrlAsFlow$lambda$5((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 22:
                return io.github.jan.supabase.storage.FlowExtensionKt.updateAsFlow$lambda$2((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 23:
                return io.github.jan.supabase.storage.FlowExtensionKt.downloadPublicAsFlow$lambda$9((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 24:
                return io.github.jan.supabase.storage.FlowExtensionKt.downloadAuthenticatedAsFlow$lambda$8((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 25:
                return io.github.jan.supabase.storage.FlowExtensionKt.downloadPublicAsFlow$lambda$11((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 26:
                return io.github.jan.supabase.storage.FlowExtensionKt.uploadAsFlow$lambda$3((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 27:
                return io.github.jan.supabase.storage.FlowExtensionKt.uploadToSignedUrlAsFlow$lambda$4((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 28:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadAuthenticatedToAsFlow$lambda$15((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            default:
                return io.github.jan.supabase.storage.JvmUtilsKt.uploadAsFlow$lambda$3((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
        }
    }
}
