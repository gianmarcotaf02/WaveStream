package com.google.android.gms.common.api;

import B3.e;
import D3.b;
import E3.k;
import E6.G;
import H3.q;
import I3.a;
import S.p;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

public final class Status extends a implements k, ReflectedParcelable {

    public final int f18690h;

    public final String f18691i;
    public final PendingIntent j;

    public final b f18692k;

    public static final Status f18685l = new Status(0, null, null, null);

    public static final Status f18686m = new Status(14, null, null, null);

    public static final Status f18687n = new Status(8, null, null, null);

    public static final Status f18688o = new Status(15, null, null, null);

    public static final Status f18689p = new Status(16, null, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new e(7);

    public Status(int i3, String str, PendingIntent pendingIntent, b bVar) {
        this.f18690h = i3;
        this.f18691i = str;
        this.j = pendingIntent;
        this.f18692k = bVar;
    }

    public final boolean a() {
        return this.f18690h <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f18690h == status.f18690h && q.j(this.f18691i, status.f18691i) && q.j(this.j, status.j) && q.j(this.f18692k, status.f18692k);
    }

    @Override
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18690h), this.f18691i, this.j, this.f18692k});
    }

    public final String toString() {
        p pVar = new p(16, this);
        String string = this.f18691i;
        if (string == null) {
            int i3 = this.f18690h;
            switch (i3) {
                case -1:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i3);
                    string = sb.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case 10:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case 14:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case 16:
                    string = "CANCELED";
                    break;
                case 17:
                    string = "API_NOT_CONNECTED";
                    break;
                case 18:
                    string = "DEAD_CLIENT";
                    break;
                case 19:
                    string = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        pVar.f(string, "statusCode");
        pVar.f(this.j, "resolution");
        return pVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18690h);
        G.Z(parcel, 2, this.f18691i);
        G.Y(parcel, 3, this.j, i3);
        G.Y(parcel, 4, this.f18692k, i3);
        G.g0(parcel, iF0);
    }
}
