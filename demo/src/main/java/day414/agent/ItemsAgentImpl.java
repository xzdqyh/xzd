package day414.agent;

public class ItemsAgentImpl implements Items{
   private ItemsImpl items;
    @Override
    public void showItems() {
        if(items==null){
            items=new ItemsImpl();
        }
        agentCome();
        items.showItems();
        agentGo();
    }



    public void agentCome(){
        System.out.println("代理来了");
    }

    public void agentGo(){
        System.out.println("代理走了");
    }
}
