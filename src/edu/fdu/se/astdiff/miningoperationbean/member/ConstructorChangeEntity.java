package edu.fdu.se.astdiff.miningoperationbean.member;

import com.github.javaparser.ast.body.ConstructorDeclaration;
import edu.fdu.se.astdiff.linkpool.LinkBean;
import edu.fdu.se.astdiff.miningoperationbean.ClusteredActionBean;
import edu.fdu.se.astdiff.miningoperationbean.OperationTypeConstants;
import edu.fdu.se.astdiff.miningoperationbean.base.ChangeEntity;
import edu.fdu.se.astdiff.miningoperationbean.base.MemberPlusChangeEntity;
import edu.fdu.se.astdiff.preprocessingfile.BodyDeclarationPair;

import java.util.HashSet;

/**
 * Created by huangkaifeng on 2018/1/16.
 *
 */
public class ConstructorChangeEntity extends MemberPlusChangeEntity {

    /**
     * gumtree 识别的 add/remove/modify
     * @param bean
     */
    public ConstructorChangeEntity(ClusteredActionBean bean){
        super(bean);
        this.lineRange = bean.nodeLinePosition;
        this.changeEntity = "Constructor - AnonymousClass";
        this.changeType = bean.changePacket.getOperationType();
        this.outputDesc = OperationTypeConstants.getKeyNameByValue(changeType) + ChangeEntity.SPLITTER + this.changeEntity +ChangeEntity.SPLITTER;
    }


    public ConstructorChangeEntity(BodyDeclarationPair bodyDeclarationPair, int changeType){
        ConstructorDeclaration cd = (ConstructorDeclaration) bodyDeclarationPair.getBodyDeclaration();
        this.lineRange = cd.getRange().get();
        this.changeEntity = "Constructor";
        this.changeType = changeType;
        this.location = bodyDeclarationPair.getLocationClassString();
        this.outputStringList.add(OperationTypeConstants.getKeyNameByValue(OperationTypeConstants.ENTITY_MEMBER));
        this.outputStringList.add("PRE_DIFF");
        this.outputStringList.add(OperationTypeConstants.getKeyNameByValue(changeType));
        this.outputStringList.add(this.changeEntity);
        this.outputStringList.add(cd.getNameAsString());

        this.linkBean = new LinkBean();
        this.linkBean.methodDeclarations = new HashSet<>();
        this.linkBean.methodDeclarations.add(cd.getNameAsString());
    }


}