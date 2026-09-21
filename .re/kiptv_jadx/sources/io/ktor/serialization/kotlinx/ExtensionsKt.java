package io.ktor.serialization.kotlinx;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln8/g;", "format", "", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtension;", "extensions", "(Ln8/g;)Ljava/util/List;", "ktor-serialization-kotlinx"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ExtensionsKt {
    public static final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtension> extensions(p119n8.g format) {
        kotlin.jvm.internal.m.e(format, "format");
        java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider> providers = io.ktor.serialization.kotlinx.ExtensionsJvmKt.getProviders();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            io.ktor.serialization.kotlinx.KotlinxSerializationExtension kotlinxSerializationExtensionExtension = ((io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider) it.next()).extension(format);
            if (kotlinxSerializationExtensionExtension != null) {
                arrayList.add(kotlinxSerializationExtensionExtension);
            }
        }
        return arrayList;
    }
}
