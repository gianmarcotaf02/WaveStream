package P3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends X3.a {
    public final O3.a f0(O3.b bVar, int i3) {
        android.os.Parcel parcelY = Y();
        p004a4.h.b(parcelY, bVar);
        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelY.writeInt(i3);
        android.os.Parcel parcelX = X(parcelY, 2);
        O3.a aVarD0 = O3.b.d0(parcelX.readStrongBinder());
        parcelX.recycle();
        return aVarD0;
    }

    public final O3.a g0(O3.b bVar, int i3) {
        android.os.Parcel parcelY = Y();
        p004a4.h.b(parcelY, bVar);
        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelY.writeInt(i3);
        android.os.Parcel parcelX = X(parcelY, 4);
        O3.a aVarD0 = O3.b.d0(parcelX.readStrongBinder());
        parcelX.recycle();
        return aVarD0;
    }

    public final O3.a h0(O3.b bVar, boolean z6, long j) {
        android.os.Parcel parcelY = Y();
        p004a4.h.b(parcelY, bVar);
        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelY.writeInt(z6 ? 1 : 0);
        parcelY.writeLong(j);
        android.os.Parcel parcelX = X(parcelY, 7);
        O3.a aVarD0 = O3.b.d0(parcelX.readStrongBinder());
        parcelX.recycle();
        return aVarD0;
    }

    public final O3.a i0(O3.b bVar, int i3, O3.b bVar2) {
        android.os.Parcel parcelY = Y();
        p004a4.h.b(parcelY, bVar);
        parcelY.writeString("com.google.android.gms.cast.framework.dynamite");
        parcelY.writeInt(i3);
        p004a4.h.b(parcelY, bVar2);
        android.os.Parcel parcelX = X(parcelY, 8);
        O3.a aVarD0 = O3.b.d0(parcelX.readStrongBinder());
        parcelX.recycle();
        return aVarD0;
    }
}
