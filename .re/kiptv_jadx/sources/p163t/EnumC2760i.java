package p163t;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2760i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p163t.EnumC2760i f27614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p163t.EnumC2760i f27615i;
    public static final /* synthetic */ p163t.EnumC2760i[] j;

    static {
        p163t.EnumC2760i enumC2760i = new p163t.EnumC2760i("BoundReached", 0);
        f27614h = enumC2760i;
        p163t.EnumC2760i enumC2760i2 = new p163t.EnumC2760i("Finished", 1);
        f27615i = enumC2760i2;
        p163t.EnumC2760i[] enumC2760iArr = {enumC2760i, enumC2760i2};
        j = enumC2760iArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2760iArr);
    }

    public static p163t.EnumC2760i valueOf(java.lang.String str) {
        return (p163t.EnumC2760i) java.lang.Enum.valueOf(p163t.EnumC2760i.class, str);
    }

    public static p163t.EnumC2760i[] values() {
        return (p163t.EnumC2760i[]) j.clone();
    }
}
