package io.ktor.serialization.kotlinx.json;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/serialization/kotlinx/json/KotlinxSerializationJsonExtensionProvider;", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtensionProvider;", "<init>", "()V", "Ln8/g;", "format", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "extension", "(Ln8/g;)Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "ktor-serialization-kotlinx-json"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class KotlinxSerializationJsonExtensionProvider implements io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider {
    @Override // io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider
    public io.ktor.serialization.kotlinx.KotlinxSerializationExtension extension(p119n8.g format) {
        kotlin.jvm.internal.m.e(format, "format");
        if (format instanceof p162s8.d) {
            return new io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions((p162s8.d) format);
        }
        return null;
    }
}
