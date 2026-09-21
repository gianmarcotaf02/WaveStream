package D3;

import E6.G;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class b extends I3.a {

    public final int f2096h;

    public final int f2097i;
    public final PendingIntent j;

    public final String f2098k;

    public final Integer f2099l;

    public static final b f2095m = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new B3.e(4);

    public b(int i3, int i9, PendingIntent pendingIntent, String str, Integer num) {
        this.f2096h = i3;
        this.f2097i = i9;
        this.j = pendingIntent;
        this.f2098k = str;
        this.f2099l = num;
    }

    public static String a(int i3) {
        if (i3 == 99) {
            return "UNFINISHED";
        }
        if (i3 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i3) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i3) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i3);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2097i == bVar.f2097i && H3.q.j(this.j, bVar.j) && H3.q.j(this.f2098k, bVar.f2098k) && H3.q.j(this.f2099l, bVar.f2099l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2097i), this.j, this.f2098k, this.f2099l});
    }

    public final String toString() {
        S.p pVar = new S.p(16, this);
        pVar.f(a(this.f2097i), "statusCode");
        pVar.f(this.j, "resolution");
        pVar.f(this.f2098k, "message");
        pVar.f(this.f2099l, "clientMethodKey");
        return pVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f2096h);
        G.e0(parcel, 2, 4);
        parcel.writeInt(this.f2097i);
        G.Y(parcel, 3, this.j, i3);
        G.Z(parcel, 4, this.f2098k);
        G.W(parcel, 5, this.f2099l);
        G.g0(parcel, iF0);
    }

    public b(int i3, PendingIntent pendingIntent, String str) {
        this(1, i3, pendingIntent, str, null);
    }
}
