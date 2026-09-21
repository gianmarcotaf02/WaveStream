package p206z3;

import B3.C0089b;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import p199y3.d;
import p199y3.m;

public abstract class j {

    public static final C0089b f32388a = new C0089b("MediaSessionUtils", null);

    public static ArrayList a(m mVar) {
        try {
            Parcel parcelZ = mVar.Z(mVar.Y(), 3);
            ArrayList arrayListCreateTypedArrayList = parcelZ.createTypedArrayList(d.CREATOR);
            parcelZ.recycle();
            return arrayListCreateTypedArrayList;
        } catch (RemoteException e6) {
            Object[] objArr = {"getNotificationActions", m.class.getSimpleName()};
            C0089b c0089b = f32388a;
            Log.e(c0089b.f617a, c0089b.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }

    public static int[] b(m mVar) {
        try {
            Parcel parcelZ = mVar.Z(mVar.Y(), 4);
            int[] iArrCreateIntArray = parcelZ.createIntArray();
            parcelZ.recycle();
            return iArrCreateIntArray;
        } catch (RemoteException e6) {
            Object[] objArr = {"getCompactViewActionIndices", m.class.getSimpleName()};
            C0089b c0089b = f32388a;
            Log.e(c0089b.f617a, c0089b.d("Unable to call %s on %s.", objArr), e6);
            return null;
        }
    }
}
