package io.ktor.client.request.forms;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23375h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f23376i;

    public /* synthetic */ a(java.lang.Object obj) {
        this.f23376i = (byte[]) obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f23375h) {
            case 0:
                return io.ktor.client.request.forms.FormDslKt.formData$lambda$9$lambda$4(this.f23376i);
            default:
                return io.ktor.client.request.forms.MultiPartFormDataContent.rawParts$lambda$3$lambda$2(this.f23376i);
        }
    }

    public /* synthetic */ a(byte[] bArr) {
        this.f23376i = bArr;
    }
}
