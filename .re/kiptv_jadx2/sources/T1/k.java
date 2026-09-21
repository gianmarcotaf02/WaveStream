package T1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC1534p;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1540w;

public final class k implements DefaultLifecycleObserver {

    public final AbstractC1534p f9694h;

    public k(EmojiCompatInitializer emojiCompatInitializer, AbstractC1534p abstractC1534p) {
        this.f9694h = abstractC1534p;
    }

    @Override
    public final void onResume(InterfaceC1540w interfaceC1540w) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new m(0), 500L);
        this.f9694h.b(this);
    }
}
