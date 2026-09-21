package p148r3;

import E6.G;
import H3.q;
import I3.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.d0;

public final class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new d0(8);

    public final PendingIntent f26846h;

    public f(PendingIntent pendingIntent) {
        q.g(pendingIntent);
        this.f26846h = pendingIntent;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Y(parcel, 1, this.f26846h, i3);
        G.g0(parcel, iF0);
    }
}
