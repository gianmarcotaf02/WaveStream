package p107m4;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f25395a;

    static {
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 10; i3++) {
            bArr[i3 + 48] = (byte) i3;
        }
        for (int i9 = 0; i9 < 26; i9++) {
            byte b9 = (byte) (i9 + 10);
            bArr[i9 + 65] = b9;
            bArr[i9 + 97] = b9;
        }
        f25395a = bArr;
    }
}
