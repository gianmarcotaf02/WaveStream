package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1531m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16363a;

    static {
        int[] iArr = new int[androidx.lifecycle.EnumC1532n.values().length];
        try {
            iArr[androidx.lifecycle.EnumC1532n.ON_CREATE.ordinal()] = 1;
        } catch (java.lang.NoSuchFieldError unused) {
        }
        try {
            iArr[androidx.lifecycle.EnumC1532n.ON_STOP.ordinal()] = 2;
        } catch (java.lang.NoSuchFieldError unused2) {
        }
        try {
            iArr[androidx.lifecycle.EnumC1532n.ON_START.ordinal()] = 3;
        } catch (java.lang.NoSuchFieldError unused3) {
        }
        try {
            iArr[androidx.lifecycle.EnumC1532n.ON_PAUSE.ordinal()] = 4;
        } catch (java.lang.NoSuchFieldError unused4) {
        }
        try {
            iArr[androidx.lifecycle.EnumC1532n.ON_RESUME.ordinal()] = 5;
        } catch (java.lang.NoSuchFieldError unused5) {
        }
        try {
            iArr[androidx.lifecycle.EnumC1532n.ON_DESTROY.ordinal()] = 6;
        } catch (java.lang.NoSuchFieldError unused6) {
        }
        try {
            iArr[androidx.lifecycle.EnumC1532n.ON_ANY.ordinal()] = 7;
        } catch (java.lang.NoSuchFieldError unused7) {
        }
        f16363a = iArr;
    }
}
