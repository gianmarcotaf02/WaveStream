package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class E {
    public static final j$.time.format.E ALWAYS;
    public static final j$.time.format.E EXCEEDS_PAD;
    public static final j$.time.format.E NEVER;
    public static final j$.time.format.E NORMAL;
    public static final j$.time.format.E NOT_NEGATIVE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ j$.time.format.E[] f23678a;

    public static j$.time.format.E valueOf(java.lang.String str) {
        return (j$.time.format.E) java.lang.Enum.valueOf(j$.time.format.E.class, str);
    }

    public static j$.time.format.E[] values() {
        return (j$.time.format.E[]) f23678a.clone();
    }

    static {
        j$.time.format.E e6 = new j$.time.format.E("NORMAL", 0);
        NORMAL = e6;
        j$.time.format.E e9 = new j$.time.format.E("ALWAYS", 1);
        ALWAYS = e9;
        j$.time.format.E e10 = new j$.time.format.E("NEVER", 2);
        NEVER = e10;
        j$.time.format.E e11 = new j$.time.format.E("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = e11;
        j$.time.format.E e12 = new j$.time.format.E("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = e12;
        f23678a = new j$.time.format.E[]{e6, e9, e10, e11, e12};
    }
}
