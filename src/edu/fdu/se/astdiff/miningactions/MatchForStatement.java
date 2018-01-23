package edu.fdu.se.astdiff.miningactions;

import com.github.gumtreediff.actions.model.Action;
import com.github.gumtreediff.actions.model.Insert;
import com.github.gumtreediff.tree.ITree;
import com.github.gumtreediff.tree.TreeContext;
import com.github.javaparser.Range;
import edu.fdu.se.astdiff.miningoperationbean.ClusteredActionBean;
import edu.fdu.se.gumtree.MyTreeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MatchForStatement {
    public static ClusteredActionBean matchForStatement(MiningActionData fp, Action a, String nodeType){
        String operationEntity = "FORSTATEMENT";
        ClusteredActionBean mHighLevelOperationBean = AstRelations.matchByNode(fp,a,nodeType,operationEntity);
        return mHighLevelOperationBean;
    }

    public static ClusteredActionBean matchEnhancedForStatement(MiningActionData fp, Action a, String nodeType){
        String operationEntity = "ENHANCEDFORSTATEMENT";
        ClusteredActionBean mHighLevelOperationBean = AstRelations.matchByNode(fp,a,nodeType,operationEntity);
        return mHighLevelOperationBean;
    }

    public static ClusteredActionBean matchForPredicate(MiningActionData fp, Action a, String nodeType, ITree fafafatherNode, String ffFatherNodeType) {
        String operationEntity  = "FORPREDICATE";

        List<Action> allActions = new ArrayList<Action>();
        ITree srcfafafather = null;
        ITree dstfafafather = null;
        TreeContext con = null;
        if (a instanceof Insert) {
            con = fp.getDstTree();
            dstfafafather = fafafatherNode;
            srcfafafather = fp.getMappedSrcOfDstNode(dstfafafather);
            if (srcfafafather == null) {
                System.err.println("err null mapping");
            }
        } else {
            con = fp.getSrcTree();
            srcfafafather = fafafatherNode;
            dstfafafather = fp.getMappedDstOfSrcNode(srcfafafather);
            if (dstfafafather == null) {
                System.err.println("err null mapping");
            }
        }

        Set<String> srcT = MyTreeUtil.traverseNodeGetAllEditActions(srcfafafather.getChild(0), allActions);
        Set<String> dstT = MyTreeUtil.traverseNodeGetAllEditActions(dstfafafather.getChild(0), allActions);
        int status = MyTreeUtil.isSrcOrDstAdded(srcT,dstT);

        fp.setActionTraversedMap(allActions);

        Range nodeLinePosition = AstRelations.getnodeLinePosition(a,con);
        ClusteredActionBean mHighLevelOperationBean = new ClusteredActionBean(
                a,nodeType,allActions,nodeLinePosition,status,operationEntity,fafafatherNode,ffFatherNodeType);
        return mHighLevelOperationBean;
    }
}