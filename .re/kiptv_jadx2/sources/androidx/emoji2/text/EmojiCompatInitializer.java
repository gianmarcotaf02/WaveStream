package androidx.emoji2.text;

import D3.j;
import T1.k;
import T1.s;
import android.content.Context;
import androidx.lifecycle.AbstractC1534p;
import androidx.lifecycle.InterfaceC1540w;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p190x2.a;
import p190x2.b;

public class EmojiCompatInitializer implements b {
    @Override
    public final Object create(Context context) {
        Object objB;
        s sVar = new s(new j(context, 2));
        sVar.f9682a = 1;
        if (T1.j.f9685k == null) {
            synchronized (T1.j.j) {
                try {
                    if (T1.j.f9685k == null) {
                        T1.j.f9685k = new T1.j(sVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f31146e) {
            try {
                objB = aVarC.f31147a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC1534p lifecycle = ((InterfaceC1540w) objB).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
