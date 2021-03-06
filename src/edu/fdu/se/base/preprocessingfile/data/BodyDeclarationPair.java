package edu.fdu.se.base.preprocessingfile.data;


import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

/**
 * Created by huangkaifeng on 2018/1/22.
 */
public class BodyDeclarationPair {
    private final BodyDeclaration bd;

    private final String locationClassString;
    private final int hashCode;

    public BodyDeclarationPair(BodyDeclaration bd1, String str) {
        this.bd = bd1;
        this.locationClassString = str;
        String hashStr = String.valueOf(bd1.toString().hashCode()) + str.hashCode();
        this.hashCode = hashStr.hashCode();
    }

    public BodyDeclaration getBodyDeclaration() {
        return bd;
    }

    public String getLocationClassString() {
        return locationClassString;
    }

    @Override
    public boolean equals(Object obj) {
        BodyDeclarationPair bdp = (BodyDeclarationPair) obj;
        return bdp.hashCode() == this.hashCode;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    public String toString() {
        String result = this.getLocationClassString() + " ";
        if (this.getBodyDeclaration() instanceof TypeDeclaration) {
            TypeDeclaration td = (TypeDeclaration) this.getBodyDeclaration();
            result += td.getClass().getSimpleName() + ": " + td.getName().toString();
        } else if (this.getBodyDeclaration() instanceof FieldDeclaration) {
            FieldDeclaration td = (FieldDeclaration) this.getBodyDeclaration();
            result += td.getClass().getSimpleName() + ": " + td.fragments().toString();
        } else if (this.getBodyDeclaration() instanceof MethodDeclaration) {
            MethodDeclaration td = (MethodDeclaration) this.getBodyDeclaration();
            result += td.getClass().getSimpleName() + ": " + td.getName().toString();
        }
        return result;
    }
}
