package com.google.android.gms.auth.api.signin;

import E3.b;
import E6.G;
import I3.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import p157s3.c;

@Deprecated
public class GoogleSignInOptions extends a implements b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    public static final GoogleSignInOptions f18589r;

    public static final Scope f18590s;

    public static final Scope f18591t;

    public static final Scope f18592u;

    public static final p157s3.b f18593v;

    public final int f18594h;

    public final ArrayList f18595i;
    public final Account j;

    public final boolean f18596k;

    public final boolean f18597l;

    public final boolean f18598m;

    public final String f18599n;

    public final String f18600o;

    public final ArrayList f18601p;

    public final String f18602q;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f18590s = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f18591t = scope3;
        f18592u = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f18592u)) {
            Scope scope4 = f18591t;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f18589r = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f18592u)) {
            Scope scope5 = f18591t;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new c(1);
        f18593v = new p157s3.b(1);
    }

    public GoogleSignInOptions(int i3, ArrayList arrayList, Account account, boolean z6, boolean z9, boolean z10, String str, String str2, HashMap map, String str3) {
        this.f18594h = i3;
        this.f18595i = arrayList;
        this.j = account;
        this.f18596k = z6;
        this.f18597l = z9;
        this.f18598m = z10;
        this.f18599n = str;
        this.f18600o = str2;
        this.f18601p = new ArrayList(map.values());
        this.f18602q = str3;
    }

    public static GoogleSignInOptions a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(1, jSONArray.getString(i3)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap b(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                p166t3.a aVar = (p166t3.a) it.next();
                map.put(Integer.valueOf(aVar.f27762i), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f18599n;
        ArrayList arrayList = this.f18595i;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f18595i;
            String str2 = googleSignInOptions.f18599n;
            Account account = googleSignInOptions.j;
            if (this.f18601p.isEmpty() && googleSignInOptions.f18601p.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.j;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.f18598m == googleSignInOptions.f18598m && this.f18596k == googleSignInOptions.f18596k && this.f18597l == googleSignInOptions.f18597l && TextUtils.equals(this.f18602q, googleSignInOptions.f18602q);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f18595i;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Scope) arrayList2.get(i3)).f18684i);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (1 * 31);
        Account account = this.j;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f18599n;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f18598m ? 1 : 0)) * 31) + (this.f18596k ? 1 : 0)) * 31) + (this.f18597l ? 1 : 0);
        String str2 = this.f18602q;
        return (iHashCode3 * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int iF0 = G.f0(parcel, 20293);
        G.e0(parcel, 1, 4);
        parcel.writeInt(this.f18594h);
        G.c0(parcel, new ArrayList(this.f18595i), 2);
        G.Y(parcel, 3, this.j, i3);
        G.e0(parcel, 4, 4);
        parcel.writeInt(this.f18596k ? 1 : 0);
        G.e0(parcel, 5, 4);
        parcel.writeInt(this.f18597l ? 1 : 0);
        G.e0(parcel, 6, 4);
        parcel.writeInt(this.f18598m ? 1 : 0);
        G.Z(parcel, 7, this.f18599n);
        G.Z(parcel, 8, this.f18600o);
        G.c0(parcel, this.f18601p, 9);
        G.Z(parcel, 10, this.f18602q);
        G.g0(parcel, iF0);
    }
}
