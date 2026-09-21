package io.github.jan.supabase.storage;

import io.github.jan.supabase.storage.resumable.ResumableClient;
import io.github.jan.supabase.storage.resumable.ResumableClientImpl;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientJvmKt;
import io.ktor.client.engine.HttpClientEngineConfig;
import java.util.Map;
import p194x6.j;

public final class f implements j {

    public final int f23323h;

    public f(int i3) {
        this.f23323h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23323h) {
            case 0:
                return JvmUtilsKt.downloadAuthenticatedTo$lambda$14((DownloadOptionBuilder) obj);
            case 1:
                return JvmUtilsKt.update$lambda$10((UploadOptionBuilder) obj);
            case 2:
                return JvmUtilsKt.downloadPublicTo$lambda$16((DownloadOptionBuilder) obj);
            case 3:
                return JvmUtilsKt.upload$lambda$2((UploadOptionBuilder) obj);
            case 4:
                return JvmUtilsKt.uploadToSignedUrlAsFlow$lambda$5((UploadOptionBuilder) obj);
            case 5:
                return JvmUtilsKt.downloadPublicToAsFlow$lambda$19((DownloadOptionBuilder) obj);
            case 6:
                return JvmUtilsKt.updateAsFlow$lambda$11((UploadOptionBuilder) obj);
            case 7:
                return JvmUtilsKt.downloadPublicToAsFlow$lambda$17((DownloadOptionBuilder) obj);
            case 8:
                return JvmUtilsKt.downloadAuthenticatedToAsFlow$lambda$13((DownloadOptionBuilder) obj);
            case 9:
                return JvmUtilsKt.uploadToSignedUrlAsFlow$lambda$7((UploadOptionBuilder) obj);
            case 10:
                return JvmUtilsKt.upload$lambda$0((UploadOptionBuilder) obj);
            case 11:
                return JvmUtilsKt.uploadToSignedUrl$lambda$4((UploadOptionBuilder) obj);
            case 12:
                return JvmUtilsKt.downloadAuthenticatedTo$lambda$12((DownloadOptionBuilder) obj);
            case 13:
                return JvmUtilsKt.downloadPublicTo$lambda$18((DownloadOptionBuilder) obj);
            case 14:
                return JvmUtilsKt.updateAsFlow$lambda$9((UploadOptionBuilder) obj);
            case 15:
                return JvmUtilsKt.update$lambda$8((UploadOptionBuilder) obj);
            case 16:
                return JvmUtilsKt.uploadAsFlow$lambda$1((UploadOptionBuilder) obj);
            case 17:
                return JvmUtilsKt.uploadToSignedUrl$lambda$6((UploadOptionBuilder) obj);
            case 18:
                return ResumableAndroidUtilsKt.createOrContinueUpload$lambda$0((UploadOptionBuilder) obj);
            case 19:
                return ResumableUtilsKt.createOrContinueUpload$lambda$0((UploadOptionBuilder) obj);
            case 20:
                return ResumableUtilsKt.createOrContinueUpload$lambda$1((UploadOptionBuilder) obj);
            case 21:
                return Storage.DefaultImpls.createBucket$lambda$0((BucketBuilder) obj);
            case 22:
                return Storage.DefaultImpls.updateBucket$lambda$1((BucketBuilder) obj);
            case 23:
                return ResumableClient.DefaultImpls.createOrContinueUpload$lambda$1((UploadOptionBuilder) obj);
            case 24:
                return ResumableClient.DefaultImpls.createOrContinueUpload$lambda$0((UploadOptionBuilder) obj);
            case 25:
                return ResumableClientImpl.encodeMetadata$lambda$9((Map.Entry) obj);
            case 26:
                return HttpClient.lambda$2$lambda$1((HttpClient) obj);
            case 27:
                return HttpClientConfig.install$lambda$2(obj);
            case 28:
                return HttpClientConfig.engineConfig$lambda$0((HttpClientEngineConfig) obj);
            default:
                return HttpClientJvmKt.HttpClient$lambda$0((HttpClientConfig) obj);
        }
    }
}
