package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1543z extends android.app.Service implements androidx.lifecycle.InterfaceC1540w {
    private final androidx.lifecycle.d0 dispatcher = new androidx.lifecycle.d0(this);

    @Override // androidx.lifecycle.InterfaceC1540w
    public androidx.lifecycle.AbstractC1534p getLifecycle() {
        return this.dispatcher.f16347a;
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        androidx.lifecycle.d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(androidx.lifecycle.EnumC1532n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        androidx.lifecycle.d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(androidx.lifecycle.EnumC1532n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        androidx.lifecycle.d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(androidx.lifecycle.EnumC1532n.ON_STOP);
        d0Var.a(androidx.lifecycle.EnumC1532n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @p070h6.c
    public void onStart(android.content.Intent intent, int i3) {
        androidx.lifecycle.d0 d0Var = this.dispatcher;
        d0Var.getClass();
        d0Var.a(androidx.lifecycle.EnumC1532n.ON_START);
        super.onStart(intent, i3);
    }
}
