package p072i;

import R0.AbstractC0815c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p105m2.a0;

public final class s extends BroadcastReceiver {

    public final int f22664a;

    public final Object f22665b;

    public s(int i3, Object obj) {
        this.f22664a = i3;
        this.f22665b = obj;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        switch (this.f22664a) {
            case 0:
                ((AbstractC0815c) this.f22665b).n();
                break;
            default:
                ((a0) this.f22665b).g();
                break;
        }
    }
}
