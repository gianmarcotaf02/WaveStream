package androidx.media3.exoplayer.util;

import androidx.media3.common.util.Consumer;
import java.util.concurrent.Executor;

public interface ReleasableExecutor extends Executor {
    static <T extends Executor> ReleasableExecutor from(final T t9, final Consumer<T> consumer) {
        return new ReleasableExecutor() {
            @Override
            public void execute(Runnable runnable) {
                t9.execute(runnable);
            }

            @Override
            public void release() {
                consumer.accept(t9);
            }
        };
    }

    void release();
}
