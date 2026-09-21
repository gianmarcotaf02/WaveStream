package p184w3;

/* JADX INFO: loaded from: classes.dex */
public final class o extends I3.a {
    public static final android.os.Parcelable.Creator<p184w3.o> CREATOR = new p184w3.D(8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.android.gms.cast.MediaInfo f29890h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29891i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double f29892k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public double f29893l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f29894m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f29895n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.String f29896o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public org.json.JSONObject f29897p;

    public o(com.google.android.gms.cast.MediaInfo mediaInfo, int i3, boolean z6, double d4, double d6, double d9, long[] jArr, java.lang.String str) {
        this.f29890h = mediaInfo;
        this.f29891i = i3;
        this.j = z6;
        this.f29892k = d4;
        this.f29893l = d6;
        this.f29894m = d9;
        this.f29895n = jArr;
        this.f29896o = str;
        if (str == null) {
            this.f29897p = null;
            return;
        }
        try {
            this.f29897p = new org.json.JSONObject(this.f29896o);
        } catch (org.json.JSONException unused) {
            this.f29897p = null;
            this.f29896o = null;
        }
    }

    public final boolean a(org.json.JSONObject jSONObject) {
        boolean z6;
        long[] jArr;
        boolean z9;
        int i3;
        boolean z10 = false;
        if (jSONObject.has(io.ktor.http.LinkHeader.Parameters.Media)) {
            this.f29890h = new com.google.android.gms.cast.MediaInfo(jSONObject.getJSONObject(io.ktor.http.LinkHeader.Parameters.Media));
            z6 = true;
        } else {
            z6 = false;
        }
        if (jSONObject.has("itemId") && this.f29891i != (i3 = jSONObject.getInt("itemId"))) {
            this.f29891i = i3;
            z6 = true;
        }
        if (jSONObject.has("autoplay") && this.j != (z9 = jSONObject.getBoolean("autoplay"))) {
            this.j = z9;
            z6 = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (java.lang.Double.isNaN(dOptDouble) != java.lang.Double.isNaN(this.f29892k) || (!java.lang.Double.isNaN(dOptDouble) && java.lang.Math.abs(dOptDouble - this.f29892k) > 1.0E-7d)) {
            this.f29892k = dOptDouble;
            z6 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d4 = jSONObject.getDouble("playbackDuration");
            if (java.lang.Math.abs(d4 - this.f29893l) > 1.0E-7d) {
                this.f29893l = d4;
                z6 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d6 = jSONObject.getDouble("preloadTime");
            if (java.lang.Math.abs(d6 - this.f29894m) > 1.0E-7d) {
                this.f29894m = d6;
                z6 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i9 = 0; i9 < length; i9++) {
                jArr[i9] = jSONArray.getLong(i9);
            }
            long[] jArr2 = this.f29895n;
            if (jArr2 == null || jArr2.length != length) {
                z10 = true;
                break;
            }
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f29895n[i10] != jArr[i10]) {
                    z10 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z10) {
            this.f29895n = jArr;
            z6 = true;
        }
        if (!jSONObject.has("customData")) {
            return z6;
        }
        this.f29897p = jSONObject.getJSONObject("customData");
        return true;
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            com.google.android.gms.cast.MediaInfo mediaInfo = this.f29890h;
            if (mediaInfo != null) {
                jSONObject.put(io.ktor.http.LinkHeader.Parameters.Media, mediaInfo.a());
            }
            int i3 = this.f29891i;
            if (i3 != 0) {
                jSONObject.put("itemId", i3);
            }
            jSONObject.put("autoplay", this.j);
            if (!java.lang.Double.isNaN(this.f29892k)) {
                jSONObject.put("startTime", this.f29892k);
            }
            double d4 = this.f29893l;
            if (d4 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d4);
            }
            jSONObject.put("preloadTime", this.f29894m);
            if (this.f29895n != null) {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                for (long j : this.f29895n) {
                    jSONArray.put(j);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            org.json.JSONObject jSONObject2 = this.f29897p;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p184w3.o)) {
            return false;
        }
        p184w3.o oVar = (p184w3.o) obj;
        org.json.JSONObject jSONObject = this.f29897p;
        boolean z6 = jSONObject == null;
        org.json.JSONObject jSONObject2 = oVar.f29897p;
        if (z6 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || M3.a.a(jSONObject, jSONObject2)) && B3.AbstractC0088a.e(this.f29890h, oVar.f29890h) && this.f29891i == oVar.f29891i && this.j == oVar.j && ((java.lang.Double.isNaN(this.f29892k) && java.lang.Double.isNaN(oVar.f29892k)) || this.f29892k == oVar.f29892k) && this.f29893l == oVar.f29893l && this.f29894m == oVar.f29894m && java.util.Arrays.equals(this.f29895n, oVar.f29895n);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.f29890h, java.lang.Integer.valueOf(this.f29891i), java.lang.Boolean.valueOf(this.j), java.lang.Double.valueOf(this.f29892k), java.lang.Double.valueOf(this.f29893l), java.lang.Double.valueOf(this.f29894m), java.lang.Integer.valueOf(java.util.Arrays.hashCode(this.f29895n)), java.lang.String.valueOf(this.f29897p)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        org.json.JSONObject jSONObject = this.f29897p;
        this.f29896o = jSONObject == null ? null : jSONObject.toString();
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.Y(parcel, 2, this.f29890h, i3);
        int i9 = this.f29891i;
        E6.G.e0(parcel, 3, 4);
        parcel.writeInt(i9);
        boolean z6 = this.j;
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(z6 ? 1 : 0);
        double d4 = this.f29892k;
        E6.G.e0(parcel, 5, 8);
        parcel.writeDouble(d4);
        double d6 = this.f29893l;
        E6.G.e0(parcel, 6, 8);
        parcel.writeDouble(d6);
        double d9 = this.f29894m;
        E6.G.e0(parcel, 7, 8);
        parcel.writeDouble(d9);
        E6.G.X(parcel, 8, this.f29895n);
        E6.G.Z(parcel, 9, this.f29896o);
        E6.G.g0(parcel, iF0);
    }

    public o(org.json.JSONObject jSONObject) {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        a(jSONObject);
    }
}
