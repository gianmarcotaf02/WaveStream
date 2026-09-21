package T1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends B3.o {
    @Override // B3.o
    public final android.content.pm.Signature[] n(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
