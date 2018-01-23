package edu.fdu.se.astdiff.preprocessingfile;

import com.github.javaparser.Position;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.*;
import edu.fdu.se.javaparser.JavaParserFactory;
import org.apache.ibatis.javassist.compiler.ast.FieldDecl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by huangkaifeng on 2018/1/16.
 */
public class PreprocessingData {
    /**
     * 操作之后的CompilationUnit
     */
    private CompilationUnit currentCu;
    private CompilationUnit previousCu;

    /**
     * curr 删除的added的body
     */
    private List<BodyDeclarationPair> mBodiesAdded;
    /**
     * prev 删除的removed body
     */
    private List<BodyDeclarationPair> mBodiesDeleted;

    /**
     * prev 和curr 中都没被删除 保修下来在CompilationUnit的Body
     */
    private List<BodyDeclarationPair> mBodiesRetained;



    private Map<String,List<ClassOrInterfaceDeclaration>> classOrInterfaceDeclarationsList;

    public PreprocessingData(){
        mBodiesAdded = new ArrayList<>();
        mBodiesDeleted = new ArrayList<>();
        mBodiesRetained = new ArrayList<>();
        classOrInterfaceDeclarationsList = new HashMap<>();
    }

    public void addClassOrInterfaceDeclaration(String prefix,ClassOrInterfaceDeclaration a){
        if(this.classOrInterfaceDeclarationsList.containsKey(prefix)){
            List<ClassOrInterfaceDeclaration> mList = this.classOrInterfaceDeclarationsList.get(prefix);
            mList.add(a);
        }else{
            List<ClassOrInterfaceDeclaration> mList = new ArrayList<>();
            mList.add(a);
            this.classOrInterfaceDeclarationsList.put(prefix,mList);
        }
    }





    public void refreshCompilationUnit(CompilationUnit cu){

    }





    public BodyDeclaration getBelongedBodyDeclaration(int start){
        for(BodyDeclarationPair bd: mBodiesRetained){
            Position p = (Position)bd.getBodyDeclaration().getBegin().get();
            Position p2 = (Position)bd.getBodyDeclaration().getEnd().get();
            if(start>p.line && start<p2.line){
                return bd.getBodyDeclaration();
            }
        }
        return null;
    }


    public CompilationUnit getPreviousCu() {
        return previousCu;
    }

    public CompilationUnit getCurrentCu() {
        return currentCu;
    }

    public void addBodiesAdded(BodyDeclaration bodyDeclaration,String classPrefix){
        this.mBodiesAdded.add(new BodyDeclarationPair(bodyDeclaration,classPrefix));
    }


    public void addBodiesDeleted(BodyDeclarationPair bodyDeclarationPair){
        this.mBodiesDeleted.add(bodyDeclarationPair);
    }


    public void setCurrentCu(CompilationUnit currentCu) {
        this.currentCu = currentCu;
    }

    public void setPreviousCu(CompilationUnit previousCu) {
        this.previousCu = previousCu;
    }

    public void printAddedRemovedBodies(){
        for(BodyDeclarationPair item:this.mBodiesAdded){
//            System.out.println(item.getBodyDeclaration().toString()+"  "+item.getLocationClassString());
            System.out.println(item.getBodyDeclaration().toString());
        }
        System.out.print("-----------------------------\n");
        for(BodyDeclarationPair item:this.mBodiesDeleted){
//            System.out.println(item.getBodyDeclaration().toString()+"  "+item.getLocationClassString());
            System.out.println(item.getBodyDeclaration().toString());
        }
    }

    public List<BodyDeclarationPair> getmBodiesAdded() {
        return mBodiesAdded;
    }

    public List<BodyDeclarationPair> getmBodiesDeleted() {
        return mBodiesDeleted;
    }
}