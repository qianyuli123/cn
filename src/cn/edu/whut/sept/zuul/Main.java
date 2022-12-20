package cn.edu.whut.sept.zuul;
/**
 * 该类是游戏程序运行的入口
 */
public class Main {
    /**
     * 在运行时需要先初始化游戏，然后调用游戏的play方法
     */
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
