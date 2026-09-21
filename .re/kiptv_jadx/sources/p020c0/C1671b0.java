package p020c0;

/* JADX INFO: renamed from: c0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1671b0 implements android.os.Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18221a;

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel parcel) {
        switch (this.f18221a) {
            case 0:
                return new p020c0.C1673c0(parcel.readFloat());
            case 1:
                return new p020c0.C1675d0(parcel.readInt());
            default:
                return new p020c0.C1677e0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final java.lang.Object[] newArray(int i3) {
        switch (this.f18221a) {
            case 0:
                return new p020c0.C1673c0[i3];
            case 1:
                return new p020c0.C1675d0[i3];
            default:
                return new p020c0.C1677e0[i3];
        }
    }
}
