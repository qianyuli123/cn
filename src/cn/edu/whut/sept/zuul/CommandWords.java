package cn.edu.whut.sept.zuul;
/**
 * 该类中定义了规定的几种指令——单指令或双指令中的首字符串
 */
public class CommandWords
{
    //几种规定的指令
    private static final String[] validCommands = {
            "go", "quit", "help"
    };
    /**
     * 构造函数
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }
    /**
     * 判断输入的字符串是否是规定几种指令之一
     * @param aString 输入的字符串
     * @return boolean 如果输入的字符串是规定的几种指令之一，返回true；否则返回false
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }
    /**
     * 输出所有的指令
     */
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
