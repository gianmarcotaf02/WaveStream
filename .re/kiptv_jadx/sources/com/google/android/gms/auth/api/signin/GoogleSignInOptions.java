package com.google.android.gms.auth.api.signin;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class GoogleSignInOptions extends I3.a implements E3.b, com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.google.android.gms.auth.api.signin.GoogleSignInOptions f18589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f18590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f18591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Scope f18592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p157s3.b f18593v;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f18594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f18595i;
    public final android.accounts.Account j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f18597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f18598m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f18599n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f18600o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f18601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f18602q;

    static {
        com.google.android.gms.common.api.Scope scope = new com.google.android.gms.common.api.Scope(1, "profile");
        new com.google.android.gms.common.api.Scope(1, "email");
        com.google.android.gms.common.api.Scope scope2 = new com.google.android.gms.common.api.Scope(1, "openid");
        f18590s = scope2;
        com.google.android.gms.common.api.Scope scope3 = new com.google.android.gms.common.api.Scope(1, "https://www.googleapis.com/auth/games_lite");
        f18591t = scope3;
        f18592u = new com.google.android.gms.common.api.Scope(1, "https://www.googleapis.com/auth/games");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap map = new java.util.HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f18592u)) {
            com.google.android.gms.common.api.Scope scope4 = f18591t;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f18589r = new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(hashSet), null, false, false, false, null, null, map, null);
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashMap map2 = new java.util.HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(java.util.Arrays.asList(new com.google.android.gms.common.api.Scope[0]));
        if (hashSet2.contains(f18592u)) {
            com.google.android.gms.common.api.Scope scope5 = f18591t;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new p157s3.c(1);
        f18593v = new p157s3.b(1);
    }

    public GoogleSignInOptions(int i3, java.util.ArrayList arrayList, android.accounts.Account account, boolean z6, boolean z9, boolean z10, java.lang.String str, java.lang.String str2, java.util.HashMap map, java.lang.String str3) {
        this.f18594h = i3;
        this.f18595i = arrayList;
        this.j = account;
        this.f18596k = z6;
        this.f18597l = z9;
        this.f18598m = z10;
        this.f18599n = str;
        this.f18600o = str2;
        this.f18601p = new java.util.ArrayList(map.values());
        this.f18602q = str3;
    }

    public static com.google.android.gms.auth.api.signin.GoogleSignInOptions a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new com.google.android.gms.common.api.Scope(1, jSONArray.getString(i3)));
        }
        java.lang.String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(hashSet), !android.text.TextUtils.isEmpty(strOptString) ? new android.accounts.Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new java.util.HashMap(), null);
    }

    public static java.util.HashMap b(java.util.ArrayList arrayList) {
        java.util.HashMap map = new java.util.HashMap();
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p166t3.a aVar = (p166t3.a) it.next();
                map.put(java.lang.Integer.valueOf(aVar.f27762i), aVar);
            }
        }
        return map;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str = this.f18599n;
        java.util.ArrayList arrayList = this.f18595i;
        if (obj == null) {
            return false;
        }
        try {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) obj;
            java.util.ArrayList arrayList2 = googleSignInOptions.f18595i;
            java.lang.String str2 = googleSignInOptions.f18599n;
            android.accounts.Account account = googleSignInOptions.j;
            if (this.f18601p.isEmpty() && googleSignInOptions.f18601p.isEmpty() && arrayList.size() == new java.util.ArrayList(arrayList2).size() && arrayList.containsAll(new java.util.ArrayList(arrayList2))) {
                android.accounts.Account account2 = this.j;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (android.text.TextUtils.isEmpty(str)) {
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.f18598m == googleSignInOptions.f18598m && this.f18596k == googleSignInOptions.f18596k && this.f18597l == googleSignInOptions.f18597l && android.text.TextUtils.equals(this.f18602q, googleSignInOptions.f18602q);
            }
            return false;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f18595i;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((com.google.android.gms.common.api.Scope) arrayList2.get(i3)).f18684i);
        }
        java.util.Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (1 * 31);
        android.accounts.Account account = this.j;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        java.lang.String str = this.f18599n;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f18598m ? 1 : 0)) * 31) + (this.f18596k ? 1 : 0)) * 31) + (this.f18597l ? 1 : 0);
        java.lang.String str2 = this.f18602q;
        return (iHashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i3) {
        int iF0 = E6.G.f0(parcel, 20293);
        E6.G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18594h);
        E6.G.c0(parcel, new java.util.ArrayList(this.f18595i), 2);
        E6.G.Y(parcel, 3, this.j, i3);
        E6.G.e0(parcel, 4, 4);
        parcel.writeInt(this.f18596k ? 1 : 0);
        E6.G.e0(parcel, 5, 4);
        parcel.writeInt(this.f18597l ? 1 : 0);
        E6.G.e0(parcel, 6, 4);
        parcel.writeInt(this.f18598m ? 1 : 0);
        E6.G.Z(parcel, 7, this.f18599n);
        E6.G.Z(parcel, 8, this.f18600o);
        E6.G.c0(parcel, this.f18601p, 9);
        E6.G.Z(parcel, 10, this.f18602q);
        E6.G.g0(parcel, iF0);
    }
}
