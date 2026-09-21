package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2803h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t5.EnumC2803h f28192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t5.EnumC2803h f28193i;
    public static final /* synthetic */ t5.EnumC2803h[] j;

    static {
        t5.EnumC2803h enumC2803h = new t5.EnumC2803h("Left", 0);
        f28192h = enumC2803h;
        t5.EnumC2803h enumC2803h2 = new t5.EnumC2803h("Right", 1);
        f28193i = enumC2803h2;
        t5.EnumC2803h[] enumC2803hArr = {enumC2803h, enumC2803h2};
        j = enumC2803hArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2803hArr);
    }

    public static t5.EnumC2803h valueOf(java.lang.String str) {
        return (t5.EnumC2803h) java.lang.Enum.valueOf(t5.EnumC2803h.class, str);
    }

    public static t5.EnumC2803h[] values() {
        return (t5.EnumC2803h[]) j.clone();
    }
}
