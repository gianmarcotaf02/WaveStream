package io.github.jan.supabase.storage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23323h;

    public /* synthetic */ f(int i3) {
        this.f23323h = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f23323h) {
            case 0:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadAuthenticatedTo$lambda$14((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 1:
                return io.github.jan.supabase.storage.JvmUtilsKt.update$lambda$10((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 2:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadPublicTo$lambda$16((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 3:
                return io.github.jan.supabase.storage.JvmUtilsKt.upload$lambda$2((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 4:
                return io.github.jan.supabase.storage.JvmUtilsKt.uploadToSignedUrlAsFlow$lambda$5((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 5:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadPublicToAsFlow$lambda$19((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 6:
                return io.github.jan.supabase.storage.JvmUtilsKt.updateAsFlow$lambda$11((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 7:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadPublicToAsFlow$lambda$17((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 8:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadAuthenticatedToAsFlow$lambda$13((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 9:
                return io.github.jan.supabase.storage.JvmUtilsKt.uploadToSignedUrlAsFlow$lambda$7((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 10:
                return io.github.jan.supabase.storage.JvmUtilsKt.upload$lambda$0((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 11:
                return io.github.jan.supabase.storage.JvmUtilsKt.uploadToSignedUrl$lambda$4((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 12:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadAuthenticatedTo$lambda$12((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 13:
                return io.github.jan.supabase.storage.JvmUtilsKt.downloadPublicTo$lambda$18((io.github.jan.supabase.storage.DownloadOptionBuilder) obj);
            case 14:
                return io.github.jan.supabase.storage.JvmUtilsKt.updateAsFlow$lambda$9((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 15:
                return io.github.jan.supabase.storage.JvmUtilsKt.update$lambda$8((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 16:
                return io.github.jan.supabase.storage.JvmUtilsKt.uploadAsFlow$lambda$1((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 17:
                return io.github.jan.supabase.storage.JvmUtilsKt.uploadToSignedUrl$lambda$6((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 18:
                return io.github.jan.supabase.storage.ResumableAndroidUtilsKt.createOrContinueUpload$lambda$0((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 19:
                return io.github.jan.supabase.storage.ResumableUtilsKt.createOrContinueUpload$lambda$0((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 20:
                return io.github.jan.supabase.storage.ResumableUtilsKt.createOrContinueUpload$lambda$1((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 21:
                return io.github.jan.supabase.storage.Storage.DefaultImpls.createBucket$lambda$0((io.github.jan.supabase.storage.BucketBuilder) obj);
            case 22:
                return io.github.jan.supabase.storage.Storage.DefaultImpls.updateBucket$lambda$1((io.github.jan.supabase.storage.BucketBuilder) obj);
            case 23:
                return io.github.jan.supabase.storage.resumable.ResumableClient.DefaultImpls.createOrContinueUpload$lambda$1((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 24:
                return io.github.jan.supabase.storage.resumable.ResumableClient.DefaultImpls.createOrContinueUpload$lambda$0((io.github.jan.supabase.storage.UploadOptionBuilder) obj);
            case 25:
                return io.github.jan.supabase.storage.resumable.ResumableClientImpl.encodeMetadata$lambda$9((java.util.Map.Entry) obj);
            case 26:
                return io.ktor.client.HttpClient.lambda$2$lambda$1((io.ktor.client.HttpClient) obj);
            case 27:
                return io.ktor.client.HttpClientConfig.install$lambda$2(obj);
            case 28:
                return io.ktor.client.HttpClientConfig.engineConfig$lambda$0((io.ktor.client.engine.HttpClientEngineConfig) obj);
            default:
                return io.ktor.client.HttpClientJvmKt.HttpClient$lambda$0((io.ktor.client.HttpClientConfig) obj);
        }
    }
}
