package androidx.media3.exoplayer.util;

/* JADX INFO: loaded from: classes.dex */
public interface ReleasableExecutor extends java.util.concurrent.Executor {
    static <T extends java.util.concurrent.Executor> androidx.media3.exoplayer.util.ReleasableExecutor from(final T t9, final androidx.media3.common.util.Consumer<T> consumer) {
        return new androidx.media3.exoplayer.util.ReleasableExecutor() { // from class: androidx.media3.exoplayer.util.ReleasableExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(java.lang.Runnable runnable) {
                t9.execute(runnable);
            }

            @Override // androidx.media3.exoplayer.util.ReleasableExecutor
            public void release() {
                consumer.accept(t9);
            }
        };
    }

    void release();
}
