package U3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends p024c4.a implements U3.c {
    public static U3.c asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof U3.c ? (U3.c) iInterfaceQueryLocalInterface : new U3.a(iBinder);
    }
}
