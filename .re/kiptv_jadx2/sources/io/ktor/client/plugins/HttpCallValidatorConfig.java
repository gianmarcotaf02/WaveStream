package io.ktor.client.plugins;

import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import p194x6.m;
import p194x6.n;

@KtorDsl
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000b\u001a\u00020\b2,\u0010\n\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ;\u0010\r\u001a\u00020\b2,\u0010\n\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\t¢\u0006\u0004\b\r\u0010\fJ5\u0010\u0011\u001a\u00020\b2&\u0010\n\u001a\"\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`\u0010¢\u0006\u0004\b\u0011\u0010\u0012R@\u0010\u0014\u001a(\u0012$\u0012\"\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000ej\u0002`\u00100\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u001c\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/ktor/client/plugins/HttpCallValidatorConfig;", "", "<init>", "()V", "Lkotlin/Function3;", "", "Lio/ktor/client/request/HttpRequest;", "Ll6/c;", "Lh6/A;", "Lio/ktor/client/plugins/CallRequestExceptionHandler;", "block", "handleResponseException", "(Lx6/n;)V", "handleResponseExceptionWithRequest", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/client/plugins/ResponseValidator;", "validateResponse", "(Lx6/m;)V", "", "responseValidators", "Ljava/util/List;", "getResponseValidators$ktor_client_core", "()Ljava/util/List;", "Lio/ktor/client/plugins/HandlerWrapper;", "responseExceptionHandlers", "getResponseExceptionHandlers$ktor_client_core", "", "expectSuccess", "Z", "getExpectSuccess$ktor_client_core", "()Z", "setExpectSuccess$ktor_client_core", "(Z)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpCallValidatorConfig {
    private final List<m> responseValidators = new ArrayList();
    private final List<HandlerWrapper> responseExceptionHandlers = new ArrayList();
    private boolean expectSuccess = true;

    public final boolean getExpectSuccess() {
        return this.expectSuccess;
    }

    public final List<HandlerWrapper> getResponseExceptionHandlers$ktor_client_core() {
        return this.responseExceptionHandlers;
    }

    public final List<m> getResponseValidators$ktor_client_core() {
        return this.responseValidators;
    }

    public final void handleResponseException(n block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.responseExceptionHandlers.add(new RequestExceptionHandlerWrapper(block));
    }

    public final void handleResponseExceptionWithRequest(n block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.responseExceptionHandlers.add(new RequestExceptionHandlerWrapper(block));
    }

    public final void setExpectSuccess$ktor_client_core(boolean z6) {
        this.expectSuccess = z6;
    }

    public final void validateResponse(m block) {
        kotlin.jvm.internal.m.e(block, "block");
        this.responseValidators.add(block);
    }
}
