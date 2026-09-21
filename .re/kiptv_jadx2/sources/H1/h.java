package H1;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class h extends View.BaseSavedState {
    public static final Parcelable.Creator<h> CREATOR = new B3.e(9);

    public int f3865h;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return Y6.f.k(sb, this.f3865h, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f3865h);
    }
}
