package main;

import edu.fdu.se.base.common.Global;
import edu.fdu.se.cldiff.CLDiffLocal;

/**
 * Created by huangkaifeng on 2018/10/11.
 */
public class CLDIFFCmd {

    public static void main(String[] args) {
        Global.runningMode = 0;
        String repo = args[0];
        String commitId = args[1];
        String outputDir = "output/";
        CLDiffLocal CLDiffLocal = new CLDiffLocal();
        CLDiffLocal.run(commitId, repo, outputDir);
    }
}
