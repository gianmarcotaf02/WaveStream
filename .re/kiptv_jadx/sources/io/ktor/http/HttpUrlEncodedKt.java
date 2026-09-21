package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\u000b\u001a\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n0\t¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0011\u001a\u00020\u0010*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\n0\t2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u000b\u001a\u00020\u0000*\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0013\u001a\u001d\u0010\u0011\u001a\u00020\u0010*\u00020\u00062\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0011\u0010\u0014\u001a\u001f\u0010\u0011\u001a\u00020\u0010*\u00020\u00152\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0016\u001a7\u0010\u0011\u001a\u00020\u0010*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t0\u00180\u00172\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "defaultEncoding", "", "limit", "Lio/ktor/http/Parameters;", "parseUrlEncodedParameters", "(Ljava/lang/String;Ljava/nio/charset/Charset;I)Lio/ktor/http/Parameters;", "", "Lh6/k;", "formUrlEncode", "(Ljava/util/List;)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "Lh6/A;", "formUrlEncodeTo", "(Ljava/util/List;Ljava/lang/Appendable;)V", "(Lio/ktor/http/Parameters;)Ljava/lang/String;", "(Lio/ktor/http/Parameters;Ljava/lang/Appendable;)V", "Lio/ktor/http/ParametersBuilder;", "(Lio/ktor/http/ParametersBuilder;Ljava/lang/Appendable;)V", "", "", "(Ljava/util/Set;Ljava/lang/Appendable;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpUrlEncodedKt {
    public static final java.lang.String formUrlEncode(java.util.List<p070h6.k> list) throws java.io.IOException {
        kotlin.jvm.internal.m.e(list, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        formUrlEncodeTo(list, sb);
        return sb.toString();
    }

    public static final void formUrlEncodeTo(java.util.List<p070h6.k> list, java.lang.Appendable out) throws java.io.IOException {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(out, "out");
        p078i6.o.n1(list, out, "&", null, null, new io.ktor.http.b(0), 60);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence formUrlEncodeTo$lambda$5(p070h6.k it) {
        kotlin.jvm.internal.m.e(it, "it");
        java.lang.String strEncodeURLParameter = io.ktor.http.CodecsKt.encodeURLParameter((java.lang.String) it.f22539h, true);
        java.lang.Object obj = it.f22540i;
        if (obj == null) {
            return strEncodeURLParameter;
        }
        return strEncodeURLParameter + '=' + io.ktor.http.CodecsKt.encodeURLParameterValue(java.lang.String.valueOf(obj));
    }

    public static final io.ktor.http.Parameters parseUrlEncodedParameters(java.lang.String str, java.nio.charset.Charset defaultEncoding, int i3) {
        java.lang.Object next;
        java.lang.String name;
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(defaultEncoding, "defaultEncoding");
        java.util.List<java.lang.String> listB1 = O7.q.b1(str, new java.lang.String[]{"&"}, i3, 2);
        java.util.ArrayList<p070h6.k> arrayList = new java.util.ArrayList(p078i6.q.I0(listB1, 10));
        for (java.lang.String str2 : listB1) {
            com.google.android.gms.internal.play_billing.M0.w(O7.q.m1(str2, "="), O7.q.j1(str2, "=", ""), arrayList);
        }
        java.util.Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m.a(((p070h6.k) next).f22539h, "_charset_"));
        p070h6.k kVar = (p070h6.k) next;
        if (kVar == null || (name = (java.lang.String) kVar.f22540i) == null) {
            name = io.ktor.utils.io.charsets.CharsetJVMKt.getName(defaultEncoding);
        }
        java.nio.charset.Charset charsetForName = io.ktor.utils.io.charsets.CharsetJVMKt.forName(O7.a.f8023a, name);
        io.ktor.http.Parameters.Companion companion = io.ktor.http.Parameters.INSTANCE;
        io.ktor.http.ParametersBuilder parametersBuilderParametersBuilder$default = io.ktor.http.ParametersKt.ParametersBuilder$default(0, 1, null);
        for (p070h6.k kVar2 : arrayList) {
            parametersBuilderParametersBuilder$default.append(io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) kVar2.f22539h, 0, 0, false, charsetForName, 7, null), io.ktor.http.CodecsKt.decodeURLQueryComponent$default((java.lang.String) kVar2.f22540i, 0, 0, false, charsetForName, 7, null));
        }
        return parametersBuilderParametersBuilder$default.build();
    }

    public static /* synthetic */ io.ktor.http.Parameters parseUrlEncodedParameters$default(java.lang.String str, java.nio.charset.Charset charset, int i3, int i9, java.lang.Object obj) {
        if ((i9 & 1) != 0) {
            charset = O7.a.f8024b;
        }
        if ((i9 & 2) != 0) {
            i3 = 1000;
        }
        return parseUrlEncodedParameters(str, charset, i3);
    }

    public static final java.lang.String formUrlEncode(io.ktor.http.Parameters parameters) {
        kotlin.jvm.internal.m.e(parameters, "<this>");
        java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> setEntries = parameters.entries();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
            java.util.Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new p070h6.k(entry.getKey(), (java.lang.String) it2.next()));
            }
            p078i6.u.M0(arrayList, arrayList2);
        }
        return formUrlEncode(arrayList);
    }

    public static final void formUrlEncodeTo(io.ktor.http.Parameters parameters, java.lang.Appendable out) throws java.io.IOException {
        kotlin.jvm.internal.m.e(parameters, "<this>");
        kotlin.jvm.internal.m.e(out, "out");
        formUrlEncodeTo(parameters.entries(), out);
    }

    public static final void formUrlEncodeTo(io.ktor.http.ParametersBuilder parametersBuilder, java.lang.Appendable out) throws java.io.IOException {
        kotlin.jvm.internal.m.e(parametersBuilder, "<this>");
        kotlin.jvm.internal.m.e(out, "out");
        formUrlEncodeTo(parametersBuilder.entries(), out);
    }

    public static final void formUrlEncodeTo(java.util.Set<? extends java.util.Map.Entry<java.lang.String, ? extends java.util.List<java.lang.String>>> set, java.lang.Appendable out) throws java.io.IOException {
        java.util.List listI0;
        kotlin.jvm.internal.m.e(set, "<this>");
        kotlin.jvm.internal.m.e(out, "out");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) entry.getValue();
            if (list.isEmpty()) {
                listI0 = com.google.common.util.concurrent.P.i0(new p070h6.k(str, null));
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(list, 10));
                java.util.Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    com.google.android.gms.internal.play_billing.M0.w(str, (java.lang.String) it2.next(), arrayList2);
                }
                listI0 = arrayList2;
            }
            p078i6.u.M0(arrayList, listI0);
        }
        formUrlEncodeTo(arrayList, out);
    }
}
