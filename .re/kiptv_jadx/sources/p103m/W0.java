package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends N1.b {
    public static final android.os.Parcelable.Creator<p103m.W0> CREATOR = new p121o0.m(3);
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f24979k;

    public W0(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.j = parcel.readInt();
        this.f24979k = parcel.readInt() != 0;
    }

    @Override // N1.b, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.j);
        parcel.writeInt(this.f24979k ? 1 : 0);
    }
}
