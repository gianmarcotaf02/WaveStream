package G3;

/* JADX INFO: loaded from: classes.dex */
public final class a extends I3.a {
    public static final android.os.Parcelable.Creator<G3.a> CREATOR = new B3.e(8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.net.Uri f3785i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f3786k;

    public a(int i3, android.net.Uri uri, int i9, int i10) {
        this.f3784h = i3;
        this.f3785i = uri;
        this.j = i9;
        this.f3786k = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof G3.a)) {
            G3.a aVar = (G3.a) obj;
            if (H3.q.j(this.f3785i, aVar.f3785i) && this.j == aVar.j && this.f3786k == aVar.f3786k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f3785i, java.lang.Integer.valueOf(this.j), java.lang.Integer.valueOf(this.f3786k)});
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        return "Image " + this.j + "x" + this.f3786k + io.ktor.sse.ServerSentEventKt.SPACE + this.f3785i.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(this.f3784h);
        E6.G.Y(parcel, 2, this.f3785i, i3);
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(this.j);
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(this.f3786k);
        E6.G.g0(parcel, iF0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(org.json.JSONObject jSONObject) {
        android.net.Uri uri = android.net.Uri.EMPTY;
        if (jSONObject.has(io.sentry.protocol.Request.JsonKeys.URL)) {
            try {
                uri = android.net.Uri.parse(jSONObject.getString(io.sentry.protocol.Request.JsonKeys.URL));
            } catch (org.json.JSONException unused) {
            }
        }
        int iOptInt = jSONObject.optInt("width", 0);
        int iOptInt2 = jSONObject.optInt("height", 0);
        this(1, uri, iOptInt, iOptInt2);
        if (uri == null) {
            throw new java.lang.IllegalArgumentException("url cannot be null");
        }
        if (iOptInt < 0 || iOptInt2 < 0) {
            throw new java.lang.IllegalArgumentException("width and height must not be negative");
        }
    }
}
