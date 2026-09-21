package O2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements O2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.net.ConnectivityManager f7889b;

    public f(android.net.ConnectivityManager connectivityManager) {
        this.f7889b = connectivityManager;
    }

    @Override // O2.e
    public final boolean a() {
        android.net.ConnectivityManager connectivityManager = this.f7889b;
        android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
