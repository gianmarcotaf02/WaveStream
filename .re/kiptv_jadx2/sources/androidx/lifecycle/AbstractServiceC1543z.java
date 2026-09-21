package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class AbstractServiceC1543z extends Service implements InterfaceC1540w {
    private final d0 dispatcher = new d0(this);

    @Override
    public AbstractC1534p getLifecycle() {
        return this.dispatcher.f16347a;
    }

    @Override
    public IBinder onBind(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC1532n.ON_START);
        return null;
    }

    @Override
    public void onCreate() {
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC1532n.ON_CREATE);
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC1532n.ON_STOP);
        d0Var.a(EnumC1532n.ON_DESTROY);
        super.onDestroy();
    }

    @Override
    @p070h6.c
    public void onStart(Intent intent, int i3) {
        d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(EnumC1532n.ON_START);
        super.onStart(intent, i3);
    }
}
