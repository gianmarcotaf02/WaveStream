package O2;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

public final class f implements e {

    public final ConnectivityManager f7889b;

    public f(ConnectivityManager connectivityManager) {
        this.f7889b = connectivityManager;
    }

    @Override
    public final boolean a() {
        ConnectivityManager connectivityManager = this.f7889b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
