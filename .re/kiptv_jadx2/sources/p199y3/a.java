package p199y3;

import B3.C0089b;
import E6.G;
import O3.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p184w3.D;

public final class a extends I3.a {

    public final String f31800h;

    public final String f31801i;
    public final j j;

    public final f f31802k;

    public final boolean f31803l;

    public final boolean f31804m;

    public static final C0089b f31799n = new C0089b("CastMediaOptions", null);
    public static final Parcelable.Creator<a> CREATOR = new D(20);

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z6, boolean z9) {
        j jVar;
        this.f31800h = str;
        this.f31801i = str2;
        if (iBinder == null) {
            jVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            jVar = iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 3);
        }
        this.j = jVar;
        this.f31802k = fVar;
        this.f31803l = z6;
        this.f31804m = z9;
    }

    public final void a() {
        j jVar = this.j;
        if (jVar != null) {
            try {
                Parcel parcelZ = jVar.Z(jVar.Y(), 2);
                O3.a aVarD0 = b.d0(parcelZ.readStrongBinder());
                parcelZ.recycle();
                if (b.e0(aVarD0) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (RemoteException e6) {
                f31799n.a(e6, "Unable to call %s on %s.", "getWrappedClientObject", j.class.getSimpleName());
            }
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Z(parcel, 2, this.f31800h);
        G.Z(parcel, 3, this.f31801i);
        j jVar = this.j;
        G.U(parcel, 4, jVar == null ? null : jVar.f10839d);
        G.Y(parcel, 5, this.f31802k, i3);
        G.e0(parcel, 6, 4);
        parcel.writeInt(this.f31803l ? 1 : 0);
        G.e0(parcel, 7, 4);
        parcel.writeInt(this.f31804m ? 1 : 0);
        G.g0(parcel, iF0);
    }
}
