package io.ktor.http.cio;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lh6/A;", "discardBlocking", "(Lio/ktor/utils/io/ByteReadChannel;)V", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MultipartJvmAndPosixKt {

    /* JADX INFO: renamed from: io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LS7/A;", "", "<anonymous>", "(LS7/A;)J"}, k = 3, mv = {2, 1, 0})
    @p117n6.e(c = "io.ktor.http.cio.MultipartJvmAndPosixKt$discardBlocking$1", f = "MultipartJvmAndPosix.kt", l = {12}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p117n6.i implements p194x6.m {
        final /* synthetic */ io.ktor.utils.io.ByteReadChannel $this_discardBlocking;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(io.ktor.utils.io.ByteReadChannel byteReadChannel, p100l6.c cVar) {
            super(2, cVar);
            this.$this_discardBlocking = byteReadChannel;
        }

        @Override // p117n6.a
        public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
            return new io.ktor.http.cio.MultipartJvmAndPosixKt.AnonymousClass1(this.$this_discardBlocking, cVar);
        }

        @Override // p194x6.m
        public final java.lang.Object invoke(S7.A a2, p100l6.c cVar) {
            return ((io.ktor.http.cio.MultipartJvmAndPosixKt.AnonymousClass1) create(a2, cVar)).invokeSuspend(p070h6.A.f22523a);
        }

        @Override // p117n6.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            p109m6.a aVar = p109m6.a.f25430h;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
                return obj;
            }
            com.google.common.util.concurrent.P.u0(obj);
            io.ktor.utils.io.ByteReadChannel byteReadChannel = this.$this_discardBlocking;
            this.label = 1;
            java.lang.Object objDiscard$default = io.ktor.utils.io.ByteReadChannelOperationsKt.discard$default(byteReadChannel, 0L, this, 1, null);
            return objDiscard$default == aVar ? aVar : objDiscard$default;
        }
    }

    public static final void discardBlocking(io.ktor.utils.io.ByteReadChannel byteReadChannel) {
        kotlin.jvm.internal.m.e(byteReadChannel, "<this>");
        S7.C.E(p100l6.i.f24820h, new io.ktor.http.cio.MultipartJvmAndPosixKt.AnonymousClass1(byteReadChannel, null));
    }
}
