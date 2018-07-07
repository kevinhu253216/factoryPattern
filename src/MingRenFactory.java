public class MingRenFactory extends AbstractMingRenFactory {

    private  MingRen mingRen;
    public <T extends MingRen>T createMingRen(Class<T> c){
        try{
            mingRen=(MingRen)Class.forName(c.getName()).newInstance();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return (T)mingRen;
    }
}
