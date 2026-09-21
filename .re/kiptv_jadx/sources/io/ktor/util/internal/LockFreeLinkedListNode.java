package io.ktor.util.internal;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001:\u0004NOPQB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u0004¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\f\b\u0000\u0010\u0011*\u00060\u0000j\u0002`\u00042\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0019\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0004\u0012\u0004\u0012\u00020\u00070\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001b\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0004\u0012\u0004\u0012\u00020\u00070\u00172\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u00020\u00072\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\"\u001a\u00020!2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u00042\u0006\u0010 \u001a\u00020\tH\u0001¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u000e¢\u0006\u0004\b&\u0010\u0003J\u0011\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00040,¢\u0006\u0004\b-\u0010.J\u001a\u0010/\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0011\u0018\u0001H\u0086\b¢\u0006\u0004\b/\u00100J1\u00101\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0011\u0018\u00012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0017H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0001¢\u0006\u0004\b3\u0010\u0003J'\u00107\u001a\u00020\u000e2\n\u00104\u001a\u00060\u0000j\u0002`\u00042\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0000¢\u0006\u0004\b5\u00106J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u000f\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020\u000e2\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b>\u0010\u0010J\u001b\u0010?\u001a\u00020\u000e2\n\u0010\u001d\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b?\u0010\u0010J\u0013\u0010@\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\b@\u0010+J\u0013\u0010A\u001a\u00060\u0000j\u0002`\u0004H\u0002¢\u0006\u0004\bA\u0010+J-\u0010E\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00042\n\u0010B\u001a\u00060\u0000j\u0002`\u00042\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FR\u0011\u0010G\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bG\u0010%R\u0011\u0010\u001d\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bH\u00100R\u0015\u0010J\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\bI\u0010+R\u0011\u00104\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bK\u00100R\u0015\u0010M\u001a\u00060\u0000j\u0002`\u00048F¢\u0006\u0006\u001a\u0004\bL\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006R"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode;", "", "<init>", "()V", "Lio/ktor/util/internal/Node;", "node", "Lkotlin/Function0;", "", "condition", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "makeCondAddOp", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "addOneIfEmpty", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "Lh6/A;", "addLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "describeAddLast", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "addLastIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lkotlin/jvm/functions/Function0;)Z", "Lkotlin/Function1;", "predicate", "addLastIfPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lx6/j;)Z", "addLastIfPrevAndIf", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lx6/j;Lkotlin/jvm/functions/Function0;)Z", io.ktor.http.LinkHeader.Rel.Next, "addNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Z", "condAdd", "", "tryCondAddNext", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;)I", "remove", "()Z", "helpRemove", "Lio/ktor/util/internal/AtomicDesc;", "describeRemove", "()Lio/ktor/util/internal/AtomicDesc;", "removeFirstOrNull", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "describeRemoveFirst", "()Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "removeFirstIfIsInstanceOf", "()Ljava/lang/Object;", "removeFirstIfIsInstanceOfOrPeekIf", "(Lx6/j;)Ljava/lang/Object;", "helpDelete", "prev", "validateNode$ktor_utils", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "validateNode", "", "toString", "()Ljava/lang/String;", "Lio/ktor/util/internal/Removed;", "removed", "()Lio/ktor/util/internal/Removed;", "finishAdd", "finishRemove", "markPrev", "findHead", "_prev", "Lio/ktor/util/internal/OpDescriptor;", "op", "correctPrev", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "isRemoved", "getNext", "getNextNode", "nextNode", "getPrev", "getPrevNode", "prevNode", "CondAddOp", "AddLastDesc", "RemoveFirstDesc", "AbstractAtomicDesc", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class LockFreeLinkedListNode {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_next");
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_prev");
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater removedRef$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "removedRef");
    volatile /* synthetic */ java.lang.Object _next = this;
    volatile /* synthetic */ java.lang.Object _prev = this;
    private volatile /* synthetic */ java.lang.Object removedRef = null;

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u000b2\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0014\u0010\u0013J'\u0010\u0016\u001a\u00020\u00152\n\u0010\n\u001a\u00060\u0006j\u0002`\u00072\n\u0010\f\u001a\u00060\u0006j\u0002`\u0007H$¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00152\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00182\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078$X¤\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/AtomicDesc;", "<init>", "()V", "Lio/ktor/util/internal/OpDescriptor;", "op", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", io.ktor.http.LinkHeader.Rel.Next, "failure", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "Lh6/A;", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/AtomicOp;", "prepare", "(Lio/ktor/util/internal/AtomicOp;)Ljava/lang/Object;", "complete", "(Lio/ktor/util/internal/AtomicOp;Ljava/lang/Object;)V", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "PrepareOp", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class AbstractAtomicDesc extends io.ktor.util.internal.AtomicDesc {

        @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u001e\u0010\u0006\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc$PrepareOp;", "Lio/ktor/util/internal/OpDescriptor;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", io.ktor.http.LinkHeader.Rel.Next, "Lio/ktor/util/internal/AtomicOp;", "op", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "desc", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/AtomicOp;Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;)V", "", "affected", "perform", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class PrepareOp extends io.ktor.util.internal.OpDescriptor {
            public final io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc;
            public final io.ktor.util.internal.LockFreeLinkedListNode next;
            public final io.ktor.util.internal.AtomicOp<io.ktor.util.internal.LockFreeLinkedListNode> op;

            /* JADX WARN: Multi-variable type inference failed */
            public PrepareOp(io.ktor.util.internal.LockFreeLinkedListNode next, io.ktor.util.internal.AtomicOp<? super io.ktor.util.internal.LockFreeLinkedListNode> op, io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc desc) {
                kotlin.jvm.internal.m.e(next, "next");
                kotlin.jvm.internal.m.e(op, "op");
                kotlin.jvm.internal.m.e(desc, "desc");
                this.next = next;
                this.op = op;
                this.desc = desc;
            }

            @Override // io.ktor.util.internal.OpDescriptor
            public java.lang.Object perform(java.lang.Object affected) {
                kotlin.jvm.internal.m.c(affected, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) affected;
                java.lang.Object objOnPrepare = this.desc.onPrepare(lockFreeLinkedListNode, this.next);
                if (objOnPrepare == null) {
                    java.lang.Object obj = this.op.isDecided() ? this.next : this.op;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, this, obj) && atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) == this) {
                    }
                    return null;
                }
                if (objOnPrepare == io.ktor.util.internal.LockFreeLinkedListKt.REMOVE_PREPARED) {
                    io.ktor.util.internal.Removed removed = this.next.removed();
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, this, removed)) {
                        if (atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) != this) {
                            return objOnPrepare;
                        }
                    }
                    lockFreeLinkedListNode.helpDelete();
                    return objOnPrepare;
                }
                this.op.tryDecide(objOnPrepare);
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.next;
                while (!atomicReferenceFieldUpdater3.compareAndSet(lockFreeLinkedListNode, this, lockFreeLinkedListNode2)) {
                    if (atomicReferenceFieldUpdater3.get(lockFreeLinkedListNode) != this) {
                        return objOnPrepare;
                    }
                }
                return objOnPrepare;
            }
        }

        @Override // io.ktor.util.internal.AtomicDesc
        public final void complete(io.ktor.util.internal.AtomicOp<?> op, java.lang.Object failure) {
            kotlin.jvm.internal.m.e(op, "op");
            boolean z6 = failure == null;
            io.ktor.util.internal.LockFreeLinkedListNode this$0 = getThis$0();
            if (this$0 == null) {
                if (z6) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                return;
            }
            io.ktor.util.internal.LockFreeLinkedListNode queue = getQueue();
            if (queue == null) {
                if (z6) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                return;
            }
            java.lang.Object objUpdatedNext = z6 ? updatedNext(this$0, queue) : queue;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this$0, op, objUpdatedNext)) {
                if (atomicReferenceFieldUpdater.get(this$0) != op) {
                    return;
                }
            }
            if (z6) {
                finishOnSuccess(this$0, queue);
            }
        }

        public java.lang.Object failure(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            return null;
        }

        public abstract void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next);

        /* JADX INFO: renamed from: getAffectedNode */
        public abstract io.ktor.util.internal.LockFreeLinkedListNode getThis$0();

        /* JADX INFO: renamed from: getOriginalNext */
        public abstract io.ktor.util.internal.LockFreeLinkedListNode getQueue();

        public abstract java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next);

        @Override // io.ktor.util.internal.AtomicDesc
        public final java.lang.Object prepare(io.ktor.util.internal.AtomicOp<?> op) {
            kotlin.jvm.internal.m.e(op, "op");
            while (true) {
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNodeTakeAffectedNode = takeAffectedNode(op);
                java.lang.Object obj = lockFreeLinkedListNodeTakeAffectedNode._next;
                if (obj == op || op.isDecided()) {
                    return null;
                }
                if (obj instanceof io.ktor.util.internal.OpDescriptor) {
                    ((io.ktor.util.internal.OpDescriptor) obj).perform(lockFreeLinkedListNodeTakeAffectedNode);
                } else {
                    java.lang.Object objFailure = failure(lockFreeLinkedListNodeTakeAffectedNode, obj);
                    if (objFailure != null) {
                        return objFailure;
                    }
                    if (retry(lockFreeLinkedListNodeTakeAffectedNode, obj)) {
                        continue;
                    } else {
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc.PrepareOp prepareOp = new io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc.PrepareOp((io.ktor.util.internal.LockFreeLinkedListNode) obj, op, this);
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNodeTakeAffectedNode, obj, prepareOp)) {
                                java.lang.Object objPerform = prepareOp.perform(lockFreeLinkedListNodeTakeAffectedNode);
                                if (objPerform == io.ktor.util.internal.LockFreeLinkedListKt.REMOVE_PREPARED) {
                                    break;
                                }
                                return objPerform;
                            }
                        } while (atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeTakeAffectedNode) == obj);
                    }
                }
            }
        }

        public boolean retry(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            return false;
        }

        public io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode(io.ktor.util.internal.OpDescriptor op) {
            kotlin.jvm.internal.m.e(op, "op");
            io.ktor.util.internal.LockFreeLinkedListNode this$0 = getThis$0();
            kotlin.jvm.internal.m.b(this$0);
            return this$0;
        }

        public abstract java.lang.Object updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next);
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0014J'\u0010\u0017\u001a\u00020\u00162\n\u0010\r\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000f\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0017\u0010\bR\u0018\u0010\u0005\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0006\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$AddLastDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "queue", "node", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", io.ktor.http.LinkHeader.Rel.Next, "", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "Lh6/A;", "finishOnSuccess", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static class AddLastDesc<T extends io.ktor.util.internal.LockFreeLinkedListNode> extends io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.AddLastDesc.class, java.lang.Object.class, "_affectedNode");
        private volatile /* synthetic */ java.lang.Object _affectedNode;
        public final T node;
        public final io.ktor.util.internal.LockFreeLinkedListNode queue;

        public AddLastDesc(io.ktor.util.internal.LockFreeLinkedListNode queue, T node) {
            kotlin.jvm.internal.m.e(queue, "queue");
            kotlin.jvm.internal.m.e(node, "node");
            this.queue = queue;
            this.node = node;
            if (node._next != node || node._prev != node) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            this._affectedNode = null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            this.node.finishAdd(this.queue);
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getAffectedNode */
        public final io.ktor.util.internal.LockFreeLinkedListNode getThis$0() {
            return (io.ktor.util.internal.LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getOriginalNext, reason: from getter */
        public final io.ktor.util.internal.LockFreeLinkedListNode getQueue() {
            return this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public boolean retry(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            return next != this.queue;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode(io.ktor.util.internal.OpDescriptor op) {
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
            kotlin.jvm.internal.m.e(op, "op");
            while (true) {
                java.lang.Object obj = this.queue._prev;
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
                java.lang.Object obj2 = lockFreeLinkedListNode._next;
                io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.queue;
                if (obj2 == lockFreeLinkedListNode2 || obj2 == op) {
                    break;
                }
                if (obj2 instanceof io.ktor.util.internal.OpDescriptor) {
                    ((io.ktor.util.internal.OpDescriptor) obj2).perform(lockFreeLinkedListNode);
                } else {
                    io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNodeCorrectPrev = lockFreeLinkedListNode2.correctPrev(lockFreeLinkedListNode, op);
                    if (lockFreeLinkedListNodeCorrectPrev != null) {
                        return lockFreeLinkedListNodeCorrectPrev;
                    }
                }
            }
            return lockFreeLinkedListNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public java.lang.Object updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            T t9 = this.node;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = io.ktor.util.internal.LockFreeLinkedListNode._prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(t9, t9, affected) && atomicReferenceFieldUpdater.get(t9) == t9) {
            }
            T t10 = this.node;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = this.queue;
            while (!atomicReferenceFieldUpdater2.compareAndSet(t10, t10, lockFreeLinkedListNode) && atomicReferenceFieldUpdater2.get(t10) == t10) {
            }
            return this.node;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0002j\u0002`\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u001e\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/AtomicOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "newNode", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "affected", "", "failure", "Lh6/A;", "complete", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)V", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "oldNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static abstract class CondAddOp extends io.ktor.util.internal.AtomicOp<io.ktor.util.internal.LockFreeLinkedListNode> {
        public final io.ktor.util.internal.LockFreeLinkedListNode newNode;
        public io.ktor.util.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(io.ktor.util.internal.LockFreeLinkedListNode newNode) {
            kotlin.jvm.internal.m.e(newNode, "newNode");
            this.newNode = newNode;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public void complete(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object failure) {
            kotlin.jvm.internal.m.e(affected, "affected");
            boolean z6 = failure == null;
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = z6 ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = io.ktor.util.internal.LockFreeLinkedListNode._next$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(affected, this, lockFreeLinkedListNode)) {
                    if (atomicReferenceFieldUpdater.get(affected) != this) {
                        return;
                    }
                }
                if (z6) {
                    io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                    io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                    kotlin.jvm.internal.m.b(lockFreeLinkedListNode3);
                    lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
                }
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00122\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001b\u001a\u00020\u001a2\n\u0010\f\u001a\u00060\u0003j\u0002`\u00042\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0017\u0010\"\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010'\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$¨\u0006("}, d2 = {"Lio/ktor/util/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "T", "Lio/ktor/util/internal/LockFreeLinkedListNode$AbstractAtomicDesc;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "queue", "<init>", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/OpDescriptor;", "op", "takeAffectedNode", "(Lio/ktor/util/internal/OpDescriptor;)Lio/ktor/util/internal/LockFreeLinkedListNode;", "affected", "", io.ktor.http.LinkHeader.Rel.Next, "failure", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Ljava/lang/Object;", "node", "", "validatePrepared", "(Ljava/lang/Object;)Z", "retry", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Ljava/lang/Object;)Z", "onPrepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "updatedNext", "Lh6/A;", "finishOnSuccess", "(Lio/ktor/util/internal/LockFreeLinkedListNode;Lio/ktor/util/internal/LockFreeLinkedListNode;)V", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "getResult", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "getAffectedNode", "()Lio/ktor/util/internal/LockFreeLinkedListNode;", "affectedNode", "getOriginalNext", "originalNext", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static class RemoveFirstDesc<T> extends io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _affectedNode$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc.class, java.lang.Object.class, "_affectedNode");
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc.class, java.lang.Object.class, "_originalNext");
        private volatile /* synthetic */ java.lang.Object _affectedNode;
        private volatile /* synthetic */ java.lang.Object _originalNext;
        public final io.ktor.util.internal.LockFreeLinkedListNode queue;

        public RemoveFirstDesc(io.ktor.util.internal.LockFreeLinkedListNode queue) {
            kotlin.jvm.internal.m.e(queue, "queue");
            this.queue = queue;
            this._affectedNode = null;
            this._originalNext = null;
        }

        public static /* synthetic */ void getResult$annotations() {
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public java.lang.Object failure(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            if (affected == this.queue) {
                return io.ktor.util.internal.LockFreeLinkedListKt.getLIST_EMPTY();
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            affected.finishRemove(next);
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getAffectedNode */
        public final io.ktor.util.internal.LockFreeLinkedListNode getThis$0() {
            return (io.ktor.util.internal.LockFreeLinkedListNode) this._affectedNode;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* JADX INFO: renamed from: getOriginalNext */
        public final io.ktor.util.internal.LockFreeLinkedListNode getQueue() {
            return (io.ktor.util.internal.LockFreeLinkedListNode) this._originalNext;
        }

        public final T getResult() {
            T t9 = (T) getThis$0();
            kotlin.jvm.internal.m.b(t9);
            return t9;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            if (affected instanceof io.ktor.util.internal.LockFreeLinkedListHead) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (!validatePrepared(affected)) {
                return io.ktor.util.internal.LockFreeLinkedListKt.REMOVE_PREPARED;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _affectedNode$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, affected) && atomicReferenceFieldUpdater.get(this) == null) {
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _originalNext$FU;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, null, next) && atomicReferenceFieldUpdater2.get(this) == null) {
            }
            return null;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final boolean retry(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            if (!(next instanceof io.ktor.util.internal.Removed)) {
                return false;
            }
            affected.helpDelete();
            return true;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final io.ktor.util.internal.LockFreeLinkedListNode takeAffectedNode(io.ktor.util.internal.OpDescriptor op) {
            kotlin.jvm.internal.m.e(op, "op");
            java.lang.Object next = this.queue.getNext();
            kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            return (io.ktor.util.internal.LockFreeLinkedListNode) next;
        }

        @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public final java.lang.Object updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
            kotlin.jvm.internal.m.e(affected, "affected");
            kotlin.jvm.internal.m.e(next, "next");
            return next.removed();
        }

        public boolean validatePrepared(T node) {
            return true;
        }
    }

    /* JADX INFO: renamed from: io.ktor.util.internal.LockFreeLinkedListNode$makeCondAddOp$1, reason: invalid class name and case insensitive filesystem */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"io/ktor/util/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lio/ktor/util/internal/LockFreeLinkedListNode$CondAddOp;", "Lio/ktor/util/internal/LockFreeLinkedListNode;", "Lio/ktor/util/internal/Node;", "affected", "", "prepare", "(Lio/ktor/util/internal/LockFreeLinkedListNode;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 176)
    public static final class C24401 extends io.ktor.util.internal.LockFreeLinkedListNode.CondAddOp {
        final /* synthetic */ kotlin.jvm.functions.Function0 $condition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24401(io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode, kotlin.jvm.functions.Function0 function0) {
            super(lockFreeLinkedListNode);
            this.$condition = function0;
        }

        @Override // io.ktor.util.internal.AtomicOp
        public java.lang.Object prepare(io.ktor.util.internal.LockFreeLinkedListNode affected) {
            kotlin.jvm.internal.m.e(affected, "affected");
            if (((java.lang.Boolean) this.$condition.invoke()).booleanValue()) {
                return null;
            }
            return io.ktor.util.internal.LockFreeLinkedListKt.getCONDITION_FALSE();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.util.internal.LockFreeLinkedListNode correctPrev(io.ktor.util.internal.LockFreeLinkedListNode _prev, io.ktor.util.internal.OpDescriptor op) {
        java.lang.Object obj;
        while (true) {
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = null;
            while (true) {
                obj = _prev._next;
                if (obj == op) {
                    return _prev;
                }
                if (obj instanceof io.ktor.util.internal.OpDescriptor) {
                    ((io.ktor.util.internal.OpDescriptor) obj).perform(_prev);
                } else if (!(obj instanceof io.ktor.util.internal.Removed)) {
                    java.lang.Object obj2 = this._prev;
                    if (obj2 instanceof io.ktor.util.internal.Removed) {
                        return null;
                    }
                    if (obj != this) {
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        lockFreeLinkedListNode = _prev;
                        _prev = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
                    } else {
                        if (obj2 == _prev) {
                            return null;
                        }
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, _prev)) {
                                if (_prev._prev instanceof io.ktor.util.internal.Removed) {
                                    break;
                                }
                                return null;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj2);
                    }
                } else {
                    if (lockFreeLinkedListNode != null) {
                        break;
                    }
                    _prev = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(_prev._prev);
                }
            }
            _prev.markPrev();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$FU;
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = ((io.ktor.util.internal.Removed) obj).ref;
            while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode, _prev, lockFreeLinkedListNode2) && atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode) == _prev) {
            }
            _prev = lockFreeLinkedListNode;
        }
    }

    private final io.ktor.util.internal.LockFreeLinkedListNode findHead() {
        io.ktor.util.internal.LockFreeLinkedListNode nextNode = this;
        while (!(nextNode instanceof io.ktor.util.internal.LockFreeLinkedListHead)) {
            nextNode = nextNode.getNextNode();
            if (nextNode == this) {
                throw new java.lang.IllegalStateException("Cannot loop to this while looking for list head");
            }
        }
        return nextNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdd(io.ktor.util.internal.LockFreeLinkedListNode next) {
        while (true) {
            java.lang.Object obj = next._prev;
            if ((obj instanceof io.ktor.util.internal.Removed) || getNext() != next) {
                return;
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(next, obj, this)) {
                    if (getNext() instanceof io.ktor.util.internal.Removed) {
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        next.correctPrev((io.ktor.util.internal.LockFreeLinkedListNode) obj, null);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(next) == obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRemove(io.ktor.util.internal.LockFreeLinkedListNode next) {
        helpDelete();
        next.correctPrev(io.ktor.util.internal.LockFreeLinkedListKt.unwrap(this._prev), null);
    }

    private final io.ktor.util.internal.LockFreeLinkedListNode markPrev() {
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNodeFindHead;
        while (true) {
            java.lang.Object obj = this._prev;
            if (obj instanceof io.ktor.util.internal.Removed) {
                return ((io.ktor.util.internal.Removed) obj).ref;
            }
            if (obj == this) {
                lockFreeLinkedListNodeFindHead = findHead();
            } else {
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                lockFreeLinkedListNodeFindHead = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
            }
            io.ktor.util.internal.Removed removed = lockFreeLinkedListNodeFindHead.removed();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, removed)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return (io.ktor.util.internal.LockFreeLinkedListNode) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io.ktor.util.internal.Removed removed() {
        io.ktor.util.internal.Removed removed = (io.ktor.util.internal.Removed) this.removedRef;
        if (removed != null) {
            return removed;
        }
        io.ktor.util.internal.Removed removed2 = new io.ktor.util.internal.Removed(this);
        removedRef$FU.lazySet(this, removed2);
        return removed2;
    }

    public final void addLast(io.ktor.util.internal.LockFreeLinkedListNode node) {
        java.lang.Object prev;
        kotlin.jvm.internal.m.e(node, "node");
        do {
            prev = getPrev();
            kotlin.jvm.internal.m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        } while (!((io.ktor.util.internal.LockFreeLinkedListNode) prev).addNext(node, this));
    }

    public final boolean addLastIf(io.ktor.util.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0 condition) {
        int iTryCondAddNext;
        kotlin.jvm.internal.m.e(node, "node");
        kotlin.jvm.internal.m.e(condition, "condition");
        io.ktor.util.internal.LockFreeLinkedListNode.C24401 c24401 = new io.ktor.util.internal.LockFreeLinkedListNode.C24401(node, condition);
        do {
            java.lang.Object prev = getPrev();
            kotlin.jvm.internal.m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            iTryCondAddNext = ((io.ktor.util.internal.LockFreeLinkedListNode) prev).tryCondAddNext(node, this, c24401);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addLastIfPrev(io.ktor.util.internal.LockFreeLinkedListNode node, p194x6.j predicate) {
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        kotlin.jvm.internal.m.e(node, "node");
        kotlin.jvm.internal.m.e(predicate, "predicate");
        do {
            java.lang.Object prev = getPrev();
            kotlin.jvm.internal.m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) prev;
            if (!((java.lang.Boolean) predicate.invoke(lockFreeLinkedListNode)).booleanValue()) {
                return false;
            }
        } while (!lockFreeLinkedListNode.addNext(node, this));
        return true;
    }

    public final boolean addLastIfPrevAndIf(io.ktor.util.internal.LockFreeLinkedListNode node, p194x6.j predicate, kotlin.jvm.functions.Function0 condition) {
        int iTryCondAddNext;
        kotlin.jvm.internal.m.e(node, "node");
        kotlin.jvm.internal.m.e(predicate, "predicate");
        kotlin.jvm.internal.m.e(condition, "condition");
        io.ktor.util.internal.LockFreeLinkedListNode.C24401 c24401 = new io.ktor.util.internal.LockFreeLinkedListNode.C24401(node, condition);
        do {
            java.lang.Object prev = getPrev();
            kotlin.jvm.internal.m.c(prev, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) prev;
            if (!((java.lang.Boolean) predicate.invoke(lockFreeLinkedListNode)).booleanValue()) {
                return false;
            }
            iTryCondAddNext = lockFreeLinkedListNode.tryCondAddNext(node, this, c24401);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addNext(io.ktor.util.internal.LockFreeLinkedListNode node, io.ktor.util.internal.LockFreeLinkedListNode next) {
        kotlin.jvm.internal.m.e(node, "node");
        kotlin.jvm.internal.m.e(next, "next");
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, node)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return false;
            }
        }
        node.finishAdd(next);
        return true;
    }

    public final boolean addOneIfEmpty(io.ktor.util.internal.LockFreeLinkedListNode node) {
        kotlin.jvm.internal.m.e(node, "node");
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, this, node)) {
                    node.finishAdd(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == this);
        }
        return false;
    }

    public final <T extends io.ktor.util.internal.LockFreeLinkedListNode> io.ktor.util.internal.LockFreeLinkedListNode.AddLastDesc<T> describeAddLast(T node) {
        kotlin.jvm.internal.m.e(node, "node");
        return new io.ktor.util.internal.LockFreeLinkedListNode.AddLastDesc<>(this, node);
    }

    public io.ktor.util.internal.AtomicDesc describeRemove() {
        if (isRemoved()) {
            return null;
        }
        return new io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc() { // from class: io.ktor.util.internal.LockFreeLinkedListNode.describeRemove.1
            private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _originalNext$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(io.ktor.util.internal.LockFreeLinkedListNode.AnonymousClass1.class, java.lang.Object.class, "_originalNext");
            private volatile /* synthetic */ java.lang.Object _originalNext = null;

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public java.lang.Object failure(io.ktor.util.internal.LockFreeLinkedListNode affected, java.lang.Object next) {
                kotlin.jvm.internal.m.e(affected, "affected");
                kotlin.jvm.internal.m.e(next, "next");
                if (next instanceof io.ktor.util.internal.Removed) {
                    return io.ktor.util.internal.LockFreeLinkedListKt.getALREADY_REMOVED();
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public void finishOnSuccess(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.m.e(affected, "affected");
                kotlin.jvm.internal.m.e(next, "next");
                io.ktor.util.internal.LockFreeLinkedListNode.this.finishRemove(next);
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            /* JADX INFO: renamed from: getAffectedNode, reason: from getter */
            public io.ktor.util.internal.LockFreeLinkedListNode getThis$0() {
                return io.ktor.util.internal.LockFreeLinkedListNode.this;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            /* JADX INFO: renamed from: getOriginalNext */
            public io.ktor.util.internal.LockFreeLinkedListNode getQueue() {
                return (io.ktor.util.internal.LockFreeLinkedListNode) this._originalNext;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public java.lang.Object onPrepare(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.m.e(affected, "affected");
                kotlin.jvm.internal.m.e(next, "next");
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _originalNext$FU;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, next) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                return null;
            }

            @Override // io.ktor.util.internal.LockFreeLinkedListNode.AbstractAtomicDesc
            public io.ktor.util.internal.Removed updatedNext(io.ktor.util.internal.LockFreeLinkedListNode affected, io.ktor.util.internal.LockFreeLinkedListNode next) {
                kotlin.jvm.internal.m.e(affected, "affected");
                kotlin.jvm.internal.m.e(next, "next");
                return next.removed();
            }
        };
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc<io.ktor.util.internal.LockFreeLinkedListNode> describeRemoveFirst() {
        return new io.ktor.util.internal.LockFreeLinkedListNode.RemoveFirstDesc<>(this);
    }

    public final java.lang.Object getNext() {
        while (true) {
            java.lang.Object obj = this._next;
            if (!(obj instanceof io.ktor.util.internal.OpDescriptor)) {
                return obj;
            }
            ((io.ktor.util.internal.OpDescriptor) obj).perform(this);
        }
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode getNextNode() {
        return io.ktor.util.internal.LockFreeLinkedListKt.unwrap(getNext());
    }

    public final java.lang.Object getPrev() {
        while (true) {
            java.lang.Object obj = this._prev;
            if (obj instanceof io.ktor.util.internal.Removed) {
                return obj;
            }
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) obj;
            if (lockFreeLinkedListNode.getNext() == this) {
                return obj;
            }
            correctPrev(lockFreeLinkedListNode, null);
        }
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode getPrevNode() {
        return io.ktor.util.internal.LockFreeLinkedListKt.unwrap(getPrev());
    }

    public final void helpDelete() {
        java.lang.Object next;
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNodeMarkPrev = markPrev();
        java.lang.Object obj = this._next;
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type io.ktor.util.internal.Removed");
        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = ((io.ktor.util.internal.Removed) obj).ref;
        while (true) {
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = null;
            while (true) {
                java.lang.Object next2 = lockFreeLinkedListNode.getNext();
                if (next2 instanceof io.ktor.util.internal.Removed) {
                    lockFreeLinkedListNode.markPrev();
                    lockFreeLinkedListNode = ((io.ktor.util.internal.Removed) next2).ref;
                } else {
                    next = lockFreeLinkedListNodeMarkPrev.getNext();
                    if (next instanceof io.ktor.util.internal.Removed) {
                        if (lockFreeLinkedListNode2 != null) {
                            break;
                        } else {
                            lockFreeLinkedListNodeMarkPrev = io.ktor.util.internal.LockFreeLinkedListKt.unwrap(lockFreeLinkedListNodeMarkPrev._prev);
                        }
                    } else if (next == this) {
                        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
                        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNodeMarkPrev, this, lockFreeLinkedListNode)) {
                            if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNodeMarkPrev) != this) {
                            }
                        }
                        return;
                    } else {
                        kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
                        io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = (io.ktor.util.internal.LockFreeLinkedListNode) next;
                        if (lockFreeLinkedListNode3 == lockFreeLinkedListNode) {
                            return;
                        }
                        lockFreeLinkedListNode2 = lockFreeLinkedListNodeMarkPrev;
                        lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode3;
                    }
                }
            }
            lockFreeLinkedListNodeMarkPrev.markPrev();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _next$FU;
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode4 = ((io.ktor.util.internal.Removed) next).ref;
            while (!atomicReferenceFieldUpdater2.compareAndSet(lockFreeLinkedListNode2, lockFreeLinkedListNodeMarkPrev, lockFreeLinkedListNode4) && atomicReferenceFieldUpdater2.get(lockFreeLinkedListNode2) == lockFreeLinkedListNodeMarkPrev) {
            }
            lockFreeLinkedListNodeMarkPrev = lockFreeLinkedListNode2;
        }
    }

    public final void helpRemove() {
        java.lang.Object next = getNext();
        io.ktor.util.internal.Removed removed = next instanceof io.ktor.util.internal.Removed ? (io.ktor.util.internal.Removed) next : null;
        if (removed == null) {
            throw new java.lang.IllegalStateException("Must be invoked on a removed node");
        }
        finishRemove(removed.ref);
    }

    public final boolean isRemoved() {
        return getNext() instanceof io.ktor.util.internal.Removed;
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode.CondAddOp makeCondAddOp(io.ktor.util.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0 condition) {
        kotlin.jvm.internal.m.e(node, "node");
        kotlin.jvm.internal.m.e(condition, "condition");
        return new io.ktor.util.internal.LockFreeLinkedListNode.C24401(node, condition);
    }

    public boolean remove() {
        while (true) {
            java.lang.Object next = getNext();
            if ((next instanceof io.ktor.util.internal.Removed) || next == this) {
                return false;
            }
            kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next;
            io.ktor.util.internal.Removed removed = lockFreeLinkedListNode.removed();
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, next, removed)) {
                    finishRemove(lockFreeLinkedListNode);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == next);
        }
    }

    public final <T> T removeFirstIfIsInstanceOf() {
        java.lang.Object next = getNext();
        kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        if (((io.ktor.util.internal.LockFreeLinkedListNode) next) == this) {
            return null;
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final <T> T removeFirstIfIsInstanceOfOrPeekIf(p194x6.j predicate) {
        kotlin.jvm.internal.m.e(predicate, "predicate");
        java.lang.Object next = getNext();
        kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
        if (((io.ktor.util.internal.LockFreeLinkedListNode) next) == this) {
            return null;
        }
        kotlin.jvm.internal.m.j();
        throw null;
    }

    public final io.ktor.util.internal.LockFreeLinkedListNode removeFirstOrNull() {
        while (true) {
            java.lang.Object next = getNext();
            kotlin.jvm.internal.m.c(next, "null cannot be cast to non-null type io.ktor.util.internal.LockFreeLinkedListNode");
            io.ktor.util.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (io.ktor.util.internal.LockFreeLinkedListNode) next;
            if (lockFreeLinkedListNode == this) {
                return null;
            }
            if (lockFreeLinkedListNode.remove()) {
                return lockFreeLinkedListNode;
            }
            lockFreeLinkedListNode.helpDelete();
        }
    }

    public java.lang.String toString() {
        return kotlin.jvm.internal.B.f24540a.b(getClass()).h() + '@' + hashCode();
    }

    public final int tryCondAddNext(io.ktor.util.internal.LockFreeLinkedListNode node, io.ktor.util.internal.LockFreeLinkedListNode next, io.ktor.util.internal.LockFreeLinkedListNode.CondAddOp condAdd) {
        kotlin.jvm.internal.m.e(node, "node");
        kotlin.jvm.internal.m.e(next, "next");
        kotlin.jvm.internal.m.e(condAdd, "condAdd");
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, next, condAdd)) {
            if (atomicReferenceFieldUpdater.get(this) != next) {
                return 0;
            }
        }
        return condAdd.perform(this) == null ? 1 : 2;
    }

    public final void validateNode$ktor_utils(io.ktor.util.internal.LockFreeLinkedListNode prev, io.ktor.util.internal.LockFreeLinkedListNode next) {
        kotlin.jvm.internal.m.e(prev, "prev");
        kotlin.jvm.internal.m.e(next, "next");
        if (prev != this._prev) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        if (next != this._next) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
    }
}
