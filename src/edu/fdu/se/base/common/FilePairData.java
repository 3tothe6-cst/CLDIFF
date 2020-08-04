package edu.fdu.se.base.common;

/**
 * Created by huangkaifeng on 2018/8/21.
 */
public class FilePairData {

    private final byte[] prev;
    private final byte[] curr;
    private final String prevPath;
    private final String currPath;
    private final String fileName;
    private String parentCommit;

    public FilePairData(byte[] prevv, byte[] currr, String prevPathh, String currPathh, String fileNamee) {
        prev = prevv;
        curr = currr;
        prevPath = prevPathh;
        currPath = currPathh;
        fileName = fileNamee;
    }

    public byte[] getPrev() {
        return prev;
    }

    public byte[] getCurr() {
        return curr;
    }

    public String getPrevPath() {
        return prevPath;
    }

    public String getCurrPath() {
        return currPath;
    }

    public String getFileName() {
        return fileName;
    }

    public String getParentCommit() {
        return parentCommit;
    }

    public void setParentCommit(String parentCommit) {
        this.parentCommit = parentCommit;
    }


}
