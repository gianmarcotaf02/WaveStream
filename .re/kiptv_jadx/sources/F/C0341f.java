package F;

/* JADX INFO: renamed from: F.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0341f implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new F.C0342g(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        return new F.C0342g[i3];
    }
}
