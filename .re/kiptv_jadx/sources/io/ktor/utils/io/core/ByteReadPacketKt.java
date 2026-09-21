package io.ktor.utils.io.core;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\r\u001a\u0019\u0010\u000f\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001e\u001a\u00020\u001d*\u00020\u00052\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001e\u0010\u001f\u001a-\u0010 \u001a\u00020\u001d*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b \u0010!\u001a+\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\u00020\u00052\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b$\u0010%\u001a+\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\"*\u00020&2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b$\u0010'\u001a\u0013\u0010(\u001a\u00020\u001d*\u00020\u0005H\u0007¢\u0006\u0004\b(\u0010)\"\u0017\u0010*\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u001b\u00101\u001a\u00020\u0016*\u00020\u00058F¢\u0006\f\u0012\u0004\b0\u0010)\u001a\u0004\b.\u0010/*>\b\u0007\u0010\u0006\"\u00020\u00052\u00020\u0005B0\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\"\b5\u0012\u001e\b\u000bB\u001a\b6\u0012\b\b7\u0012\u0004\b\b(8\u0012\f\b9\u0012\b\b\fJ\u0004\b\b(:¨\u0006;"}, d2 = {"", "array", "", "offset", io.sentry.SentryEnvelopeItemHeader.JsonKeys.LENGTH, "Lk8/n;", "ByteReadPacket", "([BII)Lk8/n;", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "Lk8/a;", "Sink", "(Lio/ktor/utils/io/pool/ObjectPool;)Lk8/a;", "()Lk8/a;", "out", "readAvailable", "(Lk8/n;Lk8/a;)I", "copy", "(Lk8/n;)Lk8/n;", "", "readShortLittleEndian", "(Lk8/n;)S", "", "count", "discard", "(Lk8/n;J)J", "Lkotlin/Function1;", "", "block", "Lh6/A;", "takeWhile", "(Lk8/n;Lx6/j;)V", "readFully", "(Lk8/n;[BII)V", "T", io.sentry.protocol.SentryStackFrame.JsonKeys.FUNCTION, "preview", "(Lk8/n;Lx6/j;)Ljava/lang/Object;", "Lk8/l;", "(Lk8/l;Lx6/j;)Ljava/lang/Object;", "release", "(Lk8/n;)V", "ByteReadPacketEmpty", "Lk8/n;", "getByteReadPacketEmpty", "()Lk8/n;", "getRemaining", "(Lk8/n;)J", "getRemaining$annotations", "remaining", "Lh6/c;", "message", "Use Source instead", "replaceWith", "Lh6/l;", "expression", "Source", "imports", "kotlinx.io.Source", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ByteReadPacketKt {
    private static final p094k8.n ByteReadPacketEmpty = new p094k8.a();

    public static final p094k8.n ByteReadPacket(byte[] array, int i3, int i9) {
        kotlin.jvm.internal.m.e(array, "array");
        p094k8.a aVar = new p094k8.a();
        aVar.write(array, i3, i9 + i3);
        return aVar;
    }

    @p070h6.c
    public static /* synthetic */ void ByteReadPacket$annotations() {
    }

    public static /* synthetic */ p094k8.n ByteReadPacket$default(byte[] bArr, int i3, int i9, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length;
        }
        return ByteReadPacket(bArr, i3, i9);
    }

    @p070h6.c
    public static final p094k8.a Sink(io.ktor.utils.io.pool.ObjectPool<?> pool) {
        kotlin.jvm.internal.m.e(pool, "pool");
        return new p094k8.a();
    }

    @p070h6.c
    public static final p094k8.n copy(p094k8.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        return nVar.peek();
    }

    public static final long discard(p094k8.n nVar, long j) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        nVar.d(j);
        long jMin = java.lang.Math.min(j, getRemaining(nVar));
        nVar.a().C(jMin);
        return jMin;
    }

    public static /* synthetic */ long discard$default(p094k8.n nVar, long j, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return discard(nVar, j);
    }

    public static final p094k8.n getByteReadPacketEmpty() {
        return ByteReadPacketEmpty;
    }

    public static final long getRemaining(p094k8.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        return nVar.a().j;
    }

    public static final <T> T preview(p094k8.n nVar, p194x6.j function) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(function, "function");
        p094k8.h hVarPeek = nVar.a().peek();
        try {
            T t9 = (T) function.invoke(hVarPeek);
            com.google.common.util.concurrent.D.h(hVarPeek, null);
            return t9;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(hVarPeek, th);
                throw th2;
            }
        }
    }

    public static final int readAvailable(p094k8.n nVar, p094k8.a out) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(out, "out");
        long j = nVar.a().j;
        out.D(nVar);
        return (int) j;
    }

    public static final void readFully(p094k8.n nVar, byte[] out, int i3, int i9) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(out, "out");
        p094k8.p.k(nVar, out, i3, i9 + i3);
    }

    public static /* synthetic */ void readFully$default(p094k8.n nVar, byte[] bArr, int i3, int i9, int i10, java.lang.Object obj) {
        if ((i10 & 2) != 0) {
            i3 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length - i3;
        }
        readFully(nVar, bArr, i3, i9);
    }

    public static final short readShortLittleEndian(p094k8.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        p094k8.a aVarA = nVar.a();
        kotlin.jvm.internal.m.e(aVarA, "<this>");
        return java.lang.Short.reverseBytes(aVarA.readShort());
    }

    @p070h6.c
    public static final void release(p094k8.n nVar) throws java.lang.Exception {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        nVar.close();
    }

    public static final void takeWhile(p094k8.n nVar, p194x6.j block) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(block, "block");
        while (!nVar.o() && ((java.lang.Boolean) block.invoke(nVar.a())).booleanValue()) {
        }
    }

    public static final <T> T preview(p094k8.l lVar, p194x6.j function) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        kotlin.jvm.internal.m.e(function, "function");
        p094k8.h hVarPeek = lVar.a().peek();
        try {
            T t9 = (T) function.invoke(hVarPeek);
            com.google.common.util.concurrent.D.h(hVarPeek, null);
            return t9;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                com.google.common.util.concurrent.D.h(hVarPeek, th);
                throw th2;
            }
        }
    }

    @p070h6.c
    public static final p094k8.a Sink() {
        return new p094k8.a();
    }

    public static /* synthetic */ void getRemaining$annotations(p094k8.n nVar) {
    }
}
