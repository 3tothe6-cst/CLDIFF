package edu.fdu.se.base.miningactions.util;


import edu.fdu.se.base.generatingactions.ActionConstants;

import java.util.List;
import java.util.Set;

/**
 * Created by huangkaifeng on 2018/1/25.
 */
public class BaseMatchUtil {


    public static boolean oneItemInsert(List<String> type) {
        return type.size() == 1 && type.contains(ActionConstants.INSERT);
    }

    public static boolean oneItemDelete(List<String> type) {
        return type.size() == 1 && type.contains(ActionConstants.DELETE);

    }

    public static boolean oneItemMoveOrTwoItemMoveAndNullAction(List<String> type) {
        if (type.size() == 2 && type.contains(ActionConstants.MOVE) && type.contains(ActionConstants.NULLACTION)) {
            return true;
        }
        return type.size() == 1 && type.contains(ActionConstants.MOVE);
    }

    public static boolean oneItemNullAction(Set<String> type) {
        return type.size() == 1 && type.contains(ActionConstants.NULLACTION);
    }


    public static boolean twoItemInsertAndNullAction(List<String> type) {
        return type.size() == 2 && type.contains(ActionConstants.INSERT) && type.contains(ActionConstants.NULLACTION);
    }

    public static boolean twoItemDeleteAndNullAction(List<String> type) {
        return type.size() == 2 && type.contains(ActionConstants.DELETE) && type.contains(ActionConstants.NULLACTION);
    }

    public static boolean twoItemUpdateAndNullAction(List<String> type) {
        return type.size() == 2 && type.contains(ActionConstants.UPDATE) && type.contains(ActionConstants.NULLACTION);
    }

    public static boolean twoItemMoveAndNullAction(List<String> type) {
        return type.size() == 2 && type.contains(ActionConstants.MOVE) && type.contains(ActionConstants.NULLACTION);
    }


}
