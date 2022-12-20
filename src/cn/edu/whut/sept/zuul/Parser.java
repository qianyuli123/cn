package cn.edu.whut.sept.zuul;
import java.util.Scanner;
/**
 * 该类用于读取并解析输入的字符串，将字符串转换为Command类的对象
 */
public class Parser
{
    //分析要求
    private CommandWords commands;
    //读入要求
    private Scanner reader;
    /**
     * 初始化解析器，一个用于分析要求，一个用于读入要求
     */
    public Parser()
    {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }
    /**
     * 读取字符串并返回一个Command类对象
     * @return cn.edu.whut.sept.command.Command 如果字符串的首单词不符合规范，则返回一个<null,String>的Command对象
     * 否则返回一个<String,String>的Command对象
     */
    public Command getCommand()
    {
        //获取首字符串与第二字符串
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");

        inputLine = reader.nextLine();

        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();   
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();
            }
        }
        //如果首字符串符合规范，就返回一个<String,String>的Command对象
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        //否则，返回一个<null,String>的Command对象
        else {
            return new Command(null, word2);
        }
    }
    /**
     * 输出所有的首字符串
     */
    public void showCommands()
    {
        commands.showAll();
    }
}
