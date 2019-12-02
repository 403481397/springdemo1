public class BraveKnight implements Knight{
    private Quest quest;
    public  BraveKnight (Quest quest){
        this.quest=quest;
    }
    public  void embarkOnQuest(){
        quest.embark();//调用执行方法
        System.out.println("wohao");
        System.out.println("nihao");
    }
}
