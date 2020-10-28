package arraysnstrings;

public class LongestCommonPrefix {
    /*    编写一个函数来查找字符串数组中的最长公共前缀。

        如果不存在公共前缀，返回空字符串 ""。

        示例 1:

        输入: ["flower","flow","flight"]
        输出: "fl"
        示例 2:

        输入: ["dog","racecar","car"]
        输出: ""
        解释: 输入不存在公共前缀。
        说明:

        所有输入只包含小写字母 a-z 。*/
    public String longestCommonPrefix(String[] strs) {
        if (strs.length != 0) {
            if (strs[0].length() == 0) {
                return "";
            }
        } else {
            return "";
        }
        int index = 0;
        //StringBuilder，快！
        StringBuilder result = new StringBuilder();
        boolean notEnd = true;
        while (notEnd) {
            for (int i = 0; i < strs.length; i++) {
                if (index >= strs[i].length()) {
                    return result.toString();
                } else {
                    if (strs[i].charAt(index) != strs[0].charAt(index)) {
                        return result.toString();
                    }
                }
            }
            result.append(strs[0].charAt(index));
            index++;
        }
        return result.toString();
    }
}
