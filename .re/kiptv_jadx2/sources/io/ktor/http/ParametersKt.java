package io.ktor.http;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import io.sentry.protocol.Request;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.C;
import p194x6.j;

@Metadata(d1 = {"\u0000F\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000b\u001a#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0006\u0010\u000e\u001a'\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u000f¢\u0006\u0004\b\u0006\u0010\u0011\u001aE\u0010\u0006\u001a\u00020\u000526\u0010\u0014\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u00130\u0012\"\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f0\u0013¢\u0006\u0004\b\u0006\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001c\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "size", "Lio/ktor/http/ParametersBuilder;", "ParametersBuilder", "(I)Lio/ktor/http/ParametersBuilder;", "Lio/ktor/http/Parameters;", "parametersOf", "()Lio/ktor/http/Parameters;", "", "name", "value", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/Parameters;", "", "values", "(Ljava/lang/String;Ljava/util/List;)Lio/ktor/http/Parameters;", "", "map", "(Ljava/util/Map;)Lio/ktor/http/Parameters;", "", "Lh6/k;", "pairs", "([Lh6/k;)Lio/ktor/http/Parameters;", "Lkotlin/Function1;", "Lh6/A;", "builder", "parameters", "(Lx6/j;)Lio/ktor/http/Parameters;", Request.JsonKeys.OTHER, "plus", "(Lio/ktor/http/Parameters;Lio/ktor/http/Parameters;)Lio/ktor/http/Parameters;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ParametersKt {
    public static final ParametersBuilder ParametersBuilder(int i3) {
        return new ParametersBuilderImpl(i3);
    }

    public static ParametersBuilder ParametersBuilder$default(int i3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i3 = 8;
        }
        return ParametersBuilder(i3);
    }

    public static final Parameters parameters(j builder) {
        m.e(builder, "builder");
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        builder.invoke(parametersBuilderParametersBuilder$default);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final Parameters parametersOf() {
        return Parameters.INSTANCE.getEmpty();
    }

    public static final Parameters plus(Parameters parameters, Parameters other) {
        m.e(parameters, "<this>");
        m.e(other, "other");
        if (parameters.getCaseInsensitiveName() != other.getCaseInsensitiveName()) {
            throw new IllegalArgumentException("Cannot concatenate Parameters with case-sensitive and case-insensitive names");
        }
        if (parameters.isEmpty()) {
            return other;
        }
        if (other.isEmpty()) {
            return parameters;
        }
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersBuilder$default(0, 1, null);
        parametersBuilderParametersBuilder$default.appendAll(parameters);
        parametersBuilderParametersBuilder$default.appendAll(other);
        return parametersBuilderParametersBuilder$default.build();
    }

    public static final Parameters parametersOf(String name, String value) {
        m.e(name, "name");
        m.e(value, "value");
        return new ParametersSingleImpl(name, P.i0(value));
    }

    public static final Parameters parametersOf(String name, List<String> values) {
        m.e(name, "name");
        m.e(values, "values");
        return new ParametersSingleImpl(name, values);
    }

    public static final Parameters parametersOf(Map<String, ? extends List<String>> map) {
        m.e(map, "map");
        return new ParametersImpl(map);
    }

    public static final Parameters parametersOf(k... pairs) {
        m.e(pairs, "pairs");
        return new ParametersImpl(C.X0(p078i6.m.S(pairs)));
    }
}
