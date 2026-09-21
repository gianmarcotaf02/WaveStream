package Z3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12981a = 0;

    static {
        Z3.a.class.getClassLoader();
    }

    public static android.os.Parcelable a(android.os.Parcel parcel, android.os.Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (android.os.Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(android.os.Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new android.os.BadParcelableException(com.google.android.gms.internal.play_billing.M0.l(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
