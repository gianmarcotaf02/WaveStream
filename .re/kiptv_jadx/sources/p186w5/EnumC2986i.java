package p186w5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2986i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p186w5.EnumC2986i f30241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p186w5.EnumC2986i f30242i;
    public static final p186w5.EnumC2986i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ p186w5.EnumC2986i[] f30243k;

    /* JADX INFO: Fake field, exist only in values array */
    p186w5.EnumC2986i EF0;

    static {
        p186w5.EnumC2986i enumC2986i = new p186w5.EnumC2986i("PARAMS", 0);
        p186w5.EnumC2986i enumC2986i2 = new p186w5.EnumC2986i("TOGGLE", 1);
        f30241h = enumC2986i2;
        p186w5.EnumC2986i enumC2986i3 = new p186w5.EnumC2986i("UP", 2);
        f30242i = enumC2986i3;
        p186w5.EnumC2986i enumC2986i4 = new p186w5.EnumC2986i("DOWN", 3);
        j = enumC2986i4;
        p186w5.EnumC2986i[] enumC2986iArr = {enumC2986i, enumC2986i2, enumC2986i3, enumC2986i4};
        f30243k = enumC2986iArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2986iArr);
    }

    public static p186w5.EnumC2986i valueOf(java.lang.String str) {
        return (p186w5.EnumC2986i) java.lang.Enum.valueOf(p186w5.EnumC2986i.class, str);
    }

    public static p186w5.EnumC2986i[] values() {
        return (p186w5.EnumC2986i[]) f30243k.clone();
    }
}
