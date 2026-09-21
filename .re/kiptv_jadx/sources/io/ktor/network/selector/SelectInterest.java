package io.ktor.network.selector;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/ktor/network/selector/SelectInterest;", "", "", "flag", "<init>", "(Ljava/lang/String;II)V", "I", "getFlag", "()I", "Companion", "READ", "WRITE", "ACCEPT", "CONNECT", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum SelectInterest {
    READ(1),
    WRITE(4),
    ACCEPT(16),
    CONNECT(8);

    private static final int[] flags;
    private static final int size;
    private final int flag;
    private static final /* synthetic */ p126o6.a $ENTRIES = com.google.crypto.tink.shaded.protobuf.q0.t(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.network.selector.SelectInterest.Companion INSTANCE = new io.ktor.network.selector.SelectInterest.Companion(null);
    private static final io.ktor.network.selector.SelectInterest[] AllInterests = (io.ktor.network.selector.SelectInterest[]) getEntries().toArray(new io.ktor.network.selector.SelectInterest[0]);

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/network/selector/SelectInterest$Companion;", "", "<init>", "()V", "", "Lio/ktor/network/selector/SelectInterest;", "AllInterests", "[Lio/ktor/network/selector/SelectInterest;", "getAllInterests", "()[Lio/ktor/network/selector/SelectInterest;", "", "flags", "[I", "getFlags", "()[I", "", "size", "I", "getSize", "()I", "ktor-network"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final io.ktor.network.selector.SelectInterest[] getAllInterests() {
            return io.ktor.network.selector.SelectInterest.AllInterests;
        }

        public final int[] getFlags() {
            return io.ktor.network.selector.SelectInterest.flags;
        }

        public final int getSize() {
            return io.ktor.network.selector.SelectInterest.size;
        }

        private Companion() {
        }
    }

    static {
        p126o6.a entries = getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(entries, 10));
        java.util.Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((io.ktor.network.selector.SelectInterest) it.next()).flag));
        }
        flags = p078i6.o.M1(arrayList);
        size = ((p078i6.AbstractC2250a) getEntries()).d();
    }

    SelectInterest(int i3) {
        this.flag = i3;
    }

    public static p126o6.a getEntries() {
        return $ENTRIES;
    }

    public final int getFlag() {
        return this.flag;
    }
}
