package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

public final class S extends N1.b {
    public static final Parcelable.Creator<S> CREATOR = new p121o0.m(2);
    public Parcelable j;

    public S(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.j = parcel.readParcelable(classLoader == null ? I.class.getClassLoader() : classLoader);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.j, 0);
    }
}
