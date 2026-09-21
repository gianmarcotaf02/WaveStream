package io.github.jan.supabase.storage;

import io.ktor.client.request.HttpRequestBuilder;
import p194x6.j;

public final class a implements j {

    public final int f23312h;

    public a(int i3) {
        this.f23312h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f23312h) {
            case 0:
                return AndroidUtilsKt.upload$lambda$0((UploadOptionBuilder) obj);
            case 1:
                return AndroidUtilsKt.updateAsFlow$lambda$5((UploadOptionBuilder) obj);
            case 2:
                return BucketApi.DefaultImpls.upload$lambda$2((UploadOptionBuilder) obj);
            case 3:
                return BucketApi.DefaultImpls.upload$lambda$0((UploadOptionBuilder) obj);
            case 4:
                return BucketApi.DefaultImpls.uploadToSignedUrl$lambda$3((UploadOptionBuilder) obj);
            case 5:
                return BucketApi.DefaultImpls.update$lambda$6((UploadOptionBuilder) obj);
            case 6:
                return BucketApi.DefaultImpls.publicRenderUrl$lambda$16((ImageTransformation) obj);
            case 7:
                return BucketApi.DefaultImpls.downloadAuthenticated$lambda$11((DownloadOptionBuilder) obj);
            case 8:
                return BucketApi.DefaultImpls.list$lambda$14((BucketListFilter) obj);
            case 9:
                return BucketApi.DefaultImpls.update$lambda$8((UploadOptionBuilder) obj);
            case 10:
                return BucketApi.DefaultImpls.createSignedUrl_dWUq8MI$lambda$9((ImageTransformation) obj);
            case 11:
                return BucketApi.DefaultImpls.downloadPublic$lambda$12((DownloadOptionBuilder) obj);
            case 12:
                return BucketApi.DefaultImpls.downloadPublic$lambda$13((DownloadOptionBuilder) obj);
            case 13:
                return BucketApi.DefaultImpls.downloadAuthenticated$lambda$10((DownloadOptionBuilder) obj);
            case 14:
                return BucketApi.DefaultImpls.authenticatedRenderUrl$lambda$15((ImageTransformation) obj);
            case 15:
                return BucketApi.DefaultImpls.uploadToSignedUrl$lambda$5((UploadOptionBuilder) obj);
            case 16:
                return BucketApiImpl.exists$lambda$18((HttpRequestBuilder) obj);
            case 17:
                return DownloadOptionBuilder._init_$lambda$0((ImageTransformation) obj);
            case 18:
                return FlowExtensionKt.updateAsFlow$lambda$7((UploadOptionBuilder) obj);
            case 19:
                return FlowExtensionKt.uploadAsFlow$lambda$6((UploadOptionBuilder) obj);
            case 20:
                return FlowExtensionKt.downloadAuthenticatedAsFlow$lambda$10((DownloadOptionBuilder) obj);
            case 21:
                return FlowExtensionKt.uploadToSignedUrlAsFlow$lambda$5((UploadOptionBuilder) obj);
            case 22:
                return FlowExtensionKt.updateAsFlow$lambda$2((UploadOptionBuilder) obj);
            case 23:
                return FlowExtensionKt.downloadPublicAsFlow$lambda$9((DownloadOptionBuilder) obj);
            case 24:
                return FlowExtensionKt.downloadAuthenticatedAsFlow$lambda$8((DownloadOptionBuilder) obj);
            case 25:
                return FlowExtensionKt.downloadPublicAsFlow$lambda$11((DownloadOptionBuilder) obj);
            case 26:
                return FlowExtensionKt.uploadAsFlow$lambda$3((UploadOptionBuilder) obj);
            case 27:
                return FlowExtensionKt.uploadToSignedUrlAsFlow$lambda$4((UploadOptionBuilder) obj);
            case 28:
                return JvmUtilsKt.downloadAuthenticatedToAsFlow$lambda$15((DownloadOptionBuilder) obj);
            default:
                return JvmUtilsKt.uploadAsFlow$lambda$3((UploadOptionBuilder) obj);
        }
    }
}
