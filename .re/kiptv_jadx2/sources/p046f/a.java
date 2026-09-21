package p046f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.d0;
import kotlin.jvm.internal.m;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new d0(1);

    public final int f21606h;

    public final Intent f21607i;

    public a(Intent intent, int i3) {
        this.f21606h = i3;
        this.f21607i = intent;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String strValueOf;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i3 = this.f21606h;
        if (i3 != -1) {
            strValueOf = i3 != 0 ? String.valueOf(i3) : "RESULT_CANCELED";
        } else {
            strValueOf = "RESULT_OK";
        }
        sb.append(strValueOf);
        sb.append(", data=");
        sb.append(this.f21607i);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final void writeToParcel(Parcel dest, int i3) {
        m.e(dest, "dest");
        dest.writeInt(this.f21606h);
        Intent intent = this.f21607i;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i3);
        }
    }
}
