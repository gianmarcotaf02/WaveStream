package com.revenuecat.purchases.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher;", "", "Ljava/util/concurrent/ExecutorService;", "executorService", "Landroid/os/Handler;", "mainHandler", "", "runningIntegrationTests", "<init>", "(Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Z)V", "Ljava/lang/Runnable;", "command", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lh6/A;", "enqueue", "(Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "isClosed", "()Z", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "Z", "Companion", "AsyncCall", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class Dispatcher {
    private static final com.revenuecat.purchases.common.Dispatcher.Companion Companion = new com.revenuecat.purchases.common.Dispatcher.Companion(null);

    @java.lang.Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final java.util.concurrent.ExecutorService executorService;
    private final android.os.Handler mainHandler;
    private final boolean runningIntegrationTests;

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Ljava/lang/Runnable;", "<init>", "()V", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "run", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class AsyncCall implements java.lang.Runnable {
        public abstract com.revenuecat.purchases.common.networking.HTTPResult call();

        public void onCompletion(com.revenuecat.purchases.common.networking.HTTPResult result) {
            kotlin.jvm.internal.m.e(result, "result");
        }

        public void onError(com.revenuecat.purchases.PurchasesError error) {
            kotlin.jvm.internal.m.e(error, "error");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                onCompletion(call());
            } catch (com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException e6) {
                com.revenuecat.purchases.PurchasesError purchasesError = com.revenuecat.purchases.common.ErrorsKt.toPurchasesError(e6);
                com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (com.revenuecat.purchases.common.verification.SignatureVerificationException e9) {
                com.revenuecat.purchases.PurchasesError purchasesError2 = com.revenuecat.purchases.common.ErrorsKt.toPurchasesError(e9);
                com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (java.io.IOException e10) {
                com.revenuecat.purchases.PurchasesError purchasesError3 = com.revenuecat.purchases.common.ErrorsKt.toPurchasesError(e10);
                com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (java.lang.SecurityException e11) {
                com.revenuecat.purchases.PurchasesError purchasesError4 = com.revenuecat.purchases.common.ErrorsKt.toPurchasesError(e11);
                com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            } catch (org.json.JSONException e12) {
                com.revenuecat.purchases.PurchasesError purchasesError5 = com.revenuecat.purchases.common.ErrorsKt.toPurchasesError(e12);
                com.revenuecat.purchases.common.LogUtilsKt.errorLog(purchasesError5);
                onError(purchasesError5);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$Companion;", "", "()V", "INTEGRATION_TEST_DELAY_PERCENTAGE", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    public Dispatcher(java.util.concurrent.ExecutorService executorService, android.os.Handler handler, boolean z6) {
        kotlin.jvm.internal.m.e(executorService, "executorService");
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z6;
    }

    public static /* synthetic */ void enqueue$default(com.revenuecat.purchases.common.Dispatcher dispatcher, java.lang.Runnable runnable, com.revenuecat.purchases.common.Delay delay, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i3 & 2) != 0) {
            delay = com.revenuecat.purchases.common.Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$3$lambda$2(java.lang.Runnable runnable, com.revenuecat.purchases.common.Dispatcher dispatcher) {
        try {
            runnable.run();
        } catch (java.lang.Throwable th) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception running command: " + th, null);
            android.os.Handler handler = dispatcher.mainHandler;
            if (handler != null) {
                handler.post(new D1.RunnableC0239y(16, th));
            }
        }
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(java.lang.Runnable command, com.revenuecat.purchases.common.Delay delay) {
        kotlin.jvm.internal.m.e(command, "command");
        kotlin.jvm.internal.m.e(delay, "delay");
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    T7.d dVar = new T7.d(command, this, 13);
                    if (delay == com.revenuecat.purchases.common.Delay.NONE || !(this.executorService instanceof java.util.concurrent.ScheduledExecutorService)) {
                        this.executorService.submit(dVar);
                    } else {
                        D6.j jVar = new D6.j(P7.b.d(delay.getMinDelay()), P7.b.d(delay.getMaxDelay()));
                        B6.c cVar = B6.d.f817h;
                        try {
                            long jY = R8.i.y(jVar);
                            if (this.runningIntegrationTests) {
                                jY = (long) (jY * 0.01d);
                            }
                            ((java.util.concurrent.ScheduledExecutorService) this.executorService).schedule(dVar, jY, java.util.concurrent.TimeUnit.MILLISECONDS);
                        } catch (java.lang.IllegalArgumentException e6) {
                            throw new java.util.NoSuchElementException(e6.getMessage());
                        }
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }

    public /* synthetic */ Dispatcher(java.util.concurrent.ExecutorService executorService, android.os.Handler handler, boolean z6, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(executorService, (i3 & 2) != 0 ? new android.os.Handler(android.os.Looper.getMainLooper()) : handler, (i3 & 4) != 0 ? false : z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enqueue$lambda$3$lambda$2$lambda$1(java.lang.Throwable th) throws java.lang.Throwable {
        throw th;
    }
}
