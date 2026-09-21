package t5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: t5.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2832q1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t5.EnumC2832q1 f28329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t5.EnumC2832q1 f28330i;
    public static final t5.EnumC2832q1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ t5.EnumC2832q1[] f28331k;

    static {
        t5.EnumC2832q1 enumC2832q1 = new t5.EnumC2832q1("PROCESSING", 0);
        f28329h = enumC2832q1;
        t5.EnumC2832q1 enumC2832q2 = new t5.EnumC2832q1("AVAILABLE", 1);
        f28330i = enumC2832q2;
        t5.EnumC2832q1 enumC2832q3 = new t5.EnumC2832q1("UNAVAILABLE", 2);
        j = enumC2832q3;
        t5.EnumC2832q1[] enumC2832q1Arr = {enumC2832q1, enumC2832q2, enumC2832q3};
        f28331k = enumC2832q1Arr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC2832q1Arr);
    }

    public static t5.EnumC2832q1 valueOf(java.lang.String str) {
        return (t5.EnumC2832q1) java.lang.Enum.valueOf(t5.EnumC2832q1.class, str);
    }

    public static t5.EnumC2832q1[] values() {
        return (t5.EnumC2832q1[]) f28331k.clone();
    }
}
