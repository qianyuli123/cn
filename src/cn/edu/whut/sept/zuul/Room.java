package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;

/**
 * 所有房间类的父类，该类是一个虚基类，实现了RoomFeature接口
 */
public class Room
{
    //储存对房间描述的字符串
    private String description;
    //房间周围存在的房间
    private HashMap<String, Room> exits;
    /**
     * 构造函数，初始化description和exits
     */
    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<String, Room>();
    }
    /**
     * 设置房间某一个方向上的另一个房间
     * @param direction 该房间的某一方向
     * @param neighbor 该方向上的另一件房间
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * 获取房间的简单描述，包括：房间的描述
     * @return java.lang.String 将房间的描述返回
     */
    public String getShortDescription()
    {
        return description;
    }
    /**
     * 返回房间的详细描述，包括：房间的描述、拥有相邻房间的方向
     * @return java.lang.String 返回详细描述
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }
    /**
     * 获取该房间的那些房间上有相邻的房间
     * @return java.lang.String 将拥有相信房间的方向以字符串的形式返回，格式：方向1 + " " + 方向2...
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }
    /**
     * 获取该房间指定方向上的物品
     * @param direction 方向
     * @return cn.edu.whut.sept.room.Room 如果该方向上不存在房间，返回null；否则返回房间
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


