package P3;

import android.os.Parcel;

public final class i extends X3.a {
    public final O3.a f0(O3.b bVar, int i3, O3.b bVar2) {
        Parcel parcelY = Y();
        p004a4.h.b(parcelY, bVar);
        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelY.writeInt(i3);
        p004a4.h.b(parcelY, bVar2);
        Parcel parcelX = X(parcelY, 2);
        O3.a aVarD0 = O3.b.d0(parcelX.readStrongBinder());
        parcelX.recycle();
        return aVarD0;
    }

    public final O3.a g0(O3.b bVar, int i3, O3.b bVar2) {
        Parcel parcelY = Y();
        p004a4.h.b(parcelY, bVar);
        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelY.writeInt(i3);
        p004a4.h.b(parcelY, bVar2);
        Parcel parcelX = X(parcelY, 3);
        O3.a aVarD0 = O3.b.d0(parcelX.readStrongBinder());
        parcelX.recycle();
        return aVarD0;
    }
}
