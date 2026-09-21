package E8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static boolean a() {
        org.conscrypt.Conscrypt.Version version = org.conscrypt.Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
