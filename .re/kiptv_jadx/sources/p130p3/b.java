package p130p3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends java.lang.Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f26186h;

    public b(java.util.HashMap map) {
        this.f26186h = map;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        android.net.Uri.Builder builderBuildUpon = android.net.Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
        java.util.HashMap map = this.f26186h;
        for (java.lang.String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, (java.lang.String) map.get(str));
        }
        java.lang.String string = builderBuildUpon.build().toString();
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(string).openConnection();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode >= 300) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(string).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(string);
                    android.util.Log.w("HttpUrlPinger", sb.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (java.io.IOException e6) {
            e = e6;
            java.lang.String message = e.getMessage();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + java.lang.String.valueOf(string).length() + 27);
            sb2.append("Error while pinging URL: ");
            sb2.append(string);
            sb2.append(". ");
            sb2.append(message);
            android.util.Log.w("HttpUrlPinger", sb2.toString(), e);
        } catch (java.lang.IndexOutOfBoundsException e9) {
            java.lang.String message2 = e9.getMessage();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(message2).length() + java.lang.String.valueOf(string).length() + 32);
            sb3.append("Error while parsing ping URL: ");
            sb3.append(string);
            sb3.append(". ");
            sb3.append(message2);
            android.util.Log.w("HttpUrlPinger", sb3.toString(), e9);
        } catch (java.lang.RuntimeException e10) {
            e = e10;
            java.lang.String message3 = e.getMessage();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(message3).length() + java.lang.String.valueOf(string).length() + 27);
            sb4.append("Error while pinging URL: ");
            sb4.append(string);
            sb4.append(". ");
            sb4.append(message3);
            android.util.Log.w("HttpUrlPinger", sb4.toString(), e);
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
