package com.google.android.gms.auth.api.signin;

import E6.G;
import H3.q;
import I3.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p157s3.c;

@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c(0);

    public final int f18577h;

    public final String f18578i;
    public final String j;

    public final String f18579k;

    public final String f18580l;

    public final Uri f18581m;

    public String f18582n;

    public final long f18583o;

    public final String f18584p;

    public final ArrayList f18585q;

    public final String f18586r;

    public final String f18587s;

    public final HashSet f18588t = new HashSet();

    public GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
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

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(1, jSONArray.getString(i3)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        q.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f18582n = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f18584p.equals(this.f18584p)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f18585q);
        hashSet.addAll(googleSignInAccount.f18588t);
        HashSet hashSet2 = new HashSet(this.f18585q);
        hashSet2.addAll(this.f18588t);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f18584p.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f18585q);
        hashSet.addAll(this.f18588t);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18577h);
        G.Z(parcel, 2, this.f18578i);
        G.Z(parcel, 3, this.j);
        G.Z(parcel, 4, this.f18579k);
        G.Z(parcel, 5, this.f18580l);
        G.Y(parcel, 6, this.f18581m, i3);
        G.Z(parcel, 7, this.f18582n);
        G.e0(parcel, 8, 8);
        parcel.writeLong(this.f18583o);
        G.Z(parcel, 9, this.f18584p);
        G.c0(parcel, this.f18585q, 10);
        G.Z(parcel, 11, this.f18586r);
        G.Z(parcel, 12, this.f18587s);
        G.g0(parcel, iF0);
    }
}
