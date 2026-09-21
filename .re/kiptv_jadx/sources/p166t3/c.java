package p166t3;

/* JADX INFO: loaded from: classes.dex */
public final class c implements java.lang.Runnable {
    public static final B8.h j = new B8.h("RevokeAccessOperation", new java.lang.String[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f27767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F3.m f27768i;

    public c(java.lang.String str) {
        H3.q.e(str);
        this.f27767h = str;
        this.f27768i = new F3.m(null, 0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        B8.h hVar = j;
        com.google.android.gms.common.api.Status status = com.google.android.gms.common.api.Status.f18687n;
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f27767h).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = com.google.android.gms.common.api.Status.f18685l;
            } else {
                hVar.getClass();
                android.util.Log.e((java.lang.String) hVar.f862k, ((java.lang.String) hVar.j).concat("Unable to revoke access!"));
            }
            java.lang.String str = "Response Code: " + responseCode;
            if (hVar.f861i <= 3) {
                android.util.Log.d((java.lang.String) hVar.f862k, ((java.lang.String) hVar.j).concat(str));
            }
        } catch (java.io.IOException e6) {
            java.lang.String strConcat = "IOException when revoking access: ".concat(java.lang.String.valueOf(e6.toString()));
            hVar.getClass();
            android.util.Log.e((java.lang.String) hVar.f862k, ((java.lang.String) hVar.j).concat(strConcat));
        } catch (java.lang.Exception e9) {
            java.lang.String strConcat2 = "Exception when revoking access: ".concat(java.lang.String.valueOf(e9.toString()));
            hVar.getClass();
            android.util.Log.e((java.lang.String) hVar.f862k, ((java.lang.String) hVar.j).concat(strConcat2));
        }
        this.f27768i.n0(status);
    }
}
