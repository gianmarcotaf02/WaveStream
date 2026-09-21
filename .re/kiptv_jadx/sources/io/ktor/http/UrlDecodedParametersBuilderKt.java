package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/util/StringValuesBuilder;", "parameters", "Lio/ktor/http/Parameters;", "decodeParameters", "(Lio/ktor/util/StringValuesBuilder;)Lio/ktor/http/Parameters;", "Lio/ktor/util/StringValues;", "Lio/ktor/http/ParametersBuilder;", "encodeParameters", "(Lio/ktor/util/StringValues;)Lio/ktor/http/ParametersBuilder;", "Lh6/A;", "appendAllDecoded", "(Lio/ktor/util/StringValuesBuilder;Lio/ktor/util/StringValuesBuilder;)V", "appendAllEncoded", "(Lio/ktor/util/StringValuesBuilder;Lio/ktor/util/StringValues;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class UrlDecodedParametersBuilderKt {
    private static final void appendAllDecoded(io.ktor.util.StringValuesBuilder stringValuesBuilder, io.ktor.util.StringValuesBuilder stringValuesBuilder2) {
        for (java.lang.String str : stringValuesBuilder2.names()) {
            java.util.List<java.lang.String> all = stringValuesBuilder2.getAll(str);
            if (all == null) {
                all = p078i6.w.f23205h;
            }
            java.lang.String strDecodeURLQueryComponent$default = io.ktor.http.CodecsKt.decodeURLQueryComponent$default(str, 0, 0, false, null, 15, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(all, 10));
            java.util.Iterator<T> it = all.iterator();
            while (it.hasNext()) {
                arrayList.add(io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) it.next(), 0, 0, true, null, 11, null));
            }
            stringValuesBuilder.appendAll(strDecodeURLQueryComponent$default, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void appendAllEncoded(io.ktor.util.StringValuesBuilder stringValuesBuilder, io.ktor.util.StringValues stringValues) {
        for (java.lang.String str : stringValues.names()) {
            java.util.List<java.lang.String> all = stringValues.getAll(str);
            if (all == null) {
                all = p078i6.w.f23205h;
            }
            java.lang.String strEncodeURLParameter$default = io.ktor.http.CodecsKt.encodeURLParameter$default(str, false, 1, null);
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(all, 10));
            java.util.Iterator<T> it = all.iterator();
            while (it.hasNext()) {
                arrayList.add(io.ktor.http.CodecsKt.encodeURLParameterValue((java.lang.String) it.next()));
            }
            stringValuesBuilder.appendAll(strEncodeURLParameter$default, arrayList);
        }
    }

    public static final io.ktor.http.Parameters decodeParameters(io.ktor.util.StringValuesBuilder parameters) {
        kotlin.jvm.internal.m.e(parameters, "parameters");
        io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        appendAllDecoded(parametersBuilderParametersBuilder$default, parameters);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final io.ktor.http.ParametersBuilder encodeParameters(io.ktor.util.StringValues parameters) {
        kotlin.jvm.internal.m.e(parameters, "parameters");
        io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        appendAllEncoded(parametersBuilderParametersBuilder$default, parameters);
        return parametersBuilderParametersBuilder$default;
    }
}
