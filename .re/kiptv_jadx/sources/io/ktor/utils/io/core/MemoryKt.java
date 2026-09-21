package io.ktor.utils.io.core;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f*8\b\u0007\u0010\u0015\"\u00020\u00042\u00020\u0004B*\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u001c\b\u0010\u0012\u0018\b\u000bB\u0014\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0006\b\u0014\u0012\u0002\b\f¨\u0006\u0016"}, d2 = {"T", "", "size", "Lkotlin/Function1;", "", "block", "withMemory", "(ILx6/j;)Ljava/lang/Object;", "index", "value", "Lh6/A;", "storeIntAt", "([BII)V", "Lh6/c;", "message", "ByteArray instead", "replaceWith", "Lh6/l;", "expression", "ByteArray", "imports", "Memory", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MemoryKt {
    @p070h6.c
    public static /* synthetic */ void Memory$annotations() {
    }

    public static final void storeIntAt(byte[] bArr, int i3, int i9) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        bArr[i3] = (byte) (i9 >> 24);
        bArr[i3 + 1] = (byte) (i9 >> 16);
        bArr[i3 + 2] = (byte) (i9 >> 8);
        bArr[i3 + 3] = (byte) i9;
    }

    public static final <T> T withMemory(int i3, p194x6.j block) {
        kotlin.jvm.internal.m.e(block, "block");
        return (T) block.invoke(new byte[i3]);
    }
}
