package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class GoogleSignInAccount extends I3.a implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInAccount> CREATOR = new p157s3.c(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f18578i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f18579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f18580l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final android.net.Uri f18581m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f18582n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f18583o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f18584p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f18585q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.String f18586r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.lang.String f18587s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.HashSet f18588t = new java.util.HashSet();

    public GoogleSignInAccount(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, long j, java.lang.String str6, java.util.ArrayList arrayList, java.lang.String str7, java.lang.String str8) {
        this.f18577h = i3;
        this.f18578i = str;
        this.j = str2;
        this.f18579k = str3;
        this.f18580l = str4;
        this.f18581m = uri;
        this.f18582n = str5;
        this.f18583o = j;
        this.f18584p = str6;
        this.f18585q = arrayList;
        this.f18586r = str7;
        this.f18587s = str8;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInAccount a(java.lang.String str) throws org.json.JSONException {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String strOptString = jSONObject.optString("photoUrl");
        android.net.Uri uri = !android.text.TextUtils.isEmpty(strOptString) ? android.net.Uri.parse(strOptString) : null;
        long j = java.lang.Long.parseLong(jSONObject.getString("expirationTime"));
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(1, jSONArray.getString(i3)));
        }
        java.lang.String strOptString2 = jSONObject.optString("id");
        java.lang.String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        java.lang.String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        java.lang.String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        java.lang.String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        java.lang.String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        java.lang.String string = jSONObject.getString("obfuscatedIdentifier");
        H3.q.e(string);
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = new com.google.android.gms.auth.api.signin.GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new java.util.ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f18582n = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.auth.api.signin.GoogleSignInAccount)) {
            return false;
        }
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) obj;
        if (!googleSignInAccount.f18584p.equals(this.f18584p)) {
            return false;
        }
        java.util.HashSet hashSet = new java.util.HashSet(googleSignInAccount.f18585q);
        hashSet.addAll(googleSignInAccount.f18588t);
        java.util.HashSet hashSet2 = new java.util.HashSet(this.f18585q);
        hashSet2.addAll(this.f18588t);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f18584p.hashCode() + 527;
        java.util.HashSet hashSet = new java.util.HashSet(this.f18585q);
        hashSet.addAll(this.f18588t);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18577h);
        E6.G.Z(parcel, 2, this.f18578i);
        E6.G.Z(parcel, 3, this.j);
        E6.G.Z(parcel, 4, this.f18579k);
        E6.G.Z(parcel, 5, this.f18580l);
        E6.G.Y(parcel, 6, this.f18581m, i3);
        E6.G.Z(parcel, 7, this.f18582n);
        E6.G.e0(parcel, 8, 8);
        parcel.writeLong(this.f18583o);
        E6.G.Z(parcel, 9, this.f18584p);
        E6.G.c0(parcel, this.f18585q, 10);
        E6.G.Z(parcel, 11, this.f18586r);
        E6.G.Z(parcel, 12, this.f18587s);
        E6.G.g0(parcel, iF0);
    }
}
