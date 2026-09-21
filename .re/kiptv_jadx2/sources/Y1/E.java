package Y1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class E implements Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new T3.G(21);

    public ArrayList f11189h;

    public ArrayList f11190i;
    public C1017b[] j;

    public int f11191k;

    public String f11192l;

    public ArrayList f11193m;

    public ArrayList f11194n;

    public ArrayList f11195o;

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStringList(this.f11189h);
        parcel.writeStringList(this.f11190i);
        parcel.writeTypedArray(this.j, i3);
        parcel.writeInt(this.f11191k);
        parcel.writeString(this.f11192l);
        parcel.writeStringList(this.f11193m);
        parcel.writeTypedList(this.f11194n);
        parcel.writeTypedList(this.f11195o);
    }
}
