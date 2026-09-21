package t8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Set f28592a = p078i6.m.F0(new kotlinx.serialization.descriptors.SerialDescriptor[]{p153r8.w0.f27016b, p153r8.z0.f27030b, p153r8.t0.f27002b, p153r8.C0.f26898b});

    public static final boolean a(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        return serialDescriptor.isInline() && f28592a.contains(serialDescriptor);
    }
}
