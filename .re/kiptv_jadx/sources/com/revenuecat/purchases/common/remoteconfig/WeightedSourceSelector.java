package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u0000 \u0019*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0019B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/WeightedSourceSelector;", "Lcom/revenuecat/purchases/common/remoteconfig/WeightedSource;", "T", "", "", "sources", "LB6/d;", "random", "<init>", "(Ljava/util/List;LB6/d;)V", "nextOrNull", "()Lcom/revenuecat/purchases/common/remoteconfig/WeightedSource;", "advance", "Lh6/A;", "reset", "()V", "orderedSources", "Ljava/util/List;", "", "iterator", "Ljava/util/Iterator;", "<set-?>", io.sentry.protocol.SentryThread.JsonKeys.CURRENT, "Lcom/revenuecat/purchases/common/remoteconfig/WeightedSource;", "getCurrent", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WeightedSourceSelector<T extends com.revenuecat.purchases.common.remoteconfig.WeightedSource> {
    private static final com.revenuecat.purchases.common.remoteconfig.WeightedSourceSelector.Companion Companion = new com.revenuecat.purchases.common.remoteconfig.WeightedSourceSelector.Companion(null);
    private T current;
    private java.util.Iterator<? extends T> iterator;
    private final java.util.List<T> orderedSources;

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0001\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\b\b\u0001\u0010\u0005*\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ-\u0010\u000f\u001a\u00020\u000e\"\b\b\u0001\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/WeightedSourceSelector$Companion;", "", "<init>", "()V", "Lcom/revenuecat/purchases/common/remoteconfig/WeightedSource;", "T", "", "sources", "LB6/d;", "random", "computeOrder", "(Ljava/util/List;LB6/d;)Ljava/util/List;", "tier", "weightedShuffle", "", "weightedPickIndex", "(Ljava/util/List;LB6/d;)I", "lhs", "rhs", "sumOrIntMax", "(II)I", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final <T extends com.revenuecat.purchases.common.remoteconfig.WeightedSource> java.util.List<T> computeOrder(java.util.List<? extends T> sources, B6.d random) {
            kotlin.jvm.internal.m.e(sources, "sources");
            kotlin.jvm.internal.m.e(random, "random");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : sources) {
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(((com.revenuecat.purchases.common.remoteconfig.WeightedSource) obj).getPriority());
                java.lang.Object arrayList = linkedHashMap.get(numValueOf);
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                    linkedHashMap.put(numValueOf, arrayList);
                }
                ((java.util.List) arrayList).add(obj);
            }
            java.util.List listI1 = p078i6.o.I1(linkedHashMap.entrySet(), new java.util.Comparator() { // from class: com.revenuecat.purchases.common.remoteconfig.WeightedSourceSelector$Companion$computeOrder$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t9, T t10) {
                    return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Integer) ((java.util.Map.Entry) t9).getKey(), (java.lang.Integer) ((java.util.Map.Entry) t10).getKey());
                }
            });
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = listI1.iterator();
            while (it.hasNext()) {
                p078i6.u.M0(arrayList2, com.revenuecat.purchases.common.remoteconfig.WeightedSourceSelector.Companion.weightedShuffle((java.util.List) ((java.util.Map.Entry) it.next()).getValue(), random));
            }
            return arrayList2;
        }

        public final int sumOrIntMax(int lhs, int rhs) {
            long j = ((long) lhs) + ((long) rhs);
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (int) j;
        }

        public final <T extends com.revenuecat.purchases.common.remoteconfig.WeightedSource> int weightedPickIndex(java.util.List<? extends T> sources, B6.d random) {
            int i3;
            kotlin.jvm.internal.m.e(sources, "sources");
            kotlin.jvm.internal.m.e(random, "random");
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(sources, 10));
            java.util.Iterator<T> it = sources.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                arrayList.add(java.lang.Integer.valueOf(java.lang.Math.max(0, ((com.revenuecat.purchases.common.remoteconfig.WeightedSource) it.next()).getWeight())));
            }
            java.util.Iterator it2 = arrayList.iterator();
            int iSumOrIntMax = 0;
            while (it2.hasNext()) {
                iSumOrIntMax = sumOrIntMax(iSumOrIntMax, ((java.lang.Number) it2.next()).intValue());
            }
            if (iSumOrIntMax <= 0) {
                return random.e(sources.size());
            }
            int iE = random.e(iSumOrIntMax);
            int iA0 = p078i6.p.A0(arrayList);
            int size = arrayList.size();
            for (i3 = 0; i3 < size; i3++) {
                iE -= ((java.lang.Number) arrayList.get(i3)).intValue();
                if (iE < 0) {
                    return i3;
                }
            }
            return iA0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T extends com.revenuecat.purchases.common.remoteconfig.WeightedSource> java.util.List<T> weightedShuffle(java.util.List<? extends T> tier, B6.d random) {
            kotlin.jvm.internal.m.e(tier, "tier");
            kotlin.jvm.internal.m.e(random, "random");
            if (tier.size() <= 1) {
                return tier;
            }
            java.util.ArrayList arrayListO1 = p078i6.o.O1(tier);
            java.util.ArrayList arrayList = new java.util.ArrayList(arrayListO1.size());
            while (arrayListO1.size() > 1) {
                arrayList.add(arrayListO1.remove(weightedPickIndex(arrayListO1, random)));
            }
            arrayList.add(p078i6.o.h1(arrayListO1));
            return arrayList;
        }

        private Companion() {
        }
    }

    public WeightedSourceSelector(java.util.List<? extends T> sources, B6.d random) {
        kotlin.jvm.internal.m.e(sources, "sources");
        kotlin.jvm.internal.m.e(random, "random");
        java.util.List<T> listComputeOrder = Companion.computeOrder(sources, random);
        this.orderedSources = listComputeOrder;
        this.iterator = listComputeOrder.iterator();
        this.current = (T) nextOrNull();
    }

    private final T nextOrNull() {
        if (this.iterator.hasNext()) {
            return this.iterator.next();
        }
        return null;
    }

    public final T advance() {
        T t9 = (T) nextOrNull();
        this.current = t9;
        return t9;
    }

    public final T getCurrent() {
        return this.current;
    }

    public final void reset() {
        this.iterator = this.orderedSources.iterator();
        this.current = (T) nextOrNull();
    }

    public /* synthetic */ WeightedSourceSelector(java.util.List list, B6.d dVar, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(list, (i3 & 2) != 0 ? B6.d.f817h : dVar);
    }
}
