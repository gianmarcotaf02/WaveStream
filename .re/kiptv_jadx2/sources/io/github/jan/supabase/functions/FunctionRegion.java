package io.github.jan.supabase.functions;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import kotlin.Metadata;
import p126o6.a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lio/github/jan/supabase/functions/FunctionRegion;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ANY", "AP_NORTHEAST_1", "AP_NORTHEAST_2", "AP_SOUTH_1", "AP_SOUTHEAST_1", "AP_SOUTHEAST_2", "CA_CENTRAL_1", "EU_CENTRAL_1", "EU_WEST_1", "EU_WEST_2", "EU_WEST_3", "SA_EAST_1", "US_EAST_1", "US_WEST_1", "US_WEST_2", "functions-kt_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum FunctionRegion {
    ANY("any"),
    AP_NORTHEAST_1("ap-northeast-1"),
    AP_NORTHEAST_2("ap-northeast-2"),
    AP_SOUTH_1("ap-south-1"),
    AP_SOUTHEAST_1("ap-southeast-1"),
    AP_SOUTHEAST_2("ap-southeast-2"),
    CA_CENTRAL_1("ca-central-1"),
    EU_CENTRAL_1("eu-central-1"),
    EU_WEST_1("eu-west-1"),
    EU_WEST_2("eu-west-2"),
    EU_WEST_3("eu-west-3"),
    SA_EAST_1("sa-east-1"),
    US_EAST_1("us-east-1"),
    US_WEST_1("us-west-1"),
    US_WEST_2("us-west-2");

    private static final a $ENTRIES = q0.t(values());
    private final String value;

    FunctionRegion(String str) {
        this.value = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
