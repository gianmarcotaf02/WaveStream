package io.ktor.network.selector;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "selectableIsClosed", "()Ljava/lang/Void;", "", "interestedOps", "flag", "selectableIsInvalid", "(II)Ljava/lang/Void;", "ktor-network"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SelectorManagerSupportKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void selectableIsClosed() throws java.io.IOException {
        throw new java.io.IOException("Selectable is already closed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Void selectableIsInvalid(int i3, int i9) {
        throw new java.lang.IllegalStateException(("Selectable is invalid state: " + i3 + ", " + i9).toString());
    }
}
