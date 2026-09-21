package p103m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.d0;

public final class M extends View.BaseSavedState {
    public static final Parcelable.Creator<M> CREATOR = new d0(6);

    public boolean f24942h;

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeByte(this.f24942h ? (byte) 1 : (byte) 0);
    }
}
