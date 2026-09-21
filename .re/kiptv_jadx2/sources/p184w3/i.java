package p184w3;

import B3.AbstractC0088a;
import E6.G;
import I3.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.recyclerview.widget.d0;
import com.google.android.gms.internal.play_billing.M0;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public final class i extends a {
    public static final Parcelable.Creator<i> CREATOR = new d0(29);

    public final boolean f29853h;

    public final String f29854i;
    public final boolean j;

    public final h f29855k;

    public i(boolean z6, String str, boolean z9, h hVar) {
        this.f29853h = z6;
        this.f29854i = str;
        this.j = z9;
        this.f29855k = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f29853h == iVar.f29853h && AbstractC0088a.e(this.f29854i, iVar.f29854i) && this.j == iVar.j && AbstractC0088a.e(this.f29855k, iVar.f29855k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f29853h), this.f29854i, Boolean.valueOf(this.j), this.f29855k});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchOptions(relaunchIfRunning=");
        sb.append(this.f29853h);
        sb.append(", language=");
        sb.append(this.f29854i);
        sb.append(", androidReceiverCompatible: ");
        return M0.o(sb, this.j, ")");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 2, 4);
        parcel.writeInt(this.f29853h ? 1 : 0);
        G.Z(parcel, 3, this.f29854i);
        G.e0(parcel, 4, 4);
        parcel.writeInt(this.j ? 1 : 0);
        G.Y(parcel, 5, this.f29855k, i3);
        G.g0(parcel, iF0);
    }

    public i() {
        Locale locale = Locale.getDefault();
        Pattern pattern = AbstractC0088a.f615a;
        StringBuilder sb = new StringBuilder(20);
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (!TextUtils.isEmpty(country)) {
            sb.append('-');
            sb.append(country);
        }
        String variant = locale.getVariant();
        if (!TextUtils.isEmpty(variant)) {
            sb.append('-');
            sb.append(variant);
        }
        this(false, sb.toString(), false, null);
    }
}
