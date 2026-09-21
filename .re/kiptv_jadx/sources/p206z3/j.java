package p206z3;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B3.C0089b f32388a = new B3.C0089b("MediaSessionUtils", null);

    public static java.util.ArrayList a(p199y3.m mVar) {
        try {
            android.os.Parcel parcelZ = mVar.Z(mVar.Y(), 3);
            java.util.ArrayList arrayListCreateTypedArrayList = parcelZ.createTypedArrayList(p199y3.d.CREATOR);
            parcelZ.recycle();
            return arrayListCreateTypedArrayList;
        } catch (android.os.RemoteException e6) {
            java.lang.Object[] objArr = {"getNotificationActions", p199y3.m.class.getSimpleName()};
            B3.C0089b c0089b = f32388a;
            android.util.Log.e(c0089b.f617a, c0089b.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }

    public static int[] b(p199y3.m mVar) {
        try {
            android.os.Parcel parcelZ = mVar.Z(mVar.Y(), 4);
            int[] iArrCreateIntArray = parcelZ.createIntArray();
            parcelZ.recycle();
            return iArrCreateIntArray;
        } catch (android.os.RemoteException e6) {
            java.lang.Object[] objArr = {"getCompactViewActionIndices", p199y3.m.class.getSimpleName()};
            B3.C0089b c0089b = f32388a;
            android.util.Log.e(c0089b.f617a, c0089b.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }
}
