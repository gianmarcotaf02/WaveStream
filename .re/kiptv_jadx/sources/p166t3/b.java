package p166t3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f27763c = new java.util.concurrent.locks.ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p166t3.b f27764d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f27765a = new java.util.concurrent.locks.ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f27766b;

    public b(android.content.Context context) {
        this.f27766b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static p166t3.b a(android.content.Context context) {
        H3.q.g(context);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f27763c;
        reentrantLock.lock();
        try {
            if (f27764d == null) {
                f27764d = new p166t3.b(context.getApplicationContext());
            }
            return f27764d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final java.lang.String f(java.lang.String str, java.lang.String str2) {
        return p121o0.p.p(str, ":", str2);
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount b() {
        java.lang.String strD;
        java.lang.String strD2 = d("defaultGoogleSignInAccount");
        if (android.text.TextUtils.isEmpty(strD2) || (strD = d(f("googleSignInAccount", strD2))) == null) {
            return null;
        }
        try {
            return com.google.android.gms.auth.api.signin.GoogleSignInAccount.a(strD);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public final void c(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        H3.q.g(googleSignInAccount);
        H3.q.g(googleSignInOptions);
        java.lang.String str = googleSignInAccount.f18584p;
        e("defaultGoogleSignInAccount", str);
        java.lang.String strF = f("googleSignInAccount", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.String str2 = googleSignInAccount.f18578i;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            java.lang.String str3 = googleSignInAccount.j;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            java.lang.String str4 = googleSignInAccount.f18579k;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            java.lang.String str5 = googleSignInAccount.f18580l;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            java.lang.String str6 = googleSignInAccount.f18586r;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            java.lang.String str7 = googleSignInAccount.f18587s;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            android.net.Uri uri = googleSignInAccount.f18581m;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            java.lang.String str8 = googleSignInAccount.f18582n;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f18583o);
            jSONObject.put("obfuscatedIdentifier", str);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.ArrayList arrayList = googleSignInAccount.f18585q;
            com.google.android.gms.common.api.Scope[] scopeArr = (com.google.android.gms.common.api.Scope[]) arrayList.toArray(new com.google.android.gms.common.api.Scope[arrayList.size()]);
            java.util.Arrays.sort(scopeArr, p157s3.b.f27262i);
            for (com.google.android.gms.common.api.Scope scope : scopeArr) {
                jSONArray.put(scope.f18684i);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(strF, jSONObject.toString());
            java.lang.String strF2 = f("googleSignInOptions", str);
            java.lang.String str9 = googleSignInOptions.f18600o;
            java.lang.String str10 = googleSignInOptions.f18599n;
            java.util.ArrayList arrayList2 = googleSignInOptions.f18595i;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                java.util.Collections.sort(arrayList2, com.google.android.gms.auth.api.signin.GoogleSignInOptions.f18593v);
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((com.google.android.gms.common.api.Scope) it.next()).f18684i);
                }
                jSONObject2.put("scopes", jSONArray2);
                android.accounts.Account account = googleSignInOptions.j;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f18596k);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f18598m);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f18597l);
                if (!android.text.TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!android.text.TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(strF2, jSONObject2.toString());
            } catch (org.json.JSONException e6) {
                throw new java.lang.RuntimeException(e6);
            }
        } catch (org.json.JSONException e9) {
            throw new java.lang.RuntimeException(e9);
        }
    }

    public final java.lang.String d(java.lang.String str) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f27765a;
        reentrantLock.lock();
        try {
            return this.f27766b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(java.lang.String str, java.lang.String str2) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f27765a;
        reentrantLock.lock();
        try {
            this.f27766b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
