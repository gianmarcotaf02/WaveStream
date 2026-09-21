package io.ktor.client.request.forms;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR!\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/client/request/forms/InputProvider;", "", "", "size", "Lkotlin/Function0;", "Lk8/n;", "Lio/ktor/utils/io/core/Input;", "block", "<init>", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "Lkotlin/jvm/functions/Function0;", "getBlock", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class InputProvider {
    private final kotlin.jvm.functions.Function0 block;
    private final java.lang.Long size;

    public InputProvider(java.lang.Long l2, kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.size = l2;
        this.block = block;
    }

    public final kotlin.jvm.functions.Function0 getBlock() {
        return this.block;
    }

    public final java.lang.Long getSize() {
        return this.size;
    }

    public /* synthetic */ InputProvider(java.lang.Long l2, kotlin.jvm.functions.Function0 function0, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : l2, function0);
    }
}
