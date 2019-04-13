package widget_list.oysu.tistory.com.widgetlist;


public class DataHolder {

    class Initializations {
        // TODO
    }

    Initializations initializations;

    private DataHolder (Initializations... inits){
    }

    private static DataHolder holder;

    public static DataHolder instance(){
        if(holder == null)
            holder = new DataHolder();
        return holder;
    }

    public  void reset(Initializations... initializations){
        this.initializations = null;
    }

}
