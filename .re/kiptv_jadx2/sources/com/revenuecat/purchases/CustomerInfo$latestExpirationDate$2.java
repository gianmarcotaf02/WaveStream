package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CustomerInfo$latestExpirationDate$2 extends o implements Function0 {
    final CustomerInfo this$0;

    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override
    public final Date invoke() {
        List listI1 = p078i6.o.I1(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() {
            @Override
            public final int compare(T t9, T t10) {
                return q0.o((Date) t9, (Date) t10);
            }
        });
        if (listI1.isEmpty()) {
            listI1 = null;
        }
        if (listI1 != null) {
            return (Date) p078i6.o.q1(listI1);
        }
        return null;
    }
}
