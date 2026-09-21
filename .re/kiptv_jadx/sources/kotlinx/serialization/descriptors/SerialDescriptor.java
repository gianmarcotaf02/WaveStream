package kotlinx.serialization.descriptors;

/* JADX INFO: loaded from: classes4.dex */
public interface SerialDescriptor {
    java.lang.String a();

    com.google.android.gms.internal.play_billing.V0 c();

    default boolean d() {
        return false;
    }

    int e(java.lang.String str);

    int f();

    java.lang.String g(int i3);

    default java.util.List getAnnotations() {
        return p078i6.w.f23205h;
    }

    java.util.List h(int i3);

    kotlinx.serialization.descriptors.SerialDescriptor i(int i3);

    default boolean isInline() {
        return false;
    }

    boolean j(int i3);
}
