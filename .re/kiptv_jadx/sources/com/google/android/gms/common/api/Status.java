package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends I3.a implements E3.k, com.google.android.gms.common.internal.ReflectedParcelable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f18691i;
    public final android.app.PendingIntent j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D3.b f18692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f18685l = new com.google.android.gms.common.api.Status(0, null, null, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f18686m = new com.google.android.gms.common.api.Status(14, null, null, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f18687n = new com.google.android.gms.common.api.Status(8, null, null, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f18688o = new com.google.android.gms.common.api.Status(15, null, null, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f18689p = new com.google.android.gms.common.api.Status(16, null, null, null);
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new B3.e(7);

    public Status(int i3, java.lang.String str, android.app.PendingIntent pendingIntent, D3.b bVar) {
        this.f18690h = i3;
        this.f18691i = str;
        this.j = pendingIntent;
        this.f18692k = bVar;
    }

    public final boolean a() {
        return this.f18690h <= 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.f18690h == status.f18690h && H3.q.j(this.f18691i, status.f18691i) && H3.q.j(this.j, status.j) && H3.q.j(this.f18692k, status.f18692k);
    }

    @Override // E3.k
    public final com.google.android.gms.common.api.Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.f18690h), this.f18691i, this.j, this.f18692k});
    }

    public final java.lang.String toString() {
        S.p pVar = new S.p(16, this);
        java.lang.String string = this.f18691i;
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
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 21);
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

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18690h);
        E6.G.Z(parcel, 2, this.f18691i);
        E6.G.Y(parcel, 3, this.j, i3);
        E6.G.Y(parcel, 4, this.f18692k, i3);
        E6.G.g0(parcel, iF0);
    }
}
