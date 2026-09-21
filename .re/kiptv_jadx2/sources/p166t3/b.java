package p166t3;

import H3.q;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p121o0.p;

public final class b {

    public static final ReentrantLock f27763c = new ReentrantLock();

    public static b f27764d;

    public final ReentrantLock f27765a = new ReentrantLock();

    public final SharedPreferences f27766b;

    public b(Context context) {
        this.f27766b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        q.g(context);
        ReentrantLock reentrantLock = f27763c;
        reentrantLock.lock();
        try {
            if (f27764d == null) {
                f27764d = new b(context.getApplicationContext());
            }
            return f27764d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String f(String str, String str2) {
        return p.p(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String strD;
        String strD2 = d("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strD2) || (strD = d(f("googleSignInAccount", strD2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.a(strD);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        q.g(googleSignInAccount);
        q.g(googleSignInOptions);
        String str = googleSignInAccount.f18584p;
        e("defaultGoogleSignInAccount", str);
        String strF = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f18578i;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.j;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f18579k;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f18580l;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f18586r;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f18587s;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f18581m;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f18582n;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f18583o);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f18585q;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, p157s3.b.f27262i);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f18684i);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(strF, jSONObject.toString());
            String strF2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f18600o;
            String str10 = googleSignInOptions.f18599n;
            ArrayList arrayList2 = googleSignInOptions.f18595i;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f18593v);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f18684i);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.j;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f18596k);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f18598m);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f18597l);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(strF2, jSONObject2.toString());
            } catch (JSONException e6) {
                throw new RuntimeException(e6);
            }
        } catch (JSONException e9) {
            throw new RuntimeException(e9);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.f27765a;
        reentrantLock.lock();
        try {
            return this.f27766b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.f27765a;
        reentrantLock.lock();
        try {
            this.f27766b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
