package io.ktor.client.request.forms;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\rJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u000fJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00102\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0013J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00142\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0015J=\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00192\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u001eJ-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001f2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010!J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\"2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010#J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020$2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010%J%\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b\u000b\u0010(J\u0019\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0)H\u0000¢\u0006\u0004\b*\u0010+R\u001e\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030&0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lio/ktor/client/request/forms/FormBuilder;", "", "<init>", "()V", "T", "", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "value", "Lio/ktor/http/Headers;", "headers", "Lh6/A;", "append", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)V", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/Headers;)V", "", "(Ljava/lang/String;Ljava/lang/Number;Lio/ktor/http/Headers;)V", "", "(Ljava/lang/String;ZLio/ktor/http/Headers;)V", "", "(Ljava/lang/String;[BLio/ktor/http/Headers;)V", "Lio/ktor/client/request/forms/InputProvider;", "(Ljava/lang/String;Lio/ktor/client/request/forms/InputProvider;Lio/ktor/http/Headers;)V", "", "size", "Lkotlin/Function0;", "Lk8/n;", "Lio/ktor/utils/io/core/Input;", "block", "appendInput", "(Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "(Ljava/lang/String;Lk8/n;Lio/ktor/http/Headers;)V", "", "values", "(Ljava/lang/String;Ljava/lang/Iterable;Lio/ktor/http/Headers;)V", "", "(Ljava/lang/String;[Ljava/lang/String;Lio/ktor/http/Headers;)V", "Lio/ktor/client/request/forms/ChannelProvider;", "(Ljava/lang/String;Lio/ktor/client/request/forms/ChannelProvider;Lio/ktor/http/Headers;)V", "Lio/ktor/client/request/forms/FormPart;", "part", "(Lio/ktor/client/request/forms/FormPart;)V", "", "build$ktor_client_core", "()Ljava/util/List;", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "", "parts", "Ljava/util/List;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FormBuilder {
    private final java.util.List<io.ktor.client.request.forms.FormPart<?>> parts = new java.util.ArrayList();

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, java.lang.Object obj, io.ktor.http.Headers headers, int i3, java.lang.Object obj2) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, obj, headers);
    }

    public static /* synthetic */ void appendInput$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, io.ktor.http.Headers headers, java.lang.Long l2, kotlin.jvm.functions.Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        if ((i3 & 4) != 0) {
            l2 = null;
        }
        formBuilder.appendInput(str, headers, l2, function0);
    }

    @io.ktor.utils.io.InternalAPI
    public final <T> void append(java.lang.String key, T value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, value, headers));
    }

    public final void appendInput(java.lang.String key, io.ktor.http.Headers headers, java.lang.Long size, kotlin.jvm.functions.Function0 block) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(headers, "headers");
        kotlin.jvm.internal.m.e(block, "block");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, new io.ktor.client.request.forms.InputProvider(size, block), headers));
    }

    public final java.util.List<io.ktor.client.request.forms.FormPart<?>> build$ktor_client_core() {
        return this.parts;
    }

    public final void append(java.lang.String key, java.lang.String value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, java.lang.String str2, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, str2, headers);
    }

    public final void append(java.lang.String key, java.lang.Number value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, java.lang.Number number, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, number, headers);
    }

    public final void append(java.lang.String key, boolean value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, java.lang.Boolean.valueOf(value), headers));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, boolean z6, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, z6, headers);
    }

    public final void append(java.lang.String key, byte[] value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, byte[] bArr, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, bArr, headers);
    }

    public final void append(java.lang.String key, io.ktor.client.request.forms.InputProvider value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, io.ktor.client.request.forms.InputProvider inputProvider, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, inputProvider, headers);
    }

    public final void append(java.lang.String key, p094k8.n value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, p094k8.n nVar, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, nVar, headers);
    }

    public final void append(java.lang.String key, java.lang.String[] values, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(values, "values");
        kotlin.jvm.internal.m.e(headers, "headers");
        append(key, p078i6.m.R(values), headers);
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, java.lang.Iterable iterable, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, (java.lang.Iterable<java.lang.String>) iterable, headers);
    }

    public final void append(java.lang.String key, io.ktor.client.request.forms.ChannelProvider value, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, java.lang.String[] strArr, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, strArr, headers);
    }

    public final <T> void append(io.ktor.client.request.forms.FormPart<T> part) {
        kotlin.jvm.internal.m.e(part, "part");
        this.parts.add(part);
    }

    public static /* synthetic */ void append$default(io.ktor.client.request.forms.FormBuilder formBuilder, java.lang.String str, io.ktor.client.request.forms.ChannelProvider channelProvider, io.ktor.http.Headers headers, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            headers = io.ktor.http.Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, channelProvider, headers);
    }

    public final void append(java.lang.String key, java.lang.Iterable<java.lang.String> values, io.ktor.http.Headers headers) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(values, "values");
        kotlin.jvm.internal.m.e(headers, "headers");
        if (O7.x.q0(key, "[]", false)) {
            java.util.Iterator<java.lang.String> it = values.iterator();
            while (it.hasNext()) {
                this.parts.add(new io.ktor.client.request.forms.FormPart<>(key, it.next(), headers));
            }
            return;
        }
        throw new java.lang.IllegalArgumentException(Y6.f.h("Array parameter must be suffixed with square brackets ie `", key, "[]`").toString());
    }
}
