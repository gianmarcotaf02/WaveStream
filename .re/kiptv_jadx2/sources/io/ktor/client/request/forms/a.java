package io.ktor.client.request.forms;

import kotlin.jvm.functions.Function0;

public final class a implements Function0 {

    public final int f23375h = 0;

    public final byte[] f23376i;

    public a(Object obj) {
        this.f23376i = (byte[]) obj;
    }

    @Override
    public final Object invoke() {
        switch (this.f23375h) {
            case 0:
                return FormDslKt.formData$lambda$9$lambda$4(this.f23376i);
            default:
                return MultiPartFormDataContent.rawParts$lambda$3$lambda$2(this.f23376i);
        }
    }

    public a(byte[] bArr) {
        this.f23376i = bArr;
    }
}
