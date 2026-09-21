package T1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.lifecycle.DefaultLifecycleObserver {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.AbstractC1534p f9694h;

    public k(androidx.emoji2.text.EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.AbstractC1534p abstractC1534p) {
        this.f9694h = abstractC1534p;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(androidx.lifecycle.InterfaceC1540w interfaceC1540w) {
        (android.os.Build.VERSION.SDK_INT >= 28 ? T1.b.a(android.os.Looper.getMainLooper()) : new android.os.Handler(android.os.Looper.getMainLooper())).postDelayed(new T1.m(0), 500L);
        this.f9694h.b(this);
    }
}
