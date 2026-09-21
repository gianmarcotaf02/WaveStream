package io.ktor.utils.io.locks;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.InternalAPI;
import io.sentry.protocol.SentryStackFrame;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a/\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00060\u0000j\u0002`\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0087\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r*\u0010\b\u0007\u0010\u000f\"\u00020\t2\u00020\tB\u0002\b\u000e*\u0010\b\u0007\u0010\u0010\"\u00020\u00002\u00020\u0000B\u0002\b\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"Ljava/util/concurrent/locks/ReentrantLock;", "Lio/ktor/utils/io/locks/ReentrantLock;", "reentrantLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "T", "Lkotlin/Function0;", "block", "withLock", "(Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "Lio/ktor/utils/io/locks/SynchronizedObject;", SentryStackFrame.JsonKeys.LOCK, "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lio/ktor/utils/io/InternalAPI;", "SynchronizedObject", "ReentrantLock", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SynchronizedKt {
    @InternalAPI
    public static void ReentrantLock$annotations() {
    }

    @InternalAPI
    public static void SynchronizedObject$annotations() {
    }

    @InternalAPI
    public static final ReentrantLock reentrantLock() {
        return new ReentrantLock();
    }

    @InternalAPI
    public static final <T> T m498synchronized(Object lock, Function0 block) {
        T t9;
        m.e(lock, "lock");
        m.e(block, "block");
        synchronized (lock) {
            t9 = (T) block.invoke();
        }
        return t9;
    }

    @InternalAPI
    public static final <T> T withLock(ReentrantLock reentrantLock, Function0 block) {
        m.e(reentrantLock, "<this>");
        m.e(block, "block");
        reentrantLock.lock();
        try {
            return (T) block.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
