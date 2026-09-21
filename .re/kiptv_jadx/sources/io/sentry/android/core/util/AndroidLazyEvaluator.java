package io.sentry.android.core.util;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLazyEvaluator<T> {
    private final io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator<T> evaluator;
    private volatile T value = null;

    public interface AndroidEvaluator<T> {
        T evaluate(android.content.Context context);
    }

    public AndroidLazyEvaluator(io.sentry.android.core.util.AndroidLazyEvaluator.AndroidEvaluator<T> androidEvaluator) {
        this.evaluator = androidEvaluator;
    }

    public T getValue(android.content.Context context) {
        if (this.value == null) {
            synchronized (this) {
                try {
                    if (this.value == null) {
                        this.value = this.evaluator.evaluate(context);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return this.value;
    }

    public void resetValue() {
        synchronized (this) {
            this.value = null;
        }
    }

    public void setValue(T t9) {
        synchronized (this) {
            this.value = t9;
        }
    }
}
