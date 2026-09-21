package io.ktor.serialization.kotlinx;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\"&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"", "Lio/ktor/serialization/kotlinx/KotlinxSerializationExtensionProvider;", "providers", "Ljava/util/List;", "getProviders", "()Ljava/util/List;", "getProviders$annotations", "()V", "ktor-serialization-kotlinx"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ExtensionsJvmKt {
    private static final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider> providers;

    static {
        java.util.Iterator it = java.util.ServiceLoader.load(io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider.class, io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider.class.getClassLoader()).iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        providers = N7.o.s0(N7.o.g0(it));
    }

    public static final java.util.List<io.ktor.serialization.kotlinx.KotlinxSerializationExtensionProvider> getProviders() {
        return providers;
    }

    public static /* synthetic */ void getProviders$annotations() {
    }
}
