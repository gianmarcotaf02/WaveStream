package p148r3;

import E6.G;
import H3.q;
import I3.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.d0;
import java.util.Arrays;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new d0(15);

    public final PendingIntent f26854h;

    public i(PendingIntent pendingIntent) {
        q.g(pendingIntent);
        this.f26854h = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return q.j(this.f26854h, ((i) obj).f26854h);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26854h});
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.Y(parcel, 1, this.f26854h, i3);
        G.g0(parcel, iF0);
    }
}
