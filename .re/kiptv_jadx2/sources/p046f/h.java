package p046f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.d0;
import kotlin.jvm.internal.m;

public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new d0(2);

    public final IntentSender f21619h;

    public final Intent f21620i;
    public final int j;

    public final int f21621k;

    public h(IntentSender intentSender, Intent intent, int i3, int i9) {
        m.e(intentSender, "intentSender");
        this.f21619h = intentSender;
        this.f21620i = intent;
        this.j = i3;
        this.f21621k = i9;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        m.e(dest, "dest");
        dest.writeParcelable(this.f21619h, i3);
        dest.writeParcelable(this.f21620i, i3);
        dest.writeInt(this.j);
        dest.writeInt(this.f21621k);
    }
}
