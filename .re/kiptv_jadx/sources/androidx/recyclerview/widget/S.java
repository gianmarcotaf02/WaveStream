package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class S extends N1.b {
    public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.S> CREATOR = new p121o0.m(2);
    public android.os.Parcelable j;

    public S(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.j = parcel.readParcelable(classLoader == null ? androidx.recyclerview.widget.I.class.getClassLoader() : classLoader);
    }

    @Override // N1.b, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.j, 0);
    }
}
