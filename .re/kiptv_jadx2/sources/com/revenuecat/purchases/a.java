package com.revenuecat.purchases;

import kotlin.jvm.functions.Function0;

public final class a implements Runnable {

    public final int f21033h;

    public final Object f21034i;

    public a(int i3, Object obj) {
        this.f21033h = i3;
        this.f21034i = obj;
    }

    @Override
    public final void run() {
        switch (this.f21033h) {
            case 0:
                ((Function0) this.f21034i).invoke();
                break;
            case 1:
                ((Function0) this.f21034i).invoke();
                break;
            case 2:
                ((Function0) this.f21034i).invoke();
                break;
            case 3:
                ((Function0) this.f21034i).invoke();
                break;
            default:
                PurchasesFactory.LowPriorityThreadFactory.newThread$lambda$1((Runnable) this.f21034i);
                break;
        }
    }
}
