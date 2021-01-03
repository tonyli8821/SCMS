package com.tonyli8821;

public class Item {
    private String id;                          //id编号属性
    private String name;                        //name属性

    public Item(){

    }

    public Item(String id, String name){        //包含所有属性初始化的构造方法
        this.id = id;
        this.name = name;
    }

    public String getId(){                      //获取id属性的方法
        return this.id;
    }

    public void setId(String id){               //设置id属性的方法
        this.id = id;
    }

    public String getName(){                    //获取name属性的方法
        return this.name;
    }

    public void setName(String name){           //设置name属性的方法
        this.name = name;
    }

    public String toString(){                   //重写toString方法，只输出name属性
        return this.getName();
    }
}
