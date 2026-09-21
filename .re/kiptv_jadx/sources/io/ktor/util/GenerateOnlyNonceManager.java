package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/util/GenerateOnlyNonceManager;", "Lio/ktor/util/NonceManager;", "<init>", "()V", "", "newNonce", "(Ll6/c;)Ljava/lang/Object;", "nonce", "", "verifyNonce", "(Ljava/lang/String;Ll6/c;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GenerateOnlyNonceManager implements io.ktor.util.NonceManager {
    public static final io.ktor.util.GenerateOnlyNonceManager INSTANCE = new io.ktor.util.GenerateOnlyNonceManager();

    private GenerateOnlyNonceManager() {
    }

    @Override // io.ktor.util.NonceManager
    public java.lang.Object newNonce(p100l6.c cVar) {
        return io.ktor.util.CryptoKt.generateNonce();
    }

    @Override // io.ktor.util.NonceManager
    public java.lang.Object verifyNonce(java.lang.String str, p100l6.c cVar) {
        return java.lang.Boolean.TRUE;
    }
}
