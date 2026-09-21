package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00014B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\u0010\u0004J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017J\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0003J\u0017\u0010\u001b\u001a\u00020\u00192\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0096\u0001J\u0013\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\u0018\u0010!\u001a\u0004\u0018\u00010\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0018\u0010#\u001a\u0004\u0018\u00010\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002J\u0011\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0096\u0003J\b\u0010&\u001a\u00020\u0011H\u0016J\u0011\u0010'\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0001J\t\u0010(\u001a\u00020\u0019H\u0096\u0001J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0096\u0003J\u0011\u0010+\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0002H\u0096\u0001J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0096\u0001J\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020-2\u0006\u0010%\u001a\u00020\u0011H\u0096\u0001J\u001f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0096\u0001J\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00102\u001a\u000203R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0012\u0010\u0010\u001a\u00020\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions;", "", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "subscriptionOptions", "(Ljava/util/List;)V", "basePlan", "getBasePlan", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOffer", "getDefaultOffer$annotations", "()V", "getDefaultOffer", "freeTrial", "getFreeTrial", "introOffer", "getIntroOffer", "size", "", "getSize", "()I", "billingPeriodToDays", "period", "Lcom/revenuecat/purchases/models/Period;", "billingPeriodToDays$purchases_defaultsRelease", "contains", "", "element", "containsAll", "elements", "", "equals", io.sentry.protocol.Request.JsonKeys.OTHER, "", "findLongestFreeTrial", "offers", "findLowestNonFreeOffer", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "withTag", "tag", "", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class SubscriptionOptions implements java.util.List<com.revenuecat.purchases.models.SubscriptionOption>, p201y6.a {
    private static final com.revenuecat.purchases.models.SubscriptionOptions.Companion Companion = new com.revenuecat.purchases.models.SubscriptionOptions.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String RC_IGNORE_OFFER_TAG = "rc-ignore-offer";
    private final java.util.List<com.revenuecat.purchases.models.SubscriptionOption> subscriptionOptions;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOptions$Companion;", "", "()V", "RC_IGNORE_OFFER_TAG", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriptionOptions(java.util.List<? extends com.revenuecat.purchases.models.SubscriptionOption> subscriptionOptions) {
        kotlin.jvm.internal.m.e(subscriptionOptions, "subscriptionOptions");
        this.subscriptionOptions = subscriptionOptions;
    }

    private final com.revenuecat.purchases.models.SubscriptionOption findLongestFreeTrial(java.util.List<? extends com.revenuecat.purchases.models.SubscriptionOption> offers) {
        java.lang.Object next;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = offers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.revenuecat.purchases.models.SubscriptionOption subscriptionOption = (com.revenuecat.purchases.models.SubscriptionOption) it.next();
            com.revenuecat.purchases.models.PricingPhase freePhase = subscriptionOption.getFreePhase();
            p070h6.k kVar = freePhase != null ? new p070h6.k(subscriptionOption, java.lang.Integer.valueOf(billingPeriodToDays$purchases_defaultsRelease(freePhase.getBillingPeriod()))) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iIntValue = ((java.lang.Number) ((p070h6.k) next).f22540i).intValue();
                do {
                    java.lang.Object next2 = it2.next();
                    int iIntValue2 = ((java.lang.Number) ((p070h6.k) next2).f22540i).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        p070h6.k kVar2 = (p070h6.k) next;
        if (kVar2 != null) {
            return (com.revenuecat.purchases.models.SubscriptionOption) kVar2.f22539h;
        }
        return null;
    }

    private final com.revenuecat.purchases.models.SubscriptionOption findLowestNonFreeOffer(java.util.List<? extends com.revenuecat.purchases.models.SubscriptionOption> offers) {
        java.lang.Object next;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = offers.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.revenuecat.purchases.models.SubscriptionOption subscriptionOption = (com.revenuecat.purchases.models.SubscriptionOption) it.next();
            com.revenuecat.purchases.models.PricingPhase introPhase = subscriptionOption.getIntroPhase();
            p070h6.k kVar = introPhase != null ? new p070h6.k(subscriptionOption, java.lang.Long.valueOf(introPhase.getPrice().getAmountMicros())) : null;
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        java.util.Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long jLongValue = ((java.lang.Number) ((p070h6.k) next).f22540i).longValue();
                do {
                    java.lang.Object next2 = it2.next();
                    long jLongValue2 = ((java.lang.Number) ((p070h6.k) next2).f22540i).longValue();
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        p070h6.k kVar2 = (p070h6.k) next;
        if (kVar2 != null) {
            return (com.revenuecat.purchases.models.SubscriptionOption) kVar2.f22539h;
        }
        return null;
    }

    public static /* synthetic */ void getDefaultOffer$annotations() {
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(int i3, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i3, java.util.Collection<? extends com.revenuecat.purchases.models.SubscriptionOption> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addFirst(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void addLast(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int billingPeriodToDays$purchases_defaultsRelease(com.revenuecat.purchases.models.Period period) {
        kotlin.jvm.internal.m.e(period, "period");
        java.lang.Integer num = (java.lang.Integer) com.revenuecat.purchases.models.SubscriptionOptionsKt.DAYS_IN_UNIT.get(period.getUnit());
        return period.getValue() * (num != null ? num.intValue() : 0);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(com.revenuecat.purchases.models.SubscriptionOption element) {
        kotlin.jvm.internal.m.e(element, "element");
        return this.subscriptionOptions.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return this.subscriptionOptions.containsAll(elements);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (com.revenuecat.purchases.models.SubscriptionOptions.class.equals(other != null ? other.getClass() : null)) {
            return (other instanceof com.revenuecat.purchases.models.SubscriptionOptions ? (com.revenuecat.purchases.models.SubscriptionOptions) other : null) != null && com.google.common.util.concurrent.P.i0(this.subscriptionOptions).equals(com.google.common.util.concurrent.P.i0(((com.revenuecat.purchases.models.SubscriptionOptions) other).subscriptionOptions));
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public com.revenuecat.purchases.models.SubscriptionOption get(int index) {
        return this.subscriptionOptions.get(index);
    }

    public final com.revenuecat.purchases.models.SubscriptionOption getBasePlan() {
        com.revenuecat.purchases.models.SubscriptionOption next;
        java.util.Iterator<com.revenuecat.purchases.models.SubscriptionOption> it = iterator();
        while (it.hasNext()) {
            next = it.next();
            if (next.isBasePlan()) {
                return next;
            }
        }
        next = null;
        return next;
    }

    public final com.revenuecat.purchases.models.SubscriptionOption getDefaultOffer() {
        com.revenuecat.purchases.models.SubscriptionOption next;
        java.util.Iterator<com.revenuecat.purchases.models.SubscriptionOption> it = iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.isBasePlan());
        com.revenuecat.purchases.models.SubscriptionOption subscriptionOption = next;
        if (subscriptionOption == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.revenuecat.purchases.models.SubscriptionOption subscriptionOption2 : this) {
            if (!subscriptionOption2.isBasePlan()) {
                arrayList.add(subscriptionOption2);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!((com.revenuecat.purchases.models.SubscriptionOption) obj).getTags().contains(RC_IGNORE_OFFER_TAG)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (!((com.revenuecat.purchases.models.SubscriptionOption) obj2).getTags().contains(com.revenuecat.purchases.common.SharedConstants.RC_CUSTOMER_CENTER_TAG)) {
                arrayList3.add(obj2);
            }
        }
        com.revenuecat.purchases.models.SubscriptionOption subscriptionOptionFindLongestFreeTrial = findLongestFreeTrial(arrayList3);
        if (subscriptionOptionFindLongestFreeTrial != null) {
            return subscriptionOptionFindLongestFreeTrial;
        }
        com.revenuecat.purchases.models.SubscriptionOption subscriptionOptionFindLowestNonFreeOffer = findLowestNonFreeOffer(arrayList3);
        return subscriptionOptionFindLowestNonFreeOffer == null ? subscriptionOption : subscriptionOptionFindLowestNonFreeOffer;
    }

    public final com.revenuecat.purchases.models.SubscriptionOption getFreeTrial() {
        com.revenuecat.purchases.models.SubscriptionOption next;
        java.util.Iterator<com.revenuecat.purchases.models.SubscriptionOption> it = iterator();
        while (it.hasNext()) {
            next = it.next();
            if (next.getFreePhase() != null) {
                return next;
            }
        }
        next = null;
        return next;
    }

    public final com.revenuecat.purchases.models.SubscriptionOption getIntroOffer() {
        com.revenuecat.purchases.models.SubscriptionOption next;
        java.util.Iterator<com.revenuecat.purchases.models.SubscriptionOption> it = iterator();
        while (it.hasNext()) {
            next = it.next();
            if (next.getIntroPhase() != null) {
                return next;
            }
        }
        next = null;
        return next;
    }

    public int getSize() {
        return this.subscriptionOptions.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return com.google.common.util.concurrent.P.i0(this.subscriptionOptions).hashCode();
    }

    public int indexOf(com.revenuecat.purchases.models.SubscriptionOption element) {
        kotlin.jvm.internal.m.e(element, "element");
        return this.subscriptionOptions.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.subscriptionOptions.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<com.revenuecat.purchases.models.SubscriptionOption> iterator() {
        return this.subscriptionOptions.iterator();
    }

    public int lastIndexOf(com.revenuecat.purchases.models.SubscriptionOption element) {
        kotlin.jvm.internal.m.e(element, "element");
        return this.subscriptionOptions.lastIndexOf(element);
    }

    @Override // java.util.List
    public java.util.ListIterator<com.revenuecat.purchases.models.SubscriptionOption> listIterator() {
        return this.subscriptionOptions.listIterator();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public com.revenuecat.purchases.models.SubscriptionOption remove(int i3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public com.revenuecat.purchases.models.SubscriptionOption removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public com.revenuecat.purchases.models.SubscriptionOption removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(java.util.function.UnaryOperator<com.revenuecat.purchases.models.SubscriptionOption> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public com.revenuecat.purchases.models.SubscriptionOption set2(int i3, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public void sort(java.util.Comparator<? super com.revenuecat.purchases.models.SubscriptionOption> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.List<com.revenuecat.purchases.models.SubscriptionOption> subList(int fromIndex, int toIndex) {
        return this.subscriptionOptions.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final java.util.List<com.revenuecat.purchases.models.SubscriptionOption> withTag(java.lang.String tag) {
        kotlin.jvm.internal.m.e(tag, "tag");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.revenuecat.purchases.models.SubscriptionOption subscriptionOption : this) {
            if (subscriptionOption.getTags().contains(tag)) {
                arrayList.add(subscriptionOption);
            }
        }
        return arrayList;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i3, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends com.revenuecat.purchases.models.SubscriptionOption> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof com.revenuecat.purchases.models.SubscriptionOption) {
            return contains((com.revenuecat.purchases.models.SubscriptionOption) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof com.revenuecat.purchases.models.SubscriptionOption) {
            return indexOf((com.revenuecat.purchases.models.SubscriptionOption) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof com.revenuecat.purchases.models.SubscriptionOption) {
            return lastIndexOf((com.revenuecat.purchases.models.SubscriptionOption) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public java.util.ListIterator<com.revenuecat.purchases.models.SubscriptionOption> listIterator(int index) {
        return this.subscriptionOptions.listIterator(index);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ com.revenuecat.purchases.models.SubscriptionOption remove(int i3) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeFirst, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m179removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: removeLast, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m180removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ com.revenuecat.purchases.models.SubscriptionOption set(int i3, com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return (T[]) kotlin.jvm.internal.l.b(this, array);
    }

    public boolean add(com.revenuecat.purchases.models.SubscriptionOption subscriptionOption) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
