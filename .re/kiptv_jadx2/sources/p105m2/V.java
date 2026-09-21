package p105m2;

import android.os.Bundle;
import android.util.Log;

public final class V {

    public final W f25242a;

    public V(W w6) {
        this.f25242a = w6;
    }

    public static void a(String str, Bundle bundle) {
        Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
    }

    public final void b(Bundle bundle) {
        bundle.getString("groupableTitle");
        W w6 = this.f25242a;
        w6.getClass();
        bundle.getString("transferableTitle");
        w6.getClass();
    }
}
