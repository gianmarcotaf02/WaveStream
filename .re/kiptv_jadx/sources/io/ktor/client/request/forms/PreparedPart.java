package io.ktor.client.request.forms;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart;", "", "", "headers", "", "size", "<init>", "([BLjava/lang/Long;)V", "[B", "getHeaders", "()[B", "Ljava/lang/Long;", "getSize", "()Ljava/lang/Long;", "InputPart", "ChannelPart", "Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart$InputPart;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
abstract class PreparedPart {
    private final byte[] headers;
    private final java.lang.Long size;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart$ChannelPart;", "Lio/ktor/client/request/forms/PreparedPart;", "", "headers", "Lkotlin/Function0;", "Lio/ktor/utils/io/ByteReadChannel;", "provider", "", "size", "<init>", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "Lkotlin/jvm/functions/Function0;", "getProvider", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class ChannelPart extends io.ktor.client.request.forms.PreparedPart {
        private final kotlin.jvm.functions.Function0 provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChannelPart(byte[] headers, kotlin.jvm.functions.Function0 provider, java.lang.Long l2) {
            super(headers, l2, null);
            kotlin.jvm.internal.m.e(headers, "headers");
            kotlin.jvm.internal.m.e(provider, "provider");
            this.provider = provider;
        }

        public final kotlin.jvm.functions.Function0 getProvider() {
            return this.provider;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR!\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/request/forms/PreparedPart$InputPart;", "Lio/ktor/client/request/forms/PreparedPart;", "", "headers", "Lkotlin/Function0;", "Lk8/n;", "Lio/ktor/utils/io/core/Input;", "provider", "", "size", "<init>", "([BLkotlin/jvm/functions/Function0;Ljava/lang/Long;)V", "Lkotlin/jvm/functions/Function0;", "getProvider", "()Lkotlin/jvm/functions/Function0;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class InputPart extends io.ktor.client.request.forms.PreparedPart {
        private final kotlin.jvm.functions.Function0 provider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputPart(byte[] headers, kotlin.jvm.functions.Function0 provider, java.lang.Long l2) {
            super(headers, l2, null);
            kotlin.jvm.internal.m.e(headers, "headers");
            kotlin.jvm.internal.m.e(provider, "provider");
            this.provider = provider;
        }

        public final kotlin.jvm.functions.Function0 getProvider() {
            return this.provider;
        }
    }

    public /* synthetic */ PreparedPart(byte[] bArr, java.lang.Long l2, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(bArr, l2);
    }

    public final byte[] getHeaders() {
        return this.headers;
    }

    public final java.lang.Long getSize() {
        return this.size;
    }

    private PreparedPart(byte[] bArr, java.lang.Long l2) {
        this.headers = bArr;
        this.size = l2;
    }
}
