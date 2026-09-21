package T1;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

public final class c extends B3.o {
    @Override
    public final Signature[] n(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
